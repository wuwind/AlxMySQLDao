package com.make.passcheck.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.make.passcheck.api.entity.design.TDesignRestApply;
import com.make.passcheck.api.service.ITDesignRestApplyService;
import com.make.passcheck.api.mapper.design.TDesignRestApplyMapper;

@Service
@Transactional(rollbackFor = Exception.class)
public class TDesignRestApplyServiceImpl extends ServiceImpl<TDesignRestApplyMapper, TDesignRestApply> implements ITDesignRestApplyService {

}