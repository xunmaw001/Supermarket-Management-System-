package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinxiaoshouEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 商品销售 服务类
 */
public interface ShangpinxiaoshouService extends IService<ShangpinxiaoshouEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}