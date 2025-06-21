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


import com.dao.CheliangchuchangDao;
import com.entity.CheliangchuchangEntity;
import com.service.CheliangchuchangService;
import com.entity.vo.CheliangchuchangVO;
import com.entity.view.CheliangchuchangView;

@Service("cheliangchuchangService")
public class CheliangchuchangServiceImpl extends ServiceImpl<CheliangchuchangDao, CheliangchuchangEntity> implements CheliangchuchangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangchuchangEntity> page = this.selectPage(
                new Query<CheliangchuchangEntity>(params).getPage(),
                new EntityWrapper<CheliangchuchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangchuchangEntity> wrapper) {
		  Page<CheliangchuchangView> page =new Query<CheliangchuchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<CheliangchuchangVO> selectListVO(Wrapper<CheliangchuchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangchuchangVO selectVO(Wrapper<CheliangchuchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangchuchangView> selectListView(Wrapper<CheliangchuchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangchuchangView selectView(Wrapper<CheliangchuchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<CheliangchuchangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<CheliangchuchangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<CheliangchuchangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
