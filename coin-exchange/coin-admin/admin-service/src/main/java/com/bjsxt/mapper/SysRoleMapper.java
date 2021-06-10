package com.bjsxt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjsxt.domain.SysRole;

/**
 * 
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
public interface SysRoleMapper extends BaseMapper<SysRole> {

    /**
     * 获取用户角色的code
     * @param userId
     * @return
     */
    String getUserRoleCode(Long userId);
}