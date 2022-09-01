package com.cos.mediger.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.cos.mediger.api.apiVO;

@Mapper
public interface apiMapper {
	apiVO getVO(int id);
	List<apiVO> getVOList();
	int createApi(apiVO vo);
}
