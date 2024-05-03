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


import com.dao.PeixuntixiDao;
import com.entity.PeixuntixiEntity;
import com.service.PeixuntixiService;
import com.entity.vo.PeixuntixiVO;
import com.entity.view.PeixuntixiView;

@Service("peixuntixiService")
public class PeixuntixiServiceImpl extends ServiceImpl<PeixuntixiDao, PeixuntixiEntity> implements PeixuntixiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeixuntixiEntity> page = this.selectPage(
                new Query<PeixuntixiEntity>(params).getPage(),
                new EntityWrapper<PeixuntixiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeixuntixiEntity> wrapper) {
		  Page<PeixuntixiView> page =new Query<PeixuntixiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeixuntixiVO> selectListVO(Wrapper<PeixuntixiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeixuntixiVO selectVO(Wrapper<PeixuntixiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeixuntixiView> selectListView(Wrapper<PeixuntixiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeixuntixiView selectView(Wrapper<PeixuntixiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
