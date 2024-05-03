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


import com.dao.FuwuquxiaoDao;
import com.entity.FuwuquxiaoEntity;
import com.service.FuwuquxiaoService;
import com.entity.vo.FuwuquxiaoVO;
import com.entity.view.FuwuquxiaoView;

@Service("fuwuquxiaoService")
public class FuwuquxiaoServiceImpl extends ServiceImpl<FuwuquxiaoDao, FuwuquxiaoEntity> implements FuwuquxiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwuquxiaoEntity> page = this.selectPage(
                new Query<FuwuquxiaoEntity>(params).getPage(),
                new EntityWrapper<FuwuquxiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwuquxiaoEntity> wrapper) {
		  Page<FuwuquxiaoView> page =new Query<FuwuquxiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwuquxiaoVO> selectListVO(Wrapper<FuwuquxiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwuquxiaoVO selectVO(Wrapper<FuwuquxiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwuquxiaoView> selectListView(Wrapper<FuwuquxiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwuquxiaoView selectView(Wrapper<FuwuquxiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
