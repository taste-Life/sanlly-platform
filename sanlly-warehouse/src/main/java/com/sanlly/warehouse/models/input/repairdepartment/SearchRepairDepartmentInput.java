package com.sanlly.warehouse.models.input.repairdepartment;

import com.sanlly.common.models.input.PageInput;

/**
 * @author lishzh
 */
public class SearchRepairDepartmentInput extends PageInput {

    public SearchRepairDepartmentInput(Integer index, Integer size) {
        super(index, size);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
