package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignModify;
import com.make.passcheck.api.service.ITDesignModifyService;
import com.make.passcheck.api.mapper.design.TDesignModifyMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignModifyServiceImpl extends ServiceImpl<TDesignModifyMapper, TDesignModify> implements ITDesignModifyService {

}