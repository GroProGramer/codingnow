/**
 * 增加博客文章的控制逻辑
 */

function addBlog() {
	
}

function getCategorys(selectListEle) {
	var url = "/codingnow/addblog";
	var myRequest = getXMLHTTPRequest();  // 获得一个XMLHttpRequest对象
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
	for(var i = 0; i < myobj.length; i++){
	    alert(myobj[i].name);
	    alert(myobj[i].age);
	}
}




















