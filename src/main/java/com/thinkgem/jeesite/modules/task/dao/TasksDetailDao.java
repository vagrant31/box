/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.task.dao;

import com.thinkgem.jeesite.common.persistence.CrudDao;
import com.thinkgem.jeesite.common.persistence.annotation.MyBatisDao;
import com.thinkgem.jeesite.modules.task.entity.TasksDetail;

/**
 * 任务表DAO接口
 * @author lycan
 * @version 2018-06-04
 */
@MyBatisDao
public interface TasksDetailDao extends CrudDao<TasksDetail> {
	
}