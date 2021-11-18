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
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="css/Home.css" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="Navigation.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                    <div class="col">
                        <nav aria-label="breadcrumb">
                            <ol class="breadcrumb">
                                <li class="breadcrumb-item"><a href="Home.jsp">Home</a></li>
                            </ol>
                        </nav>
                    </div>
                </div>
            </div>
            <div class="container">
                <section class="hero">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-3">
                                <div class="hero__categories">
                                    <div class="hero__categories__all">
                                        <i class="fa fa-bars"></i>
                                        <span>All departments</span>
                                    </div>
                                    <ul>
                                        <li><a href="#">Book</a></li>
                                        <li><a href="#">Clothes</a></li>
                                        <li><a href="#">Electronic</a></li>
                                        <li><a href="#">Shoes</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-9">
                                <div class="hero__item set-bg"><img src="image/banner.jpg"></div>
                            </div>
                        </div>
                    </div>
                </section>
                <div class="row">
                    <c:forEach items="${listBook}" var="o">                        
                        <div class="col-3 mx-3 my-5">
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
                        <div class="col-3 mx-3 my-5">
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
                        <div class="col-3 mx-3 my-5">
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
                        <div class="col-3 mx-3 my-5">
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
            

        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script>
                        function loadMore() {
                            var amount = document.getElementsByClassName("product").length;
                            $.ajax({
                                url: "/Project_banhang/load",
                                type: "get", //send it through get method
                                data: {
                                    exits: amount
                                },
                                success: function (data) {
                                    var row = document.getElementById("content");
                                    row.innerHTML += data;
                                },
                                error: function (xhr) {
                                    //Do Something to handle error
                                }
                            });
                        }
                        function searchByName(param){
                            var txtSearch = param.value;
                            $.ajax({
                                url: "/Project_banhang/searchAjax",
                                type: "get", //send it through get method
                                data: {
                                    txt: txtSearch
                                },
                                success: function (data) {
                                    var row = document.getElementById("content");
                                    row.innerHTML = data;
                                },
                                error: function (xhr) {
                                    //Do Something to handle error
                                }
                            });
                        }
        </script>  
    </body>
</html>

