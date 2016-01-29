package com.lm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lm.mapping2.MesMapper;
import com.lm.mapping2.UserMapper2;
import com.lm.model.MesInfo;
import com.lm.model.User;
import com.lm.service.UserService2;

@Service("usi2")
public class UserServiceImpl implements UserService2 {
	
	@Autowired
	private UserMapper2 userMapper2;
	@Autowired
	private MesMapper mesMapper;		
	
	@Override
	@Transactional(readOnly = false, rollbackFor = Exception.class)
	public void testTX(String mesId) {
		
		int ct = this.mesMapper.countMesList(mesId);
		if(ct == 0){
			
			User user = new User();
			user.setUserId("997");
			this.userMapper2.insertUser(user);
			
			this.mesMapper.insertMes(mesId);
			
			int i = 1/0;
			
		}
		
	}

}
