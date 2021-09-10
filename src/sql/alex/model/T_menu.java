package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_menu implements Table{
private java.lang.Long menu_id;
public static String MENU_ID = "menu_id";
public java.lang.Long getMenu_id(){
return menu_id;
}
public void setMenu_id(java.lang.Long menu_id){
this.menu_id=menu_id;

}
public void setMenu_id(java.lang.String menu_id){
if(menu_id==null||menu_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.menu_id=Long.parseLong(menu_id);

}
private java.lang.Long parent_id;
public static String PARENT_ID = "parent_id";
public java.lang.Long getParent_id(){
return parent_id;
}
public void setParent_id(java.lang.Long parent_id){
this.parent_id=parent_id;

}
public void setParent_id(java.lang.String parent_id){
if(parent_id==null||parent_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.parent_id=Long.parseLong(parent_id);

}
private java.lang.String menu_name;
public static String MENU_NAME = "menu_name";
public java.lang.String getMenu_name(){
return menu_name;
}
public void setMenu_name(java.lang.String menu_name){
this.menu_name=menu_name;

}
private java.lang.String url;
public static String URL = "url";
public java.lang.String getUrl(){
return url;
}
public void setUrl(java.lang.String url){
this.url=url;

}
private java.lang.String perms;
public static String PERMS = "perms";
public java.lang.String getPerms(){
return perms;
}
public void setPerms(java.lang.String perms){
this.perms=perms;

}
private java.lang.String icon;
public static String ICON = "icon";
public java.lang.String getIcon(){
return icon;
}
public void setIcon(java.lang.String icon){
this.icon=icon;

}
private java.lang.String type;
public static String TYPE = "type";
public java.lang.String getType(){
return type;
}
public void setType(java.lang.String type){
this.type=type;

}
private java.lang.Long order_num;
public static String ORDER_NUM = "order_num";
public java.lang.Long getOrder_num(){
return order_num;
}
public void setOrder_num(java.lang.Long order_num){
this.order_num=order_num;

}
public void setOrder_num(java.lang.String order_num){
if(order_num==null||order_num.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.order_num=Long.parseLong(order_num);

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
private java.sql.Timestamp modify_time;
public static String MODIFY_TIME = "modify_time";
public java.sql.Timestamp getModify_time(){
return modify_time;
}
public void setModify_time(java.sql.Timestamp modify_time){
this.modify_time=modify_time;

}
public void setModify_time(java.lang.String modify_time){
if(modify_time==null||modify_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.modify_time = new Timestamp(simpleDateFormat.parse(modify_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
public String giveTableName() {
 return "t_menu";
}
public String givePrimaryColumnName() {
 return "menu_id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_menu(java.lang.Long menu_id ,java.lang.Long parent_id ,java.lang.String menu_name ,java.lang.String url ,java.lang.String perms ,java.lang.String icon ,java.lang.String type ,java.lang.Long order_num ,java.sql.Timestamp create_time ,java.sql.Timestamp modify_time ){
 super();
this.menu_id = menu_id;
this.parent_id = parent_id;
this.menu_name = menu_name;
this.url = url;
this.perms = perms;
this.icon = icon;
this.type = type;
this.order_num = order_num;
this.create_time = create_time;
this.modify_time = modify_time;
}
public T_menu(){}
public String toString(){
 return "{"+"menu_id:"+ (menu_id==null?"null":"'"+menu_id+"'")+","+"parent_id:"+ (parent_id==null?"null":"'"+parent_id+"'")+","+"menu_name:"+ (menu_name==null?"null":"'"+menu_name+"'")+","+"url:"+ (url==null?"null":"'"+url+"'")+","+"perms:"+ (perms==null?"null":"'"+perms+"'")+","+"icon:"+ (icon==null?"null":"'"+icon+"'")+","+"type:"+ (type==null?"null":"'"+type+"'")+","+"order_num:"+ (order_num==null?"null":"'"+order_num+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+","+"modify_time:"+ (modify_time==null?"null":"'"+modify_time+"'")+"}" ;
}
}
