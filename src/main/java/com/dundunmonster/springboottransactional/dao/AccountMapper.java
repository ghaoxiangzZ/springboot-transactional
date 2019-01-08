/*
* 文件名: com.dundunmonster.springboottransactional.dao
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月08日 09:25
* 修改人:
* 修改时间: 2019年01月08日 09:25
* 修改变更号: 
* 修改内容: 
*/
package com.dundunmonster.springboottransactional.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.dundunmonster.springboottransactional.entity.Account;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title AccountMapper
 * @Description
 * @date 2019年01月08日 09:25
 * @since V1.0
 */
public interface AccountMapper {

    /**
     * 更新
     * @param id
     * @param money
     * @return int
     */
    int update(@Param("money") double money, @Param("id") int id);
}
