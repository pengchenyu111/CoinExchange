package com.bjsxt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bjsxt.domain.SysMenu;

import java.util.List;

/**
 * 
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
public interface SysMenuMapper extends BaseMapper<SysMenu> {

    /**
     * 查询通过用户id查询用户的菜单数据
     * @param userId
     * @return
     */
    List<SysMenu> selectMenusByUserId(Long userId);
}