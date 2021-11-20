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
    <!------ Include the above in your HEAD tag ---------->
 </head>   
    <body>
<div id="contact" class="container-fluid bg-grey">
    <h2 class="jumbotron text-center">CheckOut</h2>
    <div class="row">
      <div class="col-sm-8 ">
             <p>Địa chỉ*</p>
            <input class="form-control" id="name" name="name" placeholder="Số nhà, ngõ..." type="text" required>
            <br><input class="form-control" id="name" name="name" placeholder="Toà nhà, số phòng(chung cư...)" type="text" required>
            <p>Tỉnh, thành phố*</p>
            <input class="form-control"name="tỉnh, thành phố" type="tỉnh" required>
            <p>Quận, huyện*</p>
            <input class="form-control"  name="tỉnh, thành phố" type="tỉnh" required>
            <p>Phường, xã*</p>
            <input class="form-control" name="tỉnh, thành phố" type="tỉnh" required>
            <div class="row">
                <div class="col-sm-6">
                    <p>SĐT*</p>
                    <input name="Email" type="tỉnh" >
                </div>
                <div class="col-sm-6">
                    <p>Email*</p>
                    <input name="email" placeholder="Email"  type="email" >
                </div>
            </div>
      </div>
      <div class="col-sm-3 jumbotron">
        <h3 class=" text-center">Đơn Của Bạn</h3>              
                        <!-- <div class="container">
                            <div id="login-row" class="row justify-content-center align-items-center">
                                <div id="login-column" class="col-md-6">
                                    <div id="login-box" class="col-md-12">
                                        <form id="login-form" class="form" action="" method="post">
                                        
                                            <button type="submit"class="btn btn-info btn-md"><a class="text-white text-uppercase" href="back.html">Back</a></button>
                                            <button type="submit"class="btn btn-info btn-md pull-right"><a class="text-white text-uppercase" href="index.html">Usename</a></button>
                                         <button type="submit"s="btn btn-info btn-md"><a class="right" href="index.html">usename</a></button>-->
            <!-- <br><br><br> --> 
           <p>Đơn vị vận chuyển</p> 
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
          <li class=" d-flex justify-content-between">
            <h6 class="my-0">Tổng tiền hàng</h6>
          <span class="text-muted">25.000</span>
        </li>
            <li class=" d-flex justify-content-between">
                  <h6 class="my-0">Phí vận chuyển</h6>
                <span class="text-muted">25.000</span>
              </li>
              <li class=" d-flex justify-content-between lh-condensed">
              <h6 class="my-1 text-info">Tổng tiền</h6>
             <!-- <script language="JavaScript"> 
              let a = 20;
              let b = 30;
              
              // Tính tổng
              let tong = a + b;
              
              document.write("Tổng hai số là: " + tong);
            </script> -->
              <span class="text-info">$12</span>
            </li>
            <div class="d-block my-3">
                <p>Hình thức thanh toán</p>
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
                                         <button type="button" class="btn btn-danger">Thanh toán</button>
       
      </div>
    </div>
  </div>
    </body>