package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_basic")
/**
 * 标的物基本信息说明
 */
public class TDesignBasic {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "is_survey_info")
    @JsonProperty(value = "isSurveyInfo")
    private Boolean isSurveyInfo;//市调资料
    @TableField(value = "is_demand_info")
    @JsonProperty(value = "isDemandInfo")
    private Boolean isDemandInfo;//产品需求书
    @TableField(value = "is_3d_info")
    @JsonProperty(value = "is3dInfo")
    private Boolean is3dInfo;//三维图档
    @TableField(value = "is_engine_info")
    @JsonProperty(value = "isEngineInfo")
    private Boolean isEngineInfo;//工程图档
    @TableField(value = "is_sample")
    @JsonProperty(value = "isSample")
    private Boolean isSample;//样品
    @TableField(value = "is_env_require")
    @JsonProperty(value = "isEnvRequire")
    private Boolean isEnvRequire;//环保需求
    @TableField(value = "is_qualification_require")
    @JsonProperty(value = "isQualificationRequire")
    private Boolean isQualificationRequire;//资质需求
    @TableField(value = "material_require")
    @JsonProperty(value = "materialRequire")
    private String materialRequire;//材质需求
    @TableField(value = "surface_require")
    @JsonProperty(value = "surfaceRequire")
    private String surfaceRequire;//表面处理需求
    @TableField(value = "survey_info_path")
    @JsonProperty(value = "surveyInfoPath")
    private String surveyInfoPath;//市调资料路径
    @TableField(value = "demand_info_path")
    @JsonProperty(value = "demandInfoPath")
    private String demandInfoPath;//产品需求书路径
    @TableField(value = "info_3d_path")
    @JsonProperty(value = "info3dPath")
    private String info3dPath;//三维图档路径
    @TableField(value = "info_engine_path")
    @JsonProperty(value = "infoEnginePath")
    private String infoEnginePath;//工程图档路径
    @TableField(value = "env_require_path")
    @JsonProperty(value = "envRequirePath")
    private String envRequirePath;//环保需求路径
    @TableField(value = "qualification_require_path")
    @JsonProperty(value = "qualificationRequirePath")
    private String qualificationRequirePath;//资质需求路径
    @TableField(value = "sample_des")
    @JsonProperty(value = "sampleDes")
    private String sampleDes;//样品描述
    @TableField(value = "env_des")
    @JsonProperty(value = "envDes")
    private String envDes;//环保描述
    @TableField(value = "qualification_des")
    @JsonProperty(value = "qualificationDes")
    private String qualificationDes;//资质描述
}
