<!DOCTYPE html>
<!--[if lte IE 6]>             <html class="no-js">                               <![endif]-->
<!--[if IE 7]>                 <html class="no-js no-mediaqueries lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>                 <html class="no-js no-mediaqueries lt-ie9">        <![endif]-->
<!--[if gte IE 9]>             <html class="no-js ie">                            <![endif]-->
<!--[if (gt IE 8)|!(IE)]><!-->
<html class="no-js">
<!--<![endif]-->

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

<title>OMD Web - VW Homepage</title>

<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!--[if ! lte IE 6]><!-->
<link href="assets/css/sections/vw-homepage.css" rel="stylesheet">
<script src="assets/js/vendor/modernizr.custom.22167.js"></script>
<script>
	Modernizr.load([ {
		test : Modernizr.mq('only screen and (min-width: 960px)'),
		yep : [ 'assets/js/vendor/jquery-1.10.2.min.js',
				'assets/js/vendor/bootstrap/carousel.js' ],
		complete : function() {
			if (window.jQuery) {
				$('#carousel').carousel();
			}
		}
	} ]);
</script>
<!--<![endif]-->

<!--[if lte IE 8]>
    <link href="assets/css/components/vw-legacyie.css" rel="stylesheet">
  <![endif]-->

<!--[if IE 8]>
    <script src="assets/js/vendor/selectivizr-min.js"></script>
  <![endif]-->

<!--[if lte IE 6]>
    <link href="assets/css/legacy-ie/ie6.1.1.css" rel="stylesheet" media="screen, projection">
  <![endif]-->

<!--<![endif]-->
</head>

<body>
	<div id="wrap">
		<div class="omdweb-container" id="omdweb-home">
			<jsp:include page="../common/navigation.jsp"></jsp:include>
			<jsp:include page="../common/header.jsp"></jsp:include>
			<main role="main">

<<<<<<< Updated upstream
<script type="text/javascript" src="../js/jQuery.js">
</script>

Welcome Home ${countOfUser}
=======
				<jsp:include page="./carousel.jsp"></jsp:include>
				<jsp:include page="./referenceItems.jsp"></jsp:include>
			
			</main>
		</div>
	</div>
>>>>>>> Stashed changes

	<script src="assets/js/vendor/jquery-1.10.2.min.js"></script>

	<!--[if IE 8]>
    <script src="assets/js/vendor/bootstrap/carousel.js"></script>
  <![endif]-->

	<!--[if ! lte IE 6]><!-->
	<script src="assets/js/vendor/Placeholders.js"></script>
	<script>
		$(document).ready(function() {
			if (window.jQuery) {
				Placeholders.enable();
			}
			;
			expandHomeBoxes();
			toggleHomeLists();
		});
	</script>
	<script src="assets/js/main.js"></script>
	<!--<![endif]-->

	<!--[if IE 7]>
    <script src="assets/js/legacy.js"></script>
  <![endif]-->

</body>
</html>
