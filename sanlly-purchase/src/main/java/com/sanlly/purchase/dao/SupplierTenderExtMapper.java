package com.sanlly.purchase.dao;

import com.sanlly.purchase.models.output.matterbidding.MatterSupplierTenderOutput;
import com.sanlly.purchase.models.output.matterbidding.SupplierTenderOutput;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierTenderExtMapper {
	List<MatterSupplierTenderOutput> selectByTenderPurchaseId(@Param("purcMatterTenderPurchaseId") Integer purcMatterTenderPurchaseId);
     List<SupplierTenderOutput> selectSupplierByTenderPurchaseId(@Param("purcMatterTenderPurchaseId") Integer purcMatterTenderPurchaseId);

}
