package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_role_menu implements Table{
private java.lang.Long role_id;
public static String ROLE_ID = "role_id";
public java.lang.Long getRole_id(){
return role_id;
}
public void setRole_id(java.lang.Long role_id){
this.role_id=role_id;

}
public void setRole_id(java.lang.String role_id){
if(role_id==null||role_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.role_id=Long.parseLong(role_id);

}
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
public String giveTableName() {
 return "t_role_menu";
}
public String givePrimaryColumnName() {
 return "role_id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_role_menu(java.lang.Long role_id ,java.lang.Long menu_id ){
 super();
this.role_id = role_id;
this.menu_id = menu_id;
}
public T_role_menu(){}
public String toString(){
 return "{"+"role_id:"+ (role_id==null?"null":"'"+role_id+"'")+","+"menu_id:"+ (menu_id==null?"null":"'"+menu_id+"'")+"}" ;
}
}
