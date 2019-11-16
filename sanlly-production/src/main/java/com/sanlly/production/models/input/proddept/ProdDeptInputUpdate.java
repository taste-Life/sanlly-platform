package com.sanlly.production.models.input.proddept;

/**
 * @author zhq
 * @date 2019/10/24
 * @description 更新生产部门接口请求报文
 */
public class ProdDeptInputUpdate extends ProdDeptInputAdd {

    private Integer prodProdDeptId;

    private String key;

    public Integer getProdProdDeptId() {
        return prodProdDeptId;
    }

    public void setProdProdDeptId(Integer prodProdDeptId) {
        this.prodProdDeptId = prodProdDeptId;
    }

}
