<%-- 
    Document   : ItemDetail
    Created on : Nov 12, 2021, 10:05:10 PM
    Author     : DELL
--%>

<%@page import="utils.CartUtils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">        
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
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
                                            <div> <a href="#"><img src="${detail.photo}"></a></div>
                                        </div> <!-- slider-product.// -->
                                        <div class="img-small-wrap">
                                        </div> <!-- slider-nav.// -->
                                    </article> <!-- gallery-wrap .end// -->
                                </aside>
                                <aside class="col-sm-7">
                                    <article class="card-body p-5">
                                        <h3 class="title mb-3">${detail.clothes.name}</h3>

                                        <p class="price-detail-wrap"> 
                                            <span class="price h3 text-warning"> 
                                                <span class="num">${Math.round(detail.price)}</span>
                                                <span class="currency">VNĐ</span>
                                            </span> 
                                        </p> <!-- price-detail-wrap .// -->
                                        <p> 
                                            <span class="text-primary font-weight-bold"> 
                                                <span>Khuyến mãi: </span>
                                                <span>${Math.round(detail.discount*100)}</span>
                                                <span>%</span>
                                            </span> 
                                        </p>
                                        
                                        <dl class="item-property">
                                            <p>
                                               <span class="font-weight-bold">Màu sắc: </span>
                                                <span class="">${detail.clothes.color}</span> 
                                            </p>
                                            
                                            <p>
                                                <span class="font-weight-bold">Thương hiệu: </span>
                                                <span class="">${detail.clothes.brandClothes.name}</span> 
                                            </p>
                                            
                                            <dt>Mô tả</dt>
                                            <dd><p>${detail.description}</p></dd>
                                        </dl>

                                        <hr>

                                        <a href="cart?id=${detail.id}" class="btn btn-md btn-success text-uppercase">Mua ngay
                                            <% 
                                               int id1 = Integer.parseInt(request.getParameter("pid"));
                                               CartUtils.addClothesToCart(id1); 
                                            %>
                                        </a>
                                        <a href="#" class="btn btn-md btn-outline-danger text-uppercase" data-toggle="modal" data-target="#exampleModalCenter"> Thêm vào giỏ hàng 
                                            <% 
                                               int id = Integer.parseInt(request.getParameter("pid"));
                                               CartUtils.addClothesToCart(id); 
                                            %>
                                        </a>
                                    </article> <!-- card-body.// -->
                                </aside> <!-- col.// -->
                            </div> <!-- row.// -->
                        </div> <!-- card.// -->


                    </div>
                </div>
            </div>
            <!-- Modal -->
            <div class="modal fade" id="exampleModalCenter" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
              <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">
                  <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLongTitle">THÔNG BÁO</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                  </div>
                  <div class="modal-body">
                    Thêm sản phẩm vào giỏ hàng thành công!
                  </div>
                  <div class="modal-footer">
                    <button type="button" class="btn btn-danger" data-dismiss="modal">OK</button>
                  </div>
                </div>
              </div>
            </div>
        </div>
       <jsp:include page="Footer.jsp"></jsp:include>
    </body>
</html>
