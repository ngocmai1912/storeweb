<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <style><%@include file="css/Home.css"%></style>
    </head>
    <body>
<jsp:include page="Navigation.jsp"></jsp:include>
        <div class="container mt-5">
            <div class="row">
                <div class="col-lg-3">
                    <section class="hero">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>Danh Mục</span>
                            </div>
                            <ul class="wrap-category">
                                <li><a href="#">Sách</a></li>
                                <li>
                                    <a class="sub-btn" href="#">Quần Áo</a>
                                    <ul class="sub-menu">
                                        <li class="menu-item"><a href="#">Trẻ Em</a></li>
                                        <li class="menu-item"><a href="#">Nam</a></li>
                                        <li class="menu-item"><a href="#">Nữ</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <a class="sub-btn" href="#">Đồ Điện Tử</a>
                                    <ul class="sub-menu">
                                        <li class="menu-item"><a href="#">Điện Thoại</a></li>
                                        <li class="menu-item"><a href="#">Laptop</a></li>
                                    </ul>
                                </li>
                                <li>
                                    <a class="sub-btn" href="#">Giày</a>
                                    <ul class="sub-menu">
                                        <li class="menu-item"><a href="#">Trẻ Em</a></li>
                                        <li class="menu-item"><a href="#">Nam</a></li>
                                        <li class="menu-item"><a href="#">Nữ</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </section>
                </div>

                <div class="col-lg-9">
                    <div class="row">
                        <c:forEach items="${listBook}" var="o">                        
                            <div class="col-4 mb-5">
                                <div class="card">
                                    <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                    <div class="card-body">
                                      <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"book"}" title="View Product">${o.book.title}</a></h5>
                                      <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.price} $</p>
                                        </div>
                                        <div class="col">
                                            <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                      </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                        <c:forEach items="${listClothes}" var="o">
                            <div class="col-4 mb-5">
                                <div class="card">
                                    <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                    <div class="card-body">
                                      <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"clothes"}" title="View Product">${o.clothes.name}</a></h5>
                                      <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.price} $</p>
                                        </div>
                                        <div class="col">
                                            <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                      </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                        <c:forEach items="${listElectronic}" var="o">
                            <div class="col-4 mb-5">
                                <div class="card">
                                    <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                    <div class="card-body">
                                      <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"electronic"}" title="View Product">${o.electronic.name}</a></h5>
                                      <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.price} $</p>
                                        </div>
                                        <div class="col">
                                            <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                      </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                        <c:forEach items="${listShoes}" var="o">
                            <div class="col-4 mb-5">
                                <div class="card">
                                    <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                    <div class="card-body">
                                      <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"electronic"}" title="View Product">${o.shoes.name}</a></h5>
                                      <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${o.price} $</p>
                                        </div>
                                        <div class="col">
                                            <a href="#" class="btn btn-success btn-block">Add to cart</a>
                                        </div>
                                      </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include> 
        
        <script type="text/javascript">
            $(document).ready(function(){
               $('.sub-btn').click(function(){
                  $(this).next('.sub-menu').slideToggle(); 
               }); 
            });
        </script>
    </body>
</html>

