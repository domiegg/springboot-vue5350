package com.dao;

import com.entity.CheweileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheweileixingVO;
import com.entity.view.CheweileixingView;


/**
 * 车位类型
 * 
 * @author 
 * @email 
 * @date 2024-04-07 21:17:03
 */
public interface CheweileixingDao extends BaseMapper<CheweileixingEntity> {
	
	List<CheweileixingVO> selectListVO(@Param("ew") Wrapper<CheweileixingEntity> wrapper);
	
	CheweileixingVO selectVO(@Param("ew") Wrapper<CheweileixingEntity> wrapper);
	
	List<CheweileixingView> selectListView(@Param("ew") Wrapper<CheweileixingEntity> wrapper);

	List<CheweileixingView> selectListView(Pagination page,@Param("ew") Wrapper<CheweileixingEntity> wrapper);

	
	CheweileixingView selectView(@Param("ew") Wrapper<CheweileixingEntity> wrapper);
	

}
