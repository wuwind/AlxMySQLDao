package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignDevRequire;
import com.make.passcheck.api.service.ITDesignDevRequireService;
import com.make.passcheck.api.mapper.design.TDesignDevRequireMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignDevRequireServiceImpl extends ServiceImpl<TDesignDevRequireMapper, TDesignDevRequire> implements ITDesignDevRequireService {

}