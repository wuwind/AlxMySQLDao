package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_design_basic implements Table{
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
private java.lang.Integer t_design_task_id;
public static String T_DESIGN_TASK_ID = "t_design_task_id";
public java.lang.Integer getT_design_task_id(){
return t_design_task_id;
}
public void setT_design_task_id(java.lang.Integer t_design_task_id){
this.t_design_task_id=t_design_task_id;

}
public void setT_design_task_id(java.lang.String t_design_task_id){
if(t_design_task_id==null||t_design_task_id.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.t_design_task_id=Integer.parseInt(t_design_task_id);

}
private java.lang.Integer is_survey_info;
public static String IS_SURVEY_INFO = "is_survey_info";
public java.lang.Integer getIs_survey_info(){
return is_survey_info;
}
public void setIs_survey_info(java.lang.Integer is_survey_info){
this.is_survey_info=is_survey_info;

}
public void setIs_survey_info(java.lang.String is_survey_info){
if(is_survey_info==null||is_survey_info.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_survey_info=Integer.parseInt(is_survey_info);

}
private java.lang.Integer is_demand_info;
public static String IS_DEMAND_INFO = "is_demand_info";
public java.lang.Integer getIs_demand_info(){
return is_demand_info;
}
public void setIs_demand_info(java.lang.Integer is_demand_info){
this.is_demand_info=is_demand_info;

}
public void setIs_demand_info(java.lang.String is_demand_info){
if(is_demand_info==null||is_demand_info.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_demand_info=Integer.parseInt(is_demand_info);

}
private java.lang.Integer is_3d_info;
public static String IS_3D_INFO = "is_3d_info";
public java.lang.Integer getIs_3d_info(){
return is_3d_info;
}
public void setIs_3d_info(java.lang.Integer is_3d_info){
this.is_3d_info=is_3d_info;

}
public void setIs_3d_info(java.lang.String is_3d_info){
if(is_3d_info==null||is_3d_info.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_3d_info=Integer.parseInt(is_3d_info);

}
private java.lang.Integer is_engine_info;
public static String IS_ENGINE_INFO = "is_engine_info";
public java.lang.Integer getIs_engine_info(){
return is_engine_info;
}
public void setIs_engine_info(java.lang.Integer is_engine_info){
this.is_engine_info=is_engine_info;

}
public void setIs_engine_info(java.lang.String is_engine_info){
if(is_engine_info==null||is_engine_info.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_engine_info=Integer.parseInt(is_engine_info);

}
private java.lang.Integer is_sample;
public static String IS_SAMPLE = "is_sample";
public java.lang.Integer getIs_sample(){
return is_sample;
}
public void setIs_sample(java.lang.Integer is_sample){
this.is_sample=is_sample;

}
public void setIs_sample(java.lang.String is_sample){
if(is_sample==null||is_sample.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_sample=Integer.parseInt(is_sample);

}
private java.lang.Integer is_env_require;
public static String IS_ENV_REQUIRE = "is_env_require";
public java.lang.Integer getIs_env_require(){
return is_env_require;
}
public void setIs_env_require(java.lang.Integer is_env_require){
this.is_env_require=is_env_require;

}
public void setIs_env_require(java.lang.String is_env_require){
if(is_env_require==null||is_env_require.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_env_require=Integer.parseInt(is_env_require);

}
private java.lang.Integer is_qualification_require;
public static String IS_QUALIFICATION_REQUIRE = "is_qualification_require";
public java.lang.Integer getIs_qualification_require(){
return is_qualification_require;
}
public void setIs_qualification_require(java.lang.Integer is_qualification_require){
this.is_qualification_require=is_qualification_require;

}
public void setIs_qualification_require(java.lang.String is_qualification_require){
if(is_qualification_require==null||is_qualification_require.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_qualification_require=Integer.parseInt(is_qualification_require);

}
private java.lang.String material_require;
public static String MATERIAL_REQUIRE = "material_require";
public java.lang.String getMaterial_require(){
return material_require;
}
public void setMaterial_require(java.lang.String material_require){
this.material_require=material_require;

}
private java.lang.String surface_require;
public static String SURFACE_REQUIRE = "surface_require";
public java.lang.String getSurface_require(){
return surface_require;
}
public void setSurface_require(java.lang.String surface_require){
this.surface_require=surface_require;

}
private java.lang.String survey_info_path;
public static String SURVEY_INFO_PATH = "survey_info_path";
public java.lang.String getSurvey_info_path(){
return survey_info_path;
}
public void setSurvey_info_path(java.lang.String survey_info_path){
this.survey_info_path=survey_info_path;

}
private java.lang.String demand_info_path;
public static String DEMAND_INFO_PATH = "demand_info_path";
public java.lang.String getDemand_info_path(){
return demand_info_path;
}
public void setDemand_info_path(java.lang.String demand_info_path){
this.demand_info_path=demand_info_path;

}
private java.lang.String info_3d_path;
public static String INFO_3D_PATH = "info_3d_path";
public java.lang.String getInfo_3d_path(){
return info_3d_path;
}
public void setInfo_3d_path(java.lang.String info_3d_path){
this.info_3d_path=info_3d_path;

}
private java.lang.String info_engine_path;
public static String INFO_ENGINE_PATH = "info_engine_path";
public java.lang.String getInfo_engine_path(){
return info_engine_path;
}
public void setInfo_engine_path(java.lang.String info_engine_path){
this.info_engine_path=info_engine_path;

}
private java.lang.String env_require_path;
public static String ENV_REQUIRE_PATH = "env_require_path";
public java.lang.String getEnv_require_path(){
return env_require_path;
}
public void setEnv_require_path(java.lang.String env_require_path){
this.env_require_path=env_require_path;

}
private java.lang.String qualification_require_path;
public static String QUALIFICATION_REQUIRE_PATH = "qualification_require_path";
public java.lang.String getQualification_require_path(){
return qualification_require_path;
}
public void setQualification_require_path(java.lang.String qualification_require_path){
this.qualification_require_path=qualification_require_path;

}
public String giveTableName() {
 return "t_design_basic";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_design_basic(java.lang.Integer id ,java.lang.Integer t_design_task_id ,java.lang.Integer is_survey_info ,java.lang.Integer is_demand_info ,java.lang.Integer is_3d_info ,java.lang.Integer is_engine_info ,java.lang.Integer is_sample ,java.lang.Integer is_env_require ,java.lang.Integer is_qualification_require ,java.lang.String material_require ,java.lang.String surface_require ,java.lang.String survey_info_path ,java.lang.String demand_info_path ,java.lang.String info_3d_path ,java.lang.String info_engine_path ,java.lang.String env_require_path ,java.lang.String qualification_require_path ){
 super();
this.id = id;
this.t_design_task_id = t_design_task_id;
this.is_survey_info = is_survey_info;
this.is_demand_info = is_demand_info;
this.is_3d_info = is_3d_info;
this.is_engine_info = is_engine_info;
this.is_sample = is_sample;
this.is_env_require = is_env_require;
this.is_qualification_require = is_qualification_require;
this.material_require = material_require;
this.surface_require = surface_require;
this.survey_info_path = survey_info_path;
this.demand_info_path = demand_info_path;
this.info_3d_path = info_3d_path;
this.info_engine_path = info_engine_path;
this.env_require_path = env_require_path;
this.qualification_require_path = qualification_require_path;
}
public T_design_basic(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"t_design_task_id:"+ (t_design_task_id==null?"null":"'"+t_design_task_id+"'")+","+"is_survey_info:"+ (is_survey_info==null?"null":"'"+is_survey_info+"'")+","+"is_demand_info:"+ (is_demand_info==null?"null":"'"+is_demand_info+"'")+","+"is_3d_info:"+ (is_3d_info==null?"null":"'"+is_3d_info+"'")+","+"is_engine_info:"+ (is_engine_info==null?"null":"'"+is_engine_info+"'")+","+"is_sample:"+ (is_sample==null?"null":"'"+is_sample+"'")+","+"is_env_require:"+ (is_env_require==null?"null":"'"+is_env_require+"'")+","+"is_qualification_require:"+ (is_qualification_require==null?"null":"'"+is_qualification_require+"'")+","+"material_require:"+ (material_require==null?"null":"'"+material_require+"'")+","+"surface_require:"+ (surface_require==null?"null":"'"+surface_require+"'")+","+"survey_info_path:"+ (survey_info_path==null?"null":"'"+survey_info_path+"'")+","+"demand_info_path:"+ (demand_info_path==null?"null":"'"+demand_info_path+"'")+","+"info_3d_path:"+ (info_3d_path==null?"null":"'"+info_3d_path+"'")+","+"info_engine_path:"+ (info_engine_path==null?"null":"'"+info_engine_path+"'")+","+"env_require_path:"+ (env_require_path==null?"null":"'"+env_require_path+"'")+","+"qualification_require_path:"+ (qualification_require_path==null?"null":"'"+qualification_require_path+"'")+"}" ;
}
}
