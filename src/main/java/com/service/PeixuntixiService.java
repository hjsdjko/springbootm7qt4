package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeixuntixiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeixuntixiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeixuntixiView;


/**
 * 培训体系
 *
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface PeixuntixiService extends IService<PeixuntixiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeixuntixiVO> selectListVO(Wrapper<PeixuntixiEntity> wrapper);
   	
   	PeixuntixiVO selectVO(@Param("ew") Wrapper<PeixuntixiEntity> wrapper);
   	
   	List<PeixuntixiView> selectListView(Wrapper<PeixuntixiEntity> wrapper);
   	
   	PeixuntixiView selectView(@Param("ew") Wrapper<PeixuntixiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeixuntixiEntity> wrapper);
   	

}

