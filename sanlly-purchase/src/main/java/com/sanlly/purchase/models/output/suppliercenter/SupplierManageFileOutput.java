package com.sanlly.purchase.models.output.suppliercenter;

public class SupplierManageFileOutput {
    //管理文件名称
    private String datafileName;
    //文件名称
    private String fileName;
    //文件地址
    private String attachmentPath;

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDatafileName(String datafileName) {
        this.datafileName = datafileName;
    }

    public String getDatafileName() {
        return datafileName;
    }


}
