package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignEngineerUser;
import com.make.passcheck.api.service.ITDesignEngineerUserService;
import com.make.passcheck.api.mapper.design.TDesignEngineerUserMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignEngineerUserServiceImpl extends ServiceImpl<TDesignEngineerUserMapper, TDesignEngineerUser> implements ITDesignEngineerUserService {

}