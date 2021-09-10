package situ.sql.assistant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class TableFactory {
    public static String packageName = "com.make.passcheck.api.entity.design";
    public static String packageMapper = "com.make.passcheck.api.mapper.design";
    public static String servicePackage = "com.make.passcheck.api.service";

    private static String getCamelField(String field) {
        int i = field.indexOf("_");
        if (i < 0)
            return field;
        String temp = field.substring(0, i);
        if (field.length() > i + 1) {
            temp += field.substring(i + 1, i + 2).toUpperCase();
            if ((field.length() > i + 2)) {
                temp += field.substring(i + 2);
            }
        }
        return getCamelField(temp);
    }

    private static Map<String, String> getTableComment() throws Exception {
        Connection connection = AddConnection.getConnection();
        Map<String, String> comments = new HashMap<>();
        String sql = "SELECT TABLE_NAME,TABLE_COMMENT FROM information_schema.TABLES";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);//放入sql语句准备执行
        ResultSet resultSet = preparedStatement.executeQuery();//执行sql语句，并获得结果集
        while(resultSet.next()) {
            String column_name=resultSet.getString("table_name");//获取第一列的编号
            String column_comment=resultSet.getString("table_comment");//获取第一列的编号
            comments.put(column_name, column_comment);
        }
        connection.close();
        return comments;
    }

    private static Map<String, String> getTableColumn(String tableName) throws Exception {
        Connection connection = AddConnection.getConnection();
        String sql = "SELECT * FROM INFORMATION_SCHEMA.Columns WHERE table_name='" + tableName+"'" ;
        connection = AddConnection.getConnection();
        System.out.println("sql语句为" + sql);
        PreparedStatement preparedStatement = connection.prepareStatement(sql);//放入sql语句准备执行
        ResultSet resultSet = preparedStatement.executeQuery();//执行sql语句，并获得结果集
        Map<String, String> comments = new HashMap<>();
        while(resultSet.next()) {
            String column_name=resultSet.getString("column_name");//获取第一列的编号
            String column_comment=resultSet.getString("column_comment");//获取第一列的编号
            comments.put(column_name, column_comment);
        }
        connection.close();
        return comments;
    }

    public static String GenerateByName(String tableName, String... primaryKeyNames) throws Exception {
        if (!tableName.contains("design"))
            return "";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        StringBuffer stringBuffer = new StringBuffer();//用于生成成员变量和getset方法
        StringBuffer constructorBuffer = new StringBuffer();//用于生成构造函数
        StringBuffer subConstructor = new StringBuffer();
        //初始化成员头部
        String leiName = tableName.substring(0, 1).toUpperCase() + tableName.substring(1);//类名首字母大写
        leiName = getCamelField(leiName);
        //获得包路径
        String rootFold = TableFactory.class.getResource("/").getFile() + packageName.replace(".", "/") + "/";
        System.out.println("rootFold" + rootFold);
        stringBuffer.append("package " + packageName + ";\n");//把包路径最后一个逗号删掉，然后把所有斜线换成点号
        stringBuffer.append("import com.baomidou.mybatisplus.annotation.IdType;\n");
        stringBuffer.append("import com.baomidou.mybatisplus.annotation.TableId;\n");
        stringBuffer.append("import com.baomidou.mybatisplus.annotation.TableField;\n");
        stringBuffer.append("import com.baomidou.mybatisplus.annotation.TableName;\n");
        stringBuffer.append("import com.fasterxml.jackson.annotation.JsonProperty;\n");
        stringBuffer.append("import com.fasterxml.jackson.annotation.JsonFormat;\n");
        stringBuffer.append("import lombok.Data;\n");
//        stringBuffer.append("import java.io.Serializable;\n");
        stringBuffer.append("@Data\n");
        stringBuffer.append("@TableName(\"" + tableName + "\")\n");
        Map<String, String> tableComment = getTableComment();
        stringBuffer.append("/**\n" +
                " * " + tableComment.get(tableName) +
                "\n */\n");
        stringBuffer.append("public class " + leiName + " {\n");
        //初始化构造函数
        constructorBuffer.append("public " + leiName + "(");
        subConstructor.append("{\n super();\n");
        try {
            Map<String, String> tableColumn = getTableColumn(tableName);
//            获得列名的map，integer从1开始，这个是为了view表防止列名重复准备的，对普通表没有什么卵用
            String sql = "SELECT * FROM " + tableName + " LIMIT 1";
            connection = AddConnection.getConnection();
            System.out.println("sql语句为" + sql);
            preparedStatement = connection.prepareStatement(sql);//放入sql语句准备执行
            resultSet = preparedStatement.executeQuery();//执行sql语句，并获得结果集
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();//获得结果集的底层数据库信息
            int columns = resultSetMetaData.getColumnCount();//获得结果集的列数
            resultSet.first();
            String columnName = null;
            String columnClass = null;
            for (int i = 0; i < columns; i++) {//列遍历,添加成员变量和get,set方法
                columnName = resultSetMetaData.getColumnLabel(i + 1).toLowerCase(); //getColumnLabel得到是as后的列名，getColumnName是数据库本来的列名
                columnClass = resultSetMetaData.getColumnClassName(i + 1).replace("java.lang.", "");
                System.out.println("列名" + columnName + " 数据类型" + columnClass);
                //写入成员变量,由于mysql对列名不区分大小写，就全部改为小写，防止前端人员写错

                if (columnName.equals("id")) {
                    stringBuffer.append("    ");
                    stringBuffer.append("@TableId(value = \"" + columnName + "\", type = IdType.AUTO)\n");//写入成员变量
                } else {
                    stringBuffer.append("    ");
                    stringBuffer.append("@TableField(value = \"" + columnName + "\")\n");//写入成员变量
                }
                stringBuffer.append("    ");
                stringBuffer.append("@JsonProperty(value = \"" + getCamelField(columnName.toLowerCase()) + "\")\n");//写入成员变量
                if (columnClass.equals("java.sql.Date")) {
                    stringBuffer.append("    ");
                    stringBuffer.append("@JsonFormat(shape = JsonFormat.Shape.STRING, pattern=\"yyyy-MM-dd HH:mm:ss\", timezone = \"GMT+8\")\n");
                }
                stringBuffer.append("    ");
                stringBuffer.append("private " + columnClass + " " + getCamelField(columnName.toLowerCase()) + ";//"+tableColumn.get(columnName) );//写入成员变量
                stringBuffer.append("\n");
            }



            //消除构造方法最后的逗号
            StringBuffer constructBuffer2 = new StringBuffer();
            constructBuffer2.append(constructorBuffer.substring(0, constructorBuffer.length() - 1));
            constructBuffer2.append(")");
            //将构造方法合成
            constructBuffer2.append(subConstructor);
            constructBuffer2.append("}\n");
            stringBuffer.append("}\n");

            String output = rootFold;
            System.out.println("output:" + output);
            writeFile(output, stringBuffer, leiName + ".java");

            StringBuffer mapper = new StringBuffer();
            mapper.append("package " + packageMapper + ";\n");//把包路径最后一个逗号删掉，然后把所有斜线换成点号
            mapper.append("import com.baomidou.mybatisplus.core.mapper.BaseMapper;\n");
            mapper.append("import " + packageName + "." + leiName + ";\n");
            mapper.append("public interface " + leiName + "Mapper extends BaseMapper<" + leiName + ">{\n");
            mapper.append("}\n");
            output = TableFactory.class.getResource("/").getFile() + packageMapper.replace(".", "/") + "/";
            writeFile(output, mapper, leiName + "Mapper" + ".java");


            StringBuffer mapperXml = new StringBuffer();
            mapperXml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");//把包路径最后一个逗号删掉，然后把所有斜线换成点号
            mapperXml.append("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">\n");
            mapperXml.append("<mapper namespace=\"" + packageMapper + "." + leiName + "Mapper" + "\">\n");
            mapperXml.append("</mapper>\n");
            output = TableFactory.class.getResource("/").getFile() + packageMapper.replace(".", "/") + "/design/";
            writeFile(output, mapperXml, leiName + "Mapper" + ".xml");

            createService(leiName);
            createServiceImpl(leiName);

        } catch (SQLException e1) {
            // TODO Auto-generated catch block
            System.out.println("数据库连接失败，请检查用户名密码或配置文件");
            e1.printStackTrace();
            return null;
        }
        return stringBuffer.toString();
    }

    private static void createServiceImpl(String entityName) {
        StringBuffer buffer = new StringBuffer();
        String className = entityName + "ServiceImpl";
        buffer.append("package " + servicePackage + ".impl;\n\n");
        buffer.append("import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;\n");
        buffer.append("import org.springframework.stereotype.Service;\n");
        buffer.append("import org.springframework.transaction.annotation.Transactional;\n");
        buffer.append("import com.make.passcheck.api.entity.design." + entityName + ";\n");
        buffer.append("import com.make.passcheck.api.service.I" + entityName + "Service;\n");
        buffer.append("import com.make.passcheck.api.mapper.design." + entityName + "Mapper;\n\n");
        buffer.append("@Service\n");
        buffer.append("@Transactional(rollbackFor = Exception.class)\n");
        buffer.append("public class " + className + " extends ServiceImpl<" + entityName +"Mapper, "+entityName+ "> implements I"+entityName+"Service {\n\n}");
        String output = TableFactory.class.getResource("/").getFile() + servicePackage.replace(".", "/") + "/impl/";
        writeFile(output, buffer, className + ".java");
    }

    private static void createService(String entityName) {
        StringBuffer buffer = new StringBuffer();
        String className = "I" + entityName + "Service";
        buffer.append("package " + servicePackage + ";\n\n");
        buffer.append("import com.baomidou.mybatisplus.extension.service.IService;\n");
        buffer.append("import " + packageName + "." + entityName + ";\n");
        buffer.append("public interface " + className + " extends IService<" + entityName + "> {\n\n}");
        String output = TableFactory.class.getResource("/").getFile() + servicePackage.replace(".", "/") + "/";
        writeFile(output, buffer, className + ".java");
    }

    private static void writeFile(String output, StringBuffer stringBuffer, String leiName) {
        try {
            File file = null;
            output = URLDecoder.decode(output, "utf-8");
            //把rootfold去掉最后面的斜线并且替换classes目录为源文件目录,添加对tomcat的源路径支持
            file = new File(output.substring(1).replace("/bin/", "/src/").replace("/WebRoot/WEB-INF/classes/", "/src/") + leiName);
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            System.out.println("正在写入:" + file);
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file);
            byte[] data = stringBuffer.toString().getBytes("UTF-8");
            fos.write(data);
            fos.close();
            System.out.println("类文件已成功写入到:" + file + "请右键刷新。");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


//    public static String GenerateByName(String tableName, String... primaryKeyNames) throws Exception {
//        Connection connection = null;
//        PreparedStatement preparedStatement = null;
//        ResultSet resultSet = null;
//        StringBuffer stringBuffer = new StringBuffer();//用于生成成员变量和getset方法
//        StringBuffer constructorBuffer = new StringBuffer();//用于生成构造函数
//        StringBuffer toStringBuffer = new StringBuffer();
//        StringBuffer subConstructor = new StringBuffer();
//        //初始化成员头部
//        String leiName = tableName.substring(0, 1).toUpperCase() + tableName.substring(1);//类名首字母大写
//        //获得包路径
//        String rootFold = TableFactory.class.getResource("/").getFile() + packageName.replace(".", "/") + "/";
//        System.out.println("rootFold" + rootFold);
//        stringBuffer.append("package " + packageName + ";\n");//把包路径最后一个逗号删掉，然后把所有斜线换成点号
//        stringBuffer.append("import situ.sql.assistant.Table;\n");
//        stringBuffer.append("import java.sql.Date;\n");
//        stringBuffer.append("import java.sql.Time;\n");
//        stringBuffer.append("import java.sql.Timestamp;\n");
//        stringBuffer.append("import java.text.ParseException;\n");
//        stringBuffer.append("import java.text.SimpleDateFormat;\n");
//        stringBuffer.append("import java.math.BigDecimal;\n");
//        stringBuffer.append("public class " + leiName + " implements Table{\n");
//        //初始化构造函数
//        constructorBuffer.append("public " + leiName + "(");
//        subConstructor.append("{\n super();\n");
//        //初始化toString方法
//        toStringBuffer.append("public String toString(){\n return \"{\"+");
//
//        try {
//            //获得列名的map，integer从1开始，这个是为了view表防止列名重复准备的，对普通表没有什么卵用
//            String sql = "SELECT * FROM " + tableName + " LIMIT 1";
//            connection = AddConnection.getConnection();
//            System.out.println("sql语句为" + sql);
//            preparedStatement = connection.prepareStatement(sql);//放入sql语句准备执行
//            resultSet = preparedStatement.executeQuery();//执行sql语句，并获得结果集
//            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();//获得结果集的底层数据库信息
//            int columns = resultSetMetaData.getColumnCount();//获得结果集的列数
//            resultSet.first();
//            String columnName = null;
//            String columnClass = null;
//            for (int i = 0; i < columns; i++) {//列遍历,添加成员变量和get,set方法
//                columnName = resultSetMetaData.getColumnLabel(i + 1).toLowerCase(); //getColumnLabel得到是as后的列名，getColumnName是数据库本来的列名
//                columnClass = resultSetMetaData.getColumnClassName(i + 1);
//                System.out.println("列名" + columnName + " 数据类型" + columnClass);
//                //写入成员变量,由于mysql对列名不区分大小写，就全部改为小写，防止前端人员写错
//
//                stringBuffer.append("private " + columnClass + " " + columnName.toLowerCase() + ";\n");//写入成员变量
//                stringBuffer.append("public static String " + columnName.toUpperCase() + " = \"" + columnName.toLowerCase() + "\";\n");//获取该列名的静态字符串，用于查询的时候写列名
//                //将列名首字母大写
//                String UpcolumnName = columnName.substring(0, 1).toUpperCase() + columnName.substring(1);
//                //添加get方法
//                stringBuffer.append("public " + columnClass + " get" + UpcolumnName + "(){\n");
//                stringBuffer.append("return " + columnName + ";\n}\n");
//                //添加set方法
//                stringBuffer.append("public void set" + UpcolumnName + "(" + columnClass + " " + columnName + "){\n");
//                stringBuffer.append("this." + columnName + "=" + columnName + ";\n");
//                stringBuffer.append("\n}\n");
//                //添加set String方法
//                if (!columnClass.equals("java.lang.String")) {//如果不是字符串类型
//                    stringBuffer.append("public void set" + UpcolumnName + "(java.lang.String " + columnName + "){\n");
//                    stringBuffer.append("if(" + columnName + "==null||" + columnName + ".length()==0){System.out.println(\"YOUR INPUT IS NULL\");return;}\n");
//                    //date对象
//                    if (columnClass.equals("java.sql.Date")) {
//                        stringBuffer.append("SimpleDateFormat simpleDateFormat = new SimpleDateFormat(\"yyyy-MM-dd\");\n try {\n");
//                        stringBuffer.append("this." + columnName + "= new Date(simpleDateFormat.parse(" + columnName + ").getTime());\n");
//                        stringBuffer.append("\n} catch (ParseException e) {\n e.printStackTrace();\n}");
//                    } else if (columnClass.equals("java.sql.Time")) {
//                        stringBuffer.append("SimpleDateFormat simpleDateFormat = new SimpleDateFormat(\"HH:mm:ss\");\n try {\n");
//                        stringBuffer.append("this." + columnName + " = new Time(simpleDateFormat.parse(" + columnName + ").getTime());\n");
//                        stringBuffer.append("\n} catch (ParseException e) {\n e.printStackTrace();\n}");
//                    } else if (columnClass.equals("java.sql.Timestamp")) {
//                        stringBuffer.append("SimpleDateFormat simpleDateFormat = new SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\");\n try {\n");
//                        stringBuffer.append("this." + columnName + " = new Timestamp(simpleDateFormat.parse(" + columnName + ").getTime());\n");
//                        stringBuffer.append("\n} catch (ParseException e) {\n e.printStackTrace();\n}");
//
//                        //整形数字
//                    } else if (columnClass.equals("java.lang.Integer")) {
//                        stringBuffer.append("this." + columnName + "=Integer.parseInt(" + columnName + ");\n");
//                        //小数
//                    } else if (columnClass.equals("java.lang.Double")) {
//                        stringBuffer.append("this." + columnName + "=Double.parseDouble(" + columnName + ");\n");
//                    } else if (columnClass.equals("java.lang.Long")) {
//                        stringBuffer.append("this." + columnName + "=Long.parseLong(" + columnName + ");\n");
//                    } else if (columnClass.equals("java.lang.Float")) {
//                        stringBuffer.append("this." + columnName + "=Float.parseFloat(" + columnName + ");\n");
//                    } else if (columnClass.equals("java.math.BigDecimal")) {
//                        stringBuffer.append("this." + columnName + "=new BigDecimal(" + columnName + ");\n");
//                    } else {
//                        System.out.println("没找到该类型写入方法" + columnClass);
//                    }
//                    stringBuffer.append("\n}\n");
//                }
//                //添加构造函数
//                constructorBuffer.append(columnClass + " " + columnName + " ,");
//                subConstructor.append("this." + columnName + " = " + columnName + ";\n");
//                //添加toString方法
//                toStringBuffer.append("\"" + columnName + ":\"+ (" + columnName + "==null?\"null\":\"'\"+" + columnName + "+\"'\")+\",\"+");
//            }
//            //消除构造方法最后的逗号
//            StringBuffer constructBuffer2 = new StringBuffer();
//            constructBuffer2.append(constructorBuffer.substring(0, constructorBuffer.length() - 1));
//            constructBuffer2.append(")");
//            //将构造方法合成
//            constructBuffer2.append(subConstructor);
//            constructBuffer2.append("}\n");
//            //添加无参构造
//            constructBuffer2.append("public " + leiName + "(){}\n");
//            //消除tosting最后的加号
//            String itoString = toStringBuffer.substring(0, toStringBuffer.length() - 5);
//            itoString += "+\"}\"";
//            itoString += " ;\n}\n";
//            //添加实现接口的方法
//            stringBuffer.append("public String giveTableName() {\n return ");
//            stringBuffer.append("\"" + tableName + "\";\n}\n");
//            //普通表
//            if (primaryKeyNames != null && primaryKeyNames.length > 0) {
//                stringBuffer.append("public String givePrimaryColumnName() {\n return ");
//                stringBuffer.append("\"" + primaryKeyNames[0] + "\";\n}\n");
//                if (primaryKeyNames.length == 2) {//如果是两个复合主键
//                    stringBuffer.append("public String[] giveDualPrimaryName() {\n return new String[]{");
//                    stringBuffer.append("\"" + primaryKeyNames[0] + "\",\"" + primaryKeyNames[1] + "\"};\n}\n");
//                } else {//如果没有两个复合主键，由于接口要求，也得写
//                    stringBuffer.append("public String[] giveDualPrimaryName() {\n return ");
//                    stringBuffer.append("null;\n}\n");
//                }
//            } else {//如果3个以上主键或不写主键
//                stringBuffer.append("public String givePrimaryColumnName() {\n return ");
//                stringBuffer.append("null;\n}\n");
//                stringBuffer.append("public String[] giveDualPrimaryName() {\n return ");
//                stringBuffer.append("null;\n}\n");
//            }
//            //全部合成
//            stringBuffer.append(constructBuffer2).append(itoString);
//            stringBuffer.append("}\n");
//
//            String output = rootFold;
//            System.out.println("output:" + output);
//
//
//            try {
//                File file = null;
//                output = URLDecoder.decode(output, "utf-8");
//                //把rootfold去掉最后面的斜线并且替换classes目录为源文件目录,添加对tomcat的源路径支持
//                file = new File(output.substring(1).replace("/bin/", "/src/").replace("/WebRoot/WEB-INF/classes/", "/src/") + leiName + ".java");
//                if (!file.getParentFile().exists()) {
//                    file.getParentFile().mkdirs();
//                }
//                System.out.println("正在写入:" + file);
//                file.createNewFile();
//                FileOutputStream fos = new FileOutputStream(file);
//                byte[] data = stringBuffer.toString().getBytes("UTF-8");
//                fos.write(data);
//                fos.close();
//                System.out.println("类文件已成功写入到:" + file + "请右键刷新。" + leiName + "现在已可用");
//            } catch (FileNotFoundException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (UnsupportedEncodingException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//
//
//        } catch (SQLException e1) {
//            // TODO Auto-generated catch block
//            System.out.println("数据库连接失败，请检查用户名密码或配置文件");
//            e1.printStackTrace();
//            return null;
//        }
//        return stringBuffer.toString();
//    }

    public static void writeProperties(String ip, String dateBaseName, String user, String password) throws Exception {
        String rootFold = TableFactory.class.getResource("/").getFile();
        rootFold = rootFold.substring(1).replace("/bin/", "/src/").replace("/WebRoot/WEB-INF/classes/", "/src/");
        rootFold = URLDecoder.decode(rootFold, "utf-8");
        File file = new File(rootFold + "pwd.properties");
        System.out.println(file);


        ///保存属性到b.properties文件
        Properties properties = new Properties();
        FileOutputStream oFile;
        try {
            oFile = new FileOutputStream(file);
            //mysql 5.5.45之后需要加上useSSL=false，不然会报一些警告
            String dbName = "jdbc:mysql://" + ip + "/" + dateBaseName + "?useSSL=false&zeroDateTimeBehavior=convertToNull&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=GMT%2b8";//最后面那个是防止数据库中空的时间列报错
            properties.setProperty("url", dbName);
            properties.setProperty("username", user);
            properties.setProperty("password", password);
            properties.setProperty("driverClass", "com.mysql.jdbc.Driver");
            properties.setProperty("maxPoolSize", "100");
            properties.setProperty("minPoolSize", "10");
            properties.setProperty("initialPoolSize", "16");
            properties.setProperty("maxIdleTime", "5000");

            properties.store(oFile, "");
            oFile.close();
            System.out.println("配置文件已成功写入到src目录下，请右键刷新");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("发现中文目录，请在英文目录下建立项目");
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}
