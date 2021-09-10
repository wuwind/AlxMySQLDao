package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class Task_engineer implements Table{
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
private java.lang.Integer engineer_type;
public static String ENGINEER_TYPE = "engineer_type";
public java.lang.Integer getEngineer_type(){
return engineer_type;
}
public void setEngineer_type(java.lang.Integer engineer_type){
this.engineer_type=engineer_type;

}
public void setEngineer_type(java.lang.String engineer_type){
if(engineer_type==null||engineer_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.engineer_type=Integer.parseInt(engineer_type);

}
private java.lang.String engineer_name;
public static String ENGINEER_NAME = "engineer_name";
public java.lang.String getEngineer_name(){
return engineer_name;
}
public void setEngineer_name(java.lang.String engineer_name){
this.engineer_name=engineer_name;

}
private java.lang.Integer handover_times;
public static String HANDOVER_TIMES = "handover_times";
public java.lang.Integer getHandover_times(){
return handover_times;
}
public void setHandover_times(java.lang.Integer handover_times){
this.handover_times=handover_times;

}
public void setHandover_times(java.lang.String handover_times){
if(handover_times==null||handover_times.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.handover_times=Integer.parseInt(handover_times);

}
public String giveTableName() {
 return "task_engineer";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public Task_engineer(java.lang.Long id ,java.lang.String task_id ,java.lang.Integer engineer_type ,java.lang.String engineer_name ,java.lang.Integer handover_times ){
 super();
this.id = id;
this.task_id = task_id;
this.engineer_type = engineer_type;
this.engineer_name = engineer_name;
this.handover_times = handover_times;
}
public Task_engineer(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"engineer_type:"+ (engineer_type==null?"null":"'"+engineer_type+"'")+","+"engineer_name:"+ (engineer_name==null?"null":"'"+engineer_name+"'")+","+"handover_times:"+ (handover_times==null?"null":"'"+handover_times+"'")+"}" ;
}
}
