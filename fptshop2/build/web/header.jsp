<%-- 
    Document   : header
    Created on : Sep 27, 2016, 7:56:28 PM
    Author     : tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
         <link rel="stylesheet" href="css/header.css">
    </head>
    <body>

        <div class="fs-header">
            <div class="fs-logo-header">

                <div class="fs-logo-container fs" href="#">
                    <img src="images/ttbg1.png" title="">   
                </div>
                <a class="fs-logo fi" title="Fptshop.com.vn" href="<%=request.getContextPath()%>/trangchu" ><i class="fi fi-logo"></i></a>   
                <form class="fs-search" id="frmSearch">

                    <input type="text" class="fs-ipsearch" placeholder="Bạn muốn tìm gì?">
                    <button type="submi" class="fs-btnsearch"><i class="fi fi-search"></i></button>
                </form>

                <ul class="fs-menu"> 
                    <li  class="show">
                        <a href="<%=request.getContextPath()%>/phones" title="Điện thoại" class="boder-color"> <i class="fi fi-dienthoai"></i> Điện thoại</a>
                        <div class="sub-menu">
                            <div class="fshop-nav-submenu clearfix">
                                <div class="fshop-nsm-mobile">

                                    <div class="fshop-nsm-col fshop-nsm-col50">
                                        <h3 class="fshop-nsm-title">Hãng sản xuất</h3>
                                        <ul class="fshop-nsm-list fshop-nsm-triple">
                                            <li><a href="<%=request.getContextPath()%>/phones/apple" title="Apple (iPhone)">Apple (iPhone)</a></li>
                                            <li><a href="<%=request.getContextPath()%>/phones/oppo" title="OPPO">OPPO</a></li>
                                            <li><a href="<%=request.getContextPath()%>/phones/sony" title="Sony">Sony</a></li>
                                            <li><a href="<%=request.getContextPath()%>/phones/samsung" title="Samsung">Samsung</a></li>
                                            <li><a href="<%=request.getContextPath()%>/wing" title="Wing">Wing</a></li>
                                            <li><a href="<%=request.getContextPath()%>/phones/nokia" title="Nokia">Nokia</a></li>
                                            <li><a href="<%=request.getContextPath()%>/phones/htc" title="HTC">HTC</a></li>
                                            <li><a href="<%=request.getContextPath()%>/phones/asus" title="Asus">Asus</a></li>
                                            <li><a href="<%=request.getContextPath()%>/phones/lenovo" title="Lenovo">Lenovo</a></li>
                                            <li><a href="<%=request.getContextPath()%>/gionee" title="Gionee">Gionee</a></li>
                                            <li><a href="<%=request.getContextPath()%>/philips" title="Philips">Philips</a></li>
                                            <li><a href="<%=request.getContextPath()%>/mobell" title="Mobell">Mobell</a></li>
                                            <li><a href="<%=request.getContextPath()%>/huawei" title="Huawei">Huawei</a></li>
                                            <li><a href="<%=request.getContextPath()%>/oneplus" title="OnePlus">OnePlus</a></li>
                                            <li><a href="<%=request.getContextPath()%>/obiwordlphone" title="Obi WorldPhone">Obi WorldPhone</a></li>
                                            <li><a href="<%=request.getContextPath()%>/mobiistar" title="Mobiistar">Mobiistar</a></li>
                                            <li><a href="<%=request.getContextPath()%>/coolpad" title="Coolpad">Coolpad</a></li>
                                            <li><a href="<%=request.getContextPath()%>/masstel" title="Masstel">Masstel</a></li>
                                            <li><a href="<%=request.getContextPath()%>/meizu" title="MEIZU">MEIZU</a></li>
                                            <li><a href="<%=request.getContextPath()%>/vivo" title="ViVo">ViVo</a></li>
                                        </ul>
                                    </div>
                                    <div class="fshop-nsm-col fshop-nsm-col20">
                                        <h3 class="fshop-nsm-title">Mức giá</h3>
                                        <ul class="fshop-nsm-list fshop-nsm-only">
                                            <li><a href="/dien-thoai/duoi-1-trieu" title="Dưới 1 triệu">Dưới 1 triệu</a></li>
                                            <li><a href="tu-1-trieu-den-3-trieu" title="Từ 1 triệu đến 3 triệu">Từ 1 triệu đến 3 triệu</a></li>
                                            <li><a href="tu-3-trieu-den-6-trieu" title="Từ 3 triệu đến 6 triệu">Từ 3 triệu đến 6 triệu</a></li>
                                            <li><a href="tu-6-trieu-den-10-trieu" title="Từ 6 triệu đến 10 triệu">Từ 6 triệu đến 10 triệu</a></li>
                                            <li><a href="tren-10-trieu" title="Trên 10 triệu">Trên 10 triệu</a></li>
                                        </ul>
                                    </div>

                                </div>
                                <a href="<%=request.getContextPath()%>/trangchu" class="link-top-product">
                                    Bảng xếp hạng điện thoại của tháng
                                </a>
                            </div>
                        </div>   
                    </li>
                    <li  class="show">
                        <a href="<%=request.getContextPath()%>/laptops" title="Laptop" class="boder-color"><i class="fi fi-latop"></i> Laptop</a>
                        <div class="sub-menu">
                            <div class="fshop-nav-submenu clearfix">
                                <div class="fshop-nsm-laptop">

                                    <div class="fshop-nsm-col fshop-nsm-col50">
                                        <h3 class="fshop-nsm-title">Hãng sản xuất</h3>
                                        <ul class="fshop-nsm-list fshop-nsm-triple">
                                            <li><a href="<%=request.getContextPath()%>/laptops/applelaptop" title="Apple (Macbook)">Apple (Macbook)</a></li>
                                            <li><a href="<%=request.getContextPath()%>/laptops/asuslaptop" title="Asus">Asus</a></li>
                                            <li><a href="<%=request.getContextPath()%>/laptops/dell" title="Dell">Dell</a></li>
                                            <li><a href="<%=request.getContextPath()%>/laptops/hp" title="HP">HP</a></li>
                                            <li><a href="<%=request.getContextPath()%>/laptops/lenovolaptop" title="Lenovo">Lenovo</a></li>
                                            <li><a href="<%=request.getContextPath()%>/laptops/acer" title="Acer">Acer</a></li>
                                            <li><a href="<%=request.getContextPath()%>/laptops/msi" title="MSI">MSI</a></li>
                                        </ul>
                                    </div>
                                    <div class="fshop-nsm-col fshop-nsm-col20">
                                        <h3 class="fshop-nsm-title">Mức giá</h3>
                                        <ul class="fshop-nsm-list fshop-nsm-only">
                                            <li><a href="duoi-5-trieu" title="Dưới 5 triệu">Dưới 5 triệu</a></li>
                                            <li><a href="tu-5-10-trieu" title="Từ 5 - 10 triệu">Từ 5 - 10 triệu</a></li>
                                            <li><a href="tu-10-15-trieu" title="Từ 10 - 15 triệu">Từ 10 - 15 triệu</a></li>
                                            <li><a href="tu-15-20-trieu" title="Từ 15 - 20 triệu">Từ 15 - 20 triệu</a></li>
                                            <li><a href="tu-20-25-trieu" title="Từ 20 - 25 triệu">Từ 20 - 25 triệu</a></li>
                                            <li><a href="tu-25-30-trieu" title="Từ 25 - 30 triệu">Từ 25 - 30 triệu</a></li>
                                            <li><a href="tren-30-trieu" title="Trên 30 triệu">Trên 30 triệu</a></li>
                                        </ul>
                                    </div>

                                </div>
                                <a href="<%=request.getContextPath()%>/trangchu" class="link-top-product">
                                    Bảng xếp hạng điện thoại của tháng
                                </a>
                            </div>
                        </div>   
                    </li>
                    <li>
                        <a href="<%=request.getContextPath()%>/trangchu" title="Máy đổi trả" target="_blank"><i class="fi fi-maydoitra"></i> Máy đổi trả</a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath()%>/trangchu" title="Xả hàng"> <i class="fi fi-xahang"></i> Xả hàng</a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath()%>/trangchu" title="Khuyến mãi"><i class="fi fi-khuyenmai"></i> Khuyến mãi</a>
                    </li>
                    <li>
                        <a href="<%=request.getContextPath()%>/trangchu" title="Tin hay"><i class="fi fi-tinhay"></i> Tin hay</a>
                    </li>
                    <li >
                        <a href="<%=request.getContextPath()%>/trangchu" title="Khuyến mãi"><i class="fi fi-hoidap"></i> Hỏi đáp</a>
                    </li>
                   
                   
                </ul>
                <a class="fs-hotline" href="#" title="F.Freinds"> 
                    <i class="fi fi-ffreind"></i> <p>Mua trước trả sau</p>
                </a>

                <!--                <script>
                                    $(".fi-dienthoai").mouseenter(function () {
                                        $("body").css("background-color", "#eee");
                                        $(".fs-submenu").css("display","block");
                                        $(".fi-dienthoai").addClass("active");
                                    });
                                    $(".fi-dienthoai").mouseleave(function () {
                                        $("body").css("background-color", "#fff");
                                        $(".fi-dienthoai").removeClass("active");
                                        $(".fs-submenu").css("display","none");
                                    });
                                </script>-->
            </div>

        </div>
    </body>
</html>
