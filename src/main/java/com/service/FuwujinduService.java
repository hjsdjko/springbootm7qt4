package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwujinduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwujinduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwujinduView;


/**
 * 服务进度
 *
 * @author 
 * @email 
 * @date 2022-04-20 17:40:05
 */
public interface FuwujinduService extends IService<FuwujinduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwujinduVO> selectListVO(Wrapper<FuwujinduEntity> wrapper);
   	
   	FuwujinduVO selectVO(@Param("ew") Wrapper<FuwujinduEntity> wrapper);
   	
   	List<FuwujinduView> selectListView(Wrapper<FuwujinduEntity> wrapper);
   	
   	FuwujinduView selectView(@Param("ew") Wrapper<FuwujinduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwujinduEntity> wrapper);
   	

}

