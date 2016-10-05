<%-- 
    Document   : body-header
    Created on : Oct 3, 2016, 2:20:28 PM
    Author     : tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <div class="fs-pro-header">
                    <div class="fs-pro-proname" >
                        <h1>Điện thoại</h1>
                    </div>
                    <div class="fs-type"> 
                        <div class="input-prepend input-append">
                            <div class="btn-group">
                                <button class="btn dropdown-toggle" name="recordinput" data-toggle="dropdown">
                                    Mặc định
                                    <span class="caret"></span>
                                </button>
                                <ul class="dropdown-menu">
                                    <li class=""> <a href="#" data-value="gia-cao-den-thap"> Mặc định</a> </li> 
                                    <li class=""> <a href="#" data-value="gia-cao-den-thap">Giá cao đến thấp</a> </li> 
                                    <li class=""> <a href="#" data-value="gia-thap-den-cao">Giá thấp đến cao</a> </li> 
                                    <li class=""> <a href="#;" data-value="ban-chay-nhat">Bán chạy nhất</a> </li> 
                                    <li class=""> <a href="#" data-value="xem-nhieu-nhat">Xem  nhiều nhất</a> </li>
                                </ul>      
                            </div>
                        </div>

                        <script>
                            $(".dropdown-menu li a").click(function () {
                                var selText = $(this).text();
                                $(this).parents('.btn-group').find('.dropdown-toggle').html(selText + ' <span class="caret"></span>');
                                
                            });

                        </script>
                    </div>

                    <div class="fshop-lprod-bnbot">
                        <ul class="clearfix">
                            <li class="fshop-lprod-ckch">Cam kết hàng chính hãng</li>
                            <li class="fshop-lprod-gttn">Giá thành tốt nhất</li>
                            <li class="fshop-lprod-hthd">Hỗ Trợ trả góp</li>
                            <li class="fshop-lprod-mpgh">Miễn phí Giao hàng toàn quốc</li>
                            <li class="fshop-lprod-bnbclode"></li>
                        </ul>     
                    </div>

                </div>
</html>
