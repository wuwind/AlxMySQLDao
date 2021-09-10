package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_user_role implements Table{
private java.lang.Long user_id;
public static String USER_ID = "user_id";
public java.lang.Long getUser_id(){
return user_id;
}
public void setUser_id(java.lang.Long user_id){
this.user_id=user_id;

}
public void setUser_id(java.lang.String user_id){
if(user_id==null||user_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.user_id=Long.parseLong(user_id);

}
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
public String giveTableName() {
 return "t_user_role";
}
public String givePrimaryColumnName() {
 return "user_id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_user_role(java.lang.Long user_id ,java.lang.Long role_id ){
 super();
this.user_id = user_id;
this.role_id = role_id;
}
public T_user_role(){}
public String toString(){
 return "{"+"user_id:"+ (user_id==null?"null":"'"+user_id+"'")+","+"role_id:"+ (role_id==null?"null":"'"+role_id+"'")+"}" ;
}
}
