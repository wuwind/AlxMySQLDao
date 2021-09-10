package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class User_company implements Table{
private java.lang.Integer id;
public static String ID = "id";
public java.lang.Integer getId(){
return id;
}
public void setId(java.lang.Integer id){
this.id=id;

}
public void setId(java.lang.String id){
if(id==null||id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.id=Integer.parseInt(id);

}
private java.lang.Integer user_id;
public static String USER_ID = "user_id";
public java.lang.Integer getUser_id(){
return user_id;
}
public void setUser_id(java.lang.Integer user_id){
this.user_id=user_id;

}
public void setUser_id(java.lang.String user_id){
if(user_id==null||user_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.user_id=Integer.parseInt(user_id);

}
public String giveTableName() {
 return "user_company";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public User_company(java.lang.Integer id ,java.lang.Integer user_id ){
 super();
this.id = id;
this.user_id = user_id;
}
public User_company(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"user_id:"+ (user_id==null?"null":"'"+user_id+"'")+"}" ;
}
}
