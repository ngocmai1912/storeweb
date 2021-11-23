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
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
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
                            <div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
                                <a class="nav-link nav-effect active" id="all-tab" data-toggle="pill" href="#all" role="tab" aria-controls="all" aria-selected="true">Tất cả</a>
                                <a class="nav-link nav-effect" id="book-tab" data-toggle="pill" href="#v-pills-book" role="tab" aria-controls="v-pills-book" aria-selected="false">Sách</a>
                                <a class="nav-link nav-effect" id="clothes-tab" data-toggle="pill" href="#v-pills-clothes" role="tab" aria-controls="v-pills-clothes" aria-selected="false">Quần Áo</a>
                                <a class="nav-link nav-effect" id="electronic-tab" data-toggle="pill" href="#v-pills-electronic" role="tab" aria-controls="v-pills-electronic" aria-selected="false">Đồ Điện Tử</a>
                                <a class="nav-link nav-effect" id="shoes-tab" data-toggle="pill" href="#v-pills-shoes" role="tab" aria-controls="v-pills-shoes" aria-selected="false">Giày</a>
                            </div>
                        </div>
                    </section>
                </div>

                <div class="col-lg-9">
                   <div class="tab-content" id="v-pills-tabContent">
                        <div class="tab-pane fade show active" id="all" role="tabpanel" aria-labelledby="all-tab">
                            <div class="row">
                                <c:forEach items="${listBook}" var="o">                        
                                    <div class="col-4 mb-5" id="book-block">
                                        <div class="card">
                                            <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                            <div class="card-body">
                                              <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"book"}" title="View Product">${o.book.title}</a></h5>
                                              <div class="row">
                                                <div class="col">
                                                    <p class="text-warning font-weight-bold text-price">${Math.round(o.price)} VNĐ</p>
                                                </div>
                                                <div class="col">
                                                     <a href="detail?pid=${o.id}&type=${"book"}" title="View Product" class="btn btn-outline-danger btn-block">CHI TIẾT SẢN PHẨM</a>
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
                                                    <p class="text-warning font-weight-bold text-price">${Math.round(o.price)} VNĐ</p>
                                                </div>
                                                <div class="col">
                                                    <a href="detail?pid=${o.id}&type=${"clothes"}" title="View Product" class="btn btn-outline-danger btn-block">CHI TIẾT SẢN PHẨM</a>
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
                                                    <p class="text-warning font-weight-bold text-price">${Math.round(o.price)} VNĐ</p>
                                                </div>
                                                <div class="col">
                                                   <a href="detail?pid=${o.id}&type=${"electronic"}" title="View Product" class="btn btn-outline-danger btn-block">CHI TIẾT SẢN PHẨM</a>
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
                                                    <p class="text-warning font-weight-bold text-price">${Math.round(o.price)} VNĐ</p>
                                                </div>
                                                <div class="col">
                                                    <a href="detail?pid=${o.id}&type=${"shoes"}" title="View Product" class="btn btn-outline-danger btn-block">CHI TIẾT SẢN PHẨM</a>
                                                </div>
                                              </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                       
                        <div class="tab-pane fade" id="v-pills-book" role="tabpanel" aria-labelledby="book-tab">
                            <div class="row">
                                <c:forEach items="${listBook}" var="o">                        
                                    <div class="col-4 mb-5" id="book-block">
                                        <div class="card">
                                            <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                            <div class="card-body">
                                              <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"book"}" title="View Product">${o.book.title}</a></h5>
                                              <div class="row">
                                                <div class="col">
                                                    <p class="text-warning font-weight-bold text-price">${Math.round(o.price)} VNĐ</p>
                                                </div>
                                                <div class="col">
                                                    <a href="detail?pid=${o.id}&type=${"book"}" title="View Product" class="btn btn-outline-danger btn-block">CHI TIẾT SẢN PHẨM</a>
                                                </div>
                                              </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                        </div>
                       <div class="tab-pane fade" id="v-pills-clothes" role="tabpanel" aria-labelledby="clothes-tab">
                           <div class="row">
                                <c:forEach items="${listClothes}" var="o">
                                    <div class="col-4 mb-5">
                                        <div class="card">
                                            <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                            <div class="card-body">
                                              <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"clothes"}" title="View Product">${o.clothes.name}</a></h5>
                                              <div class="row">
                                                <div class="col">
                                                    <p class="text-warning font-weight-bold text-price">${Math.round(o.price)} VNĐ</p>
                                                </div>
                                                <div class="col">
                                                    <a href="detail?pid=${o.id}&type=${"book"}" title="View Product" class="btn btn-outline-danger btn-block">CHI TIẾT SẢN PHẨM</a>
                                                </div>
                                              </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                       </div>
                       
                       <div class="tab-pane fade" id="v-pills-electronic" role="tabpanel" aria-labelledby="electronic-tab">
                           <div class="row">
                                <c:forEach items="${listElectronic}" var="o">
                                    <div class="col-4 mb-5">
                                        <div class="card">
                                            <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                            <div class="card-body">
                                              <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"electronic"}" title="View Product">${o.electronic.name}</a></h5>
                                              <div class="row">
                                                <div class="col">
                                                    <p class="text-warning font-weight-bold text-price">${Math.round(o.price)} VNĐ</p>
                                                </div>
                                                <div class="col">
                                                    <a href="detail?pid=${o.id}&type=${"book"}" title="View Product" class="btn btn-outline-danger btn-block">CHI TIẾT SẢN PHẨM</a>
                                                </div>
                                              </div>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                            </div>
                       </div>
                       
                       <div class="tab-pane fade" id="v-pills-shoes" role="tabpanel" aria-labelledby="shoes-tab">
                           <div class="row">
                                <c:forEach items="${listShoes}" var="o">
                                    <div class="col-4 mb-5">
                                        <div class="card">
                                            <img class="card-img-top img-fluid rounded product-img" src="${o.photo}" alt="photo">
                                            <div class="card-body">
                                              <h5 class="card-title"><a href="detail?pid=${o.id}&type=${"shoes"}" title="View Product">${o.shoes.name}</a></h5>
                                              <div class="row">
                                                <div class="col">
                                                    <p class="text-warning font-weight-bold text-price">${Math.round(o.price)} VNĐ</p>
                                                </div>
                                                <div class="col">
                                                    <a href="detail?pid=${o.id}&type=${"book"}" title="View Product" class="btn btn-outline-danger btn-block">CHI TIẾT SẢN PHẨM</a>
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

            </div>
        </div>
        <jsp:include page="Footer.jsp"></jsp:include>
  
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        
    </body>
</html>

