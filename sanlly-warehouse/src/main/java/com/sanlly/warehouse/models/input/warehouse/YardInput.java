package com.sanlly.warehouse.models.input.warehouse;

import java.util.Date;
/**
 * ClassName: YardInput
 * Description: 场站信息输入类
 * date: 2019/7/25 17:51
 *
 * @author zhh
 */
public class YardInput {
	//场站id
	private Integer prodYardId;
    //场站key
    private String key;
    //公司key
    private String company;
    //场站码
    private String yardCode;
    //场站名称
    private String yardName;
    //场站名称英文
    private String yardNameEn;
    //默认仓库
    private String defaultWarehouse;
    //删除状态
    private Integer isDel;
    //创建时间
    private Date createTime;
    //创建人
    private Integer createUser;
    //修改时间
    private Date updateTime;
    //修改人
    private Integer updateUser;

    public Integer getProdYardId() {
        return prodYardId;
    }

    public void setProdYardId(Integer prodYardId) {
        this.prodYardId = prodYardId;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getYardCode() {
        return yardCode;
    }

    public void setYardCode(String yardCode) {
        this.yardCode = yardCode == null ? null : yardCode.trim();
    }

    public String getYardName() {
        return yardName;
    }

    public void setYardName(String yardName) {
        this.yardName = yardName == null ? null : yardName.trim();
    }

    public String getYardNameEn() {
        return yardNameEn;
    }

    public void setYardNameEn(String yardNameEn) {
        this.yardNameEn = yardNameEn == null ? null : yardNameEn.trim();
    }

    public String getDefaultWarehouse() {
        return defaultWarehouse;
    }

    public void setDefaultWarehouse(String defaultWarehouse) {
        this.defaultWarehouse = defaultWarehouse == null ? null : defaultWarehouse.trim();
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

	@Override
	public String toString() {
		return "YardInput [prodYardId=" + prodYardId + ", key=" + key + ", company=" + company + ", yardCode="
				+ yardCode + ", yardName=" + yardName + ", yardNameEn=" + yardNameEn + ", defaultWarehouse="
				+ defaultWarehouse + ", isDel=" + isDel + ", createTime=" + createTime + ", createUser=" + createUser
				+ ", updateTime=" + updateTime + ", updateUser=" + updateUser + "]";
	}

}
