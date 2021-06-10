package com.bjsxt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjsxt.mapper.SysUserMapper;
import com.bjsxt.domain.SysUser;
import com.bjsxt.service.SysUserService;
/**
 * 
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService{

}
