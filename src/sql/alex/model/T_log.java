package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_log implements Table{
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
private java.lang.String operation;
public static String OPERATION = "operation";
public java.lang.String getOperation(){
return operation;
}
public void setOperation(java.lang.String operation){
this.operation=operation;

}
private java.math.BigDecimal time;
public static String TIME = "time";
public java.math.BigDecimal getTime(){
return time;
}
public void setTime(java.math.BigDecimal time){
this.time=time;

}
public void setTime(java.lang.String time){
if(time==null||time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.time=new BigDecimal(time);

}
private java.lang.String method;
public static String METHOD = "method";
public java.lang.String getMethod(){
return method;
}
public void setMethod(java.lang.String method){
this.method=method;

}
private java.lang.String params;
public static String PARAMS = "params";
public java.lang.String getParams(){
return params;
}
public void setParams(java.lang.String params){
this.params=params;

}
private java.lang.String ip;
public static String IP = "ip";
public java.lang.String getIp(){
return ip;
}
public void setIp(java.lang.String ip){
this.ip=ip;

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
private java.lang.String location;
public static String LOCATION = "location";
public java.lang.String getLocation(){
return location;
}
public void setLocation(java.lang.String location){
this.location=location;

}
public String giveTableName() {
 return "t_log";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_log(java.lang.Long id ,java.lang.String username ,java.lang.String operation ,java.math.BigDecimal time ,java.lang.String method ,java.lang.String params ,java.lang.String ip ,java.sql.Timestamp create_time ,java.lang.String location ){
 super();
this.id = id;
this.username = username;
this.operation = operation;
this.time = time;
this.method = method;
this.params = params;
this.ip = ip;
this.create_time = create_time;
this.location = location;
}
public T_log(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"username:"+ (username==null?"null":"'"+username+"'")+","+"operation:"+ (operation==null?"null":"'"+operation+"'")+","+"time:"+ (time==null?"null":"'"+time+"'")+","+"method:"+ (method==null?"null":"'"+method+"'")+","+"params:"+ (params==null?"null":"'"+params+"'")+","+"ip:"+ (ip==null?"null":"'"+ip+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+","+"location:"+ (location==null?"null":"'"+location+"'")+"}" ;
}
}
