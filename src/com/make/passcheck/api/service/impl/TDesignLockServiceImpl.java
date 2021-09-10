package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignLock;
import com.make.passcheck.api.service.ITDesignLockService;
import com.make.passcheck.api.mapper.design.TDesignLockMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignLockServiceImpl extends ServiceImpl<TDesignLockMapper, TDesignLock> implements ITDesignLockService {

}