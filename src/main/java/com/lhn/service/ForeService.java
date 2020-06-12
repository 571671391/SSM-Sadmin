package com.lhn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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

public interface ForeService {
	
	public User userLogin(String u_name,String u_pwd) throws Exception;
	
	public List<Commodity> selectCommodityList(Page page) throws Exception;
	
	public Integer selectCommodityCount(Page page) throws Exception;
	
	public Commodity selectCommodityById(@Param(value = "id") Integer id) throws Exception;
	
	public Cart cartYesOrNo(Cart cart) throws Exception;
	
	public Integer addCart(Cart cart) throws Exception;
	
	public List<CC> selectCartList(Cart cart) throws Exception;
	
	public Integer updateCart(Cart cart) throws Exception;
	
	public Integer updateCartById(Cart cart) throws Exception;
	
	public Integer deleteCart(Cart cart) throws Exception;
	
    public List<Address> selectAddressList(Address address) throws Exception;
    
    public Integer addAddress(Address address) throws Exception;
    
    public Integer updateAddressById(Address address) throws Exception;
    
    public Integer deleteAddressById(Address address) throws Exception;
    
    public Integer addRecord(Record record) throws Exception;
    
    public Recharge selectRechargeByUsername(Recharge recharge) throws Exception;
    
    public Integer addRecharge(Recharge recharge) throws Exception;
    
    public Integer addRechargeData(RechargeData rechargeData) throws Exception;
    
    public Recharge rechargeYesOrNo(Recharge recharge) throws Exception;
    
    public Integer updateRechargeByUsername(Recharge recharge) throws Exception;
    
    public List<RechargeData> seletRechargeData(RechargeData rechargeData) throws Exception;
    
    public Integer updateUserByUsername(User user) throws Exception;
    
    public User selectUserByUsername(User user)throws Exception;
    
    public List<Order> seletOrderByUsername(Record record)throws Exception;
    
}
