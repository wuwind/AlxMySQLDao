package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_login_log implements Table{
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
private java.lang.String username;
public static String USERNAME = "username";
public java.lang.String getUsername(){
return username;
}
public void setUsername(java.lang.String username){
this.username=username;

}
private java.sql.Timestamp login_time;
public static String LOGIN_TIME = "login_time";
public java.sql.Timestamp getLogin_time(){
return login_time;
}
public void setLogin_time(java.sql.Timestamp login_time){
this.login_time=login_time;

}
public void setLogin_time(java.lang.String login_time){
if(login_time==null||login_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.login_time = new Timestamp(simpleDateFormat.parse(login_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.String location;
public static String LOCATION = "location";
public java.lang.String getLocation(){
return location;
}
public void setLocation(java.lang.String location){
this.location=location;

}
private java.lang.String ip;
public static String IP = "ip";
public java.lang.String getIp(){
return ip;
}
public void setIp(java.lang.String ip){
this.ip=ip;

}
private java.lang.String system;
public static String SYSTEM = "system";
public java.lang.String getSystem(){
return system;
}
public void setSystem(java.lang.String system){
this.system=system;

}
private java.lang.String browser;
public static String BROWSER = "browser";
public java.lang.String getBrowser(){
return browser;
}
public void setBrowser(java.lang.String browser){
this.browser=browser;

}
public String giveTableName() {
 return "t_login_log";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_login_log(java.lang.Long id ,java.lang.String username ,java.sql.Timestamp login_time ,java.lang.String location ,java.lang.String ip ,java.lang.String system ,java.lang.String browser ){
 super();
this.id = id;
this.username = username;
this.login_time = login_time;
this.location = location;
this.ip = ip;
this.system = system;
this.browser = browser;
}
public T_login_log(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"username:"+ (username==null?"null":"'"+username+"'")+","+"login_time:"+ (login_time==null?"null":"'"+login_time+"'")+","+"location:"+ (location==null?"null":"'"+location+"'")+","+"ip:"+ (ip==null?"null":"'"+ip+"'")+","+"system:"+ (system==null?"null":"'"+system+"'")+","+"browser:"+ (browser==null?"null":"'"+browser+"'")+"}" ;
}
}
