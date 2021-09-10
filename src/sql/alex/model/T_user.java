package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_user implements Table{
private java.lang.Long user_id;
public static String USER_ID = "user_id";
public java.lang.Long getUser_id(){
return user_id;
}
public void setUser_id(java.lang.Long user_id){
this.user_id=user_id;

}
public void setUser_id(java.lang.String user_id){
if(user_id==null||user_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.user_id=Long.parseLong(user_id);

}
private java.lang.String username;
public static String USERNAME = "username";
public java.lang.String getUsername(){
return username;
}
public void setUsername(java.lang.String username){
this.username=username;

}
private java.lang.String password;
public static String PASSWORD = "password";
public java.lang.String getPassword(){
return password;
}
public void setPassword(java.lang.String password){
this.password=password;

}
private java.lang.Long dept_id;
public static String DEPT_ID = "dept_id";
public java.lang.Long getDept_id(){
return dept_id;
}
public void setDept_id(java.lang.Long dept_id){
this.dept_id=dept_id;

}
public void setDept_id(java.lang.String dept_id){
if(dept_id==null||dept_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.dept_id=Long.parseLong(dept_id);

}
private java.lang.String email;
public static String EMAIL = "email";
public java.lang.String getEmail(){
return email;
}
public void setEmail(java.lang.String email){
this.email=email;

}
private java.lang.String mobile;
public static String MOBILE = "mobile";
public java.lang.String getMobile(){
return mobile;
}
public void setMobile(java.lang.String mobile){
this.mobile=mobile;

}
private java.lang.String status;
public static String STATUS = "status";
public java.lang.String getStatus(){
return status;
}
public void setStatus(java.lang.String status){
this.status=status;

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
private java.sql.Timestamp last_login_time;
public static String LAST_LOGIN_TIME = "last_login_time";
public java.sql.Timestamp getLast_login_time(){
return last_login_time;
}
public void setLast_login_time(java.sql.Timestamp last_login_time){
this.last_login_time=last_login_time;

}
public void setLast_login_time(java.lang.String last_login_time){
if(last_login_time==null||last_login_time.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
 try {
this.last_login_time = new Timestamp(simpleDateFormat.parse(last_login_time).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.String sex;
public static String SEX = "sex";
public java.lang.String getSex(){
return sex;
}
public void setSex(java.lang.String sex){
this.sex=sex;

}
private java.lang.String is_tab;
public static String IS_TAB = "is_tab";
public java.lang.String getIs_tab(){
return is_tab;
}
public void setIs_tab(java.lang.String is_tab){
this.is_tab=is_tab;

}
private java.lang.String theme;
public static String THEME = "theme";
public java.lang.String getTheme(){
return theme;
}
public void setTheme(java.lang.String theme){
this.theme=theme;

}
private java.lang.String avatar;
public static String AVATAR = "avatar";
public java.lang.String getAvatar(){
return avatar;
}
public void setAvatar(java.lang.String avatar){
this.avatar=avatar;

}
private java.lang.String description;
public static String DESCRIPTION = "description";
public java.lang.String getDescription(){
return description;
}
public void setDescription(java.lang.String description){
this.description=description;

}
private java.lang.String person_api_token;
public static String PERSON_API_TOKEN = "person_api_token";
public java.lang.String getPerson_api_token(){
return person_api_token;
}
public void setPerson_api_token(java.lang.String person_api_token){
this.person_api_token=person_api_token;

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
private java.lang.Integer level;
public static String LEVEL = "level";
public java.lang.Integer getLevel(){
return level;
}
public void setLevel(java.lang.Integer level){
this.level=level;

}
public void setLevel(java.lang.String level){
if(level==null||level.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.level=Integer.parseInt(level);

}
private java.lang.Integer user_type;
public static String USER_TYPE = "user_type";
public java.lang.Integer getUser_type(){
return user_type;
}
public void setUser_type(java.lang.Integer user_type){
this.user_type=user_type;

}
public void setUser_type(java.lang.String user_type){
if(user_type==null||user_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.user_type=Integer.parseInt(user_type);

}
public String giveTableName() {
 return "t_user";
}
public String givePrimaryColumnName() {
 return "user_id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_user(java.lang.Long user_id ,java.lang.String username ,java.lang.String password ,java.lang.Long dept_id ,java.lang.String email ,java.lang.String mobile ,java.lang.String status ,java.sql.Timestamp create_time ,java.sql.Timestamp modify_time ,java.sql.Timestamp last_login_time ,java.lang.String sex ,java.lang.String is_tab ,java.lang.String theme ,java.lang.String avatar ,java.lang.String description ,java.lang.String person_api_token ,java.lang.Long parent_id ,java.lang.Integer level ,java.lang.Integer user_type ){
 super();
this.user_id = user_id;
this.username = username;
this.password = password;
this.dept_id = dept_id;
this.email = email;
this.mobile = mobile;
this.status = status;
this.create_time = create_time;
this.modify_time = modify_time;
this.last_login_time = last_login_time;
this.sex = sex;
this.is_tab = is_tab;
this.theme = theme;
this.avatar = avatar;
this.description = description;
this.person_api_token = person_api_token;
this.parent_id = parent_id;
this.level = level;
this.user_type = user_type;
}
public T_user(){}
public String toString(){
 return "{"+"user_id:"+ (user_id==null?"null":"'"+user_id+"'")+","+"username:"+ (username==null?"null":"'"+username+"'")+","+"password:"+ (password==null?"null":"'"+password+"'")+","+"dept_id:"+ (dept_id==null?"null":"'"+dept_id+"'")+","+"email:"+ (email==null?"null":"'"+email+"'")+","+"mobile:"+ (mobile==null?"null":"'"+mobile+"'")+","+"status:"+ (status==null?"null":"'"+status+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+","+"modify_time:"+ (modify_time==null?"null":"'"+modify_time+"'")+","+"last_login_time:"+ (last_login_time==null?"null":"'"+last_login_time+"'")+","+"sex:"+ (sex==null?"null":"'"+sex+"'")+","+"is_tab:"+ (is_tab==null?"null":"'"+is_tab+"'")+","+"theme:"+ (theme==null?"null":"'"+theme+"'")+","+"avatar:"+ (avatar==null?"null":"'"+avatar+"'")+","+"description:"+ (description==null?"null":"'"+description+"'")+","+"person_api_token:"+ (person_api_token==null?"null":"'"+person_api_token+"'")+","+"parent_id:"+ (parent_id==null?"null":"'"+parent_id+"'")+","+"level:"+ (level==null?"null":"'"+level+"'")+","+"user_type:"+ (user_type==null?"null":"'"+user_type+"'")+"}" ;
}
}
