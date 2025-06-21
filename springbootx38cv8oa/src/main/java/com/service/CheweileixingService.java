package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheweileixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheweileixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheweileixingView;


/**
 * 车位类型
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:17:03
 */
public interface CheweileixingService extends IService<CheweileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheweileixingVO> selectListVO(Wrapper<CheweileixingEntity> wrapper);
   	
   	CheweileixingVO selectVO(@Param("ew") Wrapper<CheweileixingEntity> wrapper);
   	
   	List<CheweileixingView> selectListView(Wrapper<CheweileixingEntity> wrapper);
   	
   	CheweileixingView selectView(@Param("ew") Wrapper<CheweileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheweileixingEntity> wrapper);

   	

}

