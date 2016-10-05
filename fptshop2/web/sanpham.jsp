<%-- 
    Document   : apple
    Created on : Sep 29, 2016, 10:19:53 PM
    Author     : tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Apple - Iphone </title>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/header.css">

        <link rel="stylesheet" href="css/footer.css">
        <script src="js/jquery-3.1.0.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="css/apple.css">
        <link rel="stylesheet" href="css/sanpham.css">

    </head>
    <body>
        <%@ page isErrorPage="true" %>  
        <%@include file="header.jsp" %>
        <div class="container" style="margin-top: 100px">
            <%
                String id = request.getParameter("id");
                out.println(request.getParameter("id"));
            %>
            <div class="detail-top-info clearfix">
                <div class="box-name">
                    <h1 class="detail-name">Sony Xperia XZ</h1> 
                    <span class="sp-detail-name">(No.00273663)</span> 
                    <div class="fpt_chinhhang_main"> <div class="To_tooltip"> 
                            <span class="To_tooltip_right"> FPT Shop là thương hiệu lâu năm phân phối sản phẩm công nghệ 
                                <strong>Chính Hãng</strong> uy tín hàng đầu Việt Nam. 
                                <br> Khác hẳn với các cửa hàng bán đồ nhỏ lẻ, không có thương hiệu, hàng xách tay, hàng trôi nổi ... không được đảm bảo hàng Chính Hãng, FPT Shop cam kết sản phẩm luôn <strong>chính gốc nhà sản xuất</strong> 
                                đi với giá thành hợp lý . <br> Đặc biệt khách hàng mua sản phẩm công nghệ tại FPT Shop còn có 1 đặc quyền là được tham gia chương trình
                                <a href="#" target="_blank">
                                    <strong>Bảo Hành Vàng</strong>
                                </a>
                                “Vào nước, rơi vỡ… vẫn đổi mới”, chỉ có tại FPT Shop và đặc biệt đang có chương trình ưu đãi giảm tới 50% phí bảo hành cực hấp dẫn <br> Hơn nữa, khách hàng sẽ được mua sản phẩm chính hãng với giá cực sốc khi tham gia các chương trình khuyến mãi như 
                                <a href="#" target="_blank" title="Khuyến mại tháng">
                                    <strong>Khuyến mại tháng</strong>
                                </a> 
                                hay 
                                <a href="#" target="_blank" title="Xả Hàng Máy Khủng"><strong>Xả Hàng Máy Khủng</strong></a> 
                                <br> 
                            </span>
                        </div> 
                    </div>
                    <script>
                        $(".fpt_chinhhang_main").mouseenter(function () {
                            $(".To_tooltip_right").css("display", "block");
                            $(".To_tooltip_right").css("position", "absolute");
                        });
                        $(".fpt_chinhhang_main").mouseleave(function () {
                            $(".To_tooltip_right").css("display", "none");

                        });
                    </script>
                </div>
            </div>
            <div class="detail-main-image left">
                <div class="clearfix">

                    <img id="default_image" style="display: block;" src="http://cdn.fptshop.com.vn/Uploads/Originals/2016/7/4/636032236925618261_3558G-chi-tiet.jpg" alt="Dell Ins N3558G">
                    <div id="slider-image">
                        <script type="text/javascript"> document.getElementById("default_image").style.display = "block";</script> 
                    </div>
                </div>
            </div>
            <div class="detail-main-info right">
                <div class="detail-order-promotion clearfix">
                    <div class="clearfix">
                        <div class="detail-price-status ">
                            <div class="detail-current-price" >
                                <strong>9.990.000<label>đ</label></strong> 
                            </div>  
                            <div class="detail-listkm">
                            </div>  
                        </div> 
                    </div> 
                    <div style="display : none;" class="fs-cdprods clearfix">Chỉ còn <span id="ordered">000</span>
                        khuyến mãi
                    </div> 
                    <div class="clearfix"></div> 
                    <div class="detail-promotion">
                        <div class="detail-promotion-box"> 
                            <p>
                                <a class="detail-order-now-t" title="Đặt online" >
                                    <strong>Đặt Online</strong>
                                </a>
                                <span > hoặc 
                                </span>
                                <a href="#"><strong>Gọi 18006601</strong></a>
                                <span>
                                    ưu tiên khuyến mãi (SL có hạn):
                                </span>
                            </p>
                            <ul>
                                <li>
                                    Trả góp ACS, 1% lãi suất, trả trước 0đ, kỳ hạn 6 tháng Hoặc Trả góp Home Credit/HD Saison, 0% lãi suất, trả trước 30%, kỳ hạn 6 tháng
                                </li>
                                <li >
                                    Tặng thẻ ATM trị giá lên đến 
                                    <b>12.000.000đ</b> 
                                    (không áp dụng trả góp 0%, 1%)
                                </li>
                                <li >Balo/Túi Laptop trị giá <b>300.000đ</b></li>
                                <li>Phiếu mua combo Office 365 trị giá <b>1.200.000đ</b></li>
                            </ul> 
                        </div> 
                    </div> 
                    <div class="left detail-order" >
                        <a class="detail-order-now" href="giohang?id=<%=id%>">
                            <label>
                                Mua ngay<span>(Giữ hàng tại shop, không mua không sao)</span>
                            </label>

                        </a>
                        <script>
                            $(".detail-order-now").click(function () {

                            });
                        </script>
                        <a href="#" class="detail-order-instalments">
                            <label>Trả góp<span>(Xét duyệt hồ sơ qua điện thoại)</span></label>
                        </a>

                        <p class="dt-notimain">Gọi <strong>18006601</strong> để được tư vấn miễn phí</p>
                    </div>
                </div>

                <div class="right detail-benefits-support"> 
                    <div class="box-benefits-support"> 
                        <label class="detail-lb-loiich clearfix">
                            <strong>Ưu đãi dành riêng cho khách hàng đặt trước Online:</strong>
                        </label> 
                        <div class="detail-support"> 
                            <span> <i class="glyphicon glyphicon-ok"></i> Giữ hàng tại Shop (không mua không sao) </span>
                            <span> <i class="glyphicon glyphicon-ok"></i> Giao hàng miễn phí toàn quốc trong 60 phút </span> 
                            <span> <i class="glyphicon glyphicon-ok"></i> Tư vấn miễn phí 24/7 
                                <strong>
                                    <a style="color: red" href="tel:18006601">18006601</a>
                                </strong> (cả dịp Lễ, Tết) 
                            </span> 
                            <span> <i class="glyphicon glyphicon-ok"></i> Bảo hành nhanh tại FPT Shop trên toàn quốc </span> 
                            <span> <i class="glyphicon glyphicon-ok"></i> Đổi trả thoải mái theo nhu cầu </span>  
                        </div>
                    </div> 
                </div>

            </div>
        </div>
        <div class="header-infor">
            <div class="container-fluid container-infor">
                <div class="row">
                    <ul class="clearfix">
                        <li><a>Đặc điểm nổi bật</a></li>
                        <li><a href="#thong-so-ky-thuat" id="#start">Thông số kỹ thuật</a></li>

                        <li><a href="#phu-kien">Phụ kiện</a></li>  
                    </ul>
                </div>
            </div>
        </div>
        <div class="container" style="margin-top: 50px;">
            <h3 class="title" id="thong-so-ky-thuat">Thông số kỹ thuật</h3>
            <p>
            <table class="table" style="width: 600px;">
                <tr style="font-weight: bold;font-size: 15px;background-color: #eee;color: #46B7E8;">
                    <td colspan="2" >Cấu hình nổi bật<td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Bộ vi xử lý :</td><td style="padding: 20px;">	Intel® Core™ i3-6100U Processor (3M Cache, 2.30 GHz)</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Bộ nhớ RAM :</td><td style="padding: 20px;">		4 GB (DDR3 Bus 1600 MHz)</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Đồ họa :</td><td style="padding: 20px;">		Intel® HD Graphics 520</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Ổ đĩa cứng :	</td><td style="padding: 20px;">	500 GB (HDD)</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Màn hình :</td><td style="padding: 20px;">14 inch (HD LED, 1366 x 768 pixels)</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Hệ điều hành :	</td><td style="padding: 20px;">Free DOS</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Kết nối :	</td><td style="padding: 20px;">LAN, Wi-Fi, USB 2.0, USB 3.0, HDMI</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Pin :	</td><td style="padding: 20px;">3 Cell</td>
                </tr>
            </table>


            <table class="table" style="width: 640px;vertical-align: left;padding: 10px;">
                <tr style="font-weight: bold;font-size: 15px;background-color: #eee;color: #46B7E8;">
                    <td colspan="2" >Kích thước & trọng lượng<td>
                </tr>

                <tr>
                    <td style="padding: 20px;">Dài :	</td><td style="padding: 20px;"> 240 mm</td>
                </tr>
                <tr >
                    <td style="padding: 20px;">Rộng  :	</td><td style="padding: 20px;">340 mm</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Cao  :	</td><td style="padding: 20px;">18.5  mm</td>
                </tr>
                <tr>
                    <td style="padding: 20px;">Trọng lượng :	</td><td style="padding: 20px;">1.7 Kg</td>
                </tr>
            </table>
        </div>
        <script>
            $(document).ready(function () {
                // Add smooth scrolling to all links
                $("a").on('click', function (event) {


                    if (this.hash !== "") {

                        event.preventDefault();


                        var hash = this.hash;

                        $('html, body').animate({
                            scrollTop: $(hash).offset().top
                        }, 800, function () {


                            window.location.hash = hash;
                        });
                    } // End if
                });
            });
        </script>


        <%@include file="back-to-top.jsp" %>
        <%@include file="footer.jsp" %>
    </body>
</html>
