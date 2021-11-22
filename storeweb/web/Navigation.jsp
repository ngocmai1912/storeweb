<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-md navbar-dark" style="background-color: #000000">
    <div class="container">
        <a class="navbar-brand" href="home">THE ROSÉ</a>
        <form class="form-inline" action="search" method="get">
            <input type="text" placeholder="Nhập từ khóa..." class="form-control mt-3" name="txtS" style="width: 600px">
            <button class="btn btn-outline-danger ml-2 mt-3" type="submit">Tìm kiếm</button>
        </form>
        <div class="d-inline-flex">
            <form action="cart" method="get" class="form-inline my-2 my-lg-0">
            <a class="btn btn-danger btn-sm mr-3" href="cart">
                <i class="fa fa-shopping-cart"></i> Giỏ hàng
            </a>
        </form>
        
        <c:if test="${sessionScope.acc == null}">
            <a href="login" class="btn btn-outline-danger" role="button" aria-disabled="true">ĐĂNG NHẬP</a>
        </c:if>
            
        <c:if test="${sessionScope.acc != null}">
            <div class="btn-group">
                <button type="button" class="btn btn-outline-secondary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                  Xin chào ${sessionScope.acc.username}
                </button>
                <div class="dropdown-menu">
                  <a class="dropdown-item" href="logout">Đăng xuất</a>
                </div>
              </div>
        </c:if>
        </div>
    </div>
</nav>

<hr style="border: 2px solid red; margin: 0px">       
