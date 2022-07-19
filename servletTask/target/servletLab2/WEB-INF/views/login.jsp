<%--
  Created by IntelliJ IDEA.
  User: Виталий
  Date: 12.06.2022
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head><title>Title</title>
    <link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css"
          rel="stylesheet">

    <style>
        .footer {
            position: absolute; bottom: 0;
            width: 100%;
            height: 60px;
            background-color: #f5f5f5;
        }

        .container {
            width: auto;
            max-width: 680px;
            padding: 0 15px;
        }
    </style>
</head>
<body>
<p><font color="red">${errorMessage}</font></p>
<form action="LoginServlet" method="POST">
    <p>Name : <input name="name" type="text"/>
    </p>
    <p> Password : <input name="password" type="password"/>
    </p>
    <input type="submit"/></form>

<!--
<div id="bio"> <h2>Who's Hot Right Now?</h2> <h3>Beau Dandy</h3>
    <div> <img src="../images/beau_100.jpg" width="100" height="100" alt="Beau Dandy"/>
        <p>Content about Beau Dandy</p> </div> <h3>Johnny Stardust</h3>
    <div> <img src="../images/johnny_100.jpg" width="100" height="100" alt="Johny Stardust"/>
        <p>Content about Johny Stardust</p> </div> <h3>Glendatronix</h3>
    <div> <img src="../images/glenda_100.jpg" width="100" height="100" alt="Glendatronix"/>
        <p>Content about Glendatronix</p>
    </div>
</div>-->
</body>
<script>
    $('#bio > div').hide();
    $('#bio > div:first').show();
    $('#bio h3').click(function() { $(this).next().animate( {'height':'toggle'}, 'slow', 'easeOutBounce' ); });
</script>
<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</html>


