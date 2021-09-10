package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_product implements Table{
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
private java.lang.String product_type;
public static String PRODUCT_TYPE = "product_type";
public java.lang.String getProduct_type(){
return product_type;
}
public void setProduct_type(java.lang.String product_type){
this.product_type=product_type;

}
public String giveTableName() {
 return "t_product";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_product(java.lang.Integer id ,java.lang.String product_type ){
 super();
this.id = id;
this.product_type = product_type;
}
public T_product(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"product_type:"+ (product_type==null?"null":"'"+product_type+"'")+"}" ;
}
}
