package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_task_timeline implements Table{
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
private java.lang.String content;
public static String CONTENT = "content";
public java.lang.String getContent(){
return content;
}
public void setContent(java.lang.String content){
this.content=content;

}
private java.lang.Integer state;
public static String STATE = "state";
public java.lang.Integer getState(){
return state;
}
public void setState(java.lang.Integer state){
this.state=state;

}
public void setState(java.lang.String state){
if(state==null||state.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.state=Integer.parseInt(state);

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
 return "t_task_timeline";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_task_timeline(java.lang.Long id ,java.lang.String task_id ,java.lang.String content ,java.lang.Integer state ,java.sql.Timestamp create_time ){
 super();
this.id = id;
this.task_id = task_id;
this.content = content;
this.state = state;
this.create_time = create_time;
}
public T_task_timeline(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"content:"+ (content==null?"null":"'"+content+"'")+","+"state:"+ (state==null?"null":"'"+state+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+"}" ;
}
}
