package com.sanlly.production.service;

import java.util.List;

import com.sanlly.common.models.output.yard.YardOutput;

public interface ProdYardService {
	
	List<YardOutput> getYardListByCompanyKey(String companyKey);

}
