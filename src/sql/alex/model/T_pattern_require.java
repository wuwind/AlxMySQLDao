package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_pattern_require implements Table{
private java.lang.Integer id;
public static String ID = "id";
public java.lang.Integer getId(){
return id;
}
public void setId(java.lang.Integer id){
this.id=id;

}
public void setId(java.lang.String id){
if(id==null||id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.id=Integer.parseInt(id);

}
private java.lang.Integer t_design_task_id;
public static String T_DESIGN_TASK_ID = "t_design_task_id";
public java.lang.Integer getT_design_task_id(){
return t_design_task_id;
}
public void setT_design_task_id(java.lang.Integer t_design_task_id){
this.t_design_task_id=t_design_task_id;

}
public void setT_design_task_id(java.lang.String t_design_task_id){
if(t_design_task_id==null||t_design_task_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_design_task_id=Integer.parseInt(t_design_task_id);

}
private java.lang.Integer count;
public static String COUNT = "count";
public java.lang.Integer getCount(){
return count;
}
public void setCount(java.lang.Integer count){
this.count=count;

}
public void setCount(java.lang.String count){
if(count==null||count.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.count=Integer.parseInt(count);

}
private java.sql.Date count_date;
public static String COUNT_DATE = "count_date";
public java.sql.Date getCount_date(){
return count_date;
}
public void setCount_date(java.sql.Date count_date){
this.count_date=count_date;

}
public void setCount_date(java.lang.String count_date){
if(count_date==null||count_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.count_date= new Date(simpleDateFormat.parse(count_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.String number_flos_require;
public static String NUMBER_FLOS_REQUIRE = "number_flos_require";
public java.lang.String getNumber_flos_require(){
return number_flos_require;
}
public void setNumber_flos_require(java.lang.String number_flos_require){
this.number_flos_require=number_flos_require;

}
private java.lang.String pattern_pack_require;
public static String PATTERN_PACK_REQUIRE = "pattern_pack_require";
public java.lang.String getPattern_pack_require(){
return pattern_pack_require;
}
public void setPattern_pack_require(java.lang.String pattern_pack_require){
this.pattern_pack_require=pattern_pack_require;

}
private java.lang.Integer is_pattern_pay;
public static String IS_PATTERN_PAY = "is_pattern_pay";
public java.lang.Integer getIs_pattern_pay(){
return is_pattern_pay;
}
public void setIs_pattern_pay(java.lang.Integer is_pattern_pay){
this.is_pattern_pay=is_pattern_pay;

}
public void setIs_pattern_pay(java.lang.String is_pattern_pay){
if(is_pattern_pay==null||is_pattern_pay.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_pattern_pay=Integer.parseInt(is_pattern_pay);

}
private java.lang.String other;
public static String OTHER = "other";
public java.lang.String getOther(){
return other;
}
public void setOther(java.lang.String other){
this.other=other;

}
public String giveTableName() {
 return "t_pattern_require";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_pattern_require(java.lang.Integer id ,java.lang.Integer t_design_task_id ,java.lang.Integer count ,java.sql.Date count_date ,java.lang.String number_flos_require ,java.lang.String pattern_pack_require ,java.lang.Integer is_pattern_pay ,java.lang.String other ){
 super();
this.id = id;
this.t_design_task_id = t_design_task_id;
this.count = count;
this.count_date = count_date;
this.number_flos_require = number_flos_require;
this.pattern_pack_require = pattern_pack_require;
this.is_pattern_pay = is_pattern_pay;
this.other = other;
}
public T_pattern_require(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"t_design_task_id:"+ (t_design_task_id==null?"null":"'"+t_design_task_id+"'")+","+"count:"+ (count==null?"null":"'"+count+"'")+","+"count_date:"+ (count_date==null?"null":"'"+count_date+"'")+","+"number_flos_require:"+ (number_flos_require==null?"null":"'"+number_flos_require+"'")+","+"pattern_pack_require:"+ (pattern_pack_require==null?"null":"'"+pattern_pack_require+"'")+","+"is_pattern_pay:"+ (is_pattern_pay==null?"null":"'"+is_pattern_pay+"'")+","+"other:"+ (other==null?"null":"'"+other+"'")+"}" ;
}
}
