package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_dev_require implements Table{
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
private java.lang.Integer is_model_dev;
public static String IS_MODEL_DEV = "is_model_dev";
public java.lang.Integer getIs_model_dev(){
return is_model_dev;
}
public void setIs_model_dev(java.lang.Integer is_model_dev){
this.is_model_dev=is_model_dev;

}
public void setIs_model_dev(java.lang.String is_model_dev){
if(is_model_dev==null||is_model_dev.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_model_dev=Integer.parseInt(is_model_dev);

}
private java.lang.Integer is_dfm_require;
public static String IS_DFM_REQUIRE = "is_dfm_require";
public java.lang.Integer getIs_dfm_require(){
return is_dfm_require;
}
public void setIs_dfm_require(java.lang.Integer is_dfm_require){
this.is_dfm_require=is_dfm_require;

}
public void setIs_dfm_require(java.lang.String is_dfm_require){
if(is_dfm_require==null||is_dfm_require.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_dfm_require=Integer.parseInt(is_dfm_require);

}
private java.lang.Integer is_customer_format;
public static String IS_CUSTOMER_FORMAT = "is_customer_format";
public java.lang.Integer getIs_customer_format(){
return is_customer_format;
}
public void setIs_customer_format(java.lang.Integer is_customer_format){
this.is_customer_format=is_customer_format;

}
public void setIs_customer_format(java.lang.String is_customer_format){
if(is_customer_format==null||is_customer_format.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_customer_format=Integer.parseInt(is_customer_format);

}
private java.lang.Integer is_model_pay;
public static String IS_MODEL_PAY = "is_model_pay";
public java.lang.Integer getIs_model_pay(){
return is_model_pay;
}
public void setIs_model_pay(java.lang.Integer is_model_pay){
this.is_model_pay=is_model_pay;

}
public void setIs_model_pay(java.lang.String is_model_pay){
if(is_model_pay==null||is_model_pay.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_model_pay=Integer.parseInt(is_model_pay);

}
private java.lang.Integer model_count;
public static String MODEL_COUNT = "model_count";
public java.lang.Integer getModel_count(){
return model_count;
}
public void setModel_count(java.lang.Integer model_count){
this.model_count=model_count;

}
public void setModel_count(java.lang.String model_count){
if(model_count==null||model_count.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.model_count=Integer.parseInt(model_count);

}
private java.sql.Date model_date;
public static String MODEL_DATE = "model_date";
public java.sql.Date getModel_date(){
return model_date;
}
public void setModel_date(java.sql.Date model_date){
this.model_date=model_date;

}
public void setModel_date(java.lang.String model_date){
if(model_date==null||model_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.model_date= new Date(simpleDateFormat.parse(model_date).getTime());

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
private java.lang.String sample_pack_require;
public static String SAMPLE_PACK_REQUIRE = "sample_pack_require";
public java.lang.String getSample_pack_require(){
return sample_pack_require;
}
public void setSample_pack_require(java.lang.String sample_pack_require){
this.sample_pack_require=sample_pack_require;

}
private java.lang.Integer is_sample_report;
public static String IS_SAMPLE_REPORT = "is_sample_report";
public java.lang.Integer getIs_sample_report(){
return is_sample_report;
}
public void setIs_sample_report(java.lang.Integer is_sample_report){
this.is_sample_report=is_sample_report;

}
public void setIs_sample_report(java.lang.String is_sample_report){
if(is_sample_report==null||is_sample_report.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_sample_report=Integer.parseInt(is_sample_report);

}
private java.lang.Integer is_report_customer_format;
public static String IS_REPORT_CUSTOMER_FORMAT = "is_report_customer_format";
public java.lang.Integer getIs_report_customer_format(){
return is_report_customer_format;
}
public void setIs_report_customer_format(java.lang.Integer is_report_customer_format){
this.is_report_customer_format=is_report_customer_format;

}
public void setIs_report_customer_format(java.lang.String is_report_customer_format){
if(is_report_customer_format==null||is_report_customer_format.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_report_customer_format=Integer.parseInt(is_report_customer_format);

}
private java.lang.Integer is_sample_pay;
public static String IS_SAMPLE_PAY = "is_sample_pay";
public java.lang.Integer getIs_sample_pay(){
return is_sample_pay;
}
public void setIs_sample_pay(java.lang.Integer is_sample_pay){
this.is_sample_pay=is_sample_pay;

}
public void setIs_sample_pay(java.lang.String is_sample_pay){
if(is_sample_pay==null||is_sample_pay.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_sample_pay=Integer.parseInt(is_sample_pay);

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
 return "t_dev_require";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_dev_require(java.lang.Integer id ,java.lang.Integer t_design_task_id ,java.lang.Integer is_model_dev ,java.lang.Integer is_dfm_require ,java.lang.Integer is_customer_format ,java.lang.Integer is_model_pay ,java.lang.Integer model_count ,java.sql.Date model_date ,java.lang.String number_flos_require ,java.lang.String sample_pack_require ,java.lang.Integer is_sample_report ,java.lang.Integer is_report_customer_format ,java.lang.Integer is_sample_pay ,java.lang.String other ){
 super();
this.id = id;
this.t_design_task_id = t_design_task_id;
this.is_model_dev = is_model_dev;
this.is_dfm_require = is_dfm_require;
this.is_customer_format = is_customer_format;
this.is_model_pay = is_model_pay;
this.model_count = model_count;
this.model_date = model_date;
this.number_flos_require = number_flos_require;
this.sample_pack_require = sample_pack_require;
this.is_sample_report = is_sample_report;
this.is_report_customer_format = is_report_customer_format;
this.is_sample_pay = is_sample_pay;
this.other = other;
}
public T_dev_require(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"t_design_task_id:"+ (t_design_task_id==null?"null":"'"+t_design_task_id+"'")+","+"is_model_dev:"+ (is_model_dev==null?"null":"'"+is_model_dev+"'")+","+"is_dfm_require:"+ (is_dfm_require==null?"null":"'"+is_dfm_require+"'")+","+"is_customer_format:"+ (is_customer_format==null?"null":"'"+is_customer_format+"'")+","+"is_model_pay:"+ (is_model_pay==null?"null":"'"+is_model_pay+"'")+","+"model_count:"+ (model_count==null?"null":"'"+model_count+"'")+","+"model_date:"+ (model_date==null?"null":"'"+model_date+"'")+","+"number_flos_require:"+ (number_flos_require==null?"null":"'"+number_flos_require+"'")+","+"sample_pack_require:"+ (sample_pack_require==null?"null":"'"+sample_pack_require+"'")+","+"is_sample_report:"+ (is_sample_report==null?"null":"'"+is_sample_report+"'")+","+"is_report_customer_format:"+ (is_report_customer_format==null?"null":"'"+is_report_customer_format+"'")+","+"is_sample_pay:"+ (is_sample_pay==null?"null":"'"+is_sample_pay+"'")+","+"other:"+ (other==null?"null":"'"+other+"'")+"}" ;
}
}
