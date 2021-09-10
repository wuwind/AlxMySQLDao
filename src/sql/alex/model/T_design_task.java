package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_design_task implements Table{
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
private java.lang.Integer t_price_require_id;
public static String T_PRICE_REQUIRE_ID = "t_price_require_id";
public java.lang.Integer getT_price_require_id(){
return t_price_require_id;
}
public void setT_price_require_id(java.lang.Integer t_price_require_id){
this.t_price_require_id=t_price_require_id;

}
public void setT_price_require_id(java.lang.String t_price_require_id){
if(t_price_require_id==null||t_price_require_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_price_require_id=Integer.parseInt(t_price_require_id);

}
private java.lang.Integer t_design_basic_id;
public static String T_DESIGN_BASIC_ID = "t_design_basic_id";
public java.lang.Integer getT_design_basic_id(){
return t_design_basic_id;
}
public void setT_design_basic_id(java.lang.Integer t_design_basic_id){
this.t_design_basic_id=t_design_basic_id;

}
public void setT_design_basic_id(java.lang.String t_design_basic_id){
if(t_design_basic_id==null||t_design_basic_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_design_basic_id=Integer.parseInt(t_design_basic_id);

}
private java.lang.Integer t_lock_id;
public static String T_LOCK_ID = "t_lock_id";
public java.lang.Integer getT_lock_id(){
return t_lock_id;
}
public void setT_lock_id(java.lang.Integer t_lock_id){
this.t_lock_id=t_lock_id;

}
public void setT_lock_id(java.lang.String t_lock_id){
if(t_lock_id==null||t_lock_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_lock_id=Integer.parseInt(t_lock_id);

}
private java.lang.Integer t_dept_id;
public static String T_DEPT_ID = "t_dept_id";
public java.lang.Integer getT_dept_id(){
return t_dept_id;
}
public void setT_dept_id(java.lang.Integer t_dept_id){
this.t_dept_id=t_dept_id;

}
public void setT_dept_id(java.lang.String t_dept_id){
if(t_dept_id==null||t_dept_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_dept_id=Integer.parseInt(t_dept_id);

}
private java.lang.Integer t_customer_id;
public static String T_CUSTOMER_ID = "t_customer_id";
public java.lang.Integer getT_customer_id(){
return t_customer_id;
}
public void setT_customer_id(java.lang.Integer t_customer_id){
this.t_customer_id=t_customer_id;

}
public void setT_customer_id(java.lang.String t_customer_id){
if(t_customer_id==null||t_customer_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_customer_id=Integer.parseInt(t_customer_id);

}
private java.lang.Integer user_id;
public static String USER_ID = "user_id";
public java.lang.Integer getUser_id(){
return user_id;
}
public void setUser_id(java.lang.Integer user_id){
this.user_id=user_id;

}
public void setUser_id(java.lang.String user_id){
if(user_id==null||user_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.user_id=Integer.parseInt(user_id);

}
private java.lang.Integer t_pattern_require_id;
public static String T_PATTERN_REQUIRE_ID = "t_pattern_require_id";
public java.lang.Integer getT_pattern_require_id(){
return t_pattern_require_id;
}
public void setT_pattern_require_id(java.lang.Integer t_pattern_require_id){
this.t_pattern_require_id=t_pattern_require_id;

}
public void setT_pattern_require_id(java.lang.String t_pattern_require_id){
if(t_pattern_require_id==null||t_pattern_require_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_pattern_require_id=Integer.parseInt(t_pattern_require_id);

}
private java.lang.Integer t_product_id;
public static String T_PRODUCT_ID = "t_product_id";
public java.lang.Integer getT_product_id(){
return t_product_id;
}
public void setT_product_id(java.lang.Integer t_product_id){
this.t_product_id=t_product_id;

}
public void setT_product_id(java.lang.String t_product_id){
if(t_product_id==null||t_product_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_product_id=Integer.parseInt(t_product_id);

}
private java.lang.Integer t_dev_require_id;
public static String T_DEV_REQUIRE_ID = "t_dev_require_id";
public java.lang.Integer getT_dev_require_id(){
return t_dev_require_id;
}
public void setT_dev_require_id(java.lang.Integer t_dev_require_id){
this.t_dev_require_id=t_dev_require_id;

}
public void setT_dev_require_id(java.lang.String t_dev_require_id){
if(t_dev_require_id==null||t_dev_require_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_dev_require_id=Integer.parseInt(t_dev_require_id);

}
private java.lang.String task_number;
public static String TASK_NUMBER = "task_number";
public java.lang.String getTask_number(){
return task_number;
}
public void setTask_number(java.lang.String task_number){
this.task_number=task_number;

}
private java.lang.String product_name;
public static String PRODUCT_NAME = "product_name";
public java.lang.String getProduct_name(){
return product_name;
}
public void setProduct_name(java.lang.String product_name){
this.product_name=product_name;

}
private java.lang.Integer is_new_customer;
public static String IS_NEW_CUSTOMER = "is_new_customer";
public java.lang.Integer getIs_new_customer(){
return is_new_customer;
}
public void setIs_new_customer(java.lang.Integer is_new_customer){
this.is_new_customer=is_new_customer;

}
public void setIs_new_customer(java.lang.String is_new_customer){
if(is_new_customer==null||is_new_customer.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_new_customer=Integer.parseInt(is_new_customer);

}
private java.lang.Long sale_forecast;
public static String SALE_FORECAST = "sale_forecast";
public java.lang.Long getSale_forecast(){
return sale_forecast;
}
public void setSale_forecast(java.lang.Long sale_forecast){
this.sale_forecast=sale_forecast;

}
public void setSale_forecast(java.lang.String sale_forecast){
if(sale_forecast==null||sale_forecast.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.sale_forecast=Long.parseLong(sale_forecast);

}
private java.lang.String customer_number;
public static String CUSTOMER_NUMBER = "customer_number";
public java.lang.String getCustomer_number(){
return customer_number;
}
public void setCustomer_number(java.lang.String customer_number){
this.customer_number=customer_number;

}
private java.lang.String out_area;
public static String OUT_AREA = "out_area";
public java.lang.String getOut_area(){
return out_area;
}
public void setOut_area(java.lang.String out_area){
this.out_area=out_area;

}
private java.lang.String input_area;
public static String INPUT_AREA = "input_area";
public java.lang.String getInput_area(){
return input_area;
}
public void setInput_area(java.lang.String input_area){
this.input_area=input_area;

}
private java.lang.Integer manager_pass;
public static String MANAGER_PASS = "manager_pass";
public java.lang.Integer getManager_pass(){
return manager_pass;
}
public void setManager_pass(java.lang.Integer manager_pass){
this.manager_pass=manager_pass;

}
public void setManager_pass(java.lang.String manager_pass){
if(manager_pass==null||manager_pass.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.manager_pass=Integer.parseInt(manager_pass);

}
private java.lang.Integer chief_pass;
public static String CHIEF_PASS = "chief_pass";
public java.lang.Integer getChief_pass(){
return chief_pass;
}
public void setChief_pass(java.lang.Integer chief_pass){
this.chief_pass=chief_pass;

}
public void setChief_pass(java.lang.String chief_pass){
if(chief_pass==null||chief_pass.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.chief_pass=Integer.parseInt(chief_pass);

}
private java.lang.String use_scene_des;
public static String USE_SCENE_DES = "use_scene_des";
public java.lang.String getUse_scene_des(){
return use_scene_des;
}
public void setUse_scene_des(java.lang.String use_scene_des){
this.use_scene_des=use_scene_des;

}
private java.lang.String require_des;
public static String REQUIRE_DES = "require_des";
public java.lang.String getRequire_des(){
return require_des;
}
public void setRequire_des(java.lang.String require_des){
this.require_des=require_des;

}
private java.lang.Integer is_new_require;
public static String IS_NEW_REQUIRE = "is_new_require";
public java.lang.Integer getIs_new_require(){
return is_new_require;
}
public void setIs_new_require(java.lang.Integer is_new_require){
this.is_new_require=is_new_require;

}
public void setIs_new_require(java.lang.String is_new_require){
if(is_new_require==null||is_new_require.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_new_require=Integer.parseInt(is_new_require);

}
private java.lang.String new_require_des;
public static String NEW_REQUIRE_DES = "new_require_des";
public java.lang.String getNew_require_des(){
return new_require_des;
}
public void setNew_require_des(java.lang.String new_require_des){
this.new_require_des=new_require_des;

}
private java.lang.Integer is_only_drawing;
public static String IS_ONLY_DRAWING = "is_only_drawing";
public java.lang.Integer getIs_only_drawing(){
return is_only_drawing;
}
public void setIs_only_drawing(java.lang.Integer is_only_drawing){
this.is_only_drawing=is_only_drawing;

}
public void setIs_only_drawing(java.lang.String is_only_drawing){
if(is_only_drawing==null||is_only_drawing.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_only_drawing=Integer.parseInt(is_only_drawing);

}
private java.sql.Date drawing_date;
public static String DRAWING_DATE = "drawing_date";
public java.sql.Date getDrawing_date(){
return drawing_date;
}
public void setDrawing_date(java.sql.Date drawing_date){
this.drawing_date=drawing_date;

}
public void setDrawing_date(java.lang.String drawing_date){
if(drawing_date==null||drawing_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.drawing_date= new Date(simpleDateFormat.parse(drawing_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Date create_time;
public static String CREATE_TIME = "create_time";
public java.sql.Date getCreate_time(){
return create_time;
}
public void setCreate_time(java.sql.Date create_time){
this.create_time=create_time;

}
public void setCreate_time(java.lang.String create_time){
if(create_time==null||create_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.create_time= new Date(simpleDateFormat.parse(create_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.Integer task_state;
public static String TASK_STATE = "task_state";
public java.lang.Integer getTask_state(){
return task_state;
}
public void setTask_state(java.lang.Integer task_state){
this.task_state=task_state;

}
public void setTask_state(java.lang.String task_state){
if(task_state==null||task_state.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.task_state=Integer.parseInt(task_state);

}
public String giveTableName() {
 return "t_design_task";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_design_task(java.lang.Integer id ,java.lang.Integer t_price_require_id ,java.lang.Integer t_design_basic_id ,java.lang.Integer t_lock_id ,java.lang.Integer t_dept_id ,java.lang.Integer t_customer_id ,java.lang.Integer user_id ,java.lang.Integer t_pattern_require_id ,java.lang.Integer t_product_id ,java.lang.Integer t_dev_require_id ,java.lang.String task_number ,java.lang.String product_name ,java.lang.Integer is_new_customer ,java.lang.Long sale_forecast ,java.lang.String customer_number ,java.lang.String out_area ,java.lang.String input_area ,java.lang.Integer manager_pass ,java.lang.Integer chief_pass ,java.lang.String use_scene_des ,java.lang.String require_des ,java.lang.Integer is_new_require ,java.lang.String new_require_des ,java.lang.Integer is_only_drawing ,java.sql.Date drawing_date ,java.sql.Date create_time ,java.lang.Integer task_state ){
 super();
this.id = id;
this.t_price_require_id = t_price_require_id;
this.t_design_basic_id = t_design_basic_id;
this.t_lock_id = t_lock_id;
this.t_dept_id = t_dept_id;
this.t_customer_id = t_customer_id;
this.user_id = user_id;
this.t_pattern_require_id = t_pattern_require_id;
this.t_product_id = t_product_id;
this.t_dev_require_id = t_dev_require_id;
this.task_number = task_number;
this.product_name = product_name;
this.is_new_customer = is_new_customer;
this.sale_forecast = sale_forecast;
this.customer_number = customer_number;
this.out_area = out_area;
this.input_area = input_area;
this.manager_pass = manager_pass;
this.chief_pass = chief_pass;
this.use_scene_des = use_scene_des;
this.require_des = require_des;
this.is_new_require = is_new_require;
this.new_require_des = new_require_des;
this.is_only_drawing = is_only_drawing;
this.drawing_date = drawing_date;
this.create_time = create_time;
this.task_state = task_state;
}
public T_design_task(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"t_price_require_id:"+ (t_price_require_id==null?"null":"'"+t_price_require_id+"'")+","+"t_design_basic_id:"+ (t_design_basic_id==null?"null":"'"+t_design_basic_id+"'")+","+"t_lock_id:"+ (t_lock_id==null?"null":"'"+t_lock_id+"'")+","+"t_dept_id:"+ (t_dept_id==null?"null":"'"+t_dept_id+"'")+","+"t_customer_id:"+ (t_customer_id==null?"null":"'"+t_customer_id+"'")+","+"user_id:"+ (user_id==null?"null":"'"+user_id+"'")+","+"t_pattern_require_id:"+ (t_pattern_require_id==null?"null":"'"+t_pattern_require_id+"'")+","+"t_product_id:"+ (t_product_id==null?"null":"'"+t_product_id+"'")+","+"t_dev_require_id:"+ (t_dev_require_id==null?"null":"'"+t_dev_require_id+"'")+","+"task_number:"+ (task_number==null?"null":"'"+task_number+"'")+","+"product_name:"+ (product_name==null?"null":"'"+product_name+"'")+","+"is_new_customer:"+ (is_new_customer==null?"null":"'"+is_new_customer+"'")+","+"sale_forecast:"+ (sale_forecast==null?"null":"'"+sale_forecast+"'")+","+"customer_number:"+ (customer_number==null?"null":"'"+customer_number+"'")+","+"out_area:"+ (out_area==null?"null":"'"+out_area+"'")+","+"input_area:"+ (input_area==null?"null":"'"+input_area+"'")+","+"manager_pass:"+ (manager_pass==null?"null":"'"+manager_pass+"'")+","+"chief_pass:"+ (chief_pass==null?"null":"'"+chief_pass+"'")+","+"use_scene_des:"+ (use_scene_des==null?"null":"'"+use_scene_des+"'")+","+"require_des:"+ (require_des==null?"null":"'"+require_des+"'")+","+"is_new_require:"+ (is_new_require==null?"null":"'"+is_new_require+"'")+","+"new_require_des:"+ (new_require_des==null?"null":"'"+new_require_des+"'")+","+"is_only_drawing:"+ (is_only_drawing==null?"null":"'"+is_only_drawing+"'")+","+"drawing_date:"+ (drawing_date==null?"null":"'"+drawing_date+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+","+"task_state:"+ (task_state==null?"null":"'"+task_state+"'")+"}" ;
}
}
