package com.bjsxt.service;

import com.bjsxt.domain.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
public interface SysMenuService extends IService<SysMenu> {

    /**
     * 通过用户的id查询用户的菜单数据
     *
     * @param userId
     * @return
     */
    List<SysMenu> getMenusByUserId(Long userId);
}
