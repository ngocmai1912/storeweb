<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <jsp:useBean id="p" class="dao.DAO"></jsp:useBean>
        </head>
        <body>
        <div id="login" class="jumbotron">
<!--            <h3 class="text-center text-white pt-5">Thanh Toán</h3>-->
            
            <div class="container">
                <div id="login-row" class="row justify-content-center align-items-center">
                    <div id="login-column" class="col-md-6">
                        <div id="login-box" class="col-md-12">
                            <form id="login-form" class="form" action="" method="post">
                                <h3 class="text-center text-info">Thanh Toán</h3>
                                <button type="submit"class="btn btn-info btn-md"><a class="text-white text-uppercase" href="back.html">Back</a></button>
                                <button type="submit"class="btn btn-info btn-md pull-right"><a class="text-white text-uppercase" href="index.html">Usename</a></button>
<!--                                <button type="submit"s="btn btn-info btn-md"><a class="right" href="index.html">usename</a></button>-->
<br><br><br>
                         <div class="row">      
                            <div class="card bg-light mb-3 col-md-6">
                            <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Shipment</div>
                            <ul class="list-group category_block">
                            <c:forEach items="${p.ALLShipment}" var="o">
                                <li class="list-group-item text-white">
                                    <input type="radio" name="shipment" value="Nam" checked><a href="#">${o.shipment}</a>
                                    <a href="#">${o.price}</a>
                                </li>
                            </c:forEach>
                        </ul>
                                                        </form>

                    </div>
                             <div class="card bg-light mb-3 col-md-6">
                            <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Payment</div>
                            <ul class="list-group category_block">
                            <c:forEach items="${p.ALlPayment}" var="o">
                                <li class="list-group-item text-white"><a href="#"><input type="radio" name="gioitinh" value="Nam" checked>${o.payment}</a></li>
                            </c:forEach>
                        </ul>
                    </div>
                             <button type="button" class="btn btn-danger">Thanh toán</button>
                            <!--</form>-->
                        </div>
                    </div>
                </div>
                
            </div>
        </div>
    </body>
    
</html>
