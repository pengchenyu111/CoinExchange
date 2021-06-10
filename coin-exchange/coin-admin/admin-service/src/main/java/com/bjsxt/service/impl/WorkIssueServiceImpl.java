package com.bjsxt.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bjsxt.domain.WorkIssue;
import com.bjsxt.mapper.WorkIssueMapper;
import com.bjsxt.service.WorkIssueService;
/**
 * 
 * @author PengChenyu
 * @since 2021-06-10 16:59:15
 */
@Service
public class WorkIssueServiceImpl extends ServiceImpl<WorkIssueMapper, WorkIssue> implements WorkIssueService{

}
