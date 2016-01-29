package com.lm.mapping2;

import org.springframework.stereotype.Component;

@Component
public interface MesMapper {
	
	int countMesList(String mesId);
	
	int insertMes(String mesId);
}
