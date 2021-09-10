package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignReportComment;
import com.make.passcheck.api.service.ITDesignReportCommentService;
import com.make.passcheck.api.mapper.design.TDesignReportCommentMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignReportCommentServiceImpl extends ServiceImpl<TDesignReportCommentMapper, TDesignReportComment> implements ITDesignReportCommentService {

}