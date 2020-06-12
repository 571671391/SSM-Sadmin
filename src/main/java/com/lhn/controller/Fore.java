package com.lhn.controller;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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
import com.lhn.service.impl.ForeServiceImpl;

@Controller
@RequestMapping(value = "/rainbow")
public class Fore {
	@Autowired
	ForeServiceImpl foreServiceImpl;
	
	@RequestMapping(value = "/login",method= RequestMethod.POST)
	@ResponseBody
	public User userLogin(HttpServletRequest request,@RequestBody User user) {
		try {
			user = foreServiceImpl.userLogin(user.getUsername(), user.getPassword());
			if(user!=null) {
				request.getSession().setAttribute("username", user.getUsername());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
	
	@RequestMapping(value = "/showCommodity")
	@ResponseBody
	public List<Commodity> selectCommodityList(@RequestBody Page page){
		List<Commodity> commodityList=null;
		page.setStart((page.getPage()-1)*page.getRows());
		try {
			commodityList=foreServiceImpl.selectCommodityList(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return commodityList;
	}
	
	@RequestMapping(value = "/getCount")
	@ResponseBody
	public Page selectCommodityCount(@RequestBody Page page) {
		Integer total=null;
		try {
			total=foreServiceImpl.selectCommodityCount(page);
			page.setTotalRecord(total);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(page);
		return page;
	}
	
	@RequestMapping(value = "/selectCommodityById")
	@ResponseBody
	public Commodity selectCommodityById(@RequestBody Commodity commodity){
		try {
			commodity=foreServiceImpl.selectCommodityById(commodity.getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return commodity;
	}
	
	@RequestMapping(value = "/addCart")
	@ResponseBody
	public Cart addCart(@RequestBody Cart cart) {
		// TODO Auto-generated method stub
		Integer rows=null;
		Cart cart1 =null;
		try {
			cart1=foreServiceImpl.cartYesOrNo(cart);
			if(cart1!=null) {
				int nums=cart1.getNums()+cart.getNums();
				cart.setNums(nums);
				rows=foreServiceImpl.updateCart(cart);
			}else {
			    rows=foreServiceImpl.addCart(cart);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cart;
	}
	
	@RequestMapping(value = "/sendUsername")
	@ResponseBody
	public User sendUsername(HttpServletRequest request,User user) {
		String username=(String) request.getSession().getAttribute("username");
		user.setUsername(username);
		return user;
	}
	
	@RequestMapping(value = "/showCart")
	@ResponseBody
	public List<CC> selectCartList(@RequestBody Cart cart){
		List<CC> cCList=null;
		Integer rows=null;
		try {
			if("ljgm".equals(cart.getPurchasePlan())) {
				cCList=foreServiceImpl.selectCartList(cart);
				rows=foreServiceImpl.deleteCart(cart);
			}else {
				cCList=foreServiceImpl.selectCartList(cart);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cCList;
	}
	
	@RequestMapping(value = "/updateCartById")
	@ResponseBody
	public Cart updateCartById(@RequestBody Cart cart) {
		Integer rows=null;
		try {
			rows=foreServiceImpl.updateCartById(cart);
			cart.setNums(rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cart;
	}
	
	@RequestMapping(value = "/deleteCart")
	@ResponseBody
	public Cart deleteCart(@RequestBody Cart cart) {
		Integer rows=null;
		try {
			rows=foreServiceImpl.deleteCart(cart);
			cart.setId(rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cart;
	}
	
	@RequestMapping(value = "/showAddress")
	@ResponseBody
	public List<Address> selectAddressList(@RequestBody Address address){
		List<Address> addressList=null;
		try {
			addressList=foreServiceImpl.selectAddressList(address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return addressList;
	}
	
	@RequestMapping(value = "/addAddress")
	@ResponseBody
	public Address addAddress(@RequestBody Address address) {
		// TODO Auto-generated method stub
		Integer rows=null;
		try {
			rows=foreServiceImpl.addAddress(address);
			address.setId(rows);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(address);
		return address;
	}
	
	@RequestMapping(value = "/updateAddressById")
	@ResponseBody
	public Address updateAddressById(@RequestBody Address address) {
		// TODO Auto-generated method stub
		Integer rows=null;
		try {
			rows=foreServiceImpl.updateAddressById(address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return address;
	}
	
	@RequestMapping(value = "/deleteAddressById")
	@ResponseBody
	public Address deleteAddressById(@RequestBody Address address) {
		// TODO Auto-generated method stub
		Integer rows=null;
		try {
			rows=foreServiceImpl.deleteAddressById(address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return address;
	}
	
	@RequestMapping(value = "/addRecord")
	@ResponseBody
	public void addRecord(@RequestBody Record record) {
		// TODO Auto-generated method stub
		Integer rows=null;
		try {
			rows=foreServiceImpl.addRecord(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/showMoney")
	@ResponseBody
	public Recharge selectRechargeByUsername(@RequestBody Recharge recharge) {
		// TODO Auto-generated method stub
		Recharge recharge1 = new Recharge();
		try {
			recharge1=foreServiceImpl.selectRechargeByUsername(recharge);
			if(recharge1==null) {
				recharge.setMoney(0);
				return recharge;
			}else {
				return recharge1;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recharge1;
	}
	
	@RequestMapping(value = "/addRecharge")
	@ResponseBody
	public void addRecharge(@RequestBody Recharge recharge) {
		// TODO Auto-generated method stub
		RechargeData rechargeData=new RechargeData();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = sdf.format(date);
		rechargeData.setUsername(recharge.getUsername());
		rechargeData.setMoney(recharge.getMoney());
		rechargeData.setTime(time);
		try {
			Recharge recharge1=foreServiceImpl.rechargeYesOrNo(recharge);
			foreServiceImpl.addRechargeData(rechargeData);
			if(recharge1!=null) {
				recharge.setMoney(recharge.getMoney()+recharge1.getMoney());
				System.out.print(recharge);
				foreServiceImpl.updateRechargeByUsername(recharge);
			}else {
				foreServiceImpl.addRecharge(recharge);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value = "/updateRechargeByUsername")
	@ResponseBody
	public Integer updateRechargeByUsername(@RequestBody Recharge recharge) {
		// TODO Auto-generated method stub
		Integer rows=null;
		try {	
			rows =	foreServiceImpl.updateRechargeByUsername(recharge);		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(rows);
		return rows;
	}
	
	@RequestMapping(value = "/showRechargeData")
	@ResponseBody
	public List<RechargeData> seletRechargeData(@RequestBody RechargeData rechargeData) {
		List<RechargeData> rechargeDataList=null;
		try {
			rechargeDataList=foreServiceImpl.seletRechargeData(rechargeData);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rechargeDataList;
	}
	
	@RequestMapping(value = "/updateUserByUsername")
	@ResponseBody
	public User updateUserByUsername(@RequestBody User user,OutputStream os) {
		Integer rows=null;//E:\\eclipse-workspace\\Sadmin\\src\\main\\webapp\\images\\
		                  //D:\\Tomcat8.0\\webapp\\Sadmin\\images\\
		String newPath="E:\\eclipse-workspace\\Sadmin\\src\\main\\webapp\\images\\"+user.getUsername()+"."+user.getPassword();
		String headImg="../../images/"+user.getUsername()+"."+user.getPassword();
		File src = new File(newPath);
        if(user.getHeadImg() != null && !"".equals(user.getHeadImg())){
        	sun.misc.BASE64Decoder decoder = new sun.misc.BASE64Decoder();  
            try {
                os = new FileOutputStream(src);//默认为false，true表示打开append模式
                byte[] imgData = decoder.decodeBuffer(user.getHeadImg());
                os.write(imgData,0,imgData.length);
                os.flush();
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {        
                if(os!=null) {
                    try {
                        //释放资源
                        os.close();
                        user.setHeadImg(headImg);
                        try {
							rows=foreServiceImpl.updateUserByUsername(user);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                        user.setId(rows);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
		return user;
	}
	
	@RequestMapping(value = "/showUser")
	@ResponseBody
	public User selectUserByUsername(@RequestBody User user,HttpServletRequest request) {
		// TODO Auto-generated method stub
		User user1=new User();
		String pwd=user.getPassword();
		String pwd1=user.getHeadImg();
		Integer id=user.getId();
		String ids=""+id;
		try {
			if("1".equals(ids)) {	
				if(pwd.equals(user.getPassword())) {
					user1.setId(id);
					user1.setUsername(user.getUsername());
					user1.setPassword(pwd1);
					System.out.print(user1.getPassword());
					Integer rows=foreServiceImpl.updateUserByUsername(user1);
					request.getSession().removeAttribute("username");
				}else {
					user=null;
				}
			}else {
				user=foreServiceImpl.selectUserByUsername(user);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user);
		return user;
	}
	
	@RequestMapping(value = "/seletOrderByUsername")
	@ResponseBody
	public List<Order> seletOrderList(@RequestBody Record record) {
		List<Order> orderList=null;
		try {
			orderList=foreServiceImpl.seletOrderByUsername(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(orderList);
		return orderList;
	}
	
	@RequestMapping(value = "/closeUserSession")
	public ModelAndView closeSession(HttpServletRequest request) {
		request.getSession().removeAttribute("username");
		return new ModelAndView("redirect:/html/fore/login.html");
	}
}
