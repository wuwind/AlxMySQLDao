package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_job implements Table{
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
private java.lang.String cron_expression;
public static String CRON_EXPRESSION = "cron_expression";
public java.lang.String getCron_expression(){
return cron_expression;
}
public void setCron_expression(java.lang.String cron_expression){
this.cron_expression=cron_expression;

}
private java.lang.String status;
public static String STATUS = "status";
public java.lang.String getStatus(){
return status;
}
public void setStatus(java.lang.String status){
this.status=status;

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
public String giveTableName() {
 return "t_job";
}
public String givePrimaryColumnName() {
 return "job_id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_job(java.lang.Long job_id ,java.lang.String bean_name ,java.lang.String method_name ,java.lang.String params ,java.lang.String cron_expression ,java.lang.String status ,java.lang.String remark ,java.sql.Timestamp create_time ){
 super();
this.job_id = job_id;
this.bean_name = bean_name;
this.method_name = method_name;
this.params = params;
this.cron_expression = cron_expression;
this.status = status;
this.remark = remark;
this.create_time = create_time;
}
public T_job(){}
public String toString(){
 return "{"+"job_id:"+ (job_id==null?"null":"'"+job_id+"'")+","+"bean_name:"+ (bean_name==null?"null":"'"+bean_name+"'")+","+"method_name:"+ (method_name==null?"null":"'"+method_name+"'")+","+"params:"+ (params==null?"null":"'"+params+"'")+","+"cron_expression:"+ (cron_expression==null?"null":"'"+cron_expression+"'")+","+"status:"+ (status==null?"null":"'"+status+"'")+","+"remark:"+ (remark==null?"null":"'"+remark+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+"}" ;
}
}
