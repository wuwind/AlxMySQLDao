package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_apply_record implements Table{
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
private java.lang.String task_id;
public static String TASK_ID = "task_id";
public java.lang.String getTask_id(){
return task_id;
}
public void setTask_id(java.lang.String task_id){
this.task_id=task_id;

}
private java.lang.Long task_process_id;
public static String TASK_PROCESS_ID = "task_process_id";
public java.lang.Long getTask_process_id(){
return task_process_id;
}
public void setTask_process_id(java.lang.Long task_process_id){
this.task_process_id=task_process_id;

}
public void setTask_process_id(java.lang.String task_process_id){
if(task_process_id==null||task_process_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.task_process_id=Long.parseLong(task_process_id);

}
private java.lang.String process_name;
public static String PROCESS_NAME = "process_name";
public java.lang.String getProcess_name(){
return process_name;
}
public void setProcess_name(java.lang.String process_name){
this.process_name=process_name;

}
private java.lang.Integer operation_type;
public static String OPERATION_TYPE = "operation_type";
public java.lang.Integer getOperation_type(){
return operation_type;
}
public void setOperation_type(java.lang.Integer operation_type){
this.operation_type=operation_type;

}
public void setOperation_type(java.lang.String operation_type){
if(operation_type==null||operation_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.operation_type=Integer.parseInt(operation_type);

}
private java.lang.String operation_reason;
public static String OPERATION_REASON = "operation_reason";
public java.lang.String getOperation_reason(){
return operation_reason;
}
public void setOperation_reason(java.lang.String operation_reason){
this.operation_reason=operation_reason;

}
private java.sql.Timestamp apply_time;
public static String APPLY_TIME = "apply_time";
public java.sql.Timestamp getApply_time(){
return apply_time;
}
public void setApply_time(java.sql.Timestamp apply_time){
this.apply_time=apply_time;

}
public void setApply_time(java.lang.String apply_time){
if(apply_time==null||apply_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.apply_time = new Timestamp(simpleDateFormat.parse(apply_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.String applicant;
public static String APPLICANT = "applicant";
public java.lang.String getApplicant(){
return applicant;
}
public void setApplicant(java.lang.String applicant){
this.applicant=applicant;

}
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
private java.lang.String dept_name;
public static String DEPT_NAME = "dept_name";
public java.lang.String getDept_name(){
return dept_name;
}
public void setDept_name(java.lang.String dept_name){
this.dept_name=dept_name;

}
private java.lang.Long parent_dept_id;
public static String PARENT_DEPT_ID = "parent_dept_id";
public java.lang.Long getParent_dept_id(){
return parent_dept_id;
}
public void setParent_dept_id(java.lang.Long parent_dept_id){
this.parent_dept_id=parent_dept_id;

}
public void setParent_dept_id(java.lang.String parent_dept_id){
if(parent_dept_id==null||parent_dept_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.parent_dept_id=Long.parseLong(parent_dept_id);

}
private java.lang.String parent_dept_name;
public static String PARENT_DEPT_NAME = "parent_dept_name";
public java.lang.String getParent_dept_name(){
return parent_dept_name;
}
public void setParent_dept_name(java.lang.String parent_dept_name){
this.parent_dept_name=parent_dept_name;

}
private java.lang.Integer dept_approval;
public static String DEPT_APPROVAL = "dept_approval";
public java.lang.Integer getDept_approval(){
return dept_approval;
}
public void setDept_approval(java.lang.Integer dept_approval){
this.dept_approval=dept_approval;

}
public void setDept_approval(java.lang.String dept_approval){
if(dept_approval==null||dept_approval.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.dept_approval=Integer.parseInt(dept_approval);

}
private java.lang.String dept_approval_operator;
public static String DEPT_APPROVAL_OPERATOR = "dept_approval_operator";
public java.lang.String getDept_approval_operator(){
return dept_approval_operator;
}
public void setDept_approval_operator(java.lang.String dept_approval_operator){
this.dept_approval_operator=dept_approval_operator;

}
private java.sql.Timestamp dept_approval_time;
public static String DEPT_APPROVAL_TIME = "dept_approval_time";
public java.sql.Timestamp getDept_approval_time(){
return dept_approval_time;
}
public void setDept_approval_time(java.sql.Timestamp dept_approval_time){
this.dept_approval_time=dept_approval_time;

}
public void setDept_approval_time(java.lang.String dept_approval_time){
if(dept_approval_time==null||dept_approval_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.dept_approval_time = new Timestamp(simpleDateFormat.parse(dept_approval_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.Integer parent_dept_approval;
public static String PARENT_DEPT_APPROVAL = "parent_dept_approval";
public java.lang.Integer getParent_dept_approval(){
return parent_dept_approval;
}
public void setParent_dept_approval(java.lang.Integer parent_dept_approval){
this.parent_dept_approval=parent_dept_approval;

}
public void setParent_dept_approval(java.lang.String parent_dept_approval){
if(parent_dept_approval==null||parent_dept_approval.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.parent_dept_approval=Integer.parseInt(parent_dept_approval);

}
private java.lang.String parent_dept_approval_operator;
public static String PARENT_DEPT_APPROVAL_OPERATOR = "parent_dept_approval_operator";
public java.lang.String getParent_dept_approval_operator(){
return parent_dept_approval_operator;
}
public void setParent_dept_approval_operator(java.lang.String parent_dept_approval_operator){
this.parent_dept_approval_operator=parent_dept_approval_operator;

}
private java.sql.Timestamp parent_dept_approval_time;
public static String PARENT_DEPT_APPROVAL_TIME = "parent_dept_approval_time";
public java.sql.Timestamp getParent_dept_approval_time(){
return parent_dept_approval_time;
}
public void setParent_dept_approval_time(java.sql.Timestamp parent_dept_approval_time){
this.parent_dept_approval_time=parent_dept_approval_time;

}
public void setParent_dept_approval_time(java.lang.String parent_dept_approval_time){
if(parent_dept_approval_time==null||parent_dept_approval_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.parent_dept_approval_time = new Timestamp(simpleDateFormat.parse(parent_dept_approval_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Timestamp update_time;
public static String UPDATE_TIME = "update_time";
public java.sql.Timestamp getUpdate_time(){
return update_time;
}
public void setUpdate_time(java.sql.Timestamp update_time){
this.update_time=update_time;

}
public void setUpdate_time(java.lang.String update_time){
if(update_time==null||update_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.update_time = new Timestamp(simpleDateFormat.parse(update_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
public String giveTableName() {
 return "t_apply_record";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_apply_record(java.lang.Long id ,java.lang.String task_id ,java.lang.Long task_process_id ,java.lang.String process_name ,java.lang.Integer operation_type ,java.lang.String operation_reason ,java.sql.Timestamp apply_time ,java.lang.String applicant ,java.lang.Long dept_id ,java.lang.String dept_name ,java.lang.Long parent_dept_id ,java.lang.String parent_dept_name ,java.lang.Integer dept_approval ,java.lang.String dept_approval_operator ,java.sql.Timestamp dept_approval_time ,java.lang.Integer parent_dept_approval ,java.lang.String parent_dept_approval_operator ,java.sql.Timestamp parent_dept_approval_time ,java.sql.Timestamp update_time ){
 super();
this.id = id;
this.task_id = task_id;
this.task_process_id = task_process_id;
this.process_name = process_name;
this.operation_type = operation_type;
this.operation_reason = operation_reason;
this.apply_time = apply_time;
this.applicant = applicant;
this.dept_id = dept_id;
this.dept_name = dept_name;
this.parent_dept_id = parent_dept_id;
this.parent_dept_name = parent_dept_name;
this.dept_approval = dept_approval;
this.dept_approval_operator = dept_approval_operator;
this.dept_approval_time = dept_approval_time;
this.parent_dept_approval = parent_dept_approval;
this.parent_dept_approval_operator = parent_dept_approval_operator;
this.parent_dept_approval_time = parent_dept_approval_time;
this.update_time = update_time;
}
public T_apply_record(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"task_process_id:"+ (task_process_id==null?"null":"'"+task_process_id+"'")+","+"process_name:"+ (process_name==null?"null":"'"+process_name+"'")+","+"operation_type:"+ (operation_type==null?"null":"'"+operation_type+"'")+","+"operation_reason:"+ (operation_reason==null?"null":"'"+operation_reason+"'")+","+"apply_time:"+ (apply_time==null?"null":"'"+apply_time+"'")+","+"applicant:"+ (applicant==null?"null":"'"+applicant+"'")+","+"dept_id:"+ (dept_id==null?"null":"'"+dept_id+"'")+","+"dept_name:"+ (dept_name==null?"null":"'"+dept_name+"'")+","+"parent_dept_id:"+ (parent_dept_id==null?"null":"'"+parent_dept_id+"'")+","+"parent_dept_name:"+ (parent_dept_name==null?"null":"'"+parent_dept_name+"'")+","+"dept_approval:"+ (dept_approval==null?"null":"'"+dept_approval+"'")+","+"dept_approval_operator:"+ (dept_approval_operator==null?"null":"'"+dept_approval_operator+"'")+","+"dept_approval_time:"+ (dept_approval_time==null?"null":"'"+dept_approval_time+"'")+","+"parent_dept_approval:"+ (parent_dept_approval==null?"null":"'"+parent_dept_approval+"'")+","+"parent_dept_approval_operator:"+ (parent_dept_approval_operator==null?"null":"'"+parent_dept_approval_operator+"'")+","+"parent_dept_approval_time:"+ (parent_dept_approval_time==null?"null":"'"+parent_dept_approval_time+"'")+","+"update_time:"+ (update_time==null?"null":"'"+update_time+"'")+"}" ;
}
}
