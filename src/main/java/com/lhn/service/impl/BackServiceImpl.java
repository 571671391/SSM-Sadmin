package com.lhn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhn.bean.Commodity;
import com.lhn.bean.Page;
import com.lhn.bean.User;
import com.lhn.dao.BackDao;
import com.lhn.service.BackService;
@Service
public class BackServiceImpl implements BackService {
	@Autowired
	BackDao backDao;
	@Override
	//分页查询(用户管理)
	public List<User> selectUserList(Page page) throws Exception{
		// TODO Auto-generated method stub
		return backDao.selectUserList(page);
	}
	@Override
	//查询用户记录数
	public Integer selectUserCount(Page page) throws Exception{
		// TODO Auto-generated method stub
		return backDao.selectUserCount(page);
	}
	@Override
	public Integer deleteUserById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return backDao.deleteUserById(id);
	}
	@Override
	public Integer updateUserById(User user) throws Exception {
		// TODO Auto-generated method stub
		return backDao.updateUserById(user);
	}
	@Override
	public Integer addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return backDao.addUser(user);
	}
	@Override
	public List<Commodity> selectCommodityList(Page page) throws Exception{
		// TODO Auto-generated method stub
		return backDao.selectCommodityList(page);
	}
	@Override
	public Integer selectCommodityCount(Page page) throws Exception{
		// TODO Auto-generated method stub
		return backDao.selectCommodityCount(page);
	}
	@Override
	public Integer addCommodity(Commodity commodity) throws Exception {
		// TODO Auto-generated method stub
		return backDao.addCommodity(commodity);
	}
	@Override
	public Integer deleteCommodityById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return backDao.deleteCommodityById(id);
	}
	@Override
	public Integer updateCommodityById(Commodity commodity) throws Exception {
		// TODO Auto-generated method stub
		return backDao.updateCommodityById(commodity);
	}

}
