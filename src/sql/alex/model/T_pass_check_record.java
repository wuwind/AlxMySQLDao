package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_pass_check_record implements Table{
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
private java.lang.String personnel_name;
public static String PERSONNEL_NAME = "personnel_name";
public java.lang.String getPersonnel_name(){
return personnel_name;
}
public void setPersonnel_name(java.lang.String personnel_name){
this.personnel_name=personnel_name;

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
private java.lang.String parent_dept;
public static String PARENT_DEPT = "parent_dept";
public java.lang.String getParent_dept(){
return parent_dept;
}
public void setParent_dept(java.lang.String parent_dept){
this.parent_dept=parent_dept;

}
private java.lang.String dept_name;
public static String DEPT_NAME = "dept_name";
public java.lang.String getDept_name(){
return dept_name;
}
public void setDept_name(java.lang.String dept_name){
this.dept_name=dept_name;

}
private java.lang.String work_area;
public static String WORK_AREA = "work_area";
public java.lang.String getWork_area(){
return work_area;
}
public void setWork_area(java.lang.String work_area){
this.work_area=work_area;

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
private java.lang.String dest_area;
public static String DEST_AREA = "dest_area";
public java.lang.String getDest_area(){
return dest_area;
}
public void setDest_area(java.lang.String dest_area){
this.dest_area=dest_area;

}
private java.sql.Timestamp start_time;
public static String START_TIME = "start_time";
public java.sql.Timestamp getStart_time(){
return start_time;
}
public void setStart_time(java.sql.Timestamp start_time){
this.start_time=start_time;

}
public void setStart_time(java.lang.String start_time){
if(start_time==null||start_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.start_time = new Timestamp(simpleDateFormat.parse(start_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Timestamp estimate_time;
public static String ESTIMATE_TIME = "estimate_time";
public java.sql.Timestamp getEstimate_time(){
return estimate_time;
}
public void setEstimate_time(java.sql.Timestamp estimate_time){
this.estimate_time=estimate_time;

}
public void setEstimate_time(java.lang.String estimate_time){
if(estimate_time==null||estimate_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.estimate_time = new Timestamp(simpleDateFormat.parse(estimate_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
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
private java.sql.Timestamp actual_time;
public static String ACTUAL_TIME = "actual_time";
public java.sql.Timestamp getActual_time(){
return actual_time;
}
public void setActual_time(java.sql.Timestamp actual_time){
this.actual_time=actual_time;

}
public void setActual_time(java.lang.String actual_time){
if(actual_time==null||actual_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.actual_time = new Timestamp(simpleDateFormat.parse(actual_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.String apply_matters;
public static String APPLY_MATTERS = "apply_matters";
public java.lang.String getApply_matters(){
return apply_matters;
}
public void setApply_matters(java.lang.String apply_matters){
this.apply_matters=apply_matters;

}
public String giveTableName() {
 return "t_pass_check_record";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_pass_check_record(java.lang.Long id ,java.lang.Long user_id ,java.lang.String personnel_name ,java.lang.Long parent_dept_id ,java.lang.Long dept_id ,java.lang.String parent_dept ,java.lang.String dept_name ,java.lang.String work_area ,java.sql.Timestamp apply_time ,java.lang.String dest_area ,java.sql.Timestamp start_time ,java.sql.Timestamp estimate_time ,java.lang.Integer dept_approval ,java.lang.String dept_approval_operator ,java.sql.Timestamp dept_approval_time ,java.lang.Integer parent_dept_approval ,java.lang.String parent_dept_approval_operator ,java.sql.Timestamp parent_dept_approval_time ,java.sql.Timestamp actual_time ,java.lang.String apply_matters ){
 super();
this.id = id;
this.user_id = user_id;
this.personnel_name = personnel_name;
this.parent_dept_id = parent_dept_id;
this.dept_id = dept_id;
this.parent_dept = parent_dept;
this.dept_name = dept_name;
this.work_area = work_area;
this.apply_time = apply_time;
this.dest_area = dest_area;
this.start_time = start_time;
this.estimate_time = estimate_time;
this.dept_approval = dept_approval;
this.dept_approval_operator = dept_approval_operator;
this.dept_approval_time = dept_approval_time;
this.parent_dept_approval = parent_dept_approval;
this.parent_dept_approval_operator = parent_dept_approval_operator;
this.parent_dept_approval_time = parent_dept_approval_time;
this.actual_time = actual_time;
this.apply_matters = apply_matters;
}
public T_pass_check_record(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"user_id:"+ (user_id==null?"null":"'"+user_id+"'")+","+"personnel_name:"+ (personnel_name==null?"null":"'"+personnel_name+"'")+","+"parent_dept_id:"+ (parent_dept_id==null?"null":"'"+parent_dept_id+"'")+","+"dept_id:"+ (dept_id==null?"null":"'"+dept_id+"'")+","+"parent_dept:"+ (parent_dept==null?"null":"'"+parent_dept+"'")+","+"dept_name:"+ (dept_name==null?"null":"'"+dept_name+"'")+","+"work_area:"+ (work_area==null?"null":"'"+work_area+"'")+","+"apply_time:"+ (apply_time==null?"null":"'"+apply_time+"'")+","+"dest_area:"+ (dest_area==null?"null":"'"+dest_area+"'")+","+"start_time:"+ (start_time==null?"null":"'"+start_time+"'")+","+"estimate_time:"+ (estimate_time==null?"null":"'"+estimate_time+"'")+","+"dept_approval:"+ (dept_approval==null?"null":"'"+dept_approval+"'")+","+"dept_approval_operator:"+ (dept_approval_operator==null?"null":"'"+dept_approval_operator+"'")+","+"dept_approval_time:"+ (dept_approval_time==null?"null":"'"+dept_approval_time+"'")+","+"parent_dept_approval:"+ (parent_dept_approval==null?"null":"'"+parent_dept_approval+"'")+","+"parent_dept_approval_operator:"+ (parent_dept_approval_operator==null?"null":"'"+parent_dept_approval_operator+"'")+","+"parent_dept_approval_time:"+ (parent_dept_approval_time==null?"null":"'"+parent_dept_approval_time+"'")+","+"actual_time:"+ (actual_time==null?"null":"'"+actual_time+"'")+","+"apply_matters:"+ (apply_matters==null?"null":"'"+apply_matters+"'")+"}" ;
}
}
