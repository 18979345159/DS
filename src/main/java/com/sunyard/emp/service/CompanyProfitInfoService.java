package com.sunyard.emp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sunyard.emp.entity.CompanyProfitInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * 企业利润
 *
 * @author KouKi
 * @version 2021-01-26 17:11:18
 */
public interface CompanyProfitInfoService extends IService<CompanyProfitInfo> {
    /**
    * 带分页和查询条件的查询
    * @param page 分页参数
    * @param companyProfitInfo 查询条件
    * @return 根据查询条件查出的企业利润列表
    */
    IPage<CompanyProfitInfo> queryList(Page<CompanyProfitInfo> page, CompanyProfitInfo companyProfitInfo);
}

