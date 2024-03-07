package com.example.mapper;

import com.example.entity.Order;

import java.util.List;

/**
 * 操作order相关数据接口
*/
public interface OrderMapper {

    /**
      * 新增
    */
    int insert(Order order);

    /**
      * 删除
    */
    int deleteById(Integer id);

    /**
      * 修改
    */
    int updateById(Order order);

    /**
      * 根据ID查询
    */
    Order selectById(Integer id);

    /**
      * 查询所有
    */
    List<Order> selectAll(Order order);

}