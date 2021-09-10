package sql.alex.model;
import situ.sql.assistant.Table;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.math.BigDecimal;
public class T_lock implements Table{
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
private java.lang.Integer lock_type;
public static String LOCK_TYPE = "lock_type";
public java.lang.Integer getLock_type(){
return lock_type;
}
public void setLock_type(java.lang.Integer lock_type){
this.lock_type=lock_type;

}
public void setLock_type(java.lang.String lock_type){
if(lock_type==null||lock_type.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.lock_type=Integer.parseInt(lock_type);

}
private java.lang.String key_type;
public static String KEY_TYPE = "key_type";
public java.lang.String getKey_type(){
return key_type;
}
public void setKey_type(java.lang.String key_type){
this.key_type=key_type;

}
private java.lang.String open_key_conf;
public static String OPEN_KEY_CONF = "open_key_conf";
public java.lang.String getOpen_key_conf(){
return open_key_conf;
}
public void setOpen_key_conf(java.lang.String open_key_conf){
this.open_key_conf=open_key_conf;

}
private java.lang.String replace_key_conf;
public static String REPLACE_KEY_CONF = "replace_key_conf";
public java.lang.String getReplace_key_conf(){
return replace_key_conf;
}
public void setReplace_key_conf(java.lang.String replace_key_conf){
this.replace_key_conf=replace_key_conf;

}
private java.lang.Integer flos_count;
public static String FLOS_COUNT = "flos_count";
public java.lang.Integer getFlos_count(){
return flos_count;
}
public void setFlos_count(java.lang.Integer flos_count){
this.flos_count=flos_count;

}
public void setFlos_count(java.lang.String flos_count){
if(flos_count==null||flos_count.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.flos_count=Integer.parseInt(flos_count);

}
private java.lang.Integer is_universal_sys;
public static String IS_UNIVERSAL_SYS = "is_universal_sys";
public java.lang.Integer getIs_universal_sys(){
return is_universal_sys;
}
public void setIs_universal_sys(java.lang.Integer is_universal_sys){
this.is_universal_sys=is_universal_sys;

}
public void setIs_universal_sys(java.lang.String is_universal_sys){
if(is_universal_sys==null||is_universal_sys.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_universal_sys=Integer.parseInt(is_universal_sys);

}
private java.lang.String universal_key_conf;
public static String UNIVERSAL_KEY_CONF = "universal_key_conf";
public java.lang.String getUniversal_key_conf(){
return universal_key_conf;
}
public void setUniversal_key_conf(java.lang.String universal_key_conf){
this.universal_key_conf=universal_key_conf;

}
private java.lang.Integer universal_flos_group_count;
public static String UNIVERSAL_FLOS_GROUP_COUNT = "universal_flos_group_count";
public java.lang.Integer getUniversal_flos_group_count(){
return universal_flos_group_count;
}
public void setUniversal_flos_group_count(java.lang.Integer universal_flos_group_count){
this.universal_flos_group_count=universal_flos_group_count;

}
public void setUniversal_flos_group_count(java.lang.String universal_flos_group_count){
if(universal_flos_group_count==null||universal_flos_group_count.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.universal_flos_group_count=Integer.parseInt(universal_flos_group_count);

}
private java.lang.Integer universal_flos_every_group_count;
public static String UNIVERSAL_FLOS_EVERY_GROUP_COUNT = "universal_flos_every_group_count";
public java.lang.Integer getUniversal_flos_every_group_count(){
return universal_flos_every_group_count;
}
public void setUniversal_flos_every_group_count(java.lang.Integer universal_flos_every_group_count){
this.universal_flos_every_group_count=universal_flos_every_group_count;

}
public void setUniversal_flos_every_group_count(java.lang.String universal_flos_every_group_count){
if(universal_flos_every_group_count==null||universal_flos_every_group_count.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.universal_flos_every_group_count=Integer.parseInt(universal_flos_every_group_count);

}
private java.lang.Integer is_make_hole;
public static String IS_MAKE_HOLE = "is_make_hole";
public java.lang.Integer getIs_make_hole(){
return is_make_hole;
}
public void setIs_make_hole(java.lang.Integer is_make_hole){
this.is_make_hole=is_make_hole;

}
public void setIs_make_hole(java.lang.String is_make_hole){
if(is_make_hole==null||is_make_hole.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_make_hole=Integer.parseInt(is_make_hole);

}
private java.lang.String hole_size;
public static String HOLE_SIZE = "hole_size";
public java.lang.String getHole_size(){
return hole_size;
}
public void setHole_size(java.lang.String hole_size){
this.hole_size=hole_size;

}
private java.lang.String effect_time;
public static String EFFECT_TIME = "effect_time";
public java.lang.String getEffect_time(){
return effect_time;
}
public void setEffect_time(java.lang.String effect_time){
this.effect_time=effect_time;

}
private java.lang.String lock_tongue_size;
public static String LOCK_TONGUE_SIZE = "lock_tongue_size";
public java.lang.String getLock_tongue_size(){
return lock_tongue_size;
}
public void setLock_tongue_size(java.lang.String lock_tongue_size){
this.lock_tongue_size=lock_tongue_size;

}
private java.lang.Integer is_make_pack;
public static String IS_MAKE_PACK = "is_make_pack";
public java.lang.Integer getIs_make_pack(){
return is_make_pack;
}
public void setIs_make_pack(java.lang.Integer is_make_pack){
this.is_make_pack=is_make_pack;

}
public void setIs_make_pack(java.lang.String is_make_pack){
if(is_make_pack==null||is_make_pack.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_make_pack=Integer.parseInt(is_make_pack);

}
private java.lang.String pack_require;
public static String PACK_REQUIRE = "pack_require";
public java.lang.String getPack_require(){
return pack_require;
}
public void setPack_require(java.lang.String pack_require){
this.pack_require=pack_require;

}
private java.lang.String number_content;
public static String NUMBER_CONTENT = "number_content";
public java.lang.String getNumber_content(){
return number_content;
}
public void setNumber_content(java.lang.String number_content){
this.number_content=number_content;

}
private java.lang.String number_require;
public static String NUMBER_REQUIRE = "number_require";
public java.lang.String getNumber_require(){
return number_require;
}
public void setNumber_require(java.lang.String number_require){
this.number_require=number_require;

}
private java.lang.String open_way;
public static String OPEN_WAY = "open_way";
public java.lang.String getOpen_way(){
return open_way;
}
public void setOpen_way(java.lang.String open_way){
this.open_way=open_way;

}
private java.lang.String electory_way;
public static String ELECTORY_WAY = "electory_way";
public java.lang.String getElectory_way(){
return electory_way;
}
public void setElectory_way(java.lang.String electory_way){
this.electory_way=electory_way;

}
private java.lang.Integer is_emergency_open;
public static String IS_EMERGENCY_OPEN = "is_emergency_open";
public java.lang.Integer getIs_emergency_open(){
return is_emergency_open;
}
public void setIs_emergency_open(java.lang.Integer is_emergency_open){
this.is_emergency_open=is_emergency_open;

}
public void setIs_emergency_open(java.lang.String is_emergency_open){
if(is_emergency_open==null||is_emergency_open.length()==0){System.out.println("YOUR INPUT IS NULL");return;}
this.is_emergency_open=Integer.parseInt(is_emergency_open);

}
private java.lang.String soft_platform;
public static String SOFT_PLATFORM = "soft_platform";
public java.lang.String getSoft_platform(){
return soft_platform;
}
public void setSoft_platform(java.lang.String soft_platform){
this.soft_platform=soft_platform;

}
public String giveTableName() {
 return "t_lock";
}
public String givePrimaryColumnName() {
 return "id";
}
public String[] giveDualPrimaryName() {
 return null;
}
public T_lock(java.lang.Integer id ,java.lang.Integer t_design_task_id ,java.lang.Integer lock_type ,java.lang.String key_type ,java.lang.String open_key_conf ,java.lang.String replace_key_conf ,java.lang.Integer flos_count ,java.lang.Integer is_universal_sys ,java.lang.String universal_key_conf ,java.lang.Integer universal_flos_group_count ,java.lang.Integer universal_flos_every_group_count ,java.lang.Integer is_make_hole ,java.lang.String hole_size ,java.lang.String effect_time ,java.lang.String lock_tongue_size ,java.lang.Integer is_make_pack ,java.lang.String pack_require ,java.lang.String number_content ,java.lang.String number_require ,java.lang.String open_way ,java.lang.String electory_way ,java.lang.Integer is_emergency_open ,java.lang.String soft_platform ){
 super();
this.id = id;
this.t_design_task_id = t_design_task_id;
this.lock_type = lock_type;
this.key_type = key_type;
this.open_key_conf = open_key_conf;
this.replace_key_conf = replace_key_conf;
this.flos_count = flos_count;
this.is_universal_sys = is_universal_sys;
this.universal_key_conf = universal_key_conf;
this.universal_flos_group_count = universal_flos_group_count;
this.universal_flos_every_group_count = universal_flos_every_group_count;
this.is_make_hole = is_make_hole;
this.hole_size = hole_size;
this.effect_time = effect_time;
this.lock_tongue_size = lock_tongue_size;
this.is_make_pack = is_make_pack;
this.pack_require = pack_require;
this.number_content = number_content;
this.number_require = number_require;
this.open_way = open_way;
this.electory_way = electory_way;
this.is_emergency_open = is_emergency_open;
this.soft_platform = soft_platform;
}
public T_lock(){}
public String toString(){
 return "{"+"id:"+ (id==null?"null":"'"+id+"'")+","+"t_design_task_id:"+ (t_design_task_id==null?"null":"'"+t_design_task_id+"'")+","+"lock_type:"+ (lock_type==null?"null":"'"+lock_type+"'")+","+"key_type:"+ (key_type==null?"null":"'"+key_type+"'")+","+"open_key_conf:"+ (open_key_conf==null?"null":"'"+open_key_conf+"'")+","+"replace_key_conf:"+ (replace_key_conf==null?"null":"'"+replace_key_conf+"'")+","+"flos_count:"+ (flos_count==null?"null":"'"+flos_count+"'")+","+"is_universal_sys:"+ (is_universal_sys==null?"null":"'"+is_universal_sys+"'")+","+"universal_key_conf:"+ (universal_key_conf==null?"null":"'"+universal_key_conf+"'")+","+"universal_flos_group_count:"+ (universal_flos_group_count==null?"null":"'"+universal_flos_group_count+"'")+","+"universal_flos_every_group_count:"+ (universal_flos_every_group_count==null?"null":"'"+universal_flos_every_group_count+"'")+","+"is_make_hole:"+ (is_make_hole==null?"null":"'"+is_make_hole+"'")+","+"hole_size:"+ (hole_size==null?"null":"'"+hole_size+"'")+","+"effect_time:"+ (effect_time==null?"null":"'"+effect_time+"'")+","+"lock_tongue_size:"+ (lock_tongue_size==null?"null":"'"+lock_tongue_size+"'")+","+"is_make_pack:"+ (is_make_pack==null?"null":"'"+is_make_pack+"'")+","+"pack_require:"+ (pack_require==null?"null":"'"+pack_require+"'")+","+"number_content:"+ (number_content==null?"null":"'"+number_content+"'")+","+"number_require:"+ (number_require==null?"null":"'"+number_require+"'")+","+"open_way:"+ (open_way==null?"null":"'"+open_way+"'")+","+"electory_way:"+ (electory_way==null?"null":"'"+electory_way+"'")+","+"is_emergency_open:"+ (is_emergency_open==null?"null":"'"+is_emergency_open+"'")+","+"soft_platform:"+ (soft_platform==null?"null":"'"+soft_platform+"'")+"}" ;
}
}
