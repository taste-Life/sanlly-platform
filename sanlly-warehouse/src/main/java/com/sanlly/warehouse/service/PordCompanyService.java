package com.sanlly.warehouse.service;

import com.sanlly.common.models.output.Result;
import com.sanlly.common.models.output.company.CompanyDetailOutput;
import com.sanlly.warehouse.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * ClassName: PordCompanyService
 * Description: 生产 公司接口
 * date: 2019/8/5 16:49
 *
 * @author wannt
 * @since JDK 1.8
 */
@FeignClient(name = "production",configuration= FeignClientConfig.class)
public interface PordCompanyService {

    @GetMapping("/prodCompany/{key}")
    Result<CompanyDetailOutput> getCompany(@RequestParam("key")String key);
}
