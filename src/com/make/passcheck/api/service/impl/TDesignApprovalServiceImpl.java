package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignApproval;
import com.make.passcheck.api.service.ITDesignApprovalService;
import com.make.passcheck.api.mapper.design.TDesignApprovalMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignApprovalServiceImpl extends ServiceImpl<TDesignApprovalMapper, TDesignApproval> implements ITDesignApprovalService {

}