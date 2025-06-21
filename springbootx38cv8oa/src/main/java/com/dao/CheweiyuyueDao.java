package com.dao;

import com.entity.CheweiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheweiyuyueVO;
import com.entity.view.CheweiyuyueView;


/**
 * 车位预约
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:17:03
 */
public interface CheweiyuyueDao extends BaseMapper<CheweiyuyueEntity> {
	
	List<CheweiyuyueVO> selectListVO(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
	
	CheweiyuyueVO selectVO(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
	
	List<CheweiyuyueView> selectListView(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);

	List<CheweiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);

	
	CheweiyuyueView selectView(@Param("ew") Wrapper<CheweiyuyueEntity> wrapper);
	

}
