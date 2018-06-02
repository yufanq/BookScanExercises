<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
   <jsp:include page="header.jsp"></jsp:include>
   
    <div class="vernav2 iconmenu">
    	<ul>
        	<li><a href="${pageContext.request.contextPath}/profession/getAllProfession" class="gallery">专业管理</a></li>
            <li><a href="${pageContext.request.contextPath}/book/getAllBook" class="widgets">书本管理</a></li>
            <li><a href="${pageContext.request.contextPath}/chapter/getAllChapter" class="buttons">章节管理</a></li>
            <li><a href="${pageContext.request.contextPath}/knowladgepointmanager.jsp" class="support">知识点管理</a></li>
            <li><a href="${pageContext.request.contextPath}/questiontype.jsp" class="typo">题目类型管理</a></li>
			<li><a href="#formsub" class="editor">题目管理</a>
            	<span class="arrow"></span>
            	<ul id="formsub">
               		<li><a href="${pageContext.request.contextPath}/singlechoicemanager.jsp">单项选择</a></li>
                    <li><a href="${pageContext.request.contextPath}/multiplechoicemanager.jsp">多项选择</a></li>
                    <li><a href="${pageContext.request.contextPath}/completionmanager.jsp">填空题</a></li>
                    <li><a href="${pageContext.request.contextPath}/trueorfalsequestionmanager.jsp">判断题</a></li>
                    <li><a href="${pageContext.request.contextPath}/essayquestionmanager.jsp">问答题</a></li>
                    <li><a href="${pageContext.request.contextPath}/analysisthetopicquestionmanager.jsp">辨析题</a></li>
                </ul>
            </li>
        </ul>
        <a class="togglemenu"></a>
        <br /><br />
    </div><!--leftmenu-->
     