package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_dept implements Table{
private java.lang.Long dept_id;
public static String DEPT_ID = "dept_id";
public java.lang.Long getDept_id(){
return dept_id;
}
public void setDept_id(java.lang.Long dept_id){
this.dept_id=dept_id;

}
public void setDept_id(java.lang.String dept_id){
if(dept_id==null||dept_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.dept_id=Long.parseLong(dept_id);

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
private java.lang.String dept_name;
public static String DEPT_NAME = "dept_name";
public java.lang.String getDept_name(){
return dept_name;
}
public void setDept_name(java.lang.String dept_name){
this.dept_name=dept_name;

}
private java.lang.Long order_num;
public static String ORDER_NUM = "order_num";
public java.lang.Long getOrder_num(){
return order_num;
}
public void setOrder_num(java.lang.Long order_num){
this.order_num=order_num;

}
public void setOrder_num(java.lang.String order_num){
if(order_num==null||order_num.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.order_num=Long.parseLong(order_num);

}
private java.sql.Timestamp create_time;
public static String CREATE_TIME = "create_time";
public java.sql.Timestamp getCreate_time(){
return create_time;
}
public void setCreate_time(java.sql.Timestamp create_time){
this.create_time=create_time;

}
public void setCreate_time(java.lang.String create_time){
if(create_time==null||create_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.create_time = new Timestamp(simpleDateFormat.parse(create_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Timestamp modify_time;
public static String MODIFY_TIME = "modify_time";
public java.sql.Timestamp getModify_time(){
return modify_time;
}
public void setModify_time(java.sql.Timestamp modify_time){
this.modify_time=modify_time;

}
public void setModify_time(java.lang.String modify_time){
if(modify_time==null||modify_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.modify_time = new Timestamp(simpleDateFormat.parse(modify_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
public String giveTableName() {
 return "t_dept";
}
public String givePrimaryColumnName() {
 return "dept_id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_dept(java.lang.Long dept_id ,java.lang.Long parent_id ,java.lang.String dept_name ,java.lang.Long order_num ,java.sql.Timestamp create_time ,java.sql.Timestamp modify_time ){
 super();
this.dept_id = dept_id;
this.parent_id = parent_id;
this.dept_name = dept_name;
this.order_num = order_num;
this.create_time = create_time;
this.modify_time = modify_time;
}
public T_dept(){}
public String toString(){
 return "{"+"dept_id:"+ (dept_id==null?"null":"'"+dept_id+"'")+","+"parent_id:"+ (parent_id==null?"null":"'"+parent_id+"'")+","+"dept_name:"+ (dept_name==null?"null":"'"+dept_name+"'")+","+"order_num:"+ (order_num==null?"null":"'"+order_num+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+","+"modify_time:"+ (modify_time==null?"null":"'"+modify_time+"'")+"}" ;
}
}
