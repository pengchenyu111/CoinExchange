package com.bjsxt.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjsxt.domain.SysRole;
import com.bjsxt.mapper.SysRoleMapper;
import com.bjsxt.service.SysRoleService;

/**
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    /**
     * 查询用户是否为超级管理员
     *
     * @param userId
     * @return
     */
    @Override
    public boolean isSuperAdmin(Long userId) {
        // 当用户的角色code为 ROLE_Admin 时，该用户为超级管理员
        // 用户id -> 用户角色 -> 角色code
        String roleCode = sysRoleMapper.getUserRoleCode(userId);
        if (!StringUtils.isEmpty(roleCode) && "ROLE_ADMIN".equals(roleCode)){
            return true;
        }
        return false;
    }
}
