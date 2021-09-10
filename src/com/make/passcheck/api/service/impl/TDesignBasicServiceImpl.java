package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignBasic;
import com.make.passcheck.api.service.ITDesignBasicService;
import com.make.passcheck.api.mapper.design.TDesignBasicMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignBasicServiceImpl extends ServiceImpl<TDesignBasicMapper, TDesignBasic> implements ITDesignBasicService {

}