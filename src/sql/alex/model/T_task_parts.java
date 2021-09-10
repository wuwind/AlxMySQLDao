package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_task_parts implements Table{
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
private java.lang.String task_id;
public static String TASK_ID = "task_id";
public java.lang.String getTask_id(){
return task_id;
}
public void setTask_id(java.lang.String task_id){
this.task_id=task_id;

}
private java.lang.String parts_name;
public static String PARTS_NAME = "parts_name";
public java.lang.String getParts_name(){
return parts_name;
}
public void setParts_name(java.lang.String parts_name){
this.parts_name=parts_name;

}
private java.lang.String drawing_no;
public static String DRAWING_NO = "drawing_no";
public java.lang.String getDrawing_no(){
return drawing_no;
}
public void setDrawing_no(java.lang.String drawing_no){
this.drawing_no=drawing_no;

}
private java.lang.String provenance;
public static String PROVENANCE = "provenance";
public java.lang.String getProvenance(){
return provenance;
}
public void setProvenance(java.lang.String provenance){
this.provenance=provenance;

}
private java.lang.String imp_level;
public static String IMP_LEVEL = "imp_level";
public java.lang.String getImp_level(){
return imp_level;
}
public void setImp_level(java.lang.String imp_level){
this.imp_level=imp_level;

}
private java.lang.String assign_score;
public static String ASSIGN_SCORE = "assign_score";
public java.lang.String getAssign_score(){
return assign_score;
}
public void setAssign_score(java.lang.String assign_score){
this.assign_score=assign_score;

}
private java.sql.Date make_plan_date;
public static String MAKE_PLAN_DATE = "make_plan_date";
public java.sql.Date getMake_plan_date(){
return make_plan_date;
}
public void setMake_plan_date(java.sql.Date make_plan_date){
this.make_plan_date=make_plan_date;

}
public void setMake_plan_date(java.lang.String make_plan_date){
if(make_plan_date==null||make_plan_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.make_plan_date= new Date(simpleDateFormat.parse(make_plan_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Date make_complete_date;
public static String MAKE_COMPLETE_DATE = "make_complete_date";
public java.sql.Date getMake_complete_date(){
return make_complete_date;
}
public void setMake_complete_date(java.sql.Date make_complete_date){
this.make_complete_date=make_complete_date;

}
public void setMake_complete_date(java.lang.String make_complete_date){
if(make_complete_date==null||make_complete_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.make_complete_date= new Date(simpleDateFormat.parse(make_complete_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Date design_plan_date;
public static String DESIGN_PLAN_DATE = "design_plan_date";
public java.sql.Date getDesign_plan_date(){
return design_plan_date;
}
public void setDesign_plan_date(java.sql.Date design_plan_date){
this.design_plan_date=design_plan_date;

}
public void setDesign_plan_date(java.lang.String design_plan_date){
if(design_plan_date==null||design_plan_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.design_plan_date= new Date(simpleDateFormat.parse(design_plan_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Date design_complete_date;
public static String DESIGN_COMPLETE_DATE = "design_complete_date";
public java.sql.Date getDesign_complete_date(){
return design_complete_date;
}
public void setDesign_complete_date(java.sql.Date design_complete_date){
this.design_complete_date=design_complete_date;

}
public void setDesign_complete_date(java.lang.String design_complete_date){
if(design_complete_date==null||design_complete_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.design_complete_date= new Date(simpleDateFormat.parse(design_complete_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Date explain_plan_date;
public static String EXPLAIN_PLAN_DATE = "explain_plan_date";
public java.sql.Date getExplain_plan_date(){
return explain_plan_date;
}
public void setExplain_plan_date(java.sql.Date explain_plan_date){
this.explain_plan_date=explain_plan_date;

}
public void setExplain_plan_date(java.lang.String explain_plan_date){
if(explain_plan_date==null||explain_plan_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.explain_plan_date= new Date(simpleDateFormat.parse(explain_plan_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.sql.Date explain_complete_date;
public static String EXPLAIN_COMPLETE_DATE = "explain_complete_date";
public java.sql.Date getExplain_complete_date(){
return explain_complete_date;
}
public void setExplain_complete_date(java.sql.Date explain_complete_date){
this.explain_complete_date=explain_complete_date;

}
public void setExplain_complete_date(java.lang.String explain_complete_date){
if(explain_complete_date==null||explain_complete_date.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
 try {
this.explain_complete_date= new Date(simpleDateFormat.parse(explain_complete_date).getTime());

} catch (ParseException e) {
 e.printStackTrace();
}
}
private java.lang.String mould_type;
public static String MOULD_TYPE = "mould_type";
public java.lang.String getMould_type(){
return mould_type;
}
public void setMould_type(java.lang.String mould_type){
this.mould_type=mould_type;

}
private java.lang.String create_by;
public static String CREATE_BY = "create_by";
public java.lang.String getCreate_by(){
return create_by;
}
public void setCreate_by(java.lang.String create_by){
this.create_by=create_by;

}
private java.lang.String parts_property;
public static String PARTS_PROPERTY = "parts_property";
public java.lang.String getParts_property(){
return parts_property;
}
public void setParts_property(java.lang.String parts_property){
this.parts_property=parts_property;

}
private java.lang.String mould_name;
public static String MOULD_NAME = "mould_name";
public java.lang.String getMould_name(){
return mould_name;
}
public void setMould_name(java.lang.String mould_name){
this.mould_name=mould_name;

}
private java.lang.String mould_drawing;
public static String MOULD_DRAWING = "mould_drawing";
public java.lang.String getMould_drawing(){
return mould_drawing;
}
public void setMould_drawing(java.lang.String mould_drawing){
this.mould_drawing=mould_drawing;

}
private java.lang.Integer mould_num;
public static String MOULD_NUM = "mould_num";
public java.lang.Integer getMould_num(){
return mould_num;
}
public void setMould_num(java.lang.Integer mould_num){
this.mould_num=mould_num;

}
public void setMould_num(java.lang.String mould_num){
if(mould_num==null||mould_num.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.mould_num=Integer.parseInt(mould_num);

}
private java.lang.String mould_no;
public static String MOULD_NO = "mould_no";
public java.lang.String getMould_no(){
return mould_no;
}
public void setMould_no(java.lang.String mould_no){
this.mould_no=mould_no;

}
private java.lang.String engineer_type;
public static String ENGINEER_TYPE = "engineer_type";
public java.lang.String getEngineer_type(){
return engineer_type;
}
public void setEngineer_type(java.lang.String engineer_type){
this.engineer_type=engineer_type;

}
private java.lang.String undertake_unit;
public static String UNDERTAKE_UNIT = "undertake_unit";
public java.lang.String getUndertake_unit(){
return undertake_unit;
}
public void setUndertake_unit(java.lang.String undertake_unit){
this.undertake_unit=undertake_unit;

}
public String giveTableName() {
 return "t_task_parts";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_task_parts(java.lang.Long id ,java.lang.String task_id ,java.lang.String parts_name ,java.lang.String drawing_no ,java.lang.String provenance ,java.lang.String imp_level ,java.lang.String assign_score ,java.sql.Date make_plan_date ,java.sql.Date make_complete_date ,java.sql.Date design_plan_date ,java.sql.Date design_complete_date ,java.sql.Date explain_plan_date ,java.sql.Date explain_complete_date ,java.lang.String mould_type ,java.lang.String create_by ,java.lang.String parts_property ,java.lang.String mould_name ,java.lang.String mould_drawing ,java.lang.Integer mould_num ,java.lang.String mould_no ,java.lang.String engineer_type ,java.lang.String undertake_unit ){
 super();
this.id = id;
this.task_id = task_id;
this.parts_name = parts_name;
this.drawing_no = drawing_no;
this.provenance = provenance;
this.imp_level = imp_level;
this.assign_score = assign_score;
this.make_plan_date = make_plan_date;
this.make_complete_date = make_complete_date;
this.design_plan_date = design_plan_date;
this.design_complete_date = design_complete_date;
this.explain_plan_date = explain_plan_date;
this.explain_complete_date = explain_complete_date;
this.mould_type = mould_type;
this.create_by = create_by;
this.parts_property = parts_property;
this.mould_name = mould_name;
this.mould_drawing = mould_drawing;
this.mould_num = mould_num;
this.mould_no = mould_no;
this.engineer_type = engineer_type;
this.undertake_unit = undertake_unit;
}
public T_task_parts(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"task_id:"+ (task_id==null?"null":"'"+task_id+"'")+","+"parts_name:"+ (parts_name==null?"null":"'"+parts_name+"'")+","+"drawing_no:"+ (drawing_no==null?"null":"'"+drawing_no+"'")+","+"provenance:"+ (provenance==null?"null":"'"+provenance+"'")+","+"imp_level:"+ (imp_level==null?"null":"'"+imp_level+"'")+","+"assign_score:"+ (assign_score==null?"null":"'"+assign_score+"'")+","+"make_plan_date:"+ (make_plan_date==null?"null":"'"+make_plan_date+"'")+","+"make_complete_date:"+ (make_complete_date==null?"null":"'"+make_complete_date+"'")+","+"design_plan_date:"+ (design_plan_date==null?"null":"'"+design_plan_date+"'")+","+"design_complete_date:"+ (design_complete_date==null?"null":"'"+design_complete_date+"'")+","+"explain_plan_date:"+ (explain_plan_date==null?"null":"'"+explain_plan_date+"'")+","+"explain_complete_date:"+ (explain_complete_date==null?"null":"'"+explain_complete_date+"'")+","+"mould_type:"+ (mould_type==null?"null":"'"+mould_type+"'")+","+"create_by:"+ (create_by==null?"null":"'"+create_by+"'")+","+"parts_property:"+ (parts_property==null?"null":"'"+parts_property+"'")+","+"mould_name:"+ (mould_name==null?"null":"'"+mould_name+"'")+","+"mould_drawing:"+ (mould_drawing==null?"null":"'"+mould_drawing+"'")+","+"mould_num:"+ (mould_num==null?"null":"'"+mould_num+"'")+","+"mould_no:"+ (mould_no==null?"null":"'"+mould_no+"'")+","+"engineer_type:"+ (engineer_type==null?"null":"'"+engineer_type+"'")+","+"undertake_unit:"+ (undertake_unit==null?"null":"'"+undertake_unit+"'")+"}" ;
}
}
