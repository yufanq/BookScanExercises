<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Forms | Amanda Admin Template</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.cookie.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/colorpicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/charCount.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/ui.spinner.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/plugins/chosen.jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/forms.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/custom/elements.js"></script>

<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
<script type="text/javascript">
	
	jQuery(document).ready(function(){
		jQuery('a:contains(修改)').click(update);
		jQuery("a:contains(确定修改)").live("click",updatePaper);
	
	});
	function update(){
		var id=jQuery(this).prop("id");
		var pId="p"+jQuery(this).prop("id");
		var ppId="pp"+jQuery(this).prop("id");
		var span=jQuery("#"+pId);
		var paperName=span.text();
		span.empty();
		var input=jQuery('<input type="text" id="paperName" value='+paperName+'/>');
		span.append(input);
		var span2=jQuery("#"+ppId);
		jQuery(this).remove();
		var inner1=jQuery('<a href="javascript:void(0)" id='+id+'>确定修改</a>');
		span2.append(inner1);
	}
	function updatePaper(){
        var paperName=jQuery("#paperName").prop("value");
		var paperId=jQuery(this).prop("id");
		if(confirm("是否确认修改")){
		jQuery.ajax({
			type:"POST",
			url:'${pageContext.request.contextPath}/finalPaper/updatePaper.do',
			data:'pId='+paperId+'&paperName='+paperName
		});
		}
			
		location.reload(); 
	}
	</script>
</head>

<body class="withvernav">

<div class="bodywrapper">
    <jsp:include page="testpapersnacigation.jsp"/>
    <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">自定义试卷</h1>
            <span class="pagedesc">The content below are loaded using inline data</span>
            
            <ul class="hornav">
                <li class="current"><a href="#basicform">自定义试卷列表</a></li>
                <li><a href="#validation">自定义试卷添加</a></li>
            </ul>
        </div><!--pageheader-->
        
        <div id="contentwrapper" class="contentwrapper">
        	
        	<div id="basicform" class="subcontent">
        	 
                        <div class="widgetbox">
                            <div class="title"><h3>Statements</h3></div>
                            <div class="widgetcontent padding0 statement">
                               <table cellpadding="0" cellspacing="0" border="0" class="stdtable">
                                    <colgroup>
                                        <col class="con0" />
                                        <col class="con1" />
                                        <col class="con0" />
                                    </colgroup>
                                    <thead>
                                        <tr>
                                            <th class="head0">自定义试卷id</th>
                                            <th class="head1">自定义试卷名称</th>
                                            <th class="head0" colspan="2">操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                             <c:forEach items="${customPapers}" var="paper" >
                                        	<tr>
                                        	 <td>${paper.pId }</td>
                                            <td><span id="p${paper.pId }">${paper.pName }</span></td>
                                            <td><span id="pp${paper.pId }"><a href="javascript:void(0)" id="${paper.pId }" >修改</a></span></td>
                                            <td><a href="${pageContext.request.contextPath}/customPaper/deletePaper.do?pId=${paper.pId }">删除</a> </td>
                           
                                        	</tr>
                                        </c:forEach>
                                        </tr>
                                    </tbody>
                                </table>
                            </div><!--widgetcontent-->
                        </div><!--widgetbox-->
                        <br />
                    
                    <ul class="pagination pagination2">
                     <li class="first"><a href="" class="disable">&laquo;</a></li>
                       <li class="previous"><a href="" class="disable">&lsaquo;</a></li>
                        <c:forEach begin="${page }" end="${totalPape }"  varStatus="state">
                        		<li><a href="" class="current">${state.count}</a></li>
                        </c:forEach>
                         <li class="next"><a href="">&rsaquo;</a></li>
                        <li class="last"><a href="">&raquo;</a></li>
                     </ul>
                    <br />
      </div><!--subcontent-->
         
         
            <div id="validation" class="subcontent" style="display: none">
                   <form class="stdform" action="" method="post">
                                             <p>
                        	<label>专业</label>
                           <span class="formwrapper">
                             <select data-placeholder="选择专业...." class="chzn-select" multiple="multiple" style="width:350px;" tabindex="4">
                                    <option value="United States">United States</option> 
                               </select>
                           </span>
                             </p>
                  
                          <p>
                        	<label>自定义试卷名称</label>
                            <span class="field"><input type="text" name="firstname" id="firstname" class="longinput" /></span>
                        </p>
                        <p class="stdformbutton">
                        	<button class="submit radius2">提交</button>
                        </p>
                  </form>
         </div><!--subcontent-->
        
        </div><!--contentwrapper-->
        
	</div><!-- centercontent -->
    
    
</div><!--bodywrapper-->

</body>
</html>
