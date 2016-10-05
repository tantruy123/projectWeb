/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(function () {

    //settings for slider
    var width = 800;
    var animationSpeed = 1500;
    var pause = 5000;
    var currentSlide = 1;

    //cache DOM elements
    var $slider = $('#slider');
    var $slideContainer = $('.slides', $slider);
    var $slides = $('.slide', $slider);

    var interval;

    function startSlider() {
        interval = setInterval(function () {
            $slideContainer.animate({
                'margin-left': '-=' + width
            }, animationSpeed, function () {
                if (++currentSlide === $slides.length) {
                    currentSlide = 1;
                    $slideContainer.css('margin-left', 0);

                }
            });
        }, pause);
    }

    function pauseSlider() {
        clearInterval(interval);
    }

    $slideContainer
            .on('mouseenter', pauseSlider)
            .on('mouseleave', startSlider);

    startSlider();


});



//slide item
$(".pun").hover(function () {

    $(this).find("#sub-top").css("margin-top", "-200px");
}, function () {
    $(this).find("#sub-top").css("margin-top", "0px");
});

//$("#top1").mouseenter(function () {
//    $("#sup-top-1").css("margin-top", "-200px");
//    $("#sup-top-1").css("background-color", "#fff");
//});
//
//$("#top1").mouseleave(function () {
//    $("#sup-top-1").css("margin-top", "0");
//    $("#sup-top-1").css("background-color", "#fff");
//});
//$("#top2").mouseenter(function () {
//    $("#sup-top-2").css("margin-top", "-200px");
//    $("#sup-top-2").css("background-color", "#fff");
//});
//$("#top2").mouseleave(function () {
//    $("#sup-top-2").css("margin-top", "0");
//    $("#sup-top-2").css("background-color", "#fff");
//});
//$("#top3").mouseenter(function () {
//    $("#sup-top-3").css("margin-top", "-200px");
//    $("#sup-top-3").css("background-color", "#fff");
//});
//$("#top3").mouseleave(function () {
//    $("#sup-top-3").css("margin-top", "0");
//    $("#sup-top-3").css("background-color", "#fff");
//});
//$("#top4").mouseenter(function () {
//    $("#sup-top-4").css("margin-top", "-200px");
//    $("#sup-top-4").css("background-color", "#fff");
//});
//$("#top4").mouseleave(function () {
//    $("#sup-top-4").css("margin-top", "0");
//    $("#sup-top-4").css("background-color", "#fff");
//});
//$("#top5").mouseenter(function () {
//    $("#sup-top-5").css("margin-top", "-200px");
//    $("#sup-top-5").css("background-color", "#fff");
//});
//$("#top5").mouseleave(function () {
//    $("#sup-top-5").css("margin-top", "0");
//    $("#sup-top-5").css("background-color", "#fff");
//});
//$("#top6").mouseenter(function () {
//    $("#sup-top-6").css("margin-top", "-200px");
//    $("#sup-top-6").css("background-color", "#fff");
//});
//$("#top6").mouseleave(function () {
//    $("#sup-top-6").css("margin-top", "0");
//    $("#sup-top-6").css("background-color", "#fff");
//});

// product box
$(".pro").hover(function () {

    $(this).find(".pro-infor").css("margin-top", "-200px");
    $(this).find(".pro-infor").css("background-color", "#fff");
}, function () {
    $(this).find(".pro-infor").css("margin-top", "100px");
});

//$(".pro-1").mouseenter(function () {
//    $(".pro-infor-1").css("margin-top", "-200px");
//    $(".pro-infor-1").css("background-color", "#fff");
//
//});
//$(".pro-1").mouseleave(function () {
//    $(".pro-infor-1").css("margin-top", "100px");
//    $(".pro-infor-1").css("background-color", "#fff");
//});
//$(".pro-2").mouseenter(function () {
//    $(".pro-infor-2").css("margin-top", "-200px");
//    $(".pro-infor-2").css("background-color", "#fff");
//
//});
//$(".pro-2").mouseleave(function () {
//    $(".pro-infor-2").css("margin-top", "100px");
//    $(".pro-infor-2").css("background-color", "#fff");
//});
//$(".pro-3").mouseenter(function () {
//    $(".pro-infor-3").css("margin-top", "-200px");
//    $(".pro-infor-3").css("background-color", "#fff");
//
//});
//$(".pro-3").mouseleave(function () {
//    $(".pro-infor-3").css("margin-top", "100px");
//    $(".pro-infor-3").css("background-color", "#fff");
//});
//$(".pro-4").mouseenter(function () {
//    $(".pro-infor-4").css("margin-top", "-200px");
//    $(".pro-infor-4").css("background-color", "#fff");
//
//});
//$(".pro-4").mouseleave(function () {
//    $(".pro-infor-4").css("margin-top", "100px");
//    $(".pro-infor-4").css("background-color", "#fff");
//});
//$(".pro-5").mouseenter(function () {
//    $(".pro-infor-5").css("margin-top", "-200px");
//    $(".pro-infor-5").css("background-color", "#fff");
//
//});
//$(".pro-5").mouseleave(function () {
//    $(".pro-infor-5").css("margin-top", "100px");
//    $(".pro-infor-5").css("background-color", "#fff");
//});
//$(".pro-6").mouseenter(function () {
//    $(".pro-infor-6").css("margin-top", "-200px");
//    $(".pro-infor-6").css("background-color", "#fff");
//
//});
//$(".pro-6").mouseleave(function () {
//    $(".pro-infor-6").css("margin-top", "100px");
//    $(".pro-infor-6").css("background-color", "#fff");
//});
//$(".pro-7").mouseenter(function () {
//    $(".pro-infor-7").css("margin-top", "-200px");
//    $(".pro-infor-7").css("background-color", "#fff");
//
//});
//$(".pro-7").mouseleave(function () {
//    $(".pro-infor-7").css("margin-top", "100px");
//    $(".pro-infor-7").css("background-color", "#fff");
//});
//$(".pro-8").mouseenter(function () {
//    $(".pro-infor-8").css("margin-top", "-200px");
//    $(".pro-infor-8").css("background-color", "#fff");
//
//});
//$(".pro-8").mouseleave(function () {
//    $(".pro-infor-8").css("margin-top", "100px");
//    $(".pro-infor-8").css("background-color", "#fff");
//});