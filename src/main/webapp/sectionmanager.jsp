<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
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
	<script src="${pageContext.request.contextPath}/http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
<![endif]-->
</head>

<body class="withvernav">

<div class="bodywrapper">
    <jsp:include page="indexnavigation.jsp"/>
    <div class="centercontent">
    
        <div class="pageheader">
            <h1 class="pagetitle">章节</h1>
            <span class="pagedesc">The content below are loaded using inline data</span>
            
            <ul class="hornav">
                <li class="current"><a href="#basicform">章节列表</a></li>
                <li><a href="#validation">章节添加</a></li>
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
                                            <th class="head0">章节id</th>
                                            <th class="head1">章节编号</th>
                                            <th class="head1">章节名称</th>
                                            <th class="head0" colspan="2">操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                       <!--  <tr>
                                            <td>01/12/12</td>
                                            <td>10</td>
                                            <td><a>修改</a></td>
                                            <td><a>删除</a></td>
                                        </tr> -->
                                         <c:if test="${!empty chapters}">  
                                       <c:forEach items="${chapters}" var="c">  
                                          <tr>  
                                            <td>${c.cId}</td>
                                            <td>${c.cNumber}</td>    
                                            <td>${c.cName}</td>  
                                              <td>  
                                           <a href="<%=basePath%>chapter/selectC?id=${c.cId}">编辑</a>  
                                            <a href="<%=basePath%>chapter/deleteC?id=${c.cId}">删除</a>  
                                          </td>  
                                         </tr>               
                                        </c:forEach>  
                                        </c:if>  
                                    </tbody>
                                </table>
                            </div><!--widgetcontent-->
                        </div><!--widgetbox-->
                        <br />
                    
                    <ul class="pagination pagination2">
                    	<li class="first"><a href="" class="disable">&laquo;</a></li>
                        <li class="previous"><a href="" class="disable">&lsaquo;</a></li>
                         <c:if test="${!empty chapters }">  
                                       <c:forEach items="${chapters}" var="c">  
                                            <li><a href="">${c.cName}</a></li>            
                                        </c:forEach>  
                        </c:if>  
                    	<!-- <li><a href="" class="current">1</a></li>
                        <li><a href="">2</a></li>
                        <li><a href="">3</a></li>
                        <li><a href="">4</a></li>
                        <li><a href="">5</a></li>
                        <li class="next"><a href="">&rsaquo;</a></li>
                        <li class="last"><a href="">&raquo;</a></li> -->
                    </ul>
                    <br />
      </div><!--subcontent-->
         
         
            <div id="validation" class="subcontent" style="display: none">
                   <form class="stdform" action="<%=basePath%>chapter/insertC" method="post">
                      	<p>
                      	<label>书名</label>
                 			    <span class="formwrapper">
                           <select data-placeholder="选择书本..." class="chzn-select" style="width:350px;" tabindex="2">
                           <c:if test="${!empty books }">  
                                       <c:forEach items="${books}" var="b">  
                                             <option value="${b.bId}">${b.bName}</option>         
                                        </c:forEach>  
                        </c:if>  
                           </select>
                           </span>
                               </p>
                        <p>
                        	<label>章节编号</label>
                            <span class="field"><input type="text" name="number" id="firstname" class="longinput" /></span>
                        </p>
                         <p>
                        	<label>章节名称</label>
                            <span class="field"><input type="text" name="ctname" id="firstname" class="longinput" /></span>
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
