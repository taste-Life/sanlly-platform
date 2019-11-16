package com.sanlly.warehouse.models.input.repair;

import java.util.List;

/**
 *
 *
 * @author lishzh
 */
public class RepairInput {
    private List<ReturnStoreInput> returnStorehouseInputs;

    public List<ReturnStoreInput> getReturnStorehouseInputs() {
        return returnStorehouseInputs;
    }

    public void setReturnStorehouseInputs(List<ReturnStoreInput> returnStorehouseInputs) {
        this.returnStorehouseInputs = returnStorehouseInputs;
    }

}
