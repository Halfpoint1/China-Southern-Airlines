<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Luggage</title>
<head>
	<title>Add Luggage</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8" />
	<meta name="keywords" content="Validator Signup Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements"
	/>
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- Meta tag Keywords -->
	<!-- css file -->
	<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
	<!-- Style-CSS -->
	<!-- //css file -->
	<!-- web-fonts -->
	<link href="//fonts.googleapis.com/css?family=Cuprum:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese"
	    rel="stylesheet">
	<!-- //web-fonts -->

</head>

<body>
	<!-- title -->
	<h1>
		<span>A</span>dd
		<span>L</span>uggage
	</h1>
	<!-- //title -->
	<!-- content -->
	<div class="sub-main-w3">
		<form validate="true" action="/SoftwareT/logic" method="post">
		<input type="hidden" name="method" value="2">
			<div class="form-group">
				<label for="Length">Length</label>
				<input type="text" class="form-control" name="Length" id="Length" placeholder="Enter Length" required>
			</div>
			<div class="form-group">
				<label for="Width">Width</label>
				<input type="text" class="form-control" name="Width" id="Width" placeholder="Enter Width" required>
			</div>
			<div class="form-group">
				<label for="Height">Height</label>
				<input type="text" class="form-control" name="Height" id="Height" placeholder="Enter Height" required>
			</div>
			<div class="form-group">
				<label for="Weight">Weight</label>
				<input type="text" class="form-control" name="Weight" id="Weight" placeholder="Enter Weight" required>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
	<!-- //content -->

	<!-- copyright -->
	<!-- //copyright -->

	<!-- Jquery -->
	<script src="js/jquery-2.2.3.min.js"></script>
	<!-- //Jquery -->
	<!-- Jquery -->
	<script src="js/jquery-simple-validator.min.js"></script>
	<!-- //Jquery -->

</body>

</html>