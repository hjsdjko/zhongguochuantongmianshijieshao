package com.entity.vo;

import com.entity.ShequxinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 社区信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("shequxinxi")
public class ShequxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 文章标题
     */

    @TableField(value = "shequxinxi_name")
    private String shequxinxiName;


    /**
     * 文章封面
     */

    @TableField(value = "shequxinxi_photo")
    private String shequxinxiPhoto;


    /**
     * 文章类型
     */

    @TableField(value = "shequxinxi_types")
    private Integer shequxinxiTypes;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 文章简介
     */

    @TableField(value = "shequxinxi_content")
    private String shequxinxiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：文章标题
	 */
    public String getShequxinxiName() {
        return shequxinxiName;
    }


    /**
	 * 获取：文章标题
	 */

    public void setShequxinxiName(String shequxinxiName) {
        this.shequxinxiName = shequxinxiName;
    }
    /**
	 * 设置：文章封面
	 */
    public String getShequxinxiPhoto() {
        return shequxinxiPhoto;
    }


    /**
	 * 获取：文章封面
	 */

    public void setShequxinxiPhoto(String shequxinxiPhoto) {
        this.shequxinxiPhoto = shequxinxiPhoto;
    }
    /**
	 * 设置：文章类型
	 */
    public Integer getShequxinxiTypes() {
        return shequxinxiTypes;
    }


    /**
	 * 获取：文章类型
	 */

    public void setShequxinxiTypes(Integer shequxinxiTypes) {
        this.shequxinxiTypes = shequxinxiTypes;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：文章简介
	 */
    public String getShequxinxiContent() {
        return shequxinxiContent;
    }


    /**
	 * 获取：文章简介
	 */

    public void setShequxinxiContent(String shequxinxiContent) {
        this.shequxinxiContent = shequxinxiContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
