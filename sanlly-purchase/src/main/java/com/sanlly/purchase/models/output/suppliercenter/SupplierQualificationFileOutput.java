package com.sanlly.purchase.models.output.suppliercenter;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Description: TODO
 * @ClassName: SupplierQualificationFileOutput
 * @Version 1.0
 * @Author mqz
 */
public class SupplierQualificationFileOutput {
    //文件名称
    private String datafileName;

    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    //有效期开始时间
    private Date startTime;
    @JsonFormat(pattern = "yyyy-MM-dd", locale = "zh", timezone = "GMT+8")
    //有效期结束时间
    private Date endTime;
    //文件地址
    private String attachmentPath;

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    public String getDatafileName() {
        return datafileName;
    }

    public void setDatafileName(String datafileName) {
        this.datafileName = datafileName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
