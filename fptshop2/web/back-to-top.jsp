<%-- 
    Document   : back-to-top
    Created on : Oct 2, 2016, 11:08:55 PM
    Author     : tan
--%>
<link rel="stylesheet" href="css/back-to-top.css">
<div class="back-to-top display">

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
            </script>