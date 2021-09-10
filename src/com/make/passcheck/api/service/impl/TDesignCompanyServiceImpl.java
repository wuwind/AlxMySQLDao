package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignCompany;
import com.make.passcheck.api.service.ITDesignCompanyService;
import com.make.passcheck.api.mapper.design.TDesignCompanyMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignCompanyServiceImpl extends ServiceImpl<TDesignCompanyMapper, TDesignCompany> implements ITDesignCompanyService {

}