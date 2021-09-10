package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_lock")
/**
 * 锁具
 */
public class TDesignLock {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "lock_type")
    @JsonProperty(value = "lockType")
    private Integer lockType;//锁类型1五金2电子
    @TableField(value = "key_type")
    @JsonProperty(value = "keyType")
    private String keyType;//钥匙结构类型
    @TableField(value = "open_key_conf")
    @JsonProperty(value = "openKeyConf")
    private String openKeyConf;//常开钥匙配置
    @TableField(value = "replace_key_conf")
    @JsonProperty(value = "replaceKeyConf")
    private String replaceKeyConf;//换锁钥匙配置
    @TableField(value = "flos_count")
    @JsonProperty(value = "flosCount")
    private Integer flosCount;//常规牙花数量
    @TableField(value = "is_universal_sys")
    @JsonProperty(value = "isUniversalSys")
    private Boolean isUniversalSys;//是否万能系统
    @TableField(value = "universal_key_conf")
    @JsonProperty(value = "universalKeyConf")
    private String universalKeyConf;//万能钥匙配置
    @TableField(value = "universal_flos_group_count")
    @JsonProperty(value = "universalFlosGroupCount")
    private Integer universalFlosGroupCount;//万能牙花组数量
    @TableField(value = "universal_flos_every_group_count")
    @JsonProperty(value = "universalFlosEveryGroupCount")
    private Integer universalFlosEveryGroupCount;//万能牙花每组数量
    @TableField(value = "is_make_hole")
    @JsonProperty(value = "isMakeHole")
    private Boolean isMakeHole;//美科标准安装孔
    @TableField(value = "hole_size")
    @JsonProperty(value = "holeSize")
    private String holeSize;//安装孔尺寸
    @TableField(value = "effect_time")
    @JsonProperty(value = "effectTime")
    private String effectTime;//锁具作用长
    @TableField(value = "lock_tongue_size")
    @JsonProperty(value = "lockTongueSize")
    private String lockTongueSize;//锁舌尺寸
    @TableField(value = "is_make_pack")
    @JsonProperty(value = "isMakePack")
    private Boolean isMakePack;//美科标准包装
    @TableField(value = "pack_require")
    @JsonProperty(value = "packRequire")
    private String packRequire;//包装要求
    @TableField(value = "number_content")
    @JsonProperty(value = "numberContent")
    private String numberContent;//打号内容
    @TableField(value = "number_require")
    @JsonProperty(value = "numberRequire")
    private String numberRequire;//打号要求
    @TableField(value = "open_way")
    @JsonProperty(value = "openWay")
    private String openWay;//通信/开锁方式
    @TableField(value = "electric_way")
    @JsonProperty(value = "electricWay")
    private String electricWay;//供电方式
    @TableField(value = "is_emergency_open")
    @JsonProperty(value = "isEmergencyOpen")
    private Boolean isEmergencyOpen;//是否应急开启
    @TableField(value = "soft_platform")
    @JsonProperty(value = "softPlatform")
    private String softPlatform;//软件平台
}
