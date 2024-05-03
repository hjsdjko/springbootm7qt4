package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwufenpeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwufenpeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwufenpeiView;


/**
 * 服务分配
 *
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface FuwufenpeiService extends IService<FuwufenpeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwufenpeiVO> selectListVO(Wrapper<FuwufenpeiEntity> wrapper);
   	
   	FuwufenpeiVO selectVO(@Param("ew") Wrapper<FuwufenpeiEntity> wrapper);
   	
   	List<FuwufenpeiView> selectListView(Wrapper<FuwufenpeiEntity> wrapper);
   	
   	FuwufenpeiView selectView(@Param("ew") Wrapper<FuwufenpeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwufenpeiEntity> wrapper);
   	

}

