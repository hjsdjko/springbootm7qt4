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


import com.dao.FuwufenpeiDao;
import com.entity.FuwufenpeiEntity;
import com.service.FuwufenpeiService;
import com.entity.vo.FuwufenpeiVO;
import com.entity.view.FuwufenpeiView;

@Service("fuwufenpeiService")
public class FuwufenpeiServiceImpl extends ServiceImpl<FuwufenpeiDao, FuwufenpeiEntity> implements FuwufenpeiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwufenpeiEntity> page = this.selectPage(
                new Query<FuwufenpeiEntity>(params).getPage(),
                new EntityWrapper<FuwufenpeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwufenpeiEntity> wrapper) {
		  Page<FuwufenpeiView> page =new Query<FuwufenpeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwufenpeiVO> selectListVO(Wrapper<FuwufenpeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwufenpeiVO selectVO(Wrapper<FuwufenpeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwufenpeiView> selectListView(Wrapper<FuwufenpeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwufenpeiView selectView(Wrapper<FuwufenpeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
