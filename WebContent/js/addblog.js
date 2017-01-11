/**
 * 增加博客文章的控制逻辑
 */

function addBlog() {
	
}

function addCategory() {
	var ele = document.getElementsByName("categoryList") ;
	getCategorys(ele);
}

function getCategorys(selectListEle) {
	console.log("getCategorys call!");
	var url = "/codingnow/getcategorys";
	var myRequest = getXMLHttpRequest();  // 获得一个XMLHttpRequest对象
	if(myRequest) {
		
		myRequest.onreadystatechange =  function() // 接收获得数据状态的事件函数
        {                        
            onReadyState(myRequest, selectListEle);  
        }
		
		 try {
	        myRequest.open( "post", url, true);
	            
	     }catch(e) {
	        alert(e);
	     } 
	     try {

	        myRequest.send("");
	  
	     } catch(e) {
	        alert(e);
	     }
	}
	
}

function getXMLHttpRequest() {
	var xmlHttpReq=null;
	if (window.XMLHttpRequest) {//Mozilla 浏览器
	  xmlHttpReq = new XMLHttpRequest();
	}else {
	 if (window.ActiveXObject) {//IE 浏览器
	 try {
	  xmlHttpReq = new ActiveXObject("Microsoft.XMLHTTP");
	 }catch (e) {
	   try {//IE 浏览器
	     xmlHttpReq = new ActiveXObject("Msxml2.XMLHTTP");
	   }catch (e) {
	   }
	 }
	}
   }
   return xmlHttpReq;
}


function onReadyState(myRequest, selectListEle) { 
    if(myRequest.readyState == 4) {              
        try {
            addOptions(selectListEle, myRequest.responseText);  // 向<select>标签中加入<option>标签
        }catch(e) {
            alert("onReadyState:" + e);
        }
    }
}


//TODO 未完成
function addOptions(selectListEle, jsonStr) {
	var jsonArray = eval(jsonStr);
	var mySelect = document.getElementById("categoryList");
	for(var i = 0; i < jsonArray.length; i++){
		var objOption = document.createElement("OPTION");
		  objOption.text = jsonArray[i].des;
		  objOption.value = jsonArray[i].catagoryId;
		  mySelect.options.add(objOption);
//	    alert(jsonArray[i].catagoryId);
//	    alert(jsonArray[i].des);
	}
}




















