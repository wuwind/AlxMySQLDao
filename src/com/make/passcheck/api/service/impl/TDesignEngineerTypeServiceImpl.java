package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignEngineerType;
import com.make.passcheck.api.service.ITDesignEngineerTypeService;
import com.make.passcheck.api.mapper.design.TDesignEngineerTypeMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignEngineerTypeServiceImpl extends ServiceImpl<TDesignEngineerTypeMapper, TDesignEngineerType> implements ITDesignEngineerTypeService {

}