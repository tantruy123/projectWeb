<%-- 
    Document   : dien-thoai
    Created on : Sep 29, 2016, 10:10:04 PM
    Author     : tan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/phones.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <script src="js/jquery-3.1.0.min.js"></script>
        <link rel="stylesheet" href="css/header.css">
        <link rel="stylesheet" type="text/css" href="css/wow-css/style.css" />
        <script type="text/javascript" src="js/wow-js/jquery.js"></script>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- jQuery library -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <!-- Latest compiled JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>
        <%@include file="header.jsp" %>
        <div class="container">
            <div class="pro-container">
                <%@include file="body-header.jsp" %>
                <div class="products" style="">
                    <div class="slider p-item cell-4" style="">
                        <!-- Start WOWSlider.com BODY section --> <!-- add to the <body> of your page -->
                        <div id="wowslider-container1">
                            <div class="ws_images"><ul>
                                    <li><img src="images/wowslider/636.jpg" alt="" title="" id="wows1_0"/></li>
                                    <li><img src="images/wowslider/7Prime-C1-2.jpg" alt="" title="" id="wows1_1"/></li>
                                    <li><a href="#"><img src="images/wowslider/C1-800x290.jpg" alt="" title="" id="wows1_2"/></a></li>
                                    <li><img src="images/wowslider/MT9-C1-2.jpg" alt="" title="" id="wows1_3"/></li>
                                </ul></div>
                            <div class="ws_bullets"><div>
                                    <a href="#" title="636086262849731422_KMT9-C1-2">1</a>
                                    <a href="#" title="636102355176105344_C1-800x2901">2</a>
                                    <a href="#" title="636104774235838029_j7Prime-C1-2">3</a>
                                    <a href="#" title="636108323265175807_636106490756800549_C1-800x290">4</a>
                                </div></div><span class="wsl"><a href="#">image carousel</a> by TM</span>
                            <div class="ws_shadow"></div>
                        </div>	
                        <script type="text/javascript" src="js/wow-js/wowslider.js"></script>
                        <script type="text/javascript" src="js/wow-js/script.js"></script>
                        <!-- End WOWSlider.com BODY section -->
                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <!-- end header -->
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-2">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <!-- row one -->
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-2">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">


                    </div>
                    <!-- row two -->
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-2">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">


                    </div>
                    <!-- row three -->
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-2">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">


                    </div>
                    <!-- row four -->
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-2">

                    </div>
                    <div class="p-item cell-1">

                    </div>
                    <div class="p-item cell-1">


                    </div>
                    <!-- row five -->
                </div>
            </div>
            <!--            <div class="back-to-top display">
            
                            <a href="#" id="back-to-top" title="Back to top"><li class="back"></li></a>
                        </div>
                        <script>
                                        if ($('#back-to-top').length) {
                                            var scrollTrigger = 100, // px
                                                    backToTop = function () {
                                                        var scrollTop = $(window).scrollTop();
                                                        if (scrollTop > scrollTrigger) {
                                                            $('#back-to-top').addClass('show');
                                                        } else {
                                                            $('#back-to-top').removeClass('show');
                                                        }
                                                    };
                                            backToTop();
                                            $(window).on('scroll', function () {
                                                backToTop();
                                            });
                                            $('#back-to-top').on('click', function (e) {
                                                e.preventDefault();
                                                $('html,body').animate({
                                                    scrollTop: 0
                                                }, 700);
                                            });
                                        }
                        </script>-->
            <%@include file="back-to-top.jsp" %>
        </div>


        <%@include file="footer.jsp" %>
    </body>
</html>
