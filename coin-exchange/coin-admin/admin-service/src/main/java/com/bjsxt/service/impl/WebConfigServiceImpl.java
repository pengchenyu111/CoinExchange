package com.bjsxt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjsxt.mapper.WebConfigMapper;
import com.bjsxt.domain.WebConfig;
import com.bjsxt.service.WebConfigService;
/**
 * 
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
@Service
public class WebConfigServiceImpl extends ServiceImpl<WebConfigMapper, WebConfig> implements WebConfigService{

}
