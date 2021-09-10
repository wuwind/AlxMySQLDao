package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignProduct;
import com.make.passcheck.api.service.ITDesignProductService;
import com.make.passcheck.api.mapper.design.TDesignProductMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignProductServiceImpl extends ServiceImpl<TDesignProductMapper, TDesignProduct> implements ITDesignProductService {

}