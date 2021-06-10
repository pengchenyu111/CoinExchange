package com.bjsxt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjsxt.domain.Notice;
import com.bjsxt.mapper.NoticeMapper;
import com.bjsxt.service.NoticeService;
/**
 * 
 * @author PengChenyu
 * @since 2021-06-10 16:59:16
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService{

}
