package com.cos.mediger.api;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cos.mediger.mapper.apiMapper;

@Service
@MapperScan("com.cos.mediger.mapper")
public class apiService  {
	//CRUD 기능의 메소드 구현
	//api 등록
	apiMapper mapper;
	
	public apiService(apiMapper mapper) {
		this.mapper=mapper;
	}
	public List<apiVO> getVOList(){
		return mapper.getVOList();
	}
	public int createApiVo(apiVO vo) {
		return mapper.createApi(vo);
	}

}