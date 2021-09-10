package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_engineer_user")
/**
 * 用户-工程师类型
 */
public class TDesignEngineerUser {
    @TableField(value = "t_design_engineer_type_id")
    @JsonProperty(value = "tDesignEngineerTypeId")
    private Integer tDesignEngineerTypeId;//工程师类型_id
    @TableField(value = "t_design_engineer_id")
    @JsonProperty(value = "tDesignEngineerId")
    private Integer tDesignEngineerId;//工程师_id
}
