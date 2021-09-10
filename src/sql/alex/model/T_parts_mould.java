package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_parts_mould implements Table{
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
private java.lang.String task_content;
public static String TASK_CONTENT = "task_content";
public java.lang.String getTask_content(){
return task_content;
}
public void setTask_content(java.lang.String task_content){
this.task_content=task_content;

}
private java.lang.String provide_plan_time;
public static String PROVIDE_PLAN_TIME = "provide_plan_time";
public java.lang.String getProvide_plan_time(){
return provide_plan_time;
}
public void setProvide_plan_time(java.lang.String provide_plan_time){
this.provide_plan_time=provide_plan_time;

}
private java.lang.String provide_complete_time;
public static String PROVIDE_COMPLETE_TIME = "provide_complete_time";
public java.lang.String getProvide_complete_time(){
return provide_complete_time;
}
public void setProvide_complete_time(java.lang.String provide_complete_time){
this.provide_complete_time=provide_complete_time;

}
private java.lang.String testing_plan_time;
public static String TESTING_PLAN_TIME = "testing_plan_time";
public java.lang.String getTesting_plan_time(){
return testing_plan_time;
}
public void setTesting_plan_time(java.lang.String testing_plan_time){
this.testing_plan_time=testing_plan_time;

}
private java.lang.String testing_complete_time;
public static String TESTING_COMPLETE_TIME = "testing_complete_time";
public java.lang.String getTesting_complete_time(){
return testing_complete_time;
}
public void setTesting_complete_time(java.lang.String testing_complete_time){
this.testing_complete_time=testing_complete_time;

}
private java.lang.String review_plan_time;
public static String REVIEW_PLAN_TIME = "review_plan_time";
public java.lang.String getReview_plan_time(){
return review_plan_time;
}
public void setReview_plan_time(java.lang.String review_plan_time){
this.review_plan_time=review_plan_time;

}
private java.lang.String review_complete_time;
public static String REVIEW_COMPLETE_TIME = "review_complete_time";
public java.lang.String getReview_complete_time(){
return review_complete_time;
}
public void setReview_complete_time(java.lang.String review_complete_time){
this.review_complete_time=review_complete_time;

}
private java.lang.String engineer_type;
public static String ENGINEER_TYPE = "engineer_type";
public java.lang.String getEngineer_type(){
return engineer_type;
}
public void setEngineer_type(java.lang.String engineer_type){
this.engineer_type=engineer_type;

}
private java.lang.String remark;
public static String REMARK = "remark";
public java.lang.String getRemark(){
return remark;
}
public void setRemark(java.lang.String remark){
this.remark=remark;

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
public String giveTableName() {
 return "t_parts_mould";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_parts_mould(java.lang.Long id ,java.lang.Long parts_id ,java.lang.String task_content ,java.lang.String provide_plan_time ,java.lang.String provide_complete_time ,java.lang.String testing_plan_time ,java.lang.String testing_complete_time ,java.lang.String review_plan_time ,java.lang.String review_complete_time ,java.lang.String engineer_type ,java.lang.String remark ,java.lang.Long p_order ,java.lang.Integer order_num ,java.lang.Integer delay_count ){
 super();
this.id = id;
this.parts_id = parts_id;
this.task_content = task_content;
this.provide_plan_time = provide_plan_time;
this.provide_complete_time = provide_complete_time;
this.testing_plan_time = testing_plan_time;
this.testing_complete_time = testing_complete_time;
this.review_plan_time = review_plan_time;
this.review_complete_time = review_complete_time;
this.engineer_type = engineer_type;
this.remark = remark;
this.p_order = p_order;
this.order_num = order_num;
this.delay_count = delay_count;
}
public T_parts_mould(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"parts_id:"+ (parts_id==null?"null":"'"+parts_id+"'")+","+"task_content:"+ (task_content==null?"null":"'"+task_content+"'")+","+"provide_plan_time:"+ (provide_plan_time==null?"null":"'"+provide_plan_time+"'")+","+"provide_complete_time:"+ (provide_complete_time==null?"null":"'"+provide_complete_time+"'")+","+"testing_plan_time:"+ (testing_plan_time==null?"null":"'"+testing_plan_time+"'")+","+"testing_complete_time:"+ (testing_complete_time==null?"null":"'"+testing_complete_time+"'")+","+"review_plan_time:"+ (review_plan_time==null?"null":"'"+review_plan_time+"'")+","+"review_complete_time:"+ (review_complete_time==null?"null":"'"+review_complete_time+"'")+","+"engineer_type:"+ (engineer_type==null?"null":"'"+engineer_type+"'")+","+"remark:"+ (remark==null?"null":"'"+remark+"'")+","+"p_order:"+ (p_order==null?"null":"'"+p_order+"'")+","+"order_num:"+ (order_num==null?"null":"'"+order_num+"'")+","+"delay_count:"+ (delay_count==null?"null":"'"+delay_count+"'")+"}" ;
}
}
