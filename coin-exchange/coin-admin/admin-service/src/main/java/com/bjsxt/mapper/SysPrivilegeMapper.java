package com.bjsxt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjsxt.domain.SysPrivilege;

import java.util.Set;

/**
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
public interface SysPrivilegeMapper extends BaseMapper<SysPrivilege> {

    /**
     * 使用角色的ID 查询权限的id
     *
     * @param roleId
     * @return
     */
    Set<Long> getPrivilegesByRoleId(Long roleId);
}