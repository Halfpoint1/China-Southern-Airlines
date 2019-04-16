<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Luggage Transportation</title>
<head>
<title>Luggage Transportation</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8" />
<meta name="keywords"
	content="Luggage Transportation Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
<script>
	addEventListener("load", function() {
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
<link
	href="//fonts.googleapis.com/css?family=Cuprum:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese"
	rel="stylesheet">
<!-- //web-fonts -->

</head>

<body>
	<!-- title -->
	<h1>
		<span>L</span>uggage <span>T</span>ransportation
	</h1>
	<!-- //title -->
	<!-- content -->
	<div class="sub-main-w3">
		<form action="/SoftwareT/logic" method="post">
			<input type="hidden" name="method" value="1">
			<div>
				<label for="selectBegin">Begin</label> <select name="selectBegin"
					id="selectBegin" style="width: 150px;">
					<option value="1">中国大陆</option>
					<option value="2">日本</option>
					<option value="2">美洲</option>
					<option value="2">澳新</option>
					<option value="2">俄罗斯</option>
					<option value="2">迪拜</option>
					<option value="3">中西亚</option>
					<option value="4">内罗毕</option>
					<option value="5">新加坡</option>
					<option value="6">韩国</option>
					<option value="7">其它</option>
				</select>
			</div>
			<div>
				<label for="selectEnd">End</label> <select name="selectEnd"
					id="selectEnd" style="width: 150px;">
					<option value="1">中国大陆</option>
					<option value="2">日本</option>
					<option value="2">美洲</option>
					<option value="2">澳新</option>
					<option value="2">俄罗斯</option>
					<option value="2">迪拜</option>
					<option value="3">中西亚</option>
					<option value="4">内罗毕</option>
					<option value="5">新加坡</option>
					<option value="6">韩国</option>
					<option value="7">其它</option>
				</select>
			</div>
			<div>
				<label for="selectType">Type</label> <select name="selectType"
					id="selectType" style="width: 150px;">
					<option value="1">头等舱</option>
					<option value="2">公务舱</option>
					<option value="3">经济舱</option>
					<option value="4">婴儿</option>
					<option value="5">明珠经济舱</option>
				</select>
			</div>
			<div>
				<label for="InputMoney">Input Money</label> <input type="text"
					name="inputmoney" id="inputmoney" placeholder="Input Money"
					required>
			</div>
			<div>
				<label for="selectType2">Passenger Type</label> <select
					name="selectType2" id="selectType2" style="width: 150px;">
					<option value="1">普通乘客</option>
					<option value="2">南航明珠金卡会员</option>
					<option value="2">天合联盟超级精英</option>
					<option value="3">南航明珠银卡会员</option>
					<option value="3">天合联盟精英</option>
					<option value="4">留学生</option>
					<option value="4">劳务</option>
					<option value="4">海员</option>
				</select>
			</div>
			<div>

				<label for="Luggage Messege">Luggage Messege</label>
				<%
					String info = (String) request.getAttribute("info");
				%>
				<textarea name="Messege" style="width: 300px; height: 100px;"><%out.println(info);%></textarea>
			</div>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br>
			<br> <a href="Add.jsp" style="color: #fff; width: 200px;">&emsp;&emsp;&emsp;&emsp;Add
				Luggage</a>
			<button type="submit" class="btn btn-primary">Calculate</button>
		</form>

	</div>
	<!-- //content -->

	<!-- Jquery -->
	<script src="js/jquery-2.2.3.min.js"></script>
	<!-- //Jquery -->
	<!-- Jquery -->
	<script src="js/jquery-simple-validator.min.js"></script>
	<!-- //Jquery -->

</body>

</html>