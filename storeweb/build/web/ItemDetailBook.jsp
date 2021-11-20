<%-- 
    Document   : ItemDetail
    Created on : Nov 12, 2021, 10:05:10 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <style><%@include file="css/ItemDetail.css"%></style>
    </head>
    <body>
        <jsp:include page="Navigation.jsp"></jsp:include>
            <div class="container">
                <div class="row">
                <%--<jsp:include page="Left.jsp"></jsp:include>--%>
                <div class="col-sm-9 py-3">
                    <div class="container">
                        <div class="card">
                            <div class="row">
                                <aside class="col-sm-5">
                                    <article class="gallery-wrap"> 
                                        <div class="img-big-wrap">
                                            <div> <a href="#"><img class="product-img" src="${detail.photo}"></a></div>
                                        </div> <!-- slider-product.// -->
                                        <div class="img-small-wrap">
                                        </div> <!-- slider-nav.// -->
                                    </article> <!-- gallery-wrap .end// -->
                                </aside>
                                <aside class="col-sm-7">
                                    <article class="card-body p-5">
                                        <h3 class="title mb-3">${detail.book.title}</h3>

                                        <p class="price-detail-wrap"> 
                                            <span class="price h3 text-warning"> 
                                                <span class="num">${Math.round(detail.price)}VNĐ</span>
                                            </span> 
                                        </p> <!-- price-detail-wrap .// -->
                                        <p> 
                                            <span class="text-primary font-weight-bold"> 
                                                <span>Khuyến mãi: </span>
                                                <span>${Math.round(detail.discount*100)}</span>
                                                <span>%</span>
                                            </span> 
                                        </p>
                                        
                                        <p> 
                                            <span class="font-weight-bold">Tác giả: </span>
                                            <span>${detail.book.author.name}</span>
                                        </p>
                                        
                                        <p> 
                                            <span class="font-weight-bold">NXB: </span>
                                            <span>${detail.book.publisher.name}</span>
                                        </p>
                                        
                                        <dl class="item-property">
                                            <dt>Mô tả</dt>
                                            <dd><p>
                                                    ${detail.description}
                                                </p></dd>
                                        </dl>

                                        <hr>
                                        <div class="row">
                                            <div class="col-sm-5">
                                                <dl class="param param-inline">
                                                    <dt>Số lượng: </dt>
                                                    <dd>
                                                        <select class="form-control form-control-sm" style="width:70px;">
                                                            <option> 1 </option>
                                                            <option> 2 </option>
                                                            <option> 3 </option>
                                                        </select>
                                                    </dd>
                                                </dl>  <!-- item-property .// -->
                                            </div> <!-- col.// -->

                                        </div> <!-- row.// -->
                                        <hr>
                                        <a href="cart?id=${detail.id}" class="btn btn-md btn-success text-uppercase">mua ngay</a>
                                        <a href="#" class="btn btn-md btn-outline-primary text-uppercase"> <i class="fas fa-shopping-cart"></i> Thêm vào giỏ hàng </a>
                                    </article> <!-- card-body.// -->
                                </aside> <!-- col.// -->
                            </div> <!-- row.// -->
                        </div> <!-- card.// -->


                    </div>
                </div>
            </div>
        </div>
       <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
