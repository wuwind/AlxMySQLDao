package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_job_log implements Table{
private java.lang.Long log_id;
public static String LOG_ID = "log_id";
public java.lang.Long getLog_id(){
return log_id;
}
public void setLog_id(java.lang.Long log_id){
this.log_id=log_id;

}
public void setLog_id(java.lang.String log_id){
if(log_id==null||log_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.log_id=Long.parseLong(log_id);

}
private java.lang.Long job_id;
public static String JOB_ID = "job_id";
public java.lang.Long getJob_id(){
return job_id;
}
public void setJob_id(java.lang.Long job_id){
this.job_id=job_id;

}
public void setJob_id(java.lang.String job_id){
if(job_id==null||job_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.job_id=Long.parseLong(job_id);

}
private java.lang.String bean_name;
public static String BEAN_NAME = "bean_name";
public java.lang.String getBean_name(){
return bean_name;
}
public void setBean_name(java.lang.String bean_name){
this.bean_name=bean_name;

}
private java.lang.String method_name;
public static String METHOD_NAME = "method_name";
public java.lang.String getMethod_name(){
return method_name;
}
public void setMethod_name(java.lang.String method_name){
this.method_name=method_name;

}
private java.lang.String params;
public static String PARAMS = "params";
public java.lang.String getParams(){
return params;
}
public void setParams(java.lang.String params){
this.params=params;

}
private java.lang.String status;
public static String STATUS = "status";
public java.lang.String getStatus(){
return status;
}
public void setStatus(java.lang.String status){
this.status=status;

}
private java.lang.String error;
public static String ERROR = "error";
public java.lang.String getError(){
return error;
}
public void setError(java.lang.String error){
this.error=error;

}
private java.math.BigDecimal times;
public static String TIMES = "times";
public java.math.BigDecimal getTimes(){
return times;
}
public void setTimes(java.math.BigDecimal times){
this.times=times;

}
public void setTimes(java.lang.String times){
if(times==null||times.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.times=new BigDecimal(times);

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
public String giveTableName() {
 return "t_job_log";
}
public String givePrimaryColumnName() {
 return "log_id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_job_log(java.lang.Long log_id ,java.lang.Long job_id ,java.lang.String bean_name ,java.lang.String method_name ,java.lang.String params ,java.lang.String status ,java.lang.String error ,java.math.BigDecimal times ,java.sql.Timestamp create_time ){
 super();
this.log_id = log_id;
this.job_id = job_id;
this.bean_name = bean_name;
this.method_name = method_name;
this.params = params;
this.status = status;
this.error = error;
this.times = times;
this.create_time = create_time;
}
public T_job_log(){}
public String toString(){
 return "{"+"log_id:"+ (log_id==null?"null":"'"+log_id+"'")+","+"job_id:"+ (job_id==null?"null":"'"+job_id+"'")+","+"bean_name:"+ (bean_name==null?"null":"'"+bean_name+"'")+","+"method_name:"+ (method_name==null?"null":"'"+method_name+"'")+","+"params:"+ (params==null?"null":"'"+params+"'")+","+"status:"+ (status==null?"null":"'"+status+"'")+","+"error:"+ (error==null?"null":"'"+error+"'")+","+"times:"+ (times==null?"null":"'"+times+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+"}" ;
}
}
