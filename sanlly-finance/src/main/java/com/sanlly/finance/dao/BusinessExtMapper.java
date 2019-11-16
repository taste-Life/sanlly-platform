package com.sanlly.finance.dao;

import java.util.Date;

public interface BusinessExtMapper {

 
   int updateBillStatus(String tablename,String billStatus,Integer financeReturn,String financeReturnTime,String financeReturnReason,String financeRemark,Integer id);
    
    
}