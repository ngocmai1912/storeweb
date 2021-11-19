<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-md navbar-dark" style="background-color: #000000">
    <div class="container">
        <a class="navbar-brand" href="home">THE ROSÉ</a>
        <form class="form-inline mt-2" action="search" method="get">
            <input type="text" placeholder="Search..." class="form-control" name="txtS" >
            <button class="btn btn-outline-danger ml-2" type="submit">Search</button>
        </form>
        <form action="search" method="post" class="form-inline my-2 my-lg-0">
            <a class="btn btn-danger btn-sm ml-3" href="Cart.jsp">
                <i class="fa fa-shopping-cart"></i> Cart
                <span class="badge badge-light">3</span>
            </a>
        </form>
    </div>
</nav>

<hr style="border: 2px solid red; margin: 0px">

<nav class="navbar navbar-expand-lg navbar-light bg-white">
    <div class="container">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                    <c:if test="${sessionScope.acc.isAdmin == 1}">
                        <li class="nav-item mx-3">
                            <a class="nav-link" style="color:black" href="#">TÀI KHOẢN</a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.acc.isSell == 1}">
                        <li class="nav-item mx-3">
                            <a class="nav-link" style="color:black" href="manager">Manager Product</a>
                        </li>
                    </c:if>
                    <c:if test="${sessionScope.acc != null}">
                        <li class="nav-item mx-3">
                            <a class="nav-link" style="color:black" href="#">XIN CHÀO ${sessionScope.acc.user}</a>
                        </li> 
                    </c:if>
                    <c:if test="${sessionScope.acc != null}">
                        <li class="nav-item mx-3">
                            <a class="nav-link" style="color:black" href="logout">ĐĂNG XUẤT</a>
                        </li> 
                    </c:if>
                    <c:if test="${sessionScope.acc == null}">
                        <li class="nav-item mx-3">
                            <a class="nav-link" style="color:black" href="Login.jsp">ĐĂNG NHẬP</a>
                        </li>
                    </c:if>
                </ul>
          </div>
    </div>
</nav>
                
<hr class="mt-0">              

<!--<section class="jumbotron text-center">
    <div class="container">
        <h1 class="jumbotron-heading">Cửa hàng chất lượng cao</h1>
        <p class="lead text-muted mb-0">Uy tín tạo nên thương hiệu với hơn 10 năm cung cấp các sản phầm Việt Nam chất lượng cao</p>
    </div>
</section>-->
