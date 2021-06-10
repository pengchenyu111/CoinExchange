package com.bjsxt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjsxt.domain.Config;
import com.bjsxt.mapper.ConfigMapper;
import com.bjsxt.service.ConfigService;
/**
 * 
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
@Service
public class ConfigServiceImpl extends ServiceImpl<ConfigMapper, Config> implements ConfigService{

}
