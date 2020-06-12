package com.lhn.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import com.lhn.bean.Address;
import com.lhn.bean.CC;
import com.lhn.bean.Cart;
import com.lhn.bean.Commodity;
import com.lhn.bean.Order;
import com.lhn.bean.Page;
import com.lhn.bean.Recharge;
import com.lhn.bean.RechargeData;
import com.lhn.bean.Record;
import com.lhn.bean.User;
import com.lhn.dao.ForeDao;
import com.lhn.service.ForeService;
@Service
public class ForeServiceImpl implements ForeService {
	@Autowired
	ForeDao foreDao;
	@Override
	public User userLogin(String u_name, String u_pwd) throws Exception {
		// TODO Auto-generated method stub		
		return foreDao.userLogin(u_name, u_pwd);
	}
	@Override
	public List<Commodity> selectCommodityList(Page page) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.selectCommodityList(page);
	}
	@Override
	public Integer selectCommodityCount(Page page) throws Exception{
		// TODO Auto-generated method stub
		return foreDao.selectCommodityCount(page);
	}
	@Override
	public Commodity selectCommodityById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.selectCommodityById(id);
	}
	@Override
	public Integer addCart(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.addCart(cart);
	}
	@Override
	public List<CC> selectCartList(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.selectCartList(cart);
	}
	@Override
	public Cart cartYesOrNo(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.cartYesOrNo(cart);
	}
	@Override
	public Integer updateCart(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.updateCart(cart);
	}
	@Override
	public Integer updateCartById(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.updateCartById(cart);
	}
	@Override
	public Integer deleteCart(Cart cart) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.deleteCart(cart);
	}
	@Override
	public List<Address> selectAddressList(Address address) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.selectAddressList(address);
	}
	@Override
	public Integer addAddress(Address address) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.addAddress(address);
	}
	@Override
	public Integer updateAddressById(Address address) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.updateAddressById(address);
	}
	@Override
	public Integer deleteAddressById(Address address) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.deleteAddressById(address);
	}
	@Override
	public Integer addRecord(Record record) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.addRecord(record);
	}
	@Override
	public Recharge selectRechargeByUsername(Recharge recharge) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.selectRechargeByUsername(recharge);
	}
	@Override
	public Integer addRecharge(Recharge recharge) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.addRecharge(recharge);
	}
	@Override
	public Integer addRechargeData(RechargeData rechargeData) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.addRechargeData(rechargeData);
	}
	@Override
	public Recharge rechargeYesOrNo(Recharge recharge) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.rechargeYesOrNo(recharge);
	}
	@Override
	public Integer updateRechargeByUsername(Recharge recharge) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.updateRechargeByUsername(recharge);
	}
	@Override
	public List<RechargeData> seletRechargeData(RechargeData rechargeData) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.seletRechargeData(rechargeData);
	}
	@Override
	public Integer updateUserByUsername(User user) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.updateUserByUsername(user);
	}
	@Override
	public User selectUserByUsername(User user) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.selectUserByUsername(user);
	}
	@Override
	public List<Order> seletOrderByUsername(Record record) throws Exception {
		// TODO Auto-generated method stub
		return foreDao.seletOrderByUsername(record);
	}
	
	
}
