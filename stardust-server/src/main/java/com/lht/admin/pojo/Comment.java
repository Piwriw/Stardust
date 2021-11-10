package com.lht.admin.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 *
 * </p>
 *
 * @author lht
 * @since 2021-03-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("t_comment")
@ApiModel(value="Comment对象", description="")
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "comment_id", type = IdType.AUTO)
    private Long commentId;

    @ApiModelProperty(value = "评论内容")
    private String content;

    @ApiModelProperty(value = "文章id")
    private Long articleId;

    @ApiModelProperty(value = "父级评论id")
    private Long fid;

    @ApiModelProperty(value = "父级评论昵称")
    private String fcommentNickname;

    @ApiModelProperty(value = "昵称")
    private String nickname;

    @ApiModelProperty(value = "浏览器")
    private String browser;

    @ApiModelProperty(value = "操作系统")
    private String os;

    @ApiModelProperty(value = "请求ip")
    private String requestIp;

    @ApiModelProperty(value = "ip来源")
    private String address;

    @ApiModelProperty(value = "是否已被删除")
    private Boolean isDelete;

    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @TableField(exist = false)
    @ApiModelProperty(value = "子评论")
    private List<Comment> children;


}
