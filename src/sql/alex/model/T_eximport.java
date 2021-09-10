package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_eximport implements Table{
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
private java.lang.String field1;
public static String FIELD1 = "field1";
public java.lang.String getField1(){
return field1;
}
public void setField1(java.lang.String field1){
this.field1=field1;

}
private java.lang.Integer field2;
public static String FIELD2 = "field2";
public java.lang.Integer getField2(){
return field2;
}
public void setField2(java.lang.Integer field2){
this.field2=field2;

}
public void setField2(java.lang.String field2){
if(field2==null||field2.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.field2=Integer.parseInt(field2);

}
private java.lang.String field3;
public static String FIELD3 = "field3";
public java.lang.String getField3(){
return field3;
}
public void setField3(java.lang.String field3){
this.field3=field3;

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
public String giveTableName() {
 return "t_eximport";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_eximport(java.lang.Long id ,java.lang.String field1 ,java.lang.Integer field2 ,java.lang.String field3 ,java.sql.Timestamp create_time ){
 super();
this.id = id;
this.field1 = field1;
this.field2 = field2;
this.field3 = field3;
this.create_time = create_time;
}
public T_eximport(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"field1:"+ (field1==null?"null":"'"+field1+"'")+","+"field2:"+ (field2==null?"null":"'"+field2+"'")+","+"field3:"+ (field3==null?"null":"'"+field3+"'")+","+"create_time:"+ (create_time==null?"null":"'"+create_time+"'")+"}" ;
}
}
