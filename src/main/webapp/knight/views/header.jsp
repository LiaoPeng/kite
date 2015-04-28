<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common.jsp"%>
<header class="header" id="header">
	<!--header-start-->
<!-- 	<div class="container"> -->
		<figure class="logo animated fadeInDown delay-07s">
			<a href="#"><img src="img/logo.png" alt=""></a>
		</figure>
		<h1 class="animated fadeInDown delay-07s">
			<spring:message code="kite.home.welcome"></spring:message>
		</h1>
		<ul class="we-create animated fadeInUp delay-1s">
			<li><spring:message code="kite.home.introduce" /></li>
		</ul>
		<a class="link animated fadeInUp delay-1s" href="?target=service"><spring:message
				code="kite.home.begin"/></a> <br>
				<div class="animated fadeInUp delay-1s">
				使用下列语言：
				<a  href="javascript:setWebSiteLanguage('zh_CN')">中文（简体）</a> 
				<a  href="javascript:setWebSiteLanguage('en_US')">English</a>
				</div>
<!-- 	</div> -->

</header>
<!--header-end-->