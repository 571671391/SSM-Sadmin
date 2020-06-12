package com.lhn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lhn.bean.Commodity;
import com.lhn.bean.Page;
import com.lhn.bean.User;

public interface BackDao {
   //user表操作
   //分页模糊查询
   public List<User> selectUserList(Page page);
   //查询用户记录数
   public Integer selectUserCount(Page page);
   //根据ID删除用户
   public Integer deleteUserById(@Param("id")Integer id);
   //根据ID修改数据
   public Integer updateUserById(User user);
   //添加数据到user表
   public Integer addUser(User user);
   
   //commodity表操作
   //分页模糊查询
   public List<Commodity> selectCommodityList(Page page);
   //查询商品记录数
   public Integer selectCommodityCount(Page page);
   //添加数据到user表
   public Integer addCommodity(Commodity commodity);
   //根据ID删除商品
   public Integer deleteCommodityById(@Param("id")Integer id);
   //根据ID修改数据
   public Integer updateCommodityById(Commodity commodity);
}
