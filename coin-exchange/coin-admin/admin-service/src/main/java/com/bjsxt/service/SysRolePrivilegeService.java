package com.bjsxt.service;

import com.bjsxt.domain.SysMenu;
import com.bjsxt.domain.SysRolePrivilege;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bjsxt.model.RolePrivilegesParam;

import java.util.List;

/**
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
public interface SysRolePrivilegeService extends IService<SysRolePrivilege> {

    /**
     * 查询角色权限
     *
     * @param roleId
     * @return
     */
    List<SysMenu> findSysMenuAndPrivileges(Long roleId);

    /**
     * 给角色授权权限
     *
     * @param rolePrivilegesParam
     * @return
     */
    boolean grantPrivileges(RolePrivilegesParam rolePrivilegesParam);
}
