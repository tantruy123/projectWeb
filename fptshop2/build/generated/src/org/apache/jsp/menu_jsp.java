package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link rel=\"stylesheet\" href=\"css/test.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"sub-menu\">\n");
      out.write("                                <div class=\"fshop-nav-submenu clearfix\">\n");
      out.write("                                    <div class=\"fshop-nsm-mobile\">\n");
      out.write("\n");
      out.write("                                                <div class=\"fshop-nsm-col fshop-nsm-col50\">\n");
      out.write("                                                    <h3 class=\"fshop-nsm-title\">Hãng sản xuất</h3>\n");
      out.write("                                                    <ul class=\"fshop-nsm-list fshop-nsm-triple\">\n");
      out.write("                                                            <li><a href=\"/dien-thoai/apple-iphone\" title=\"Apple (iPhone)\">Apple (iPhone)</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/oppo\" title=\"OPPO\">OPPO</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/sony\" title=\"Sony\">Sony</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/samsung\" title=\"Samsung\">Samsung</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/wing\" title=\"Wing\">Wing</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/nokia\" title=\"Nokia\">Nokia</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/htc\" title=\"HTC\">HTC</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/asus\" title=\"Asus\">Asus</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/lenovo\" title=\"Lenovo\">Lenovo</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/gionee\" title=\"Gionee\">Gionee</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/philips\" title=\"Philips\">Philips</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/mobell\" title=\"Mobell\">Mobell</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/huawei\" title=\"Huawei\">Huawei</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/oneplus\" title=\"OnePlus\">OnePlus</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/obi-worldphone\" title=\"Obi WorldPhone\">Obi WorldPhone</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/mobiistar\" title=\"Mobiistar\">Mobiistar</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/coolpad\" title=\"Coolpad\">Coolpad</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/masstel\" title=\"Masstel\">Masstel</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/meizu\" title=\"MEIZU\">MEIZU</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/vivo\" title=\"ViVo\">ViVo</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"fshop-nsm-col fshop-nsm-col20\">\n");
      out.write("                                                    <h3 class=\"fshop-nsm-title\">Mức giá</h3>\n");
      out.write("                                                    <ul class=\"fshop-nsm-list fshop-nsm-only\">\n");
      out.write("                                                            <li><a href=\"/dien-thoai/duoi-1-trieu\" title=\"Dưới 1 triệu\">Dưới 1 triệu</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/tu-1-trieu-den-3-trieu\" title=\"Từ 1 triệu đến 3 triệu\">Từ 1 triệu đến 3 triệu</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/tu-3-trieu-den-6-trieu\" title=\"Từ 3 triệu đến 6 triệu\">Từ 3 triệu đến 6 triệu</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/tu-6-trieu-den-10-trieu\" title=\"Từ 6 triệu đến 10 triệu\">Từ 6 triệu đến 10 triệu</a></li>\n");
      out.write("                                                            <li><a href=\"/dien-thoai/tren-10-trieu\" title=\"Trên 10 triệu\">Trên 10 triệu</a></li>\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <a href=\"http://fptshop.com.vn/bang-xep-hang#dien-thoai\" class=\"link-top-product\">\n");
      out.write("                                        Bảng xếp hạng điện thoại của tháng\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
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
