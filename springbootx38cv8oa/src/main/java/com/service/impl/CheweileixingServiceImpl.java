package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.CheweileixingDao;
import com.entity.CheweileixingEntity;
import com.service.CheweileixingService;
import com.entity.vo.CheweileixingVO;
import com.entity.view.CheweileixingView;

@Service("cheweileixingService")
public class CheweileixingServiceImpl extends ServiceImpl<CheweileixingDao, CheweileixingEntity> implements CheweileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheweileixingEntity> page = this.selectPage(
                new Query<CheweileixingEntity>(params).getPage(),
                new EntityWrapper<CheweileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheweileixingEntity> wrapper) {
		  Page<CheweileixingView> page =new Query<CheweileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<CheweileixingVO> selectListVO(Wrapper<CheweileixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheweileixingVO selectVO(Wrapper<CheweileixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheweileixingView> selectListView(Wrapper<CheweileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheweileixingView selectView(Wrapper<CheweileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
