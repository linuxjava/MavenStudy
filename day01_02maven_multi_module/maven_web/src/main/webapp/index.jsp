<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<html>
<head>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#staticResource").click(function () {
                alert('1111111')
            });
        })
    </script>
</head>
<body>
<a href="${pageContext.request.contextPath}/account/findAll">查找所有用户</a>

<form action="${pageContext.request.contextPath}/account/saveAccount" method="post">
    用户名:<input type="text" name="name">
    金额:<input type="text" name="money">
    <input type="submit" value="保存">
</form>

<h3>过滤静态资源</h3>
<button id="staticResource">过滤静态资源</button>
</body>
</html>
