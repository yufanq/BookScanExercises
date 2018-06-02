<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.default.css" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery-1.7.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery-ui-1.8.16.custom.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery.cookie.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/colorpicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery.uniform.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery.validate.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/jquery.tagsinput.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/charCount.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/ui.spinner.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/plugins/chosen.jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/custom/general.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/custom/forms.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/custom/elements.js"></script>

<!--[if IE 9]>
    <link rel="stylesheet" media="screen" href="css/style.ie9.css"/>
<![endif]-->
<!--[if IE 8]>
    <link rel="stylesheet" media="screen" href="css/style.ie8.css"/>
<![endif]-->
<!--[if lt IE 9]>
	<script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body class="withvernav">

<div class="bodywrapper">
    <jsp:include page="jurisdictionnavigation.jsp"/>
    <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">管理员</h1>
            <span class="pagedesc">The content below are loaded using inline data</span>
            
            <ul class="hornav">
                <li class="current"><a href="#basicform">管理员列表</a></li>
                <li><a href="#validation">管理员角色</a></li>
                <li><a href="#create">管理员添加</a></li>  
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
                                            <th class="head0">管理员id</th>
                                            <th class="head1">管理员名称</th>
                                            <th class="head0" colspan="2">操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach items="${requestScope.admins}" var="admin">
                                        <tr>
                                            <td>${admin.aId}</td>
                                            <td>${admin.aAccount }</td>
                                            <td><a>修改</a></td>
                                            <td><a>删除</a></td>
                                        </tr>
                                     </c:forEach>
                                    </tbody>
                                </table>
                            </div><!--widgetcontent-->
                        </div><!--widgetbox-->
                        <br />
                    
                    <ul class="pagination pagination2">
                    	当前第<strong> ${requestScope.page.pageIndex}</strong> 页，共 <strong>${requestScope.page.pageCount}</strong> 页
                    	<li class="first"><a href="${pageContext.request.contextPath}/admin/showAdmins" class="disable">&laquo;</a></li>
                        <li class="previous"><a href="${pageContext.request.contextPath}/admin/showAdmins?pn=${requestScope.page.pageIndex -1}" class="disable">&lsaquo;</a></li>
                    	<li><a href="${pageContext.request.contextPath}/admin/showAdmins" class="current">1</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/showAdmins?pn=2">2</a></li>
                        <li><a href="${pageContext.request.contextPath}/admin/showAdmins?pn=3">3</a></li>
                        <li><a href="">4</a></li>
                        <li><a href="">5</a></li>
                        <li class="next"><a href="${pageContext.request.contextPath}/admin/showAdmins?pn=${requestScope.page.pageIndex +1}">&rsaquo;</a></li>
                        <li class="last"><a href="${pageContext.request.contextPath}/admin/showAdmins?pn=${requestScope.page.pageCount}">&raquo;</a></li>
                    </ul>
                    <br />
      </div><!--subcontent-->
         
         
            <div id="validation" class="subcontent" style="display: none">
                   <form class="stdform" action="" method="post">
                         <p>
                        	<label>管理员选择</label>
                        	   <span class="formwrapper">
                            	<select data-placeholder="选择管理员" class="chzn-select" style="width:350px;" tabindex="2">
                                <option value="">管理员 One</option>
                                <option value="">管理员Two</option>
                                <option value="">管理员Three</option>
                            </select>
                            </span>
                        </p>
                        <p>
                        	<label>角色选择</label>
                            <span id="dualselect" class="dualselect">
                            	<select class="uniformselect" name="select3" multiple="multiple" size="10">
                                    <option value="">角色 One</option>
                                    <option value="">角色 Two</option>
                                    <option value="">角色 Three</option>
                                    <option value="">角色 Four</option>
                                    <option value="">角色 Five</option>
                                    <option value="">角色 Six</option>
                                    <option value="">角色 Seven</option>
                                    <option value="">角色 Eight</option>
                                </select>
                                <span class="ds_arrow">
                                	<span class="arrow ds_prev">&laquo;</span>
                                    <span class="arrow ds_next">&raquo;</span>
                                </span>
                                <select name="select4" multiple="multiple" size="10">
                                	
                                </select>
                            </span>
                        </p>
                          <p class="stdformbutton">
                        	<button class="submit radius2">提交</button>
                        </p>
                  </form>
         </div><!--subcontent-->
         <div id="create" class="subcontent" style="display: none">
                   <form class="stdform" action="${pageContext.request.contextPath}/admin/addAdmin" method="post">
             			    <p>
                        	<label>管理员名称</label>
                            <span class="field"><input type="text" name="aAccount" id="firstname2" class="longinput" /></span>
                        </p>
                        <br />
                        <p>
                        	<label>管理员密码</label>
                            <span class="field"><input type="password" name="aPassword" id="firstname2" class="longinput" /></span>
                        </p>
                        <br />
                        <p>
                        	<label>再次输入管理员密码</label>
                            <span class="field"><input type="password" name="password" id="firstname2" class="longinput" /></span>
                        </p>
                        <br />
                        <p>
                        	<label>管理员真实姓名</label>
                            <span class="field"><input type="text" name="aNickname" id="firstname2" class="longinput" /></span>
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
