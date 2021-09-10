package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_statistic_comparison implements Table{
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
private java.lang.Integer year;
public static String YEAR = "year";
public java.lang.Integer getYear(){
return year;
}
public void setYear(java.lang.Integer year){
this.year=year;

}
public void setYear(java.lang.String year){
if(year==null||year.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.year=Integer.parseInt(year);

}
private java.lang.Integer month;
public static String MONTH = "month";
public java.lang.Integer getMonth(){
return month;
}
public void setMonth(java.lang.Integer month){
this.month=month;

}
public void setMonth(java.lang.String month){
if(month==null||month.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.month=Integer.parseInt(month);

}
private java.lang.Integer data_type;
public static String DATA_TYPE = "data_type";
public java.lang.Integer getData_type(){
return data_type;
}
public void setData_type(java.lang.Integer data_type){
this.data_type=data_type;

}
public void setData_type(java.lang.String data_type){
if(data_type==null||data_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.data_type=Integer.parseInt(data_type);

}
private java.lang.Integer task_type;
public static String TASK_TYPE = "task_type";
public java.lang.Integer getTask_type(){
return task_type;
}
public void setTask_type(java.lang.Integer task_type){
this.task_type=task_type;

}
public void setTask_type(java.lang.String task_type){
if(task_type==null||task_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.task_type=Integer.parseInt(task_type);

}
private java.lang.Integer effective_type;
public static String EFFECTIVE_TYPE = "effective_type";
public java.lang.Integer getEffective_type(){
return effective_type;
}
public void setEffective_type(java.lang.Integer effective_type){
this.effective_type=effective_type;

}
public void setEffective_type(java.lang.String effective_type){
if(effective_type==null||effective_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.effective_type=Integer.parseInt(effective_type);

}
private java.lang.Integer sales_type;
public static String SALES_TYPE = "sales_type";
public java.lang.Integer getSales_type(){
return sales_type;
}
public void setSales_type(java.lang.Integer sales_type){
this.sales_type=sales_type;

}
public void setSales_type(java.lang.String sales_type){
if(sales_type==null||sales_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.sales_type=Integer.parseInt(sales_type);

}
private java.lang.Integer device_type;
public static String DEVICE_TYPE = "device_type";
public java.lang.Integer getDevice_type(){
return device_type;
}
public void setDevice_type(java.lang.Integer device_type){
this.device_type=device_type;

}
public void setDevice_type(java.lang.String device_type){
if(device_type==null||device_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.device_type=Integer.parseInt(device_type);

}
private java.lang.Integer data;
public static String DATA = "data";
public java.lang.Integer getData(){
return data;
}
public void setData(java.lang.Integer data){
this.data=data;

}
public void setData(java.lang.String data){
if(data==null||data.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.data=Integer.parseInt(data);

}
public String giveTableName() {
 return "t_statistic_comparison";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_statistic_comparison(java.lang.Long id ,java.lang.Integer year ,java.lang.Integer month ,java.lang.Integer data_type ,java.lang.Integer task_type ,java.lang.Integer effective_type ,java.lang.Integer sales_type ,java.lang.Integer device_type ,java.lang.Integer data ){
 super();
this.id = id;
this.year = year;
this.month = month;
this.data_type = data_type;
this.task_type = task_type;
this.effective_type = effective_type;
this.sales_type = sales_type;
this.device_type = device_type;
this.data = data;
}
public T_statistic_comparison(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"year:"+ (year==null?"null":"'"+year+"'")+","+"month:"+ (month==null?"null":"'"+month+"'")+","+"data_type:"+ (data_type==null?"null":"'"+data_type+"'")+","+"task_type:"+ (task_type==null?"null":"'"+task_type+"'")+","+"effective_type:"+ (effective_type==null?"null":"'"+effective_type+"'")+","+"sales_type:"+ (sales_type==null?"null":"'"+sales_type+"'")+","+"device_type:"+ (device_type==null?"null":"'"+device_type+"'")+","+"data:"+ (data==null?"null":"'"+data+"'")+"}" ;
}
}
