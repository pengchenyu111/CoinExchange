package com.bjsxt.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bjsxt.domain.AdminBank;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author PengChenyu
 * @since 2021-06-14 15:09:03
 */
public interface AdminBankService extends IService<AdminBank> {


    /**
     * 条件分页查询公司银行卡
     *
     * @param page     分页参数
     * @param bankCard 银行卡卡号
     * @return
     */
    Page<AdminBank> findByPage(Page<AdminBank> page, String bankCard);
}
