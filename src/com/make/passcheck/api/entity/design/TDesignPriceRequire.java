package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_price_require")
/**
 * 报价需求
 */
public class TDesignPriceRequire {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "is_design_pay")
    @JsonProperty(value = "isDesignPay")
    private Boolean isDesignPay;//设计收费
    @TableField(value = "is_ppt")
    @JsonProperty(value = "isPpt")
    private Boolean isPpt;//PPT设计方案
    @TableField(value = "ppt_date")
    @JsonProperty(value = "pptDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date pptDate;//ppt需求日期
    @TableField(value = "is_pattern_pay")
    @JsonProperty(value = "isPatternPay")
    private Boolean isPatternPay;//手版样报价
    @TableField(value = "pattern_pay_date")
    @JsonProperty(value = "patternPayDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date patternPayDate;//手版样报价日期
    @TableField(value = "is_product_pay")
    @JsonProperty(value = "isProductPay")
    private Boolean isProductPay;//产品报价
    @TableField(value = "product_pay_date")
    @JsonProperty(value = "productPayDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date productPayDate;//产品报价日期
    @TableField(value = "other")
    @JsonProperty(value = "other")
    private String other;//其它
    @TableField(value = "is_need")
    @JsonProperty(value = "isNeed")
    private Boolean isNeed;//是否需要
}
