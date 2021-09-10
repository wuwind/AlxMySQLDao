package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignPriceRequire;
import com.make.passcheck.api.service.ITDesignPriceRequireService;
import com.make.passcheck.api.mapper.design.TDesignPriceRequireMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignPriceRequireServiceImpl extends ServiceImpl<TDesignPriceRequireMapper, TDesignPriceRequire> implements ITDesignPriceRequireService {

}