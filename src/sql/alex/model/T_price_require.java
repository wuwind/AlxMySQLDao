package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_price_require implements Table{
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
private java.lang.Integer is_design_pay;
public static String IS_DESIGN_PAY = "is_design_pay";
public java.lang.Integer getIs_design_pay(){
return is_design_pay;
}
public void setIs_design_pay(java.lang.Integer is_design_pay){
this.is_design_pay=is_design_pay;

}
public void setIs_design_pay(java.lang.String is_design_pay){
if(is_design_pay==null||is_design_pay.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_design_pay=Integer.parseInt(is_design_pay);

}
private java.lang.Integer is_ppt;
public static String IS_PPT = "is_ppt";
public java.lang.Integer getIs_ppt(){
return is_ppt;
}
public void setIs_ppt(java.lang.Integer is_ppt){
this.is_ppt=is_ppt;

}
public void setIs_ppt(java.lang.String is_ppt){
if(is_ppt==null||is_ppt.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_ppt=Integer.parseInt(is_ppt);

}
private java.sql.Date ppt_date;
public static String PPT_DATE = "ppt_date";
public java.sql.Date getPpt_date(){
return ppt_date;
}
public void setPpt_date(java.sql.Date ppt_date){
this.ppt_date=ppt_date;

}
public void setPpt_date(java.lang.String ppt_date){
if(ppt_date==null||ppt_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.ppt_date= new Date(simpleDateFormat.parse(ppt_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
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
private java.sql.Date pattern_pay_date;
public static String PATTERN_PAY_DATE = "pattern_pay_date";
public java.sql.Date getPattern_pay_date(){
return pattern_pay_date;
}
public void setPattern_pay_date(java.sql.Date pattern_pay_date){
this.pattern_pay_date=pattern_pay_date;

}
public void setPattern_pay_date(java.lang.String pattern_pay_date){
if(pattern_pay_date==null||pattern_pay_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.pattern_pay_date= new Date(simpleDateFormat.parse(pattern_pay_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.Integer is_product_pay;
public static String IS_PRODUCT_PAY = "is_product_pay";
public java.lang.Integer getIs_product_pay(){
return is_product_pay;
}
public void setIs_product_pay(java.lang.Integer is_product_pay){
this.is_product_pay=is_product_pay;

}
public void setIs_product_pay(java.lang.String is_product_pay){
if(is_product_pay==null||is_product_pay.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_product_pay=Integer.parseInt(is_product_pay);

}
private java.sql.Date product_pay_date;
public static String PRODUCT_PAY_DATE = "product_pay_date";
public java.sql.Date getProduct_pay_date(){
return product_pay_date;
}
public void setProduct_pay_date(java.sql.Date product_pay_date){
this.product_pay_date=product_pay_date;

}
public void setProduct_pay_date(java.lang.String product_pay_date){
if(product_pay_date==null||product_pay_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.product_pay_date= new Date(simpleDateFormat.parse(product_pay_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
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
 return "t_price_require";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_price_require(java.lang.Integer id ,java.lang.Integer t_design_task_id ,java.lang.Integer is_design_pay ,java.lang.Integer is_ppt ,java.sql.Date ppt_date ,java.lang.Integer is_pattern_pay ,java.sql.Date pattern_pay_date ,java.lang.Integer is_product_pay ,java.sql.Date product_pay_date ,java.lang.String other ){
 super();
this.id = id;
this.t_design_task_id = t_design_task_id;
this.is_design_pay = is_design_pay;
this.is_ppt = is_ppt;
this.ppt_date = ppt_date;
this.is_pattern_pay = is_pattern_pay;
this.pattern_pay_date = pattern_pay_date;
this.is_product_pay = is_product_pay;
this.product_pay_date = product_pay_date;
this.other = other;
}
public T_price_require(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"t_design_task_id:"+ (t_design_task_id==null?"null":"'"+t_design_task_id+"'")+","+"is_design_pay:"+ (is_design_pay==null?"null":"'"+is_design_pay+"'")+","+"is_ppt:"+ (is_ppt==null?"null":"'"+is_ppt+"'")+","+"ppt_date:"+ (ppt_date==null?"null":"'"+ppt_date+"'")+","+"is_pattern_pay:"+ (is_pattern_pay==null?"null":"'"+is_pattern_pay+"'")+","+"pattern_pay_date:"+ (pattern_pay_date==null?"null":"'"+pattern_pay_date+"'")+","+"is_product_pay:"+ (is_product_pay==null?"null":"'"+is_product_pay+"'")+","+"product_pay_date:"+ (product_pay_date==null?"null":"'"+product_pay_date+"'")+","+"other:"+ (other==null?"null":"'"+other+"'")+"}" ;
}
}
