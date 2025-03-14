package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BeondutyEntity;
import java.util.Map;

/**
 * 卫生值班 服务类
 */
public interface BeondutyService extends IService<BeondutyEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}