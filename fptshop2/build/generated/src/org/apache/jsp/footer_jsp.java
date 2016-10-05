package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <footer class=\"fs-footer\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"fshop-mainbox\"> \n");
      out.write("                        <div class=\"fs-ftrow clearfix\">\n");
      out.write("                            <div class=\"fs-ftcol fs-ftcol1\"> \n");
      out.write("                                <h2>Giới thiệu về công ty</h2> \n");
      out.write("                                <ul class=\"fs-ftul\"> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/huong-dan/cau-hoi-thuong-gap\" title=\"Câu hỏi thường gặp mua hàng\">Câu hỏi thường gặp mua hàng</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/ho-tro/chinh-sach-bao-mat\" title=\"\">Các chính sách FPT Shop</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/ho-tro/chinh-sach-bao-hanh\" title=\"\">Hệ thống bảo hành</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul> \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"fs-ftcol fs-ftcol1\"> \n");
      out.write("                                <h2>Tin tuyển dụng</h2>\n");
      out.write("                                <ul class=\"fs-ftul\"> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/tin-tuc/Tin-khuyen-mai\" title=\"\">Tin khuyến mãi</a>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/huong-dan/huong-dan-mua-hang\" title=\"\">Hướng dẫn mua online</a>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/tra-gop\" title=\"\">Hướng dẫn mua trả góp</a>\n");
      out.write("                                    </li> \n");
      out.write("                                </ul> \n");
      out.write("                            </div> \n");
      out.write("                            <div class=\"fs-ftcol fs-ftcol1\"> \n");
      out.write("                                <h2>Hệ thống cửa hàng</h2> \n");
      out.write("                                <ul class=\"fs-ftul\">  \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/kiem-tra-hang-apple-chinh-hang\" title=\"\">Kiểm tra hàng Apple chính hãng</a>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/ho-tro/gioi-thieu-may-doi-tra\" title=\"\">Giới thiệu máy đổi trả</a>\n");
      out.write("                                    </li> \n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"http://fptshop.com.vn/ho-tro/gioi-thieu-xa-hang\" title=\"\">Giới thiệu xả hàng</a></li>\n");
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
      out.write("                                    <li class=\"fs-li\"> <p>Tư vẫn miễn phí (24/7)</p> <a href=\"javascript:;\" title=\"\">1800 6601</a> </li> \n");
      out.write("                                    <li> <p>Góp ý, phản ánh(8h00 - 22h00)</p> <a href=\"javascript:;\" title=\"\">1800 6616</a> </li> \n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"fs-ftr3\"> \n");
      out.write("                                    <ul> \n");
      out.write("                                        <li><a class=\"fs-ftr-cthuong ta\" href=\"javascript:;\" title=\"\"></a></li> \n");
      out.write("                                        <li><a class=\"fs-ftr-dmca\" href=\"javascript:;\" title=\"\"></a></li>\n");
      out.write("                                        <li><a class=\"fs-ftr-sp\" href=\"javascript:;\" title=\"\"></a></li> \n");
      out.write("                                        <li><a class=\"fs-ftr-thieuvn\" href=\"javascript:;\" title=\"\"></a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div> \n");
      out.write("                            </div> \n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"fs-ftbott\"> © 2007 - 2016 Công Ty Cổ Phần Bán Lẻ Kỹ Thuật Số FPT / Địa chỉ: 261 Khánh Hội, P5, Q4, TP. Hồ Chí Minh / \n");
      out.write("            GPĐKKD số 0311609355 do Sở KHĐT TP.HCM cấp ngày 08/03/2012. </div> </footer>\n");
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
