package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class Hibernate_sequence implements Table{
private java.lang.Long next_val;
public static String NEXT_VAL = "next_val";
public java.lang.Long getNext_val(){
return next_val;
}
public void setNext_val(java.lang.Long next_val){
this.next_val=next_val;

}
public void setNext_val(java.lang.String next_val){
if(next_val==null||next_val.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.next_val=Long.parseLong(next_val);

}
public String giveTableName() {
 return "hibernate_sequence";
}
public String givePrimaryColumnName() {
 return "next_val";
}
public String[] giveDualPrimaryName() {
 return null;
}
public Hibernate_sequence(java.lang.Long next_val ){
 super();
this.next_val = next_val;
}
public Hibernate_sequence(){}
public String toString(){
 return "{"+"next_val:"+ (next_val==null?"null":"'"+next_val+"'")+"}" ;
}
}
