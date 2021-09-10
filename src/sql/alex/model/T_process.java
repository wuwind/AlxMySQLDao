package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_process implements Table{
private java.lang.Long id;
public static String ID = "id";
public java.lang.Long getId(){
return id;
}
public void setId(java.lang.Long id){
this.id=id;

}
public void setId(java.lang.String id){
if(id==null||id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.id=Long.parseLong(id);

}
private java.lang.String process_name;
public static String PROCESS_NAME = "process_name";
public java.lang.String getProcess_name(){
return process_name;
}
public void setProcess_name(java.lang.String process_name){
this.process_name=process_name;

}
private java.lang.Integer process_level;
public static String PROCESS_LEVEL = "process_level";
public java.lang.Integer getProcess_level(){
return process_level;
}
public void setProcess_level(java.lang.Integer process_level){
this.process_level=process_level;

}
public void setProcess_level(java.lang.String process_level){
if(process_level==null||process_level.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.process_level=Integer.parseInt(process_level);

}
private java.lang.Long parent_id;
public static String PARENT_ID = "parent_id";
public java.lang.Long getParent_id(){
return parent_id;
}
public void setParent_id(java.lang.Long parent_id){
this.parent_id=parent_id;

}
public void setParent_id(java.lang.String parent_id){
if(parent_id==null||parent_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.parent_id=Long.parseLong(parent_id);

}
private java.lang.Integer has_child;
public static String HAS_CHILD = "has_child";
public java.lang.Integer getHas_child(){
return has_child;
}
public void setHas_child(java.lang.Integer has_child){
this.has_child=has_child;

}
public void setHas_child(java.lang.String has_child){
if(has_child==null||has_child.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.has_child=Integer.parseInt(has_child);

}
private java.lang.String process_sign;
public static String PROCESS_SIGN = "process_sign";
public java.lang.String getProcess_sign(){
return process_sign;
}
public void setProcess_sign(java.lang.String process_sign){
this.process_sign=process_sign;

}
private java.lang.Integer engineer_type;
public static String ENGINEER_TYPE = "engineer_type";
public java.lang.Integer getEngineer_type(){
return engineer_type;
}
public void setEngineer_type(java.lang.Integer engineer_type){
this.engineer_type=engineer_type;

}
public void setEngineer_type(java.lang.String engineer_type){
if(engineer_type==null||engineer_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.engineer_type=Integer.parseInt(engineer_type);

}
private java.lang.String output_file;
public static String OUTPUT_FILE = "output_file";
public java.lang.String getOutput_file(){
return output_file;
}
public void setOutput_file(java.lang.String output_file){
this.output_file=output_file;

}
private java.lang.Integer order_num;
public static String ORDER_NUM = "order_num";
public java.lang.Integer getOrder_num(){
return order_num;
}
public void setOrder_num(java.lang.Integer order_num){
this.order_num=order_num;

}
public void setOrder_num(java.lang.String order_num){
if(order_num==null||order_num.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.order_num=Integer.parseInt(order_num);

}
private java.lang.Integer is_primary;
public static String IS_PRIMARY = "is_primary";
public java.lang.Integer getIs_primary(){
return is_primary;
}
public void setIs_primary(java.lang.Integer is_primary){
this.is_primary=is_primary;

}
public void setIs_primary(java.lang.String is_primary){
if(is_primary==null||is_primary.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_primary=Integer.parseInt(is_primary);

}
public String giveTableName() {
 return "t_process";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_process(java.lang.Long id ,java.lang.String process_name ,java.lang.Integer process_level ,java.lang.Long parent_id ,java.lang.Integer has_child ,java.lang.String process_sign ,java.lang.Integer engineer_type ,java.lang.String output_file ,java.lang.Integer order_num ,java.lang.Integer is_primary ){
 super();
this.id = id;
this.process_name = process_name;
this.process_level = process_level;
this.parent_id = parent_id;
this.has_child = has_child;
this.process_sign = process_sign;
this.engineer_type = engineer_type;
this.output_file = output_file;
this.order_num = order_num;
this.is_primary = is_primary;
}
public T_process(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"process_name:"+ (process_name==null?"null":"'"+process_name+"'")+","+"process_level:"+ (process_level==null?"null":"'"+process_level+"'")+","+"parent_id:"+ (parent_id==null?"null":"'"+parent_id+"'")+","+"has_child:"+ (has_child==null?"null":"'"+has_child+"'")+","+"process_sign:"+ (process_sign==null?"null":"'"+process_sign+"'")+","+"engineer_type:"+ (engineer_type==null?"null":"'"+engineer_type+"'")+","+"output_file:"+ (output_file==null?"null":"'"+output_file+"'")+","+"order_num:"+ (order_num==null?"null":"'"+order_num+"'")+","+"is_primary:"+ (is_primary==null?"null":"'"+is_primary+"'")+"}" ;
}
}
