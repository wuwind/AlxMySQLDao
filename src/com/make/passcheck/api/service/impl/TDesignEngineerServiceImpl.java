package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignEngineer;
import com.make.passcheck.api.service.ITDesignEngineerService;
import com.make.passcheck.api.mapper.design.TDesignEngineerMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignEngineerServiceImpl extends ServiceImpl<TDesignEngineerMapper, TDesignEngineer> implements ITDesignEngineerService {

}