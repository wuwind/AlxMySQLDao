package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignUrl;
import com.make.passcheck.api.service.ITDesignUrlService;
import com.make.passcheck.api.mapper.design.TDesignUrlMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignUrlServiceImpl extends ServiceImpl<TDesignUrlMapper, TDesignUrl> implements ITDesignUrlService {

}