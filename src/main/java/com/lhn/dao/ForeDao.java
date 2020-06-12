package com.lhn.dao;

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

public interface ForeDao {
	//用户登录验证 
	public User userLogin(@Param("u_name")String u_name ,@Param("u_pwd")String u_pwd);
	//显示所有商品
	public List<Commodity> selectCommodityList(Page page);
	//查询商品记录数
	public Integer selectCommodityCount(Page page);
	//通过id查询商品
	public Commodity selectCommodityById(@Param(value = "id") Integer id);
	//查询商品在购物车中是否已存在
	public Cart cartYesOrNo(Cart cart);
	//更新购物车中购买商品的数量
	public Integer updateCart(Cart cart);
	//加入购物车
	public Integer addCart(Cart cart);
	//显示购物车
	public List<CC> selectCartList(Cart cart);
	//更新cart表BYID
	public Integer updateCartById(Cart cart);
	//删除cart数据
	public Integer deleteCart(Cart cart);
	//显示地址
	public List<Address> selectAddressList(Address address);
	//添加新地址
	public Integer addAddress(Address address);
	//修改地址
	public Integer updateAddressById(Address address);
	//删除地址
	public Integer deleteAddressById(Address address);
	//保存用户购买记录
	public Integer addRecord(Record record);
	//账户余额
	public Recharge selectRechargeByUsername(Recharge recharge);
	//账户充值
	public Integer addRecharge(Recharge recharge);
	//充值记录保存
	public Integer addRechargeData(RechargeData rechargeData);
	//查询username在recharge表中是否已存在
	public Recharge rechargeYesOrNo(Recharge recharge);
	//账户余额修改
    public Integer updateRechargeByUsername(Recharge recharge);
	//充值记录查看
	public List<RechargeData> seletRechargeData(RechargeData rechargeData);
	//账户资料修改
	public Integer updateUserByUsername(User user);
	//show userifo in userCenter
	public User selectUserByUsername(User user);
	//订单记录
	public List<Order> seletOrderByUsername(Record record);
}
