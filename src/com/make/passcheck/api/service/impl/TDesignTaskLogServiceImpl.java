package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignTaskLog;
import com.make.passcheck.api.service.ITDesignTaskLogService;
import com.make.passcheck.api.mapper.design.TDesignTaskLogMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignTaskLogServiceImpl extends ServiceImpl<TDesignTaskLogMapper, TDesignTaskLog> implements ITDesignTaskLogService {

}