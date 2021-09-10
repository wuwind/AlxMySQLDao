package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_customer")
/**
 * 客户
 */
public class TDesignCustomer {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "customer_name")
    @JsonProperty(value = "customerName")
    private String customerName;//customer_name
    @TableField(value = "customer_level")
    @JsonProperty(value = "customerLevel")
    private String customerLevel;//客户等级
    @TableField(value = "code")
    @JsonProperty(value = "code")
    private String code;//客户代码
}
