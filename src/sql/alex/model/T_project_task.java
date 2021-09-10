package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_project_task implements Table{
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
private java.lang.String task_id;
public static String TASK_ID = "task_id";
public java.lang.String getTask_id(){
return task_id;
}
public void setTask_id(java.lang.String task_id){
this.task_id=task_id;

}
private java.lang.Integer task_attribute_id;
public static String TASK_ATTRIBUTE_ID = "task_attribute_id";
public java.lang.Integer getTask_attribute_id(){
return task_attribute_id;
}
public void setTask_attribute_id(java.lang.Integer task_attribute_id){
this.task_attribute_id=task_attribute_id;

}
public void setTask_attribute_id(java.lang.String task_attribute_id){
if(task_attribute_id==null||task_attribute_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.task_attribute_id=Integer.parseInt(task_attribute_id);

}
private java.lang.Integer business_department_id;
public static String BUSINESS_DEPARTMENT_ID = "business_department_id";
public java.lang.Integer getBusiness_department_id(){
return business_department_id;
}
public void setBusiness_department_id(java.lang.Integer business_department_id){
this.business_department_id=business_department_id;

}
public void setBusiness_department_id(java.lang.String business_department_id){
if(business_department_id==null||business_department_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.business_department_id=Integer.parseInt(business_department_id);

}
private java.lang.Integer product_id;
public static String PRODUCT_ID = "product_id";
public java.lang.Integer getProduct_id(){
return product_id;
}
public void setProduct_id(java.lang.Integer product_id){
this.product_id=product_id;

}
public void setProduct_id(java.lang.String product_id){
if(product_id==null||product_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.product_id=Integer.parseInt(product_id);

}
private java.lang.Integer undertake_department_id;
public static String UNDERTAKE_DEPARTMENT_ID = "undertake_department_id";
public java.lang.Integer getUndertake_department_id(){
return undertake_department_id;
}
public void setUndertake_department_id(java.lang.Integer undertake_department_id){
this.undertake_department_id=undertake_department_id;

}
public void setUndertake_department_id(java.lang.String undertake_department_id){
if(undertake_department_id==null||undertake_department_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.undertake_department_id=Integer.parseInt(undertake_department_id);

}
private java.sql.Timestamp issued_date;
public static String ISSUED_DATE = "issued_date";
public java.sql.Timestamp getIssued_date(){
return issued_date;
}
public void setIssued_date(java.sql.Timestamp issued_date){
this.issued_date=issued_date;

}
public void setIssued_date(java.lang.String issued_date){
if(issued_date==null||issued_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.issued_date = new Timestamp(simpleDateFormat.parse(issued_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.String sales_rep;
public static String SALES_REP = "sales_rep";
public java.lang.String getSales_rep(){
return sales_rep;
}
public void setSales_rep(java.lang.String sales_rep){
this.sales_rep=sales_rep;

}
private java.lang.String project_engineer;
public static String PROJECT_ENGINEER = "project_engineer";
public java.lang.String getProject_engineer(){
return project_engineer;
}
public void setProject_engineer(java.lang.String project_engineer){
this.project_engineer=project_engineer;

}
private java.lang.String project_schedule;
public static String PROJECT_SCHEDULE = "project_schedule";
public java.lang.String getProject_schedule(){
return project_schedule;
}
public void setProject_schedule(java.lang.String project_schedule){
this.project_schedule=project_schedule;

}
private java.lang.Integer current_state;
public static String CURRENT_STATE = "current_state";
public java.lang.Integer getCurrent_state(){
return current_state;
}
public void setCurrent_state(java.lang.Integer current_state){
this.current_state=current_state;

}
public void setCurrent_state(java.lang.String current_state){
if(current_state==null||current_state.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.current_state=Integer.parseInt(current_state);

}
private java.sql.Timestamp suspend_time;
public static String SUSPEND_TIME = "suspend_time";
public java.sql.Timestamp getSuspend_time(){
return suspend_time;
}
public void setSuspend_time(java.sql.Timestamp suspend_time){
this.suspend_time=suspend_time;

}
public void setSuspend_time(java.lang.String suspend_time){
if(suspend_time==null||suspend_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.suspend_time = new Timestamp(simpleDateFormat.parse(suspend_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.String product_infor;
public static String PRODUCT_INFOR = "product_infor";
public java.lang.String getProduct_infor(){
return product_infor;
}
public void setProduct_infor(java.lang.String product_infor){
this.product_infor=product_infor;

}
private java.lang.String product_drawing_no;
public static String PRODUCT_DRAWING_NO = "product_drawing_no";
public java.lang.String getProduct_drawing_no(){
return product_drawing_no;
}
public void setProduct_drawing_no(java.lang.String product_drawing_no){
this.product_drawing_no=product_drawing_no;

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
 return "t_project_task";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_project_task(java.lang.Long id ,java.lang.Long parent_id ,java.lang.String task_id ,java.lang.Integer task_attribute_id ,java.lang.Integer business_department_id ,java.lang.Integer product_id ,java.lang.Integer undertake_department_id ,java.sql.Timestamp issued_date ,java.lang.String sales_rep ,java.lang.String project_engineer ,java.lang.String project_schedule ,java.lang.Integer current_state ,java.sql.Timestamp suspend_time ,java.lang.String product_infor ,java.lang.String product_drawing_no ,java.sql.Timestamp create_time ){
 super();
this.id = id;
this.parent_id = parent_id;
this.task_id = task_id;
this.task_attribute_id = task_attribute_id;
this.business_department_id = business_department_id;
this.product_id = product_id;
this.undertake_department_id = undertake_department_id;
this.issued_date = issued_date;
this.sales_rep = sales_rep;
this.project_engineer = project_engineer;
this.project_schedule = project_schedule;
this.current_state = current_state;
this.suspend_time = suspend_time;
this.product_infor = product_infor;
this.product_drawing_no = product_drawing_no;
this.create_time = create_time;
}
public T_project_task(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"parent_id:"+ (parent_id==null?"null":"'"+parent_id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"task_attribute_id:"+ (task_attribute_id==null?"null":"'"+task_attribute_id+"'")+","+"business_department_id:"+ (business_department_id==null?"null":"'"+business_department_id+"'")+","+"product_id:"+ (product_id==null?"null":"'"+product_id+"'")+","+"undertake_department_id:"+ (undertake_department_id==null?"null":"'"+undertake_department_id+"'")+","+"issued_date:"+ (issued_date==null?"null":"'"+issued_date+"'")+","+"sales_rep:"+ (sales_rep==null?"null":"'"+sales_rep+"'")+","+"project_engineer:"+ (project_engineer==null?"null":"'"+project_engineer+"'")+","+"project_schedule:"+ (project_schedule==null?"null":"'"+project_schedule+"'")+","+"current_state:"+ (current_state==null?"null":"'"+current_state+"'")+","+"suspend_time:"+ (suspend_time==null?"null":"'"+suspend_time+"'")+","+"product_infor:"+ (product_infor==null?"null":"'"+product_infor+"'")+","+"product_drawing_no:"+ (product_drawing_no==null?"null":"'"+product_drawing_no+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+"}" ;
}
}
