package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwuquxiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwuquxiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwuquxiaoView;


/**
 * 服务取消
 *
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface FuwuquxiaoService extends IService<FuwuquxiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwuquxiaoVO> selectListVO(Wrapper<FuwuquxiaoEntity> wrapper);
   	
   	FuwuquxiaoVO selectVO(@Param("ew") Wrapper<FuwuquxiaoEntity> wrapper);
   	
   	List<FuwuquxiaoView> selectListView(Wrapper<FuwuquxiaoEntity> wrapper);
   	
   	FuwuquxiaoView selectView(@Param("ew") Wrapper<FuwuquxiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwuquxiaoEntity> wrapper);
   	

}

