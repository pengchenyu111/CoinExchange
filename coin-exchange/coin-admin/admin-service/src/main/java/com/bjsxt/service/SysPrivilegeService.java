package com.bjsxt.service;

import com.bjsxt.domain.SysPrivilege;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
public interface SysPrivilegeService extends IService<SysPrivilege> {


    /**
     * 获取该菜单下面所有的权限
     *
     * @param roleId roleId 代表当前的查询的角色的ID
     * @param menuId 菜单的ID
     * @return
     */
    List<SysPrivilege> getAllSysPrivilege(Long menuId, Long roleId);
}
