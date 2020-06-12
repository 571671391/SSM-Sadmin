package com.lhn.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lhn.bean.Commodity;
import com.lhn.bean.Page;
import com.lhn.bean.User;
import com.lhn.bean.PublicMap;
import com.lhn.service.impl.BackServiceImpl;

@Controller
@RequestMapping(value = "/admin")
public class Back {
	@Autowired
	BackServiceImpl backServiceImpl;
	
	//管理员登录
	@RequestMapping(value = "/login",method= RequestMethod.POST)
	public ModelAndView adminLogin(HttpServletRequest request,HttpServletResponse response) {
	    String uname=request.getParameter("user_name");
		String pwd=request.getParameter("pass_word");
		if(uname.equals("lhn")&&pwd.equals("123456")) {
			request.getSession().setAttribute("uname", uname);
			return new ModelAndView("redirect:/html/back/main-admin.html");
		}else {
			return new ModelAndView("redirect:/html/back/login.html");
		}
	}
	
	//分页查询(用户管理)
	@RequestMapping(value = "/selectUserList")
	@ResponseBody
	public PublicMap<List<User>> selectUserList(Page page,@RequestParam("limit") int limit) {
		List<User> userList=null;
		page.setRows(limit);
		page.setStart((page.getPage()-1)*limit);
		Integer totals=null;
		try {
			totals = backServiceImpl.selectUserCount(page);
			page.setTotalRecord(totals);
			page.setTotalPage((page.getTotalRecord()-1)/limit+1);
		    userList=backServiceImpl.selectUserList(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new PublicMap<List<User>>(0,"",totals,userList);
	}
	
	//根据id删除用户
	@RequestMapping(value = "/deleteUserById",method= RequestMethod.POST)
	@ResponseBody
	public User deleteUserById(@RequestBody User user) {
		Integer id=null;
		try {
			id=backServiceImpl.deleteUserById(user.getId());
			user.setId(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;	
	}
	
	//根据id修改用户信息
	@RequestMapping(value = "/updateUserById",method= RequestMethod.POST)
	public ModelAndView updateUserById(User user) {
		try {
			Integer rows=backServiceImpl.updateUserById(user);
			if(rows!=null) {
				System.out.print("修改成功");
			}else {
				System.out.print("修改失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/user-admin.html");
	}
	
	//添加数据到user表
	@RequestMapping(value = "/addUser",method= RequestMethod.POST)
	public ModelAndView addUser(User user,HttpServletRequest request) {
		String ids=request.getParameter("ids");
		try {
			Integer rows=backServiceImpl.addUser(user);
			if(rows!=null) {
				System.out.print("添加数据成功");
			}else {
				System.out.print("添加数据失败");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if("zx110".equals(ids)) {
			return new ModelAndView("redirect:/html/fore/login.html");
		}else {
			return new ModelAndView("redirect:/html/back/user-admin.html");
		}
	}
	
	//分页查询(用户管理)
    @RequestMapping(value = "/selectCommodityList")
    @ResponseBody
    public PublicMap<List<Commodity>> selectCommodityList(Page page,@RequestParam("limit") int limit) {
    	List<Commodity> commodityList=null;
    	page.setRows(limit);
    	page.setStart((page.getPage()-1)*limit);
		Integer totals=null;
		try {
			totals = backServiceImpl.selectCommodityCount(page);
			page.setTotalRecord(totals);
			page.setTotalPage((page.getTotalRecord()-1)/limit+1);
			commodityList=backServiceImpl.selectCommodityList(page);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return new PublicMap<List<Commodity>>(0,"",totals,commodityList);
   }
    
    //添加数据到commodity表
  	@RequestMapping(value = "/addCommodity",method= RequestMethod.POST)
  	public ModelAndView Commodity(Commodity commodity) {
  		try {
  			Integer rows=backServiceImpl.addCommodity(commodity);
  			if(rows!=null) {
  				System.out.print("添加数据成功");
  			}else {
  				System.out.print("添加数据失败");
  			}
  		} catch (Exception e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		return new ModelAndView("redirect:/html/back/commodity-admin.html");
  	}
  	
    //根据id删除商品
  	@RequestMapping(value = "/deleteCommodityById",method= RequestMethod.POST)
  	@ResponseBody
  	public Commodity deleteCommodityById(@RequestBody Commodity commodity) {
  		Integer id=null;
  		try {
  			id=backServiceImpl.deleteCommodityById(commodity.getId());
  			commodity.setId(id);
  		} catch (Exception e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		return commodity;	
  	}
  	
    //根据id修改商品信息
  	@RequestMapping(value = "/updateCommodityById",method= RequestMethod.POST)
  	public ModelAndView updateCommodityById(Commodity commodity) {
  		try {
  			Integer rows=backServiceImpl.updateCommodityById(commodity);
  			if(rows!=null) {
  				System.out.print("修改成功");
  			}else {
  				System.out.print("修改失败");
  			}
  		} catch (Exception e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		return new ModelAndView("redirect:/html/back/commodity-admin.html");
  	}
	
  	@RequestMapping(value = "/closeAdminSession")
	public ModelAndView closeSession(HttpServletRequest request) {
		request.getSession().removeAttribute("uname");
		return new ModelAndView("redirect:/html/back/login-admin.html");
	}
}
