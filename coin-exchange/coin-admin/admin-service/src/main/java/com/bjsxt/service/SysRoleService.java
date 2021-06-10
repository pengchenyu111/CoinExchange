package com.bjsxt.service;

import com.bjsxt.domain.SysRole;
import com.baomidou.mybatisplus.extension.service.IService;
    /**
 * 
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
public interface SysRoleService extends IService<SysRole>{

        /**
         *  查询用户是否为超级管理员
         * @param userId
         * @return
         */
        boolean isSuperAdmin(Long userId);
    }
