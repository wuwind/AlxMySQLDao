package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_pattern_require")
/**
 * 手版样需求
 */
public class TDesignPatternRequire {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "count")
    @JsonProperty(value = "count")
    private Integer count;//数量需求
    @TableField(value = "count_date")
    @JsonProperty(value = "countDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date countDate;//数量需求日期
    @TableField(value = "number_flos_require")
    @JsonProperty(value = "numberFlosRequire")
    private String numberFlosRequire;//打号及牙花需求
    @TableField(value = "pattern_pack_require")
    @JsonProperty(value = "patternPackRequire")
    private String patternPackRequire;//手版样包装需求
    @TableField(value = "is_pattern_pay")
    @JsonProperty(value = "isPatternPay")
    private Boolean isPatternPay;//手版样收费
    @TableField(value = "other")
    @JsonProperty(value = "other")
    private String other;//其它
    @TableField(value = "is_need")
    @JsonProperty(value = "isNeed")
    private Boolean isNeed;//是否需要
}
