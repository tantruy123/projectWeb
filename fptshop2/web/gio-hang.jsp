<%-- 
    Document   : apple
    Created on : Sep 29, 2016, 10:19:53 PM
    Author     : tan
--%>

<%@page import="com.entity.Customer"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apple - Iphone </title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" href="css/giohang.css">
        <link rel="stylesheet" href="css/footer.css">
        <script src="js/jquery-3.1.0.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
        <link rel="stylesheet" href="css/apple.css">

    </head>
    <body ng-app="" >
        <%@ page isErrorPage="true" %>  
        <%@include file="header.jsp" %>
        <div style="background-color: #eee;">
            <div class="container">
                <%!
                    double price = 599900;
                    String name = "";
                    String phone = "", email = "";
                    String country = "", glosbe = "", date = "";
                    boolean isDisplay = false;
                %>
                <%
                    out.println(request.getParameter("id"));
                %>

                <form action="giohang" method="post">

                    <div class="content" id="content" style="margin-top: 100px;background: #fff;height: 1000px;    padding-top: 50px;">

                        <h2 class="ck-tit-prod">1.Các sản phẩm đặt mua</h2>
                        <div class="check-out-1">
                            <div class="check-out-img">

                            </div>
                            <div class="check-out-detail">
                                <p class="ck-s1-tit" id="productname">OPPO F1s</p>
                                <p class="ck-s1-price">
                                    5.990.000<sup>đ</sup>
                                </p>
                                <p>
                                <p class="ck-s1-tit" id="productname" name="quantity">Số Lượng</p>

                                <select class="form-control quantity-product" ng-model="myVar" name="quantity">
                                    <option value="1" ng-selected="">Số lượng: 01</option>
                                    <option value="2">Số lượng: 02</option>
                                    <option value="3">Số lượng: 03</option>
                                    <option value="4">Số lượng: 04</option>
                                    <option value="5">Số lượng: 05</option>
                                </select>


                            </div>
                        </div>



                        <div class="check-out-2">
                            <div ng-switch="myVar">
                                <div ng-switch-when="1">

                                    <h2> Tổng đơn hàng: <fmt:formatNumber type="number"  maxFractionDigits="3" value="<%=price%>" /></h2>

                                </div>
                                <div ng-switch-when="2">

                                    <h2> Tổng đơn hàng: <fmt:formatNumber type="number"  maxFractionDigits="3" value="<%=(price * 2)%>" /></h2>


                                </div>
                                <div ng-switch-when="3">

                                    <h2> Tổng đơn hàng: <fmt:formatNumber type="number"  maxFractionDigits="3" value="<%=(price * 3)%>" /></h2>

                                </div>
                                <div ng-switch-when="4">

                                    <h2>Tổng đơn hàng:  <fmt:formatNumber type="number"  maxFractionDigits="3" value="<%=(price * 4)%>" /></h2>

                                </div>
                                <div ng-switch-when="5">

                                    <h2>Tổng đơn hàng:  <fmt:formatNumber type="number"  maxFractionDigits="3" value="<%=(price * 5)%>" /></h2>

                                </div>

                            </div>

                        </div>

                        <%
                            if (request.getParameter("btnBuy") != null) {
                                String q = request.getParameter("quantity");
                                if (q.equalsIgnoreCase("1")) {
                                    price = price * 1;
                                } else if (q.equalsIgnoreCase("2")) {
                                    price = price * 2;
                                } else if (q.equalsIgnoreCase("3")) {
                                    price = price * 3;
                                } else if (q.equalsIgnoreCase("4")) {
                                    price = price * 4;
                                } else if (q.equalsIgnoreCase("5")) {
                                    price = price * 5;
                                }
                                name = request.getParameter("CustomerName");
                                phone = request.getParameter("CustomerPhone");
                                email = request.getParameter("CustomerEmail");

                                if (name == null) {
                                    name = "";
                                }
                                if (phone == null) {
                                    phone = "";
                                }

                                if (email == null) {
                                    email = "";
                                }

                                country = request.getParameter("txtCountry");
                                glosbe = request.getParameter("txtGlosbe");
                                date = request.getParameter("txtDate");
                                if (country == null) {
                                    country = "";
                                }
                                if (glosbe == null) {
                                    glosbe = "";
                                }

                                if (date == null) {
                                    date = "";
                                }
                                Customer c = new Customer(name, phone, email, country, glosbe, date);
                                isDisplay = true;

                        %>
                        <script>
                            $('#content').css("display", "none");
                            $('#content2').css("display", "block");
                        </script>
                        <%                                    }

                        %>


                        <div class="check-out-3" style="margin-top: 50px;display: ">
                            <h2 class="ck-tit-prod">2.Thông tin khách hàng</h2>
                            <p class="ck-s2-ibb">Bạn vui lòng nhập thông tin cá nhân của bạn (những ô có dấu * là những ô bắt buộc)</p>
                            <div id="customer-info" novalidate="novalidate" class="customer-info">
                                <ul class="ck-s2-iul clearfix" id="ck-ifkh" style="margin-left: 40px;margin-top: 40px;">
                                    <li style="width: 300px;">
                                        <div class="ck-s2-form ck-s2-frm">
                                            <input type="text" id="CustomerName" name="CustomerName" class="form-control valid" placeholder="Họ và tên" aria-required="true" aria-invalid="false"  value="<%=name%>">

                                        </div>
                                        <%
                                            if (name.equalsIgnoreCase("")) {
                                        %>
                                        <label id="name-error" class="error" for="name">Bạn cần nhập đầy đủ họ tên</label>
                                        <%
                                            }
                                        %>

                                    </li>
                                    <li>
                                        <div class="ck-s2-form ck-s2-frm">
                                            <input type="text" id="CustomerPhone" name="CustomerPhone" class="form-control" placeholder="Số điện thoại"  onkeypress='validate(event)' value="<%=phone%>">
                                        </div>
                                        <script>function validate(evt) {
                                                var theEvent = evt || window.event;
                                                var key = theEvent.keyCode || theEvent.which;
                                                key = String.fromCharCode(key);
                                                var regex = /[0-9]|\./;
                                                if (!regex.test(key)) {
                                                    theEvent.returnValue = false;
                                                    if (theEvent.preventDefault)
                                                        theEvent.preventDefault();
                                                }
                                            }
                                        </script>
                                        <%
                                            if (phone.equalsIgnoreCase("") || phone.length() < 9) {
                                        %>
                                        <label id="name-error" class="error" for="name">Bạn cần nhập đúng số điện thoại</label>
                                        <%
                                            }
                                        %>
                                    </li>
                                    <li>
                                        <div class="ck-s2-form">
                                            <input type="email" id="CustomerEmail" name="CustomerEmail" class="form-control valid" placeholder="Email để theo dõi tiến độ đơn hàng" aria-invalid="false"  value="<%=email%>">
                                        </div>
                                    </li>
                                </ul>
                            </div>
                        </div>
                        <div class="check-out-3" style="margin-top: 50px;">
                            <h2 class="ck-tit-prod">3.Thông tin giao hàng</h2>
                            <p class="ck-s2-ibb">Nhập thông tin giao hàng sẽ giúp bạn nhận được sản phẩm nhanh hơn</p>
                            <ul class="ck-s3-tinh" style="  margin-left: 50px;margin-top: 50px;">
                                <li style="width: 220px;">
                                    <select class="form-control ck-s2-form1 selectpicker valid" id="country" name="txtCountry" >
                                        <option value="">Chọn Tỉnh/Thành phố</option>
                                        <option value="26">Hà Nội</option>
                                        <option value="23">Hồ Chí Minh</option>
                                        <option value="17">Đà Nẵng</option>
                                        <option value="28">Hải Phòng</option>
                                        <option value="1">An Giang</option>
                                        <option value="4">Bắc Giang</option>
                                        <option value="5">Bắc Kạn</option>
                                        <option value="6">Bạc Liêu</option>
                                        <option value="7">Bắc Ninh</option>
                                        <option value="10">Bến Tre</option>
                                        <option value="3">Bình Định</option>
                                        <option value="2">Bình Dương</option>
                                        <option value="8">Bình Phước</option>
                                        <option value="11">Bình Thuận</option>
                                        <option value="13">Cà Mau</option>
                                        <option value="14">Cần Thơ</option>
                                        <option value="12">Cao Bằng</option>
                                        <option value="16">Đak Lak</option>
                                        <option value="19">Đak Nông</option>
                                        <option value="15">Điện Biên</option>
                                        <option value="18">Đồng Nai</option>
                                        <option value="20">Đồng Tháp</option>
                                        <option value="21">Gia Lai</option>
                                        <option value="25">Hà Giang</option>
                                        <option value="27">Hà Nam</option>
                                        <option value="29">Hà Tĩnh</option>
                                        <option value="24">Hải Dương</option>
                                        <option value="32">Hậu Giang</option>
                                        <option value="22">Hòa Bình</option>
                                        <option value="31">Huế</option>
                                        <option value="33">Hưng Yên</option>
                                        <option value="35">Khánh Hòa</option>
                                        <option value="34">Kiên Giang</option>
                                        <option value="36">Kon Tum</option>
                                        <option value="39">Lai châu</option>
                                        <option value="40">Lâm Đồng</option>
                                        <option value="41">Lạng Sơn</option>
                                        <option value="38">Lào Cai</option>
                                        <option value="37">Long An</option>
                                        <option value="44">Nam Định</option>
                                        <option value="42">Nghệ An</option>
                                        <option value="43">Ninh Bình</option>
                                        <option value="45">Ninh Thuận</option>
                                        <option value="46">Phú Thọ</option>
                                        <option value="47">Phú Yên</option>
                                        <option value="48">Quảng Bình</option>
                                        <option value="51">Quảng Nam</option>
                                        <option value="50">Quảng Ngãi</option>
                                        <option value="49">Quảng Ninh</option>
                                        <option value="52">Quảng Trị</option>
                                        <option value="54">Sóc Trăng</option>
                                        <option value="53">Sơn La</option>
                                        <option value="58">Tây Ninh</option>
                                        <option value="55">Thái Bình</option>
                                        <option value="59">Thái Nguyên</option>
                                        <option value="57">Thanh Hóa</option>
                                        <option value="56">Tiền Giang</option>
                                        <option value="61">Trà Vinh</option>
                                        <option value="60">Tuyên Quang</option>
                                        <option value="62">Vĩnh Long</option>
                                        <option value="63">Vĩnh Phúc</option>
                                        <option value="9">Vũng Tàu</option>
                                        <option value="64">Yên Bái</option>
                                    </select>
                                </li>
                                <li>
                                    <select class="form-control ck-s2-form1 valid" name="DistrictIDShop" id="DistrictIDShop" name="txtGlosbe">
                                        <option value="">Chọn Quận/Huyện</option>
                                        <option value="274">Quận Ba Đình</option>
                                        <option value="275">Quận Hoàn Kiếm</option>
                                        <option value="276">Quận Tây Hồ</option>
                                        <option value="277">Quận Long Biên</option>
                                        <option value="278">Quận Cầu Giấy</option>
                                        <option value="279">Quận Đống Đa</option>
                                        <option value="280">Quận Hai Bà Trưng</option>
                                        <option value="281">Quận Hoàng Mai</option>
                                        <option value="282">Quận Thanh Xuân</option>
                                        <option value="283">Huyện Sóc Sơn</option>
                                        <option value="284">Huyện Đông Anh</option>
                                        <option value="285">Huyện Gia Lâm</option>
                                        <option value="286">Huyện Từ Liêm</option>
                                        <option value="287">Huyện Thanh Trì</option>
                                        <option value="288">Huyện Ba Vì</option>
                                        <option value="289">Huyện Chương Mỹ</option>
                                        <option value="290">Huyện Đan Phượng</option>
                                        <option value="291">Huyện Hoài Đức</option>
                                        <option value="292">Huyện Mê Linh</option>
                                        <option value="293">Huyện Mỹ Đức</option>
                                        <option value="294">Huyện Phú Xuyên</option>
                                        <option value="295">Huyện Phúc Thọ</option>
                                        <option value="296">Huyện Quốc Oai</option>
                                        <option value="297">Huyện Thạch Thất</option>
                                        <option value="298">Huyện Thanh Oai</option>
                                        <option value="299">Huyện Thường Tín</option>
                                        <option value="300">Huyện ứng Hòa</option>
                                        <option value="301">Quận Hà Đông</option>
                                        <option value="302">Tx Sơn Tây</option>

                                    </select>
                                </li>

                                <li style="width: 280px;">
                                    <input type="date" name="Deliverydateshop" id="Deliverydateshop" class="form-control valid" placeholder="Thời gian giao hàng" aria-invalid="false" name="txtDate">
                                </li>
                            </ul>
                        </div>
                        <div class="check-out-3" style="margin-left: 150px;">
                            <ul class="ck-s3-btn">
                                <li style="    width: 250px;">                                   
                                    <button type="submit" id="btnAddOrder" class="btn btn-danger ck-s3-btntt" name="btnBuy">
                                        <p>MUA NGAY<span>(Giao tận nơi hoặc nhận ở cửa hàng)</span></p>
                                    </button>

                                </li>
                                <li>
                                    <button type="button" id="PaymentOnline" class="btn btn-success ck-s3-btntt" onclick="ga('send', 'event', 'Fullflow', 'PayOnline', 'Samsung Galaxy J7 Prime');">
                                        <p>Thanh Toán Online<span>(Hỗ trợ thanh toán ATM Visa Master)</span></p>
                                    </button>
                                </li>
                            </ul>
                        </div>



                    </div>
                </form>


                <div class="content" id="content2"  style="margin-top: 100px;background: #fff;height: 700px;padding-top: 50px;">


                    <div class="ck-tab2-s1">
                        <div class="ck-tab2-s1ok">
                            <p class="ck-tab2-s1i"><img src="images/icon-ok.png" alt=""></p>
                            <p>Đặt hàng thành công!</p>
                        </div>
                        <table class="table table-bordered ck-tab2-s1tb" style="width: 755px;height: 285px;margin-left: 100px">
                            <tbody>
                                <tr>
                                    <td>Sản phẩm</td>
                                    <td class="ck-tab2-titpr"><strong>OPPO F1s </strong></td>
                                </tr>
                                <tr>
                                    <td>Số lượng </td>
                                    <td>1</td>
                                </tr>
                                <tr>
                                    <td>Màu sắc</td>
                                    <td>
                                        Gold
                                    </td>
                                </tr>
                                <tr>
                                    <td>Giá</td>
                                    <td><p><strong>5.990.000đ</strong></p></td>
                                </tr>
                                <tr>
                                    <td>Khuyến mại bạn chọn</td>
                                    <td>
                                        <ul>

                                        </ul>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Phương thức nhận hàng:</td>
                                    <td>
                                        Nhận tại địa chỉ:  <strong>asd</strong>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Thời gian dự kiến:</td>
                                    <td><strong> Ngày 03-10-2016</strong></td>
                                </tr>
                                <tr>
                                    <td>Mã đơn hàng</td>
                                    <td><strong>3397376</strong></td>
                                </tr>
                            </tbody>
                        </table>
                        <p class="ck-tab2-s1tha">Cám ơn bạn đã mua sắm tại FPTSHOP. Hy vọng bạn hài lòng với những sản phẩm đã mua.</p>
                        <div class="ck-tab2-btn clearfix" style="    margin-left:350px;">
                            <a href="<%=request.getContextPath()%>/trangchu" class="ck-tab2-btnrep">quay lại trang chủ</a>
                        </div>
                    </div>
                </div>


                <div class="check-out-footer">
                    Gọi ngay <span>1800 6601</span> để được tư vấn miễn phí
                </div>


            </div>
        </div>


        <%
            if (!isDisplay) {
        %>
        <script>
            $('#content2').css("display", "none");

        </script>
        <%
            }
        %>


    </div>
</div>

<%@include file="back-to-top.jsp" %>
<%@include file="footer.jsp" %>
</body>
</html>
