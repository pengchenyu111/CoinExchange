package com.bjsxt.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bjsxt.domain.Config;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
public interface ConfigService extends IService<Config> {


    /**
     * 条件分页查询参数
     *
     * @param page 分页参数
     * @param type 类型
     * @param name 参数名称
     * @param code 参数Code
     * @return
     */
    Page<Config> findByPage(Page<Config> page, String type, String name, String code);

}
