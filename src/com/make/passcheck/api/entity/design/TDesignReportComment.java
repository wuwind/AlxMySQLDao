package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_report_comment")
/**
 * 报表评论
 */
public class TDesignReportComment {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "content_key")
    @JsonProperty(value = "contentKey")
    private String contentKey;//键值
    @TableField(value = "content")
    @JsonProperty(value = "content")
    private String content;//内容
    @TableField(value = "user_id")
    @JsonProperty(value = "userId")
    private Integer userId;//创建者id
    @TableField(value = "create_date")
    @JsonProperty(value = "createDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date createDate;//日期
    @TableField(value = "content_no")
    @JsonProperty(value = "contentNo")
    private Integer contentNo;//序号
}
