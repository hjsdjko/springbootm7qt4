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


import com.dao.FuwujinduDao;
import com.entity.FuwujinduEntity;
import com.service.FuwujinduService;
import com.entity.vo.FuwujinduVO;
import com.entity.view.FuwujinduView;

@Service("fuwujinduService")
public class FuwujinduServiceImpl extends ServiceImpl<FuwujinduDao, FuwujinduEntity> implements FuwujinduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwujinduEntity> page = this.selectPage(
                new Query<FuwujinduEntity>(params).getPage(),
                new EntityWrapper<FuwujinduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwujinduEntity> wrapper) {
		  Page<FuwujinduView> page =new Query<FuwujinduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwujinduVO> selectListVO(Wrapper<FuwujinduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwujinduVO selectVO(Wrapper<FuwujinduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwujinduView> selectListView(Wrapper<FuwujinduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwujinduView selectView(Wrapper<FuwujinduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
