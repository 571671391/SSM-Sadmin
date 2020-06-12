  $(document).ready(function(){
	  $("input").blur(function(){
		  if ($(this).is("#username")) {
			  if(this.value==""){
				  document.getElementById("s1").style.color="red";
				  document.getElementById("s1").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*用户名不能为空！";
			  }else{
				  document.getElementById("s1").style.color="green";
				  document.getElementById("s1").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;✔✔✔";
			  }
		  };
		  if ($(this).is("#password")) {
			  var regpassword=/^[\w@#*]{6,16}$/;
			  var password= document.getElementById("password").value;
			  if(this.value==""){
				  document.getElementById("s2").style.color="red";
				  document.getElementById("s2").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*密码不能为空！";
			  }else if(!regpassword.test(password)){
				  document.getElementById("s2").style.color="red";
				  document.getElementById("s2").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*请输入1-6位的英文、数字、下划线、@、#、*";
			  }else{
				  document.getElementById("s2").style.color="green";
				  document.getElementById("s2").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;✔✔✔";
			  }
		  };
		 /* if ($(this).is("#name")) {
			  var regname=/^[\u4e00-\u9fa5\w]{1,6}$/;
			  var name= document.getElementById("name").value;
			  if(this.value==""){
				  document.getElementById("s3").style.color="red";
				  document.getElementById("s3").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*姓名不能为空！";
			  }else if(!regname.test(name)){
				  document.getElementById("s3").style.color="red";
				  document.getElementById("s3").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*请输入1-6位的汉字、英文、数字、下划线";
			  }else{
				  document.getElementById("s3").style.color="green";
				  document.getElementById("s3").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;✔✔✔";
			  }
		  };*/
		  if ($(this).is("#sex")) {
			  var regsex=/^男$|^女$/;
			  var sex= document.getElementById("sex").value;
			  if(this.value==""){
				  document.getElementById("s4").style.color="red";
				  document.getElementById("s4").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*性别不能为空！";
			  }else if(!regsex.test(sex)){
				  document.getElementById("s4").style.color="red";
				  document.getElementById("s4").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*请输入男或女";
			  }else{
				  document.getElementById("s4").style.color="green";
				  document.getElementById("s4").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;✔✔✔";
			  }
		  };
		  if ($(this).is("#age")) {
			  if(this.value==""){
				  document.getElementById("s5").style.color="red";
				  document.getElementById("s5").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*年龄不能为空！";
			  }else{
				  document.getElementById("s5").style.color="green";
				  document.getElementById("s5").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;✔✔✔";
			  }
		  };
		  if ($(this).is("#phone")) {
			  var regphone=/^1\d{10}$/;
			  var phone= document.getElementById("phone").value;
			  if(this.value==""){
				  document.getElementById("s6").style.color="red";
				  document.getElementById("s6").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*电话不能为空！";
			  }else if(!regphone.test(phone)){
				  document.getElementById("s6").style.color="red";
				  document.getElementById("s6").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*请输入11位电话号码";
			  }else{
				  document.getElementById("s6").style.color="green";
				  document.getElementById("s6").innerHTML="&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;✔✔✔";
			  }
		  };
	  });
	  $("form").submit(function(){
		  $("form input").trigger("blur");
		  if($(".points").text() != "     ✔✔✔     ✔✔✔     ✔✔✔     ✔✔✔     ✔✔✔"){
			  return false;
		  }
	  });
  })
