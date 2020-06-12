package com.lhn.service;

import java.util.List;

import com.lhn.bean.Commodity;
import com.lhn.bean.Page;
import com.lhn.bean.User;

public interface BackService {
	//user表操作
	//分页查询(用户管理)
	public List<User> selectUserList(Page page) throws Exception;
	//查询用户记录数
	public Integer selectUserCount(Page page) throws Exception;
	//根据id删除用户
	public Integer deleteUserById(Integer id) throws Exception;
	//根据ID修改数据
	public Integer updateUserById(User user)throws Exception;
	//添加数据到user表
	public Integer addUser(User user)throws Exception;
	
	//commodity表操作
	//分页查询(商品管理)
	public List<Commodity> selectCommodityList(Page page) throws Exception;
	//查询商品记录数
	public Integer selectCommodityCount(Page page) throws Exception;
	//添加数据到commodity表
	public Integer addCommodity(Commodity commodity) throws Exception;
	//根据id删除用户
    public Integer deleteCommodityById(Integer id) throws Exception;
    //根据ID修改数据
    public Integer updateCommodityById(Commodity commodity) throws Exception;
}
