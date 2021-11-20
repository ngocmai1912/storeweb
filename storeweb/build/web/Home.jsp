<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">        
<style><%@include file="css/Home.css"%></style>
    </head>
    <body>
        <jsp:include page="Navigation.jsp"></jsp:include>
        <div class="mx-4 mt-5">
            <div class="row">
                <div class="col-lg-3">
                    <section class="hero">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>Danh Mục</span>
                            </div>
                            <ul class="wrap-category">
                                <li><a href="#" id="book">Sách</a></li>
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
                            <div class="col-4 mb-5" id="book-block">
                                <div class="card">
                                    <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                    <div class="card-body">
                                      <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"book"}" title="View Product">${o.book.title}</a></h5>
                                      <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${Math.round(o.price)}VNĐ</p>
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
                                            <p class="btn btn-danger btn-block">${Math.round(o.price)}VNĐ</p>
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
                                            <p class="btn btn-danger btn-block">${Math.round(o.price)}VNĐ</p>
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
                                      <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"shoes"}" title="View Product">${o.shoes.name}</a></h5>
                                      <div class="row">
                                        <div class="col">
                                            <p class="btn btn-danger btn-block">${Math.round(o.price)}VNĐ</p>
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
  
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
               $('.sub-btn').click(function(){
                  $(this).next('.sub-menu').slideToggle(); 
               }); 
            });
            
            
        </script>
    </body>
</html>

