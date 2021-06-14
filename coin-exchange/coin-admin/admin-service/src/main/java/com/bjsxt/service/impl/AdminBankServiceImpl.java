package com.bjsxt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjsxt.domain.AdminBank;
import com.bjsxt.mapper.AdminBankMapper;
import com.bjsxt.service.AdminBankService;

/**
 * @author PengChenyu
 * @since 2021-06-14 15:09:03
 */
@Service
public class AdminBankServiceImpl extends ServiceImpl<AdminBankMapper, AdminBank> implements AdminBankService {

    /**
     * 条件分页查询公司银行卡
     *
     * @param page     分页参数
     * @param bankCard 银行卡卡号
     * @return
     */
    @Override
    public Page<AdminBank> findByPage(Page<AdminBank> page, String bankCard) {
        return page(page, new LambdaQueryWrapper<AdminBank>()
                .like(!StringUtils.isEmpty(bankCard), AdminBank::getBankCard, bankCard));
    }
}
