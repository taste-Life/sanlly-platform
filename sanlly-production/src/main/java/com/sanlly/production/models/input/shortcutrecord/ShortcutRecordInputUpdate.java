package com.sanlly.production.models.input.shortcutrecord;

/**
 * @author zhq
 * @date 2019/11/2
 * @description
 */
public class ShortcutRecordInputUpdate extends ShortcutRecordInputAdd {
    private Integer prodShortcutRecordId;

    public Integer getProdShortcutRecordId() {
        return prodShortcutRecordId;
    }

    public void setProdShortcutRecordId(Integer prodShortcutRecordId) {
        this.prodShortcutRecordId = prodShortcutRecordId;
    }
}
