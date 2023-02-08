
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>login</title>
    <style>
        form{
            border: 3px solid black;
            width: 240px;
        }
        h2{
            text-align: center;
        }
       .submit{
           position: relative;
           text-align: center;
           left: 87px;
       }

    </style>
</head>
<body>
<form action="/login" method="post">
    <div class="login">
        <h2>Login</h2>
        <input type="text" name="username" size="30"  placeholder="username" /> <br> <br>
        <input type="password" name="password" size="30" placeholder="password" /> <br> <br>
        <input class="submit" type="submit" value="Sign in"/>
    </div>
</form>
</body>
</html>
