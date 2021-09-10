package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_task_material implements Table{
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
private java.lang.String material_name;
public static String MATERIAL_NAME = "material_name";
public java.lang.String getMaterial_name(){
return material_name;
}
public void setMaterial_name(java.lang.String material_name){
this.material_name=material_name;

}
private java.sql.Date plan_time;
public static String PLAN_TIME = "plan_time";
public java.sql.Date getPlan_time(){
return plan_time;
}
public void setPlan_time(java.sql.Date plan_time){
this.plan_time=plan_time;

}
public void setPlan_time(java.lang.String plan_time){
if(plan_time==null||plan_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.plan_time= new Date(simpleDateFormat.parse(plan_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Date complete_time;
public static String COMPLETE_TIME = "complete_time";
public java.sql.Date getComplete_time(){
return complete_time;
}
public void setComplete_time(java.sql.Date complete_time){
this.complete_time=complete_time;

}
public void setComplete_time(java.lang.String complete_time){
if(complete_time==null||complete_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.complete_time= new Date(simpleDateFormat.parse(complete_time).getTime());

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
 return "t_task_material";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_task_material(java.lang.Long id ,java.lang.String task_id ,java.lang.String material_name ,java.sql.Date plan_time ,java.sql.Date complete_time ,java.sql.Timestamp update_time ){
 super();
this.id = id;
this.task_id = task_id;
this.material_name = material_name;
this.plan_time = plan_time;
this.complete_time = complete_time;
this.update_time = update_time;
}
public T_task_material(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"material_name:"+ (material_name==null?"null":"'"+material_name+"'")+","+"plan_time:"+ (plan_time==null?"null":"'"+plan_time+"'")+","+"complete_time:"+ (complete_time==null?"null":"'"+complete_time+"'")+","+"update_time:"+ (update_time==null?"null":"'"+update_time+"'")+"}" ;
}
}
