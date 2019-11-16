package com.sanlly.production.service;

import com.sanlly.common.models.input.PageInput;
import com.sanlly.common.models.output.base.ContainerUserOutput;
import com.sanlly.common.models.output.pagination.PagedList;

public interface BaseInfoService {
    PagedList<ContainerUserOutput> containerUserList(PageInput input, String searchWords);
}
