package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignCustomer;
import com.make.passcheck.api.service.ITDesignCustomerService;
import com.make.passcheck.api.mapper.design.TDesignCustomerMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignCustomerServiceImpl extends ServiceImpl<TDesignCustomerMapper, TDesignCustomer> implements ITDesignCustomerService {

}