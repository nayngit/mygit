package com.own.core.service.impl;
import com.own.core.service.impl.BaseServiceImpl;
import com.own.common.base.dao.IBaseMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.own.dao.IUserMapper;
import com.own.core.service.IUserService;
import com.own.base.entity.UserDO;
/**
 *com.own.core.service.impl.IUserServices.java
 *2018-04-27 10:26:50
 * This was class generated by ant velocity
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDO,java.lang.String> implements IUserService{
	 
   @Resource
   private IUserMapper mapper;

   
   @Override
   protected IBaseMapper<UserDO,java.lang.String> getEntityMapper() {
	return mapper;
   }
}
