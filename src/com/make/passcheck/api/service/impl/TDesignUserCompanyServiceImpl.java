package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignUserCompany;
import com.make.passcheck.api.service.ITDesignUserCompanyService;
import com.make.passcheck.api.mapper.design.TDesignUserCompanyMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignUserCompanyServiceImpl extends ServiceImpl<TDesignUserCompanyMapper, TDesignUserCompany> implements ITDesignUserCompanyService {

}