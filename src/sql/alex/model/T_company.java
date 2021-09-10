package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_company implements Table{
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
private java.lang.String company_name;
public static String COMPANY_NAME = "company_name";
public java.lang.String getCompany_name(){
return company_name;
}
public void setCompany_name(java.lang.String company_name){
this.company_name=company_name;

}
public String giveTableName() {
 return "t_company";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_company(java.lang.Integer id ,java.lang.String company_name ){
 super();
this.id = id;
this.company_name = company_name;
}
public T_company(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"company_name:"+ (company_name==null?"null":"'"+company_name+"'")+"}" ;
}
}
