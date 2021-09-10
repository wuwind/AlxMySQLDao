package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_parts_detail implements Table{
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
private java.lang.Long parts_id;
public static String PARTS_ID = "parts_id";
public java.lang.Long getParts_id(){
return parts_id;
}
public void setParts_id(java.lang.Long parts_id){
this.parts_id=parts_id;

}
public void setParts_id(java.lang.String parts_id){
if(parts_id==null||parts_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.parts_id=Long.parseLong(parts_id);

}
private java.lang.String task_type;
public static String TASK_TYPE = "task_type";
public java.lang.String getTask_type(){
return task_type;
}
public void setTask_type(java.lang.String task_type){
this.task_type=task_type;

}
private java.lang.String undertake_unit;
public static String UNDERTAKE_UNIT = "undertake_unit";
public java.lang.String getUndertake_unit(){
return undertake_unit;
}
public void setUndertake_unit(java.lang.String undertake_unit){
this.undertake_unit=undertake_unit;

}
private java.lang.Integer parts_num;
public static String PARTS_NUM = "parts_num";
public java.lang.Integer getParts_num(){
return parts_num;
}
public void setParts_num(java.lang.Integer parts_num){
this.parts_num=parts_num;

}
public void setParts_num(java.lang.String parts_num){
if(parts_num==null||parts_num.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.parts_num=Integer.parseInt(parts_num);

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
private java.lang.String engineer_type;
public static String ENGINEER_TYPE = "engineer_type";
public java.lang.String getEngineer_type(){
return engineer_type;
}
public void setEngineer_type(java.lang.String engineer_type){
this.engineer_type=engineer_type;

}
private java.lang.String output_file;
public static String OUTPUT_FILE = "output_file";
public java.lang.String getOutput_file(){
return output_file;
}
public void setOutput_file(java.lang.String output_file){
this.output_file=output_file;

}
private java.lang.Integer group;
public static String GROUP = "group";
public java.lang.Integer getGroup(){
return group;
}
public void setGroup(java.lang.Integer group){
this.group=group;

}
public void setGroup(java.lang.String group){
if(group==null||group.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.group=Integer.parseInt(group);

}
private java.lang.Long p_order;
public static String P_ORDER = "p_order";
public java.lang.Long getP_order(){
return p_order;
}
public void setP_order(java.lang.Long p_order){
this.p_order=p_order;

}
public void setP_order(java.lang.String p_order){
if(p_order==null||p_order.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.p_order=Long.parseLong(p_order);

}
private java.lang.Integer order_num;
public static String ORDER_NUM = "order_num";
public java.lang.Integer getOrder_num(){
return order_num;
}
public void setOrder_num(java.lang.Integer order_num){
this.order_num=order_num;

}
public void setOrder_num(java.lang.String order_num){
if(order_num==null||order_num.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.order_num=Integer.parseInt(order_num);

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
private java.lang.Integer repeat_time;
public static String REPEAT_TIME = "repeat_time";
public java.lang.Integer getRepeat_time(){
return repeat_time;
}
public void setRepeat_time(java.lang.Integer repeat_time){
this.repeat_time=repeat_time;

}
public void setRepeat_time(java.lang.String repeat_time){
if(repeat_time==null||repeat_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.repeat_time=Integer.parseInt(repeat_time);

}
private java.lang.String remark;
public static String REMARK = "remark";
public java.lang.String getRemark(){
return remark;
}
public void setRemark(java.lang.String remark){
this.remark=remark;

}
public String giveTableName() {
 return "t_parts_detail";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_parts_detail(java.lang.Long id ,java.lang.String task_id ,java.lang.Long parts_id ,java.lang.String task_type ,java.lang.String undertake_unit ,java.lang.Integer parts_num ,java.sql.Date plan_time ,java.sql.Date complete_time ,java.lang.String engineer_type ,java.lang.String output_file ,java.lang.Integer group ,java.lang.Long p_order ,java.lang.Integer order_num ,java.lang.Integer delay_count ,java.lang.Integer repeat_time ,java.lang.String remark ){
 super();
this.id = id;
this.task_id = task_id;
this.parts_id = parts_id;
this.task_type = task_type;
this.undertake_unit = undertake_unit;
this.parts_num = parts_num;
this.plan_time = plan_time;
this.complete_time = complete_time;
this.engineer_type = engineer_type;
this.output_file = output_file;
this.group = group;
this.p_order = p_order;
this.order_num = order_num;
this.delay_count = delay_count;
this.repeat_time = repeat_time;
this.remark = remark;
}
public T_parts_detail(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"parts_id:"+ (parts_id==null?"null":"'"+parts_id+"'")+","+"task_type:"+ (task_type==null?"null":"'"+task_type+"'")+","+"undertake_unit:"+ (undertake_unit==null?"null":"'"+undertake_unit+"'")+","+"parts_num:"+ (parts_num==null?"null":"'"+parts_num+"'")+","+"plan_time:"+ (plan_time==null?"null":"'"+plan_time+"'")+","+"complete_time:"+ (complete_time==null?"null":"'"+complete_time+"'")+","+"engineer_type:"+ (engineer_type==null?"null":"'"+engineer_type+"'")+","+"output_file:"+ (output_file==null?"null":"'"+output_file+"'")+","+"group:"+ (group==null?"null":"'"+group+"'")+","+"p_order:"+ (p_order==null?"null":"'"+p_order+"'")+","+"order_num:"+ (order_num==null?"null":"'"+order_num+"'")+","+"delay_count:"+ (delay_count==null?"null":"'"+delay_count+"'")+","+"repeat_time:"+ (repeat_time==null?"null":"'"+repeat_time+"'")+","+"remark:"+ (remark==null?"null":"'"+remark+"'")+"}" ;
}
}
