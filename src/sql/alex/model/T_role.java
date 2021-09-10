package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_role implements Table{
private java.lang.Long role_id;
public static String ROLE_ID = "role_id";
public java.lang.Long getRole_id(){
return role_id;
}
public void setRole_id(java.lang.Long role_id){
this.role_id=role_id;

}
public void setRole_id(java.lang.String role_id){
if(role_id==null||role_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.role_id=Long.parseLong(role_id);

}
private java.lang.String role_name;
public static String ROLE_NAME = "role_name";
public java.lang.String getRole_name(){
return role_name;
}
public void setRole_name(java.lang.String role_name){
this.role_name=role_name;

}
private java.lang.String remark;
public static String REMARK = "remark";
public java.lang.String getRemark(){
return remark;
}
public void setRemark(java.lang.String remark){
this.remark=remark;

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
 return "t_role";
}
public String givePrimaryColumnName() {
 return "role_id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_role(java.lang.Long role_id ,java.lang.String role_name ,java.lang.String remark ,java.sql.Timestamp create_time ,java.sql.Timestamp modify_time ){
 super();
this.role_id = role_id;
this.role_name = role_name;
this.remark = remark;
this.create_time = create_time;
this.modify_time = modify_time;
}
public T_role(){}
public String toString(){
 return "{"+"role_id:"+ (role_id==null?"null":"'"+role_id+"'")+","+"role_name:"+ (role_name==null?"null":"'"+role_name+"'")+","+"remark:"+ (remark==null?"null":"'"+remark+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+","+"modify_time:"+ (modify_time==null?"null":"'"+modify_time+"'")+"}" ;
}
}
