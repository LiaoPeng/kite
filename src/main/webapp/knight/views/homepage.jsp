<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common.jsp"%>
<%@ page isELIgnored="false"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, maximum-scale=1">

<title>Homepage</title>

</head>
<body>
	<div style="overflow: hidden;">
		<header class="header" id="header">
			<!--header-start-->
			<div class="container">
				<figure class="logo animated fadeInDown delay-07s">
					<a href="#"><img src="img/logo.png" alt=""></a>
				</figure>
				<h1 class="animated fadeInDown delay-07s">
					<spring:message code="Kite.home.welcome" />
				</h1>
				<ul class="we-create animated fadeInUp delay-1s">
					<li><spring:message code="kite.home.introduce" /></li>
				</ul>
				 <select>
						<option>中文</option>
						<option>English</option>
						<option>Germany</option>ddd
				</select> 
				<a class="link animated fadeInUp delay-1s" href="#"><spring:message code="kite.home.begin"></spring:message></a>
			</div>
	</div>
	</header>
	<!--header-end-->



	<script type="text/javascript">
		$(document).ready(function(e) {
			$('#test').scrollToFixed();
			$('.res-nav_click').click(function() {
				$('.main-nav').slideToggle();
				return false

			});

		});
	</script>

	<script>
		wow = new WOW({
			animateClass : 'animated',
			offset : 100
		});
		wow.init();
		document.getElementById('').onclick = function() {
			var section = document.createElement('section');
			section.className = 'wow fadeInDown';
			this.parentNode.insertBefore(section, this);
		};
	</script>


	<script type="text/javascript">
		$(window).load(function() {

			$('.main-nav li a').bind('click', function(event) {
				var $anchor = $(this);

				$('html, body').stop().animate({
					scrollTop : $($anchor.attr('href')).offset().top - 102
				}, 1500, 'easeInOutExpo');
				/*
				if you don't want to use the easing effects:
				$('html, body').stop().animate({
					scrollTop: $($anchor.attr('href')).offset().top
				}, 1000);
				 */
				event.preventDefault();
			});
		})
	</script>

	<script type="text/javascript">
		$(window)
				.load(
						function() {

							var $container = $('.portfolioContainer'), $body = $('body'), colW = 375, columns = null;

							$container.isotope({
								// disable window resizing
								resizable : true,
								masonry : {
									columnWidth : colW
								}
							});

							$(window).smartresize(
									function() {
										// check if columns has changed
										var currentColumns = Math.floor(($body
												.width() - 30)
												/ colW);
										if (currentColumns !== columns) {
											// set new column count
											columns = currentColumns;
											// apply width to container manually, then trigger relayout
											$container.width(columns * colW)
													.isotope('reLayout');
										}

									}).smartresize(); // trigger resize to set container width
							$('.portfolioFilter a').click(
									function() {
										$('.portfolioFilter .current')
												.removeClass('current');
										$(this).addClass('current');

										var selector = $(this).attr(
												'data-filter');
										$container.isotope({

											filter : selector,
										});
										return false;
									});

						});
	</script>
</body>
</html>