package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.Customer;
import java.text.DecimalFormat;

public final class gio_002dhang_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                    double price = 599900;
                    String name = "";
                    String phone = "", email = "";
                    String country = "", glosbe = "", date = "";

                
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/back-to-top.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    Throwable exception = org.apache.jasper.runtime.JspRuntimeLibrary.getThrowable(request);
    if (exception != null) {
      response.setStatus((Integer)request.getAttribute("javax.servlet.error.status_code"));
    }
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Apple - Iphone </title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/giohang.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("        <script src=\"js/jquery-3.1.0.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/apple.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body ng-app=\"\" >\n");
      out.write("          \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("         <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"fs-header\">\n");
      out.write("            <div class=\"fs-logo-header\">\n");
      out.write("\n");
      out.write("                <div class=\"fs-logo-container fs\" href=\"#\">\n");
      out.write("                    <img src=\"images/ttbg1.png\" title=\"\">   \n");
      out.write("                </div>\n");
      out.write("                <a class=\"fs-logo fi\" title=\"Fptshop.com.vn\" href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" ><i class=\"fi fi-logo\"></i></a>   \n");
      out.write("                <form class=\"fs-search\" id=\"frmSearch\">\n");
      out.write("\n");
      out.write("                    <input type=\"text\" class=\"fs-ipsearch\" placeholder=\"Bạn muốn tìm gì?\">\n");
      out.write("                    <button type=\"submi\" class=\"fs-btnsearch\"><i class=\"fi fi-search\"></i></button>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("                <ul class=\"fs-menu\"> \n");
      out.write("                    <li  class=\"show\">\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/phones\" title=\"Điện thoại\" class=\"boder-color\"> <i class=\"fi fi-dienthoai\"></i> Điện thoại</a>\n");
      out.write("                        <div class=\"sub-menu\">\n");
      out.write("                            <div class=\"fshop-nav-submenu clearfix\">\n");
      out.write("                                <div class=\"fshop-nsm-mobile\">\n");
      out.write("\n");
      out.write("                                    <div class=\"fshop-nsm-col fshop-nsm-col50\">\n");
      out.write("                                        <h3 class=\"fshop-nsm-title\">Hãng sản xuất</h3>\n");
      out.write("                                        <ul class=\"fshop-nsm-list fshop-nsm-triple\">\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/phones/apple\" title=\"Apple (iPhone)\">Apple (iPhone)</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/phones/oppo\" title=\"OPPO\">OPPO</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/phones/sony\" title=\"Sony\">Sony</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/phones/samsung\" title=\"Samsung\">Samsung</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/wing\" title=\"Wing\">Wing</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/phones/nokia\" title=\"Nokia\">Nokia</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/phones/htc\" title=\"HTC\">HTC</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/phones/asus\" title=\"Asus\">Asus</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/phones/lenovo\" title=\"Lenovo\">Lenovo</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/gionee\" title=\"Gionee\">Gionee</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/philips\" title=\"Philips\">Philips</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/mobell\" title=\"Mobell\">Mobell</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/huawei\" title=\"Huawei\">Huawei</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/oneplus\" title=\"OnePlus\">OnePlus</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/obiwordlphone\" title=\"Obi WorldPhone\">Obi WorldPhone</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/mobiistar\" title=\"Mobiistar\">Mobiistar</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/coolpad\" title=\"Coolpad\">Coolpad</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/masstel\" title=\"Masstel\">Masstel</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/meizu\" title=\"MEIZU\">MEIZU</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/vivo\" title=\"ViVo\">ViVo</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"fshop-nsm-col fshop-nsm-col20\">\n");
      out.write("                                        <h3 class=\"fshop-nsm-title\">Mức giá</h3>\n");
      out.write("                                        <ul class=\"fshop-nsm-list fshop-nsm-only\">\n");
      out.write("                                            <li><a href=\"/dien-thoai/duoi-1-trieu\" title=\"Dưới 1 triệu\">Dưới 1 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tu-1-trieu-den-3-trieu\" title=\"Từ 1 triệu đến 3 triệu\">Từ 1 triệu đến 3 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tu-3-trieu-den-6-trieu\" title=\"Từ 3 triệu đến 6 triệu\">Từ 3 triệu đến 6 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tu-6-trieu-den-10-trieu\" title=\"Từ 6 triệu đến 10 triệu\">Từ 6 triệu đến 10 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tren-10-trieu\" title=\"Trên 10 triệu\">Trên 10 triệu</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" class=\"link-top-product\">\n");
      out.write("                                    Bảng xếp hạng điện thoại của tháng\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>   \n");
      out.write("                    </li>\n");
      out.write("                    <li  class=\"show\">\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/laptops\" title=\"Laptop\" class=\"boder-color\"><i class=\"fi fi-latop\"></i> Laptop</a>\n");
      out.write("                        <div class=\"sub-menu\">\n");
      out.write("                            <div class=\"fshop-nav-submenu clearfix\">\n");
      out.write("                                <div class=\"fshop-nsm-laptop\">\n");
      out.write("\n");
      out.write("                                    <div class=\"fshop-nsm-col fshop-nsm-col50\">\n");
      out.write("                                        <h3 class=\"fshop-nsm-title\">Hãng sản xuất</h3>\n");
      out.write("                                        <ul class=\"fshop-nsm-list fshop-nsm-triple\">\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/laptops/applelaptop\" title=\"Apple (Macbook)\">Apple (Macbook)</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/laptops/asuslaptop\" title=\"Asus\">Asus</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/laptops/dell\" title=\"Dell\">Dell</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/laptops/hp\" title=\"HP\">HP</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/laptops/lenovolaptop\" title=\"Lenovo\">Lenovo</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/laptops/acer\" title=\"Acer\">Acer</a></li>\n");
      out.write("                                            <li><a href=\"");
      out.print(request.getContextPath());
      out.write("/laptops/msi\" title=\"MSI\">MSI</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"fshop-nsm-col fshop-nsm-col20\">\n");
      out.write("                                        <h3 class=\"fshop-nsm-title\">Mức giá</h3>\n");
      out.write("                                        <ul class=\"fshop-nsm-list fshop-nsm-only\">\n");
      out.write("                                            <li><a href=\"duoi-5-trieu\" title=\"Dưới 5 triệu\">Dưới 5 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tu-5-10-trieu\" title=\"Từ 5 - 10 triệu\">Từ 5 - 10 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tu-10-15-trieu\" title=\"Từ 10 - 15 triệu\">Từ 10 - 15 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tu-15-20-trieu\" title=\"Từ 15 - 20 triệu\">Từ 15 - 20 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tu-20-25-trieu\" title=\"Từ 20 - 25 triệu\">Từ 20 - 25 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tu-25-30-trieu\" title=\"Từ 25 - 30 triệu\">Từ 25 - 30 triệu</a></li>\n");
      out.write("                                            <li><a href=\"tren-30-trieu\" title=\"Trên 30 triệu\">Trên 30 triệu</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" class=\"link-top-product\">\n");
      out.write("                                    Bảng xếp hạng điện thoại của tháng\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>   \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"Máy đổi trả\" target=\"_blank\"><i class=\"fi fi-maydoitra\"></i> Máy đổi trả</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"Xả hàng\"> <i class=\"fi fi-xahang\"></i> Xả hàng</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"Khuyến mãi\"><i class=\"fi fi-khuyenmai\"></i> Khuyến mãi</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"Tin hay\"><i class=\"fi fi-tinhay\"></i> Tin hay</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li >\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"Khuyến mãi\"><i class=\"fi fi-hoidap\"></i> Hỏi đáp</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("                <a class=\"fs-hotline\" href=\"#\" title=\"F.Freinds\"> \n");
      out.write("                    <i class=\"fi fi-ffreind\"></i> <p>Mua trước trả sau</p>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <!--                <script>\n");
      out.write("                                    $(\".fi-dienthoai\").mouseenter(function () {\n");
      out.write("                                        $(\"body\").css(\"background-color\", \"#eee\");\n");
      out.write("                                        $(\".fs-submenu\").css(\"display\",\"block\");\n");
      out.write("                                        $(\".fi-dienthoai\").addClass(\"active\");\n");
      out.write("                                    });\n");
      out.write("                                    $(\".fi-dienthoai\").mouseleave(function () {\n");
      out.write("                                        $(\"body\").css(\"background-color\", \"#fff\");\n");
      out.write("                                        $(\".fi-dienthoai\").removeClass(\"active\");\n");
      out.write("                                        $(\".fs-submenu\").css(\"display\",\"none\");\n");
      out.write("                                    });\n");
      out.write("                                </script>-->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <div style=\"background-color: #eee;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                ");
      out.write("\n");
      out.write("                ");

                    out.println(request.getParameter("id"));
                
      out.write("\n");
      out.write("                <form action=\"giohang\" method=\"post\">\n");
      out.write("\n");
      out.write("                    <div class=\"content\" id=\"content\" style=\"margin-top: 100px;background: #fff;height: 2000px;\">\n");
      out.write("\n");
      out.write("                        <h2 class=\"ck-tit-prod\">1.Các sản phẩm đặt mua</h2>\n");
      out.write("                        <div class=\"check-out-1\">\n");
      out.write("                            <div class=\"check-out-img\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"check-out-detail\">\n");
      out.write("                                <p class=\"ck-s1-tit\" id=\"productname\">OPPO F1s</p>\n");
      out.write("                                <p class=\"ck-s1-price\">\n");
      out.write("                                    5.990.000<sup>đ</sup>\n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                <p class=\"ck-s1-tit\" id=\"productname\" name=\"quantity\">Số Lượng</p>\n");
      out.write("\n");
      out.write("                                <select class=\"form-control quantity-product\" ng-model=\"myVar\" name=\"quantity\">\n");
      out.write("                                    <option value=\"1\" ng-selected=\"\">Số lượng: 01</option>\n");
      out.write("                                    <option value=\"2\">Số lượng: 02</option>\n");
      out.write("                                    <option value=\"3\">Số lượng: 03</option>\n");
      out.write("                                    <option value=\"4\">Số lượng: 04</option>\n");
      out.write("                                    <option value=\"5\">Số lượng: 05</option>\n");
      out.write("                                </select>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"check-out-2\">\n");
      out.write("                            <div ng-switch=\"myVar\">\n");
      out.write("                                <div ng-switch-when=\"1\">\n");
      out.write("\n");
      out.write("                                    <h2> Tổng đơn hàng: ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_0.setParent(null);
      _jspx_th_fmt_formatNumber_0.setType("number");
      _jspx_th_fmt_formatNumber_0.setMaxFractionDigits(3);
      _jspx_th_fmt_formatNumber_0.setValue(price);
      int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
      if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      out.write("</h2>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div ng-switch-when=\"2\">\n");
      out.write("\n");
      out.write("                                    <h2> Tổng đơn hàng: ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_1.setParent(null);
      _jspx_th_fmt_formatNumber_1.setType("number");
      _jspx_th_fmt_formatNumber_1.setMaxFractionDigits(3);
      _jspx_th_fmt_formatNumber_1.setValue((price * 2));
      int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
      if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_1);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      out.write("</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div ng-switch-when=\"3\">\n");
      out.write("\n");
      out.write("                                    <h2> Tổng đơn hàng: ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_2.setParent(null);
      _jspx_th_fmt_formatNumber_2.setType("number");
      _jspx_th_fmt_formatNumber_2.setMaxFractionDigits(3);
      _jspx_th_fmt_formatNumber_2.setValue((price * 3));
      int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
      if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_2);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      out.write("</h2>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div ng-switch-when=\"4\">\n");
      out.write("\n");
      out.write("                                    <h2>Tổng đơn hàng:  ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_3.setParent(null);
      _jspx_th_fmt_formatNumber_3.setType("number");
      _jspx_th_fmt_formatNumber_3.setMaxFractionDigits(3);
      _jspx_th_fmt_formatNumber_3.setValue((price * 4));
      int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
      if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_3);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      out.write("</h2>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div ng-switch-when=\"5\">\n");
      out.write("\n");
      out.write("                                    <h2>Tổng đơn hàng:  ");
      //  fmt:formatNumber
      org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_4 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
      _jspx_th_fmt_formatNumber_4.setPageContext(_jspx_page_context);
      _jspx_th_fmt_formatNumber_4.setParent(null);
      _jspx_th_fmt_formatNumber_4.setType("number");
      _jspx_th_fmt_formatNumber_4.setMaxFractionDigits(3);
      _jspx_th_fmt_formatNumber_4.setValue((price * 5));
      int _jspx_eval_fmt_formatNumber_4 = _jspx_th_fmt_formatNumber_4.doStartTag();
      if (_jspx_th_fmt_formatNumber_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_4);
        return;
      }
      _jspx_tagPool_fmt_formatNumber_value_type_maxFractionDigits_nobody.reuse(_jspx_th_fmt_formatNumber_4);
      out.write("</h2>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        ");

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

                        
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            $('#content').css(\"display\", \"none\");\n");
      out.write("                             $('#content2').css(\"display\", \"block\");\n");
      out.write("                        </script>\n");
      out.write("                        ");
                                    }

                        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"check-out-3\" style=\"margin-top: 50px;\">\n");
      out.write("                            <h2 class=\"ck-tit-prod\">2.Thông tin khách hàng</h2>\n");
      out.write("                            <p class=\"ck-s2-ibb\">Bạn vui lòng nhập thông tin cá nhân của bạn (những ô có dấu * là những ô bắt buộc)</p>\n");
      out.write("                            <div id=\"customer-info\" novalidate=\"novalidate\" class=\"customer-info\">\n");
      out.write("                                <ul class=\"ck-s2-iul clearfix\" id=\"ck-ifkh\" style=\"margin-left: 40px;margin-top: 40px;\">\n");
      out.write("                                    <li style=\"width: 300px;\">\n");
      out.write("                                        <div class=\"ck-s2-form ck-s2-frm\">\n");
      out.write("                                            <input type=\"text\" id=\"CustomerName\" name=\"CustomerName\" class=\"form-control valid\" placeholder=\"Họ và tên\" aria-required=\"true\" aria-invalid=\"false\"  value=\"");
      out.print(name);
      out.write("\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        ");

                                            if (name.equalsIgnoreCase("")) {
                                        
      out.write("\n");
      out.write("                                        <label id=\"name-error\" class=\"error\" for=\"name\">Bạn cần nhập đầy đủ họ tên</label>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"ck-s2-form ck-s2-frm\">\n");
      out.write("                                            <input type=\"text\" id=\"CustomerPhone\" name=\"CustomerPhone\" class=\"form-control\" placeholder=\"Số điện thoại\"  onkeypress='validate(event)' value=\"");
      out.print(phone);
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <script>function validate(evt) {\n");
      out.write("                                                var theEvent = evt || window.event;\n");
      out.write("                                                var key = theEvent.keyCode || theEvent.which;\n");
      out.write("                                                key = String.fromCharCode(key);\n");
      out.write("                                                var regex = /[0-9]|\\./;\n");
      out.write("                                                if (!regex.test(key)) {\n");
      out.write("                                                    theEvent.returnValue = false;\n");
      out.write("                                                    if (theEvent.preventDefault)\n");
      out.write("                                                        theEvent.preventDefault();\n");
      out.write("                                                }\n");
      out.write("                                            }\n");
      out.write("                                        </script>\n");
      out.write("                                        ");

                                            if (phone.equalsIgnoreCase("") || phone.length() < 9) {
                                        
      out.write("\n");
      out.write("                                        <label id=\"name-error\" class=\"error\" for=\"name\">Bạn cần nhập đúng số điện thoại</label>\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <div class=\"ck-s2-form\">\n");
      out.write("                                            <input type=\"email\" id=\"CustomerEmail\" name=\"CustomerEmail\" class=\"form-control valid\" placeholder=\"Email để theo dõi tiến độ đơn hàng\" aria-invalid=\"false\"  value=\"");
      out.print(email);
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"check-out-3\" style=\"margin-top: 50px;\">\n");
      out.write("                            <h2 class=\"ck-tit-prod\">3.Thông tin giao hàng</h2>\n");
      out.write("                            <p class=\"ck-s2-ibb\">Nhập thông tin giao hàng sẽ giúp bạn nhận được sản phẩm nhanh hơn</p>\n");
      out.write("                            <ul class=\"ck-s3-tinh\" style=\"  margin-left: 50px;margin-top: 50px;\">\n");
      out.write("                                <li style=\"width: 220px;\">\n");
      out.write("                                    <select class=\"form-control ck-s2-form1 selectpicker valid\" id=\"country\" name=\"txtCountry\" >\n");
      out.write("                                        <option value=\"\">Chọn Tỉnh/Thành phố</option>\n");
      out.write("                                        <option value=\"26\">Hà Nội</option>\n");
      out.write("                                        <option value=\"23\">Hồ Chí Minh</option>\n");
      out.write("                                        <option value=\"17\">Đà Nẵng</option>\n");
      out.write("                                        <option value=\"28\">Hải Phòng</option>\n");
      out.write("                                        <option value=\"1\">An Giang</option>\n");
      out.write("                                        <option value=\"4\">Bắc Giang</option>\n");
      out.write("                                        <option value=\"5\">Bắc Kạn</option>\n");
      out.write("                                        <option value=\"6\">Bạc Liêu</option>\n");
      out.write("                                        <option value=\"7\">Bắc Ninh</option>\n");
      out.write("                                        <option value=\"10\">Bến Tre</option>\n");
      out.write("                                        <option value=\"3\">Bình Định</option>\n");
      out.write("                                        <option value=\"2\">Bình Dương</option>\n");
      out.write("                                        <option value=\"8\">Bình Phước</option>\n");
      out.write("                                        <option value=\"11\">Bình Thuận</option>\n");
      out.write("                                        <option value=\"13\">Cà Mau</option>\n");
      out.write("                                        <option value=\"14\">Cần Thơ</option>\n");
      out.write("                                        <option value=\"12\">Cao Bằng</option>\n");
      out.write("                                        <option value=\"16\">Đak Lak</option>\n");
      out.write("                                        <option value=\"19\">Đak Nông</option>\n");
      out.write("                                        <option value=\"15\">Điện Biên</option>\n");
      out.write("                                        <option value=\"18\">Đồng Nai</option>\n");
      out.write("                                        <option value=\"20\">Đồng Tháp</option>\n");
      out.write("                                        <option value=\"21\">Gia Lai</option>\n");
      out.write("                                        <option value=\"25\">Hà Giang</option>\n");
      out.write("                                        <option value=\"27\">Hà Nam</option>\n");
      out.write("                                        <option value=\"29\">Hà Tĩnh</option>\n");
      out.write("                                        <option value=\"24\">Hải Dương</option>\n");
      out.write("                                        <option value=\"32\">Hậu Giang</option>\n");
      out.write("                                        <option value=\"22\">Hòa Bình</option>\n");
      out.write("                                        <option value=\"31\">Huế</option>\n");
      out.write("                                        <option value=\"33\">Hưng Yên</option>\n");
      out.write("                                        <option value=\"35\">Khánh Hòa</option>\n");
      out.write("                                        <option value=\"34\">Kiên Giang</option>\n");
      out.write("                                        <option value=\"36\">Kon Tum</option>\n");
      out.write("                                        <option value=\"39\">Lai châu</option>\n");
      out.write("                                        <option value=\"40\">Lâm Đồng</option>\n");
      out.write("                                        <option value=\"41\">Lạng Sơn</option>\n");
      out.write("                                        <option value=\"38\">Lào Cai</option>\n");
      out.write("                                        <option value=\"37\">Long An</option>\n");
      out.write("                                        <option value=\"44\">Nam Định</option>\n");
      out.write("                                        <option value=\"42\">Nghệ An</option>\n");
      out.write("                                        <option value=\"43\">Ninh Bình</option>\n");
      out.write("                                        <option value=\"45\">Ninh Thuận</option>\n");
      out.write("                                        <option value=\"46\">Phú Thọ</option>\n");
      out.write("                                        <option value=\"47\">Phú Yên</option>\n");
      out.write("                                        <option value=\"48\">Quảng Bình</option>\n");
      out.write("                                        <option value=\"51\">Quảng Nam</option>\n");
      out.write("                                        <option value=\"50\">Quảng Ngãi</option>\n");
      out.write("                                        <option value=\"49\">Quảng Ninh</option>\n");
      out.write("                                        <option value=\"52\">Quảng Trị</option>\n");
      out.write("                                        <option value=\"54\">Sóc Trăng</option>\n");
      out.write("                                        <option value=\"53\">Sơn La</option>\n");
      out.write("                                        <option value=\"58\">Tây Ninh</option>\n");
      out.write("                                        <option value=\"55\">Thái Bình</option>\n");
      out.write("                                        <option value=\"59\">Thái Nguyên</option>\n");
      out.write("                                        <option value=\"57\">Thanh Hóa</option>\n");
      out.write("                                        <option value=\"56\">Tiền Giang</option>\n");
      out.write("                                        <option value=\"61\">Trà Vinh</option>\n");
      out.write("                                        <option value=\"60\">Tuyên Quang</option>\n");
      out.write("                                        <option value=\"62\">Vĩnh Long</option>\n");
      out.write("                                        <option value=\"63\">Vĩnh Phúc</option>\n");
      out.write("                                        <option value=\"9\">Vũng Tàu</option>\n");
      out.write("                                        <option value=\"64\">Yên Bái</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <select class=\"form-control ck-s2-form1 valid\" name=\"DistrictIDShop\" id=\"DistrictIDShop\" name=\"txtGlosbe\">\n");
      out.write("                                        <option value=\"\">Chọn Quận/Huyện</option>\n");
      out.write("                                        <option value=\"274\">Quận Ba Đình</option>\n");
      out.write("                                        <option value=\"275\">Quận Hoàn Kiếm</option>\n");
      out.write("                                        <option value=\"276\">Quận Tây Hồ</option>\n");
      out.write("                                        <option value=\"277\">Quận Long Biên</option>\n");
      out.write("                                        <option value=\"278\">Quận Cầu Giấy</option>\n");
      out.write("                                        <option value=\"279\">Quận Đống Đa</option>\n");
      out.write("                                        <option value=\"280\">Quận Hai Bà Trưng</option>\n");
      out.write("                                        <option value=\"281\">Quận Hoàng Mai</option>\n");
      out.write("                                        <option value=\"282\">Quận Thanh Xuân</option>\n");
      out.write("                                        <option value=\"283\">Huyện Sóc Sơn</option>\n");
      out.write("                                        <option value=\"284\">Huyện Đông Anh</option>\n");
      out.write("                                        <option value=\"285\">Huyện Gia Lâm</option>\n");
      out.write("                                        <option value=\"286\">Huyện Từ Liêm</option>\n");
      out.write("                                        <option value=\"287\">Huyện Thanh Trì</option>\n");
      out.write("                                        <option value=\"288\">Huyện Ba Vì</option>\n");
      out.write("                                        <option value=\"289\">Huyện Chương Mỹ</option>\n");
      out.write("                                        <option value=\"290\">Huyện Đan Phượng</option>\n");
      out.write("                                        <option value=\"291\">Huyện Hoài Đức</option>\n");
      out.write("                                        <option value=\"292\">Huyện Mê Linh</option>\n");
      out.write("                                        <option value=\"293\">Huyện Mỹ Đức</option>\n");
      out.write("                                        <option value=\"294\">Huyện Phú Xuyên</option>\n");
      out.write("                                        <option value=\"295\">Huyện Phúc Thọ</option>\n");
      out.write("                                        <option value=\"296\">Huyện Quốc Oai</option>\n");
      out.write("                                        <option value=\"297\">Huyện Thạch Thất</option>\n");
      out.write("                                        <option value=\"298\">Huyện Thanh Oai</option>\n");
      out.write("                                        <option value=\"299\">Huyện Thường Tín</option>\n");
      out.write("                                        <option value=\"300\">Huyện ứng Hòa</option>\n");
      out.write("                                        <option value=\"301\">Quận Hà Đông</option>\n");
      out.write("                                        <option value=\"302\">Tx Sơn Tây</option>\n");
      out.write("\n");
      out.write("                                    </select>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li style=\"width: 280px;\">\n");
      out.write("                                    <input type=\"date\" name=\"Deliverydateshop\" id=\"Deliverydateshop\" class=\"form-control valid\" placeholder=\"Thời gian giao hàng\" aria-invalid=\"false\" name=\"txtDate\">\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"check-out-3\" style=\"margin-left: 150px;\">\n");
      out.write("                            <ul class=\"ck-s3-btn\">\n");
      out.write("                                <li style=\"    width: 250px;\">                                   \n");
      out.write("                                    <button type=\"submit\" id=\"btnAddOrder\" class=\"btn btn-danger ck-s3-btntt\" name=\"btnBuy\">\n");
      out.write("                                        <p>MUA NGAY<span>(Giao tận nơi hoặc nhận ở cửa hàng)</span></p>\n");
      out.write("                                    </button>\n");
      out.write("\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <button type=\"button\" id=\"PaymentOnline\" class=\"btn btn-success ck-s3-btntt\" onclick=\"ga('send', 'event', 'Fullflow', 'PayOnline', 'Samsung Galaxy J7 Prime');\">\n");
      out.write("                                        <p>Thanh Toán Online<span>(Hỗ trợ thanh toán ATM Visa Master)</span></p>\n");
      out.write("                                    </button>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"content\" id=\"content2\"  style=\"margin-top: 100px;background: #fff;height: 2000px;display: none;\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"ck-tab2-s1\">\n");
      out.write("                        <div class=\"ck-tab2-s1ok\">\n");
      out.write("                            <p class=\"ck-tab2-s1i\"><img src=\"images/icon-ok.png\" alt=\"\"></p>\n");
      out.write("                            <p>Đặt hàng thành công!</p>\n");
      out.write("                        </div>\n");
      out.write("                        <table class=\"table table-bordered ck-tab2-s1tb\" style=\"width: 755px;height: 285px;margin-left: 100px\">\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Sản phẩm</td>\n");
      out.write("                                    <td class=\"ck-tab2-titpr\"><strong>OPPO F1s </strong></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Số lượng </td>\n");
      out.write("                                    <td>1</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Màu sắc</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        Gold\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Giá</td>\n");
      out.write("                                    <td><p><strong>5.990.000đ</strong></p></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Khuyến mại bạn chọn</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <ul>\n");
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Phương thức nhận hàng:</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        Nhận tại địa chỉ:  <strong>asd</strong>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Thời gian dự kiến:</td>\n");
      out.write("                                    <td><strong> Ngày 03-10-2016</strong></td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Mã đơn hàng</td>\n");
      out.write("                                    <td><strong>3397376</strong></td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <p class=\"ck-tab2-s1tha\">Cám ơn bạn đã mua sắm tại FPTSHOP. Hy vọng bạn hài lòng với những sản phẩm đã mua.</p>\n");
      out.write("                        <div class=\"ck-tab2-btn clearfix\" style=\"    margin-left: 400px;\">\n");
      out.write("                            <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" class=\"ck-tab2-btnrep\">quay lại trang chủ</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"check-out-footer\">\n");
      out.write("                    Gọi ngay <span>1800 6601</span> để được tư vấn miễn phí\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/back-to-top.css\">\n");
      out.write("<div class=\"back-to-top display\">\n");
      out.write("\n");
      out.write("                <a href=\"#\" id=\"back-to-top\" title=\"Back to top\"><li class=\"back\"></li></a>\n");
      out.write("            </div>\n");
      out.write("            <script>\n");
      out.write("                            if ($('#back-to-top').length) {\n");
      out.write("                                var scrollTrigger = 100, // px\n");
      out.write("                                        backToTop = function () {\n");
      out.write("                                            var scrollTop = $(window).scrollTop();\n");
      out.write("                                            if (scrollTop > scrollTrigger) {\n");
      out.write("                                                $('#back-to-top').addClass('show');\n");
      out.write("                                            } else {\n");
      out.write("                                                $('#back-to-top').removeClass('show');\n");
      out.write("                                            }\n");
      out.write("                                        };\n");
      out.write("                                backToTop();\n");
      out.write("                                $(window).on('scroll', function () {\n");
      out.write("                                    backToTop();\n");
      out.write("                                });\n");
      out.write("                                $('#back-to-top').on('click', function (e) {\n");
      out.write("                                    e.preventDefault();\n");
      out.write("                                    $('html,body').animate({\n");
      out.write("                                        scrollTop: 0\n");
      out.write("                                    }, 700);\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("            </script>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #fff\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"container-fluid\" style=\"margin-left: -30px;margin-top: 3px\">\n");
      out.write("            <footer class=\"fs-footer\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"fshop-mainbox\"> \n");
      out.write("                        <div class=\"fs-ftrow clearfix\">\n");
      out.write("                            <div class=\"fs-ftcol fs-ftcol1\"> \n");
      out.write("                                <h2>Giới thiệu về công ty</h2> \n");
      out.write("                                <ul class=\"fs-ftul\"> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"Câu hỏi thường gặp mua hàng\">Câu hỏi thường gặp mua hàng</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"\">Các chính sách cua Shop</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"\">Hệ thống bảo hành</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"fs-ftcol fs-ftcol1\"> \n");
      out.write("                                <h2>Tin tuyển dụng</h2>\n");
      out.write("                                <ul class=\"fs-ftul\"> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"\">Tin khuyến mãi</a>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"\">Hướng dẫn mua online</a>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"\">Hướng dẫn mua trả góp</a>\n");
      out.write("                                    </li> \n");
      out.write("                                </ul> \n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"fs-ftcol fs-ftcol1\"> \n");
      out.write("                                <h2>Hệ thống cửa hàng</h2> \n");
      out.write("                                <ul class=\"fs-ftul\">  \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"\">Kiểm tra hàng Apple chính hãng</a>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"\">Giới thiệu máy đổi trả</a>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/trangchu\" title=\"\">Giới thiệu xả hàng</a></li>\n");
      out.write("                                </ul> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"fs-ftcol  fs-ftcol2\">\n");
      out.write("                                <div class=\"fs-ftr1\"> \n");
      out.write("                                    <span>Hỗ trợ thanh toán</span>\n");
      out.write("                                    <a class=\"fs-ftr-vs\" href=\"\" title=\"\"></a> \n");
      out.write("                                    <a class=\"fs-ftr-mt\" href=\"\" title=\"\"></a> \n");
      out.write("                                    <a class=\"fs-ftr-atm\" href=\"\" title=\"\"></a> \n");
      out.write("                                </div> \n");
      out.write("                                <ul class=\"fs-ftr2 clearfix\">   \n");
      out.write("                                    <li class=\"fs-li\"> <p>Tư vẫn miễn phí (24/7)</p> <a href=\"#\" title=\"\">1800 6601</a> </li> \n");
      out.write("                                    <li> <p>Góp ý, phản ánh(8h00 - 22h00)</p> <a href=\"#\" title=\"\">1800 6616</a> </li> \n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"fs-ftr3\"> \n");
      out.write("                                    <ul> \n");
      out.write("                                        <li><a class=\"fs-ftr-cthuong ta\" href=\"#\" title=\"\"></a></li> \n");
      out.write("                                        <li><a class=\"fs-ftr-dmca\" href=\"#\" title=\"\"></a></li>\n");
      out.write("                                        <li><a class=\"fs-ftr-sp\" href=\"#\" title=\"\"></a></li> \n");
      out.write("                                        <li><a class=\"fs-ftr-thieuvn\" href=\"#\" title=\"\"></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div> \n");
      out.write("                            </div> \n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"fs-ftbott\"> ©  2016 Công Ty Cổ Phần Bán Lẻ Kỹ Thuật Số / Địa chỉ: số 137 đường Lê Đức Thọ , quận Từ Liêm , TP. Hà Nội / \n");
      out.write("            Design by : TM </div> </footer>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
