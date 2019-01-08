/*
* 文件名: com.dundunmonster.springboottransactional.web
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 09:28
* 修改人:
* 修改时间: 2019年01月08日 09:28
* 修改变更号: 
* 修改内容: 
*/
package com.dundunmonster.springboottransactional.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dundunmonster.springboottransactional.service.AccountService;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title AccountController
 * @Description
 * @date 2019年01月08日 09:28
 * @since V1.0
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @RequestMapping(value = "transfer", method = RequestMethod.GET)
    public void transfer(){
        accountService.transfer();
    }
}
