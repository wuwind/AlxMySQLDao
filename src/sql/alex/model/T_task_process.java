package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_task_process implements Table{
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
private java.lang.Long process_id;
public static String PROCESS_ID = "process_id";
public java.lang.Long getProcess_id(){
return process_id;
}
public void setProcess_id(java.lang.Long process_id){
this.process_id=process_id;

}
public void setProcess_id(java.lang.String process_id){
if(process_id==null||process_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.process_id=Long.parseLong(process_id);

}
private java.sql.Timestamp deadline_time;
public static String DEADLINE_TIME = "deadline_time";
public java.sql.Timestamp getDeadline_time(){
return deadline_time;
}
public void setDeadline_time(java.sql.Timestamp deadline_time){
this.deadline_time=deadline_time;

}
public void setDeadline_time(java.lang.String deadline_time){
if(deadline_time==null||deadline_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.deadline_time = new Timestamp(simpleDateFormat.parse(deadline_time).getTime());

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
private java.lang.String person_in_charge;
public static String PERSON_IN_CHARGE = "person_in_charge";
public java.lang.String getPerson_in_charge(){
return person_in_charge;
}
public void setPerson_in_charge(java.lang.String person_in_charge){
this.person_in_charge=person_in_charge;

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
private java.lang.Integer enabled;
public static String ENABLED = "enabled";
public java.lang.Integer getEnabled(){
return enabled;
}
public void setEnabled(java.lang.Integer enabled){
this.enabled=enabled;

}
public void setEnabled(java.lang.String enabled){
if(enabled==null||enabled.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.enabled=Integer.parseInt(enabled);

}
private java.lang.Integer hidden;
public static String HIDDEN = "hidden";
public java.lang.Integer getHidden(){
return hidden;
}
public void setHidden(java.lang.Integer hidden){
this.hidden=hidden;

}
public void setHidden(java.lang.String hidden){
if(hidden==null||hidden.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.hidden=Integer.parseInt(hidden);

}
private java.lang.Integer editable;
public static String EDITABLE = "editable";
public java.lang.Integer getEditable(){
return editable;
}
public void setEditable(java.lang.Integer editable){
this.editable=editable;

}
public void setEditable(java.lang.String editable){
if(editable==null||editable.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.editable=Integer.parseInt(editable);

}
private java.lang.Integer is_delay;
public static String IS_DELAY = "is_delay";
public java.lang.Integer getIs_delay(){
return is_delay;
}
public void setIs_delay(java.lang.Integer is_delay){
this.is_delay=is_delay;

}
public void setIs_delay(java.lang.String is_delay){
if(is_delay==null||is_delay.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_delay=Integer.parseInt(is_delay);

}
private java.lang.Integer p_state;
public static String P_STATE = "p_state";
public java.lang.Integer getP_state(){
return p_state;
}
public void setP_state(java.lang.Integer p_state){
this.p_state=p_state;

}
public void setP_state(java.lang.String p_state){
if(p_state==null||p_state.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.p_state=Integer.parseInt(p_state);

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
private java.lang.Integer delay_count;
public static String DELAY_COUNT = "delay_count";
public java.lang.Integer getDelay_count(){
return delay_count;
}
public void setDelay_count(java.lang.Integer delay_count){
this.delay_count=delay_count;

}
public void setDelay_count(java.lang.String delay_count){
if(delay_count==null||delay_count.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.delay_count=Integer.parseInt(delay_count);

}
private java.lang.String delay_reason;
public static String DELAY_REASON = "delay_reason";
public java.lang.String getDelay_reason(){
return delay_reason;
}
public void setDelay_reason(java.lang.String delay_reason){
this.delay_reason=delay_reason;

}
public String giveTableName() {
 return "t_task_process";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_task_process(java.lang.Long id ,java.lang.String task_id ,java.lang.Long process_id ,java.sql.Timestamp deadline_time ,java.sql.Timestamp actual_time ,java.lang.String person_in_charge ,java.lang.Integer handover_times ,java.lang.Integer enabled ,java.lang.Integer hidden ,java.lang.Integer editable ,java.lang.Integer is_delay ,java.lang.Integer p_state ,java.lang.Integer state ,java.lang.Integer delay_count ,java.lang.String delay_reason ){
 super();
this.id = id;
this.task_id = task_id;
this.process_id = process_id;
this.deadline_time = deadline_time;
this.actual_time = actual_time;
this.person_in_charge = person_in_charge;
this.handover_times = handover_times;
this.enabled = enabled;
this.hidden = hidden;
this.editable = editable;
this.is_delay = is_delay;
this.p_state = p_state;
this.state = state;
this.delay_count = delay_count;
this.delay_reason = delay_reason;
}
public T_task_process(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"process_id:"+ (process_id==null?"null":"'"+process_id+"'")+","+"deadline_time:"+ (deadline_time==null?"null":"'"+deadline_time+"'")+","+"actual_time:"+ (actual_time==null?"null":"'"+actual_time+"'")+","+"person_in_charge:"+ (person_in_charge==null?"null":"'"+person_in_charge+"'")+","+"handover_times:"+ (handover_times==null?"null":"'"+handover_times+"'")+","+"enabled:"+ (enabled==null?"null":"'"+enabled+"'")+","+"hidden:"+ (hidden==null?"null":"'"+hidden+"'")+","+"editable:"+ (editable==null?"null":"'"+editable+"'")+","+"is_delay:"+ (is_delay==null?"null":"'"+is_delay+"'")+","+"p_state:"+ (p_state==null?"null":"'"+p_state+"'")+","+"state:"+ (state==null?"null":"'"+state+"'")+","+"delay_count:"+ (delay_count==null?"null":"'"+delay_count+"'")+","+"delay_reason:"+ (delay_reason==null?"null":"'"+delay_reason+"'")+"}" ;
}
}
