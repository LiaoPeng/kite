<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="common.jsp"%>
<nav class="main-nav-outer" id="test"><!--main-nav-start-->
	<div class="container">
        <ul class="main-nav">
        	<li><a href="?target=header"><spring:message code="kite.navigate.home"></spring:message></a></li>
            <li><a href="?target=service"><spring:message code="kite.navigate.service"></spring:message></a></li>
            <li><a href="?target=portfolio"><spring:message code="kite.navigate.portfolio"></spring:message></a></li>
            <li class="small-logo"><a href="?target=header"><img src="img/small-logo.png" alt=""></a></li>
            <li><a href="?target=client"><spring:message code="kite.navigate.clients"></spring:message></a></li>
            <li><a href="?target=team"><spring:message code="kite.navigate.team"></spring:message></a></li>
            <li><a href="?target=contact"><spring:message code="kite.navigate.contact"></spring:message></a></li>
        </ul>
        <a class="res-nav_click" href="#"><i class="fa-bars"></i></a>
    </div>
</nav><!--main-nav-end-->