<%-- 
    Document   : ItemDetail
    Created on : Nov 12, 2021, 10:05:10 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <style><%@include file="css/CheckOut.css"%></style>
    <!------ Include the above in your HEAD tag ---------->
 </head>   
    <body>
  <jsp:include page="Navigation.jsp"></jsp:include>
<div id="contact" class="container-fluid bg-grey">
    <h2 class="jumbotron text-center text-white back">CheckOut</h2>
    <div class="row">
      <div class="col-sm-7 "><br>
          <form action="cart" method="post">
          <h3 class="text-muted"> Địa chỉ nhận hàng</h3><br>
             <p>Địa chỉ*</p><br>
            <input class="form-control" id="name" name="name" placeholder="Số nhà, ngõ..." type="text" required>
            <br><input class="form-control" id="name" name="name" placeholder="Toà nhà, số phòng(chung cư...)" type="text" required><br>
            <p>Tỉnh, thành phố*</p><br>
            <input class="form-control"name="tỉnh, thành phố" type="tỉnh" required><br>
            <p>Quận, huyện*</p><br>
            <input class="form-control"  name="tỉnh, thành phố" type="tỉnh" required><br>
            <p>Phường, xã*</p><br>
            <input class="form-control" name="tỉnh, thành phố" type="tỉnh" required><br>
            <div class="row">
                <div class="col-sm-6">
                    <p>SĐT*</p><br>
                    <input name="Email" type="tỉnh" ><br>
                </div>
                <div class="col-sm-6">
                    <p>Email*</p><br>
                    <input name="email" placeholder="Email"  type="email" ><br>
                </div>
            </div>
            </form>
      </div>
           <div class="col-sm-5 jumbotron front">
               <h3 class=" text-center">Đơn Của Bạn</h3>
       
        <div class="shopping-cart">
            <div class="px-4 px-lg-0">

   
                                    <ul class="list-unstyled mb-4">
                                        
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng tiền hàng</strong><strong>${total} ₫</strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Phí vận chuyển</strong><strong>25.000 ₫</strong></li>
                                        <li class="d-flex justify-content-between py-3 border-bottom"><strong class="text-muted">Tổng thanh toán</strong>
                                            <h5 class="font-weight-bold">${total+25000} ₫</h5>
                                        </li>
                                    </ul>
                                                
            <p>Đơn vị vận chuyển</p> 
            <p class="text-warning"> [Bạn có thể theo dõi đơn hàng khi chọn một trong các đơn vị vận chuyển]</p>
           <div class="d-block my-3">
            <div class="custom-control custom-radio ">
              <input id="credt" name="payment" type="radio" class="custom-control-input" checked required>
              <label class="custom-control-label" for="credt">Economaical</label>
              <!-- <span class="text-muted">25.000</span> -->
            </div>
            <div class="custom-control custom-radio">
              <input id="debt" name="payment" type="radio" class="custom-control-input" required>
              <label class="custom-control-label" for="debt">Express   </label>
              <!-- <span class="text-muted">   30.000</span> -->
            </div>
          </div>                            
            <div class="d-block my-3">
                <p>Hình thức thanh toán</p>
                <p class="text-warning">[Khuyến khích thanh toán trả trước và hạn chế tiếp xúc gần để phòng dịch Covid-19]</p>
                <div class="custom-control custom-radio">
                  <input id="credit" name="paymentMethod" type="radio" class="custom-control-input" checked required>
                  <label class="custom-control-label" for="credit">Credit</label>
                </div>
                <div class="custom-control custom-radio">
                  <input id="debit" name="paymentMethod" type="radio" class="custom-control-input" required>
                  <label class="custom-control-label" for="debit">Cash</label>
                </div>
                <div class="custom-control custom-radio">
                  <input id="paypal" name="paymentMethod" type="radio" class="custom-control-input" required>
                  <label class="custom-control-label" for="paypal">Check</label>
                </div>
              </div>
                   <a href="order" class="btn btn-danger rounded-pill py-2 btn-block">Thanh Toán</a>                    
       
      </div>
    </div>
  </div>
    </body>