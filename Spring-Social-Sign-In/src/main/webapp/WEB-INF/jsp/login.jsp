<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>${title}</title>
	<link href='http://fonts.googleapis.com/css?family=Rokkitt' rel='stylesheet' type='text/css'>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link href='<c:url value="/resources/css/loginPage.css"/>' rel='stylesheet' type='text/css'> 
</head>
<body>		
		<div class="wrap">

			<div class="login-form">
			
				<form class="login_form" name='loginForm' action="<c:url value='../j_spring_security_check' />" method='POST'>
					<h1>Login Into Your Account</h1>
					<ul>
						<li>
							<input type="text" class="textbox1" id="username" name="j_username" placeholder="Username" required="required">
							<p><img src="<c:url value="/resources/images/contact.png"/>" ></p>
						</li>
						<li>
							<input type="password" id="password" name="j_password" class="textbox2" placeholder="Password">
							<p><img src="<c:url value="/resources/images/lock.png"/>" ></p>
						</li>
					</ul>
					<input type="submit" name="Sign In" value="Sign In">
					<div class="clear"></div>	
					<label class="checkbox"><input type="checkbox" name="checkbox" checked="checked"><i></i>Remember me</label>
					<div class="forgot">
						<a href="#">forgot password?</a>
					</div>	
					<div class="clear"></div>	
				</form>
				<c:url value="../services/signup" var="signupurl" />
			<div class="account">
				<h2><a href="${signupurl}">Don't have an account? Sign Up!</a></h2>
				<div class="span">
					<form name='facebookSocialloginForm'
            		  action="<c:url value='../auth/facebook?scope=email,user_about_me,user_birthday' />" method='POST'>
							<img src="<c:url value="/resources/images/facebook.png"/>" >
							<button type="submit">
								<i>Sign In with Facebook</i>
							</button>	
							<div class="clear"></div>
					</form>		
				</div>	
				<div class="span1">
					<form name='TwitterSocialloginForm'
            		  action="<c:url value='../auth/twitter?scope=email,user_about_me,user_birthday' />" method='POST'>
						<img src="<c:url value="/resources/images/twitter.png"/>" >
						<button type="submit">
							<i>Sign In with Twitter</i>
						</button>			
						<div class="clear"></div>
					</form>
				</div>
				<div class="span2">
					<form name='LinkedInSocialloginForm'
            		  action="<c:url value='../auth/linkedin' />" method='POST'>
						<img src="<c:url value="/resources/images/linkedin.png"/>" >
						<button type="submit">
							<i>Sign In with Linkedin</i>
						</button>	
						<div class="clear"></div>
					</form>
				</div>
				<div class="span3">
                	<form name='GoogleSocialloginForm'
                      action="<c:url value='../auth/google' />" method='POST'>
                		<img src="<c:url value="/resources/images/gmail2.png"/>" width="30" height="30">
                		<button type="submit">
                			<i>Sign In with Google</i>
                		</button>
                		<input type="hidden" name="scope" value="https://www.googleapis.com/auth/userinfo.profile https://www.googleapis.com/auth/userinfo#email https://www.googleapis.com/auth/plus.me https://www.googleapis.com/auth/tasks https://www-opensocial.googleusercontent.com/api/people https://www.googleapis.com/auth/plus.login" />
                		<div class="clear"></div>
                	</form>
                				</div>
			</div>	
			<div class="clear"></div>	
		</div>

	</div>


</body>
</html>
