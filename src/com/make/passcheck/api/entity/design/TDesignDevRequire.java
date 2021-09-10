package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_dev_require")
/**
 * 开发需求
 */
public class TDesignDevRequire {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "is_model_dev")
    @JsonProperty(value = "isModelDev")
    private Boolean isModelDev;//模具开发
    @TableField(value = "is_dfm_require")
    @JsonProperty(value = "isDfmRequire")
    private Boolean isDfmRequire;//DFM需求
    @TableField(value = "is_customer_format")
    @JsonProperty(value = "isCustomerFormat")
    private Boolean isCustomerFormat;//客人格式
    @TableField(value = "is_model_pay")
    @JsonProperty(value = "isModelPay")
    private Boolean isModelPay;//模具收费
    @TableField(value = "model_count")
    @JsonProperty(value = "modelCount")
    private Integer modelCount;//模具样品数量
    @TableField(value = "model_date")
    @JsonProperty(value = "modelDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date modelDate;//样品需求日期
    @TableField(value = "number_flos_require")
    @JsonProperty(value = "numberFlosRequire")
    private String numberFlosRequire;//打号及牙花需求
    @TableField(value = "sample_pack_require")
    @JsonProperty(value = "samplePackRequire")
    private String samplePackRequire;//样品包装需求
    @TableField(value = "is_sample_report")
    @JsonProperty(value = "isSampleReport")
    private Boolean isSampleReport;//样品检测报告
    @TableField(value = "is_report_customer_format")
    @JsonProperty(value = "isReportCustomerFormat")
    private Boolean isReportCustomerFormat;//样品检测客人格式
    @TableField(value = "is_sample_pay")
    @JsonProperty(value = "isSamplePay")
    private Boolean isSamplePay;//样品收费
    @TableField(value = "other")
    @JsonProperty(value = "other")
    private String other;//其他
    @TableField(value = "is_need")
    @JsonProperty(value = "isNeed")
    private Boolean isNeed;//是否需要
}
