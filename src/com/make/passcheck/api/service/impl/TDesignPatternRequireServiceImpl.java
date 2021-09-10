package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignPatternRequire;
import com.make.passcheck.api.service.ITDesignPatternRequireService;
import com.make.passcheck.api.mapper.design.TDesignPatternRequireMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignPatternRequireServiceImpl extends ServiceImpl<TDesignPatternRequireMapper, TDesignPatternRequire> implements ITDesignPatternRequireService {

}