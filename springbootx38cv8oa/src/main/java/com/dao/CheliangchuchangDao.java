package com.dao;

import com.entity.CheliangchuchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangchuchangVO;
import com.entity.view.CheliangchuchangView;


/**
 * 车辆出场
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:17:03
 */
public interface CheliangchuchangDao extends BaseMapper<CheliangchuchangEntity> {
	
	List<CheliangchuchangVO> selectListVO(@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);
	
	CheliangchuchangVO selectVO(@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);
	
	List<CheliangchuchangView> selectListView(@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);

	List<CheliangchuchangView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);

	
	CheliangchuchangView selectView(@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);



}
