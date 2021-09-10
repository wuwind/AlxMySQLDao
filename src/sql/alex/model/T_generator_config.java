package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_generator_config implements Table{
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
private java.lang.String author;
public static String AUTHOR = "author";
public java.lang.String getAuthor(){
return author;
}
public void setAuthor(java.lang.String author){
this.author=author;

}
private java.lang.String base_package;
public static String BASE_PACKAGE = "base_package";
public java.lang.String getBase_package(){
return base_package;
}
public void setBase_package(java.lang.String base_package){
this.base_package=base_package;

}
private java.lang.String entity_package;
public static String ENTITY_PACKAGE = "entity_package";
public java.lang.String getEntity_package(){
return entity_package;
}
public void setEntity_package(java.lang.String entity_package){
this.entity_package=entity_package;

}
private java.lang.String mapper_package;
public static String MAPPER_PACKAGE = "mapper_package";
public java.lang.String getMapper_package(){
return mapper_package;
}
public void setMapper_package(java.lang.String mapper_package){
this.mapper_package=mapper_package;

}
private java.lang.String mapper_xml_package;
public static String MAPPER_XML_PACKAGE = "mapper_xml_package";
public java.lang.String getMapper_xml_package(){
return mapper_xml_package;
}
public void setMapper_xml_package(java.lang.String mapper_xml_package){
this.mapper_xml_package=mapper_xml_package;

}
private java.lang.String service_package;
public static String SERVICE_PACKAGE = "service_package";
public java.lang.String getService_package(){
return service_package;
}
public void setService_package(java.lang.String service_package){
this.service_package=service_package;

}
private java.lang.String service_impl_package;
public static String SERVICE_IMPL_PACKAGE = "service_impl_package";
public java.lang.String getService_impl_package(){
return service_impl_package;
}
public void setService_impl_package(java.lang.String service_impl_package){
this.service_impl_package=service_impl_package;

}
private java.lang.String controller_package;
public static String CONTROLLER_PACKAGE = "controller_package";
public java.lang.String getController_package(){
return controller_package;
}
public void setController_package(java.lang.String controller_package){
this.controller_package=controller_package;

}
private java.lang.String is_trim;
public static String IS_TRIM = "is_trim";
public java.lang.String getIs_trim(){
return is_trim;
}
public void setIs_trim(java.lang.String is_trim){
this.is_trim=is_trim;

}
private java.lang.String trim_value;
public static String TRIM_VALUE = "trim_value";
public java.lang.String getTrim_value(){
return trim_value;
}
public void setTrim_value(java.lang.String trim_value){
this.trim_value=trim_value;

}
public String giveTableName() {
 return "t_generator_config";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_generator_config(java.lang.Integer id ,java.lang.String author ,java.lang.String base_package ,java.lang.String entity_package ,java.lang.String mapper_package ,java.lang.String mapper_xml_package ,java.lang.String service_package ,java.lang.String service_impl_package ,java.lang.String controller_package ,java.lang.String is_trim ,java.lang.String trim_value ){
 super();
this.id = id;
this.author = author;
this.base_package = base_package;
this.entity_package = entity_package;
this.mapper_package = mapper_package;
this.mapper_xml_package = mapper_xml_package;
this.service_package = service_package;
this.service_impl_package = service_impl_package;
this.controller_package = controller_package;
this.is_trim = is_trim;
this.trim_value = trim_value;
}
public T_generator_config(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"author:"+ (author==null?"null":"'"+author+"'")+","+"base_package:"+ (base_package==null?"null":"'"+base_package+"'")+","+"entity_package:"+ (entity_package==null?"null":"'"+entity_package+"'")+","+"mapper_package:"+ (mapper_package==null?"null":"'"+mapper_package+"'")+","+"mapper_xml_package:"+ (mapper_xml_package==null?"null":"'"+mapper_xml_package+"'")+","+"service_package:"+ (service_package==null?"null":"'"+service_package+"'")+","+"service_impl_package:"+ (service_impl_package==null?"null":"'"+service_impl_package+"'")+","+"controller_package:"+ (controller_package==null?"null":"'"+controller_package+"'")+","+"is_trim:"+ (is_trim==null?"null":"'"+is_trim+"'")+","+"trim_value:"+ (trim_value==null?"null":"'"+trim_value+"'")+"}" ;
}
}
