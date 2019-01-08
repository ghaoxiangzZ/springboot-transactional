/*
* 文件名: com.dundunmonster.springboottransactional.service.impl
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 09:27
* 修改人:
* 修改时间: 2019年01月08日 09:27
* 修改变更号: 
* 修改内容: 
*/
package com.dundunmonster.springboottransactional.service.impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dundunmonster.springboottransactional.dao.AccountMapper;
import com.dundunmonster.springboottransactional.entity.Account;
import com.dundunmonster.springboottransactional.service.AccountService;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title AccountServiceImpl
 * @Description
 * @date 2019年01月08日 09:27
 * @since V1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 事物测试
     * @throws RuntimeException
     * @return void
     */
    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void transfer() throws RuntimeException{
        // 用户1减10块 用户2加10块
        accountMapper.update(90,1);
        // 模拟异常测试事务回滚
        int i = 1 / 0;
        accountMapper.update(110,2);
    }
}
