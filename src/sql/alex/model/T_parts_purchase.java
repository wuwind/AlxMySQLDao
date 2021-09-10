package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_parts_purchase implements Table{
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
private java.lang.Long product_id;
public static String PRODUCT_ID = "product_id";
public java.lang.Long getProduct_id(){
return product_id;
}
public void setProduct_id(java.lang.Long product_id){
this.product_id=product_id;

}
public void setProduct_id(java.lang.String product_id){
if(product_id==null||product_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.product_id=Long.parseLong(product_id);

}
private java.lang.String product_name;
public static String PRODUCT_NAME = "product_name";
public java.lang.String getProduct_name(){
return product_name;
}
public void setProduct_name(java.lang.String product_name){
this.product_name=product_name;

}
private java.lang.String product_drawing_no;
public static String PRODUCT_DRAWING_NO = "product_drawing_no";
public java.lang.String getProduct_drawing_no(){
return product_drawing_no;
}
public void setProduct_drawing_no(java.lang.String product_drawing_no){
this.product_drawing_no=product_drawing_no;

}
private java.lang.String product_property;
public static String PRODUCT_PROPERTY = "product_property";
public java.lang.String getProduct_property(){
return product_property;
}
public void setProduct_property(java.lang.String product_property){
this.product_property=product_property;

}
private java.lang.Integer product_num;
public static String PRODUCT_NUM = "product_num";
public java.lang.Integer getProduct_num(){
return product_num;
}
public void setProduct_num(java.lang.Integer product_num){
this.product_num=product_num;

}
public void setProduct_num(java.lang.String product_num){
if(product_num==null||product_num.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.product_num=Integer.parseInt(product_num);

}
private java.lang.String gum_table;
public static String GUM_TABLE = "gum_table";
public java.lang.String getGum_table(){
return gum_table;
}
public void setGum_table(java.lang.String gum_table){
this.gum_table=gum_table;

}
private java.lang.String milling_pic;
public static String MILLING_PIC = "milling_pic";
public java.lang.String getMilling_pic(){
return milling_pic;
}
public void setMilling_pic(java.lang.String milling_pic){
this.milling_pic=milling_pic;

}
private java.lang.String stamping_pic;
public static String STAMPING_PIC = "stamping_pic";
public java.lang.String getStamping_pic(){
return stamping_pic;
}
public void setStamping_pic(java.lang.String stamping_pic){
this.stamping_pic=stamping_pic;

}
private java.lang.String burn_program;
public static String BURN_PROGRAM = "burn_program";
public java.lang.String getBurn_program(){
return burn_program;
}
public void setBurn_program(java.lang.String burn_program){
this.burn_program=burn_program;

}
public String giveTableName() {
 return "t_parts_purchase";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_parts_purchase(java.lang.Long id ,java.lang.String task_id ,java.lang.Long product_id ,java.lang.String product_name ,java.lang.String product_drawing_no ,java.lang.String product_property ,java.lang.Integer product_num ,java.lang.String gum_table ,java.lang.String milling_pic ,java.lang.String stamping_pic ,java.lang.String burn_program ){
 super();
this.id = id;
this.task_id = task_id;
this.product_id = product_id;
this.product_name = product_name;
this.product_drawing_no = product_drawing_no;
this.product_property = product_property;
this.product_num = product_num;
this.gum_table = gum_table;
this.milling_pic = milling_pic;
this.stamping_pic = stamping_pic;
this.burn_program = burn_program;
}
public T_parts_purchase(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"product_id:"+ (product_id==null?"null":"'"+product_id+"'")+","+"product_name:"+ (product_name==null?"null":"'"+product_name+"'")+","+"product_drawing_no:"+ (product_drawing_no==null?"null":"'"+product_drawing_no+"'")+","+"product_property:"+ (product_property==null?"null":"'"+product_property+"'")+","+"product_num:"+ (product_num==null?"null":"'"+product_num+"'")+","+"gum_table:"+ (gum_table==null?"null":"'"+gum_table+"'")+","+"milling_pic:"+ (milling_pic==null?"null":"'"+milling_pic+"'")+","+"stamping_pic:"+ (stamping_pic==null?"null":"'"+stamping_pic+"'")+","+"burn_program:"+ (burn_program==null?"null":"'"+burn_program+"'")+"}" ;
}
}
