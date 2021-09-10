package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignTaskEngineer;
import com.make.passcheck.api.service.ITDesignTaskEngineerService;
import com.make.passcheck.api.mapper.design.TDesignTaskEngineerMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignTaskEngineerServiceImpl extends ServiceImpl<TDesignTaskEngineerMapper, TDesignTaskEngineer> implements ITDesignTaskEngineerService {

}