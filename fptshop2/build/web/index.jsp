<%-- 
    Document   : index
    Created on : Sep 26, 2016, 1:44:04 PM
    Author     : tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <link rel="stylesheet" href="css/main.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" >      
        <script src="js/jquery-3.1.0.min.js"></script>
    </head>
    <body>
        <%@ page isErrorPage="true" %>  
        <%@include file="header.jsp" %>

        <div class="container">
            <!-- slider-->
            <div class="row fs-slidebox">
                <div class="fs-slider-main clearfix">
                    <div class="slide-left">
                        <div id="slider">
                            <ul class="slides">
                                <li class="slide"><img src="images/slide/1.jpg"></li>
                                <li class="slide"><img src="images/slide/2.jpg"></li>
                                <li class="slide"><img src="images/slide/3.jpg"></li>
                                <li class="slide"><img src="images/slide/4.jpg"></li>
                                <li class="slide"><img src="images/slide/5.jpg"></li>
                            </ul>

                        </div>
                        <div class="banner-slide">
                            <ul class="clearfix">
                                <li>
                                    <a target="_blank" title="tao">
                                        <img style="width: 400px;height:70px;margin-left: -50px;float: left;" src="images/banner/banner1.jpg">
                                    </a>
                                </li>
                                <li>
                                    <a target="_blank" title="oppo">
                                        <img style="width: 380px;height: 70px;float: right;margin-top: -20px; "src="images/banner/banner2.jpg">
                                    </a>
                                </li>
                            </ul>
                        </div>
                    </div>
                    <script>

                    </script>
                    <div class="slide-right">
                        <ul class="clearfix">
                            <li>
                                <a target="_blank" title="tao" >
                                    <img src="images/slide/H2.jpg">
                                </a>
                            </li>
                            <li>
                                <a target="_blank" title="oppo"  >
                                    <img src="images/slide/H3.jpg">
                                </a>
                            </li> 
                        </ul>
                    </div>
                </div>
            </div>
            <!-- best seller-->
            <div class="row">
                <div class="best-seller">
                    <div class="best-seller-title clearfix">
                        <h3 class="left">Top bán chạy nhất</h3>
                        <a href="ranking" target="_blank" class="best-seller-more right">
                            Xem thêm <i class="fa fa-angle-right"></i>
                        </a>
                    </div>
                    <div class="best-seller-content">
                        <div class="beest-seller-list">
                            <div class="best-seller-wrapper">
                                <div class="swiper-wrapper">
                                    <!-- best top one-->
                                    <%
                                        for(int i=0;i<6;i++){
                                            
                                        
                                    %>
                                    <div class="swiper-slide p-item col-lg-2 col-md-3 col-sm-4 col-xs-6 pun"> 
                                        <div class="p-label best-seller-label icons"><%=i+1%></div>
                                        <a href="sanpham?id=333" title="OPPO F1s" class="p-link-prod">

                                        </a> 
                                        <figure class="p-image">
                                            <span> 
                                                <a href="/dien-thoai/oppo-f1s" title="OPPO F1s">
                                                    <img src="images/bestseller/top1.jpg" alt="OPPO F1s">
                                                </a> 
                                            </span>
                                        </figure> 
                                        <div class="p-info" id="sub-top"> 
                                            <div class="p-top-info" >
                                                <div class="p-name"> 
                                                    <h3><a href="/dien-thoai/oppo-f1s" title="OPPO F1s">OPPO F1s</a> </h3> 
                                                </div> 
                                                <div class="p-price"> 
                                                    <span class="p-current-price">5.990.000<span>đ</span></span>  
                                                </div> 
                                            </div> 
                                            <div class="p-hide-info">  
                                                <div class="p-promotion"> 
                                                    <ul>
                                                        <li>Giảm 35% khi mua combo <br>Phụ kiện</li>
                                                        <li>Trả góp Home Credit, 0% lãi suất, trả trước 30%, kỳ hạn 4 tháng</li>

                                                    </ul>
                                                </div>
                                            </div>
                                        </div> 
                                    </div>
                                    <%
                                    }
                                    %>
                          
                                </div>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
         
            <!-- box product -->
            <!-- row one -->
            <div class="col-md-8 col-sm-12 box-products"style="margin-left: 30px;margin-top: 20px;margin-bottom: -20px;">
                <div class="products" style="position: relative;margin-left: -60px;">
                    <div class="pro-item pro cell-2" style="position: absolute;top: 0px;width: 400px;"> 
                        <div class="p-badge">  
                            <img src="images/ico/label-moi.png" alt="Sony Xperia XZ">   
                        </div>
                       <div class="pro-item-bound" style="background: url('images/636101525643920651_XZ232o.jpg') no-repeat center top"> 
                            <a href="/dien-thoai/sony-xperia-xz" class="p-link-prod" title="Sony Xperia XZ"></a> 

                            <figure class="pro-image"> 
                                <span>
                                    <a href="/dien-thoai/sony-xperia-xz" title="Sony Xperia XZ">
                                        <img >
                                    </a> 
                                </span>
                            </figure> 
                            <div class="pro-infor"> 
                                <div class="p-topro-infor"> 
                                    <div class="pro-infor-show">
                                        <div class="p-name">
                                            <a href="/dien-thoai/sony-xperia-xz" title="Sony Xperia XZ">
                                                <h3>Sony Xperia XZ</h3></a> </div> <div class="p-price">  
                                            <span class="p-current-price">14.990.000<span>đ</span></span>   
                                        </div>
                                    </div> 
                                </div> 
                                <div class="pro-hide-info"> 
                                    <div class="best-seller-order"> 

                                        <ul>
                                            <li><span style="line-height: 1.6;">Trả thẳng: Tặng Loa Sony H.ear Go trị giá 4.290.000đ (Số lượng có hạn)</span><br></li>
                                            <li><span style="line-height: 1.6;">Trả góp: Ưu đãi lãi suất 0%, trả trước 30% HC, kỳ hạn 6 tháng</span></li>

                                        </ul>
                                    </div>
                                    <div class="p-promotion"> 
                                    </div> 
                                </div> 
                            </div> 
                        </div> 
                    </div>
                </div>
               

                <div style="float: right;width: 383px;height: 400px;margin-right: 10px;">
                    <div class="products" style="position: relative;margin-left:0px;">
                        <div class="pro-item pro cell-2" style="position: absolute;top: 0px;width: 400px;"> 
                            <div class="p-badge">  
                                <img src="images/ico/label-moi.png" alt="Sony Xperia XZ">  
                            </div>
                            <div class="pro-item-bound" style="background: url('images/636101525643920651_XZ232o.jpg') no-repeat center top"> 
                                <a href="/dien-thoai/sony-xperia-xz" class="p-link-prod" title="Sony Xperia XZ"></a> 

                                <figure class="pro-image"> 
                                    <span>
                                        <a href="/dien-thoai/sony-xperia-xz" title="Sony Xperia XZ">
                                            <img >
                                        </a> 
                                    </span>
                                </figure> 
                                <div class="pro-infor"> 
                                    <div class="p-topro-infor"> 
                                        <div class="pro-infor-show">
                                            <div class="p-name">
                                                <a href="/dien-thoai/sony-xperia-xz" title="Sony Xperia XZ">
                                                    <h3>Sony Xperia XZ</h3></a> </div> <div class="p-price">  
                                                <span class="p-current-price">14.990.000<span>đ</span></span>   
                                            </div>
                                        </div> 
                                    </div> 
                                    <div class="pro-hide-info"> 
                                        <div class="best-seller-order"> 

                                            <ul>
                                                <li><span style="line-height: 1.6;">Trả thẳng: Tặng Loa Sony H.ear Go trị giá 4.290.000đ (Số lượng có hạn)</span><br></li>
                                                <li><span style="line-height: 1.6;">Trả góp: Ưu đãi lãi suất 0%, trả trước 30% HC, kỳ hạn 6 tháng</span></li>

                                            </ul>
                                        </div>
                                        <div class="p-promotion"> 
                                        </div> 
                                    </div> 
                                </div> 
                            </div> 
                        </div>
                    </div>
                </div>

            </div>

            <div class="col-md-4 hidden-sm hidden-xs right-sidebar" style="margin-right: -100px;margin-top: 20px;margin-bottom: -17px;">
                <div class="deliver-box">
                    <img src="images/banner/Giao-hang.gif" title="" alt="" style="display: block !important;">
                </div>
                <!--free consulting box-->
                <div class="free-consulting">
                    <h3>Tư vấn miễn phí</h3>
                    <div class="free-consulting-content">
                        <p>
                            Nhập thông tin của bạn để được tư vấn miễn phí và nhận những thông tin ưu đãi,
                            khuyến mại đặc biệt dành cho thành viên của FPT Shop!
                        </p>
                        <p>
                            <input type="text" placeholder="Nhập số điện thoại của bạn" id="txtConsultingPhone">
                        </p>
                        <p>
                            <a href="javascript:jfpts.homepage.call();" class="receive-call-button">Nhận cuộc gọi</a>

                        </p>
                    </div>
                    <!-- end free consulting box-->

                </div>
            </div>
         
            <%
            
                for(int i=0;i<5;i++){
                %>
                <div class="col-md-8 col-sm-12 box-products"style="margin-left: 30px;margin-top: 15px;">
                    <div class="products" style="position: relative;margin-left: -60px;">
                    <div class="pro-item pro cell-2" style="position: absolute;top: 0px;width: 400px;"> 
                        <div class="p-badge">  
                           <img src="images/ico/label-moi.png" alt="Sony Xperia XZ">   
                        </div>
                        <div class="pro-item-bound" style="background: url('images/636101525643920651_XZ232o.jpg') no-repeat center top"> 
                            <a href="/dien-thoai/sony-xperia-xz" class="p-link-prod" title="Sony Xperia XZ"></a> 

                            <figure class="pro-image"> 
                                <span>
                                    <a href="/dien-thoai/sony-xperia-xz" title="Sony Xperia XZ">
                                        <img>
                                </span>
                            </figure> 
                            <div class="pro-infor"> 
                                <div class="p-topro-infor "> 
                                    <div class="pro-infor-show">
                                        <div class="p-name">
                                            <a href="/dien-thoai/sony-xperia-xz" title="Sony Xperia XZ">
                                                <h3>Sony Xperia XZ</h3></a> </div> <div class="p-price">  
                                            <span class="p-current-price">14.990.000<span>đ</span></span>   
                                        </div>
                                    </div> 
                                </div> 
                                <div class="pro-hide-info"> 
                                    <div class="best-seller-order"> 

                                        <ul>
                                            <li><span style="line-height: 1.6;">Trả thẳng: Tặng Loa Sony H.ear Go trị giá 4.290.000đ (Số lượng có hạn)</span><br></li>
                                            <li><span style="line-height: 1.6;">Trả góp: Ưu đãi lãi suất 0%, trả trước 30% HC, kỳ hạn 6 tháng</span></li>

                                        </ul>
                                    </div>
                                    <div class="p-promotion"> 
                                    </div> 
                                </div> 
                            </div> 
                        </div> 
                    </div>
                </div>
                

                <div style="float: right;width: 383px;height: 400px;margin-right: 10px;">
                    <div class="products" style="position: relative;margin-left:0px;">
                        <div class="pro-item pro cell-2" style="position: absolute;top: 0px;width: 400px;"> 
                            <div class="p-badge">  
                                <img src="images/ico/label-moi.png" alt="Sony Xperia XZ">  
                            </div>
                           <div class="pro-item-bound" style="background: url('images/636101525643920651_XZ232o.jpg') no-repeat center top"> 
                               <a href="/dien-thoai/sony-xperia-xz" class="p-link-prod" title="Sony Xperia XZ"></a> 

                                <figure class="pro-image"> 
                                    <span>
                                        <a href="/dien-thoai/sony-xperia-xz" title="Sony Xperia XZ">
                                            <img>
                                        </a> 
                                    </span>
                                </figure> 
                                <div class="pro-infor"> 
                                    <div class="p-topro-infor"> 
                                        <div class="pro-infor-show">
                                            <div class="p-name">
                                                <a href="/dien-thoai/sony-xperia-xz" title="Sony Xperia XZ">
                                                    <h3>Sony Xperia XZ</h3></a> </div> <div class="p-price">  
                                                <span class="p-current-price">14.990.000<span>đ</span></span>   
                                            </div>
                                        </div> 
                                    </div> 
                                    <div class="pro-hide-info"> 
                                        <div class="best-seller-order"> 

                                            <ul>
                                                <li><span style="line-height: 1.6;">Trả thẳng: Tặng Loa Sony H.ear Go trị giá 4.290.000đ (Số lượng có hạn)</span><br></li>
                                                <li><span style="line-height: 1.6;">Trả góp: Ưu đãi lãi suất 0%, trả trước 30% HC, kỳ hạn 6 tháng</span></li>

                                            </ul>
                                        </div>
                                        <div class="p-promotion"> 
                                        </div> 
                                    </div> 
                                </div> 
                            </div> 
                        </div>
                    </div>
                </div>

            </div>
                <%
            }
            %>
             <div class="col-md-8 col-sm-12 box-products"style="margin-left: 30px;margin-top: 15px;">
                    <div class="products" style="position: relative;margin-left: -60px;">
                         <div class="pro-item pro cell-2" style="position: absolute;top: 0px;width: 200px;height: 250px"> 
                        <div class="p-item-bound"> 
                            <a href="#" class="p-more" data-current="8"> 
                                <span> <i class="icons p-more-icon"></i> <label>Xem thêm <strong>8</strong> sản phẩm</label> </span> 
                            </a> 
                        </div>
                         </div>
                </div>
                

                <div style="float: right;width: 383px;height: 400px;margin-right: 10px;">
                   
                </div>

            </div>
            
        </div>
            
            
    


        <%@include file="footer.jsp" %>

        <script src="js/main.js"></script>

    </body>
</html>
