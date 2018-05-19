<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
   <jsp:include page="header.jsp"></jsp:include>
   
    <div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="majormanager.jsp" class="gallery">专业管理</a></li>
            <li><a href="booksmanager.jsp" class="widgets">书本管理</a></li>
            <li><a href="knowladgepointmanager.jsp" class="support">知识点管理</a></li>
            <li><a href="questiontype.jsp" class="typo">题目类型管理</a></li>
			<li><a href="#formsub" class="editor">试题管理</a>
            	<span class="arrow"></span>
            	<ul id="formsub">
               		<li><a href="forms.html">单项选择</a></li>
                    <li><a href="wizard.html">多项选择</a></li>
                    <li><a href="editor.html">填空题</a></li>
                    <li><a href="editor.html">判断题</a></li>
                    <li><a href="editor.html">问答题</a></li>
                    <li><a href="editor.html">辨析题</a></li>
                </ul>
            </li>
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->
     