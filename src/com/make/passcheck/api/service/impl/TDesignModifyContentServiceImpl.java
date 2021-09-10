package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignModifyContent;
import com.make.passcheck.api.service.ITDesignModifyContentService;
import com.make.passcheck.api.mapper.design.TDesignModifyContentMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignModifyContentServiceImpl extends ServiceImpl<TDesignModifyContentMapper, TDesignModifyContent> implements ITDesignModifyContentService {

}