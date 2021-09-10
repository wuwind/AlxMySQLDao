package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignTaskStep;
import com.make.passcheck.api.service.ITDesignTaskStepService;
import com.make.passcheck.api.mapper.design.TDesignTaskStepMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignTaskStepServiceImpl extends ServiceImpl<TDesignTaskStepMapper, TDesignTaskStep> implements ITDesignTaskStepService {

}