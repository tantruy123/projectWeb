package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("/index.jsp\" ><i class=\"fi fi-logo\"></i></a>   \n");
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
      out.write("                                <a href=\"bang-xep-hang#dien-thoai\" class=\"link-top-product\">\n");
      out.write("                                    Bảng xếp hạng điện thoại của tháng\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>   \n");
      out.write("                    </li>\n");
      out.write("                    <li  class=\"show\">\n");
      out.write("                        <a href=\"laptops\" title=\"Laptop\" class=\"boder-color\"><i class=\"fi fi-latop\"></i> Laptop</a>\n");
      out.write("                        <div class=\"sub-menu\">\n");
      out.write("                            <div class=\"fshop-nav-submenu clearfix\">\n");
      out.write("                                <div class=\"fshop-nsm-laptop\">\n");
      out.write("\n");
      out.write("                                    <div class=\"fshop-nsm-col fshop-nsm-col50\">\n");
      out.write("                                        <h3 class=\"fshop-nsm-title\">Hãng sản xuất</h3>\n");
      out.write("                                        <ul class=\"fshop-nsm-list fshop-nsm-triple\">\n");
      out.write("                                            <li><a href=\"apple-macbook\" title=\"Apple (Macbook)\">Apple (Macbook)</a></li>\n");
      out.write("                                            <li><a href=\"asus\" title=\"Asus\">Asus</a></li>\n");
      out.write("                                            <li><a href=\"dell\" title=\"Dell\">Dell</a></li>\n");
      out.write("                                            <li><a href=\"hp\" title=\"HP\">HP</a></li>\n");
      out.write("                                            <li><a href=\"lenovo\" title=\"Lenovo\">Lenovo</a></li>\n");
      out.write("                                            <li><a href=\"acer\" title=\"Acer\">Acer</a></li>\n");
      out.write("                                            <li><a href=\"msi\" title=\"MSI\">MSI</a></li>\n");
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
      out.write("                                <a href=\"bang-xep-hang#dien-thoai\" class=\"link-top-product\">\n");
      out.write("                                    Bảng xếp hạng điện thoại của tháng\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>   \n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"/may-doi-tra\" title=\"Máy đổi trả\" target=\"_blank\"><i class=\"fi fi-maydoitra\"></i> Máy đổi trả</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"/xa-hang\" title=\"Xả hàng\"> <i class=\"fi fi-xahang\"></i> Xả hàng</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"/khuyen-mai\" title=\"Khuyến mãi\"><i class=\"fi fi-khuyenmai\"></i> Khuyến mãi</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"/tin-tuc\" title=\"Tin hay\"><i class=\"fi fi-tinhay\"></i> Tin hay</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li >\n");
      out.write("                        <a href=\"/hoi-dap\" title=\"Khuyến mãi\"><i class=\"fi fi-hoidap\"></i> Hỏi đáp</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                </ul>\n");
      out.write("                <a class=\"fs-hotline\" href=\"/ffriends\" title=\"F.Freinds\"> \n");
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
