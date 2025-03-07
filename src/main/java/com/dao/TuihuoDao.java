package com.dao;

import com.entity.TuihuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TuihuoView;

/**
 * 退货 Dao 接口
 *
 * @author 
 */
public interface TuihuoDao extends BaseMapper<TuihuoEntity> {

   List<TuihuoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
