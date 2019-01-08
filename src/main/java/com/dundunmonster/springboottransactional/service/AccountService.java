/*
* 文件名: com.dundunmonster.springboottransactional.service
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
package com.dundunmonster.springboottransactional.service;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title AccountService
 * @Description
 * @date 2019年01月08日 09:27
 * @since V1.0
 */
public interface AccountService {

    /**
     * 事物测试
     * @throws RuntimeException
     * @return void
     */
    void transfer() throws RuntimeException;
}
