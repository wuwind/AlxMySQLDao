package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_modify_content")
/**
 * 变更内容
 */
public class TDesignModifyContent {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//变更内容id
    @TableField(value = "t_design_modify_id")
    @JsonProperty(value = "tDesignModifyId")
    private Integer tDesignModifyId;//变更任务_变更id
    @TableField(value = "content_des")
    @JsonProperty(value = "contentDes")
    private String contentDes;//内容描述
    @TableField(value = "content_order")
    @JsonProperty(value = "contentOrder")
    private Integer contentOrder;//序号0其它
}
