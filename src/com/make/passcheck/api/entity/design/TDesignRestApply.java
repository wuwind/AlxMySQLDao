package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_rest_apply")
/**
 * 周六申请单
 */
public class TDesignRestApply {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "t_design_user_user_id")
    @JsonProperty(value = "tDesignUserUserId")
    private Integer tDesignUserUserId;//工程人员_人员id
    @TableField(value = "t_design_user_user_id2")
    @JsonProperty(value = "tDesignUserUserId2")
    private Integer tDesignUserUserId2;//工程人员_人员id2
    @TableField(value = "rest_date")
    @JsonProperty(value = "restDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date restDate;//休息日期
    @TableField(value = "rest_des")
    @JsonProperty(value = "restDes")
    private String restDes;//事项
    @TableField(value = "create_date")
    @JsonProperty(value = "createDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date createDate;//申请日期
    @TableField(value = "is_pass")
    @JsonProperty(value = "isPass")
    private Boolean isPass;//部门审批
    @TableField(value = "rest_time")
    @JsonProperty(value = "restTime")
    private Integer restTime;//休息时间0天1上午2下午
}
