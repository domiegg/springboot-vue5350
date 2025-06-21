package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangchuchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangchuchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangchuchangView;


/**
 * 车辆出场
 *
 * @author 
 * @email 
 * @date 2024-04-07 21:17:03
 */
public interface CheliangchuchangService extends IService<CheliangchuchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangchuchangVO> selectListVO(Wrapper<CheliangchuchangEntity> wrapper);
   	
   	CheliangchuchangVO selectVO(@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);
   	
   	List<CheliangchuchangView> selectListView(Wrapper<CheliangchuchangEntity> wrapper);
   	
   	CheliangchuchangView selectView(@Param("ew") Wrapper<CheliangchuchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangchuchangEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<CheliangchuchangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<CheliangchuchangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<CheliangchuchangEntity> wrapper);



}

