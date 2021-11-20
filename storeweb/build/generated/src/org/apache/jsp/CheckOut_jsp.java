package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CheckOut_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"vi\">\r\n");
      out.write("<head>\r\n");
      out.write("     <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("    <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("    <!------ Include the above in your HEAD tag ---------->\r\n");
      out.write(" </head>   \r\n");
      out.write("    <body>\r\n");
      out.write("<div id=\"contact\" class=\"container-fluid bg-grey\">\r\n");
      out.write("    <h2 class=\"jumbotron text-center\">CheckOut</h2>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-sm-8 \">\r\n");
      out.write("             <p>Địa chỉ*</p>\r\n");
      out.write("            <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Số nhà, ngõ...\" type=\"text\" required>\r\n");
      out.write("            <br><input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Toà nhà, số phòng(chung cư...)\" type=\"text\" required>\r\n");
      out.write("            <p>Tỉnh, thành phố*</p>\r\n");
      out.write("            <input class=\"form-control\"name=\"tỉnh, thành phố\" type=\"tỉnh\" required>\r\n");
      out.write("            <p>Quận, huyện*</p>\r\n");
      out.write("            <input class=\"form-control\"  name=\"tỉnh, thành phố\" type=\"tỉnh\" required>\r\n");
      out.write("            <p>Phường, xã*</p>\r\n");
      out.write("            <input class=\"form-control\" name=\"tỉnh, thành phố\" type=\"tỉnh\" required>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <p>SĐT*</p>\r\n");
      out.write("                    <input name=\"Email\" type=\"tỉnh\" >\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                    <p>Email*</p>\r\n");
      out.write("                    <input name=\"email\" placeholder=\"Email\"  type=\"email\" >\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-sm-3 jumbotron\">\r\n");
      out.write("        <h3 class=\" text-center\">Đơn Của Bạn</h3>              \r\n");
      out.write("                        <!-- <div class=\"container\">\r\n");
      out.write("                            <div id=\"login-row\" class=\"row justify-content-center align-items-center\">\r\n");
      out.write("                                <div id=\"login-column\" class=\"col-md-6\">\r\n");
      out.write("                                    <div id=\"login-box\" class=\"col-md-12\">\r\n");
      out.write("                                        <form id=\"login-form\" class=\"form\" action=\"\" method=\"post\">\r\n");
      out.write("                                        \r\n");
      out.write("                                            <button type=\"submit\"class=\"btn btn-info btn-md\"><a class=\"text-white text-uppercase\" href=\"back.html\">Back</a></button>\r\n");
      out.write("                                            <button type=\"submit\"class=\"btn btn-info btn-md pull-right\"><a class=\"text-white text-uppercase\" href=\"index.html\">Usename</a></button>\r\n");
      out.write("                                         <button type=\"submit\"s=\"btn btn-info btn-md\"><a class=\"right\" href=\"index.html\">usename</a></button>-->\r\n");
      out.write("            <!-- <br><br><br> --> \r\n");
      out.write("           <p>Đơn vị vận chuyển</p> \r\n");
      out.write("           <div class=\"d-block my-3\">\r\n");
      out.write("            <div class=\"custom-control custom-radio \">\r\n");
      out.write("              <input id=\"credt\" name=\"payment\" type=\"radio\" class=\"custom-control-input\" checked required>\r\n");
      out.write("              <label class=\"custom-control-label\" for=\"credt\">Economaical</label>\r\n");
      out.write("              <!-- <span class=\"text-muted\">25.000</span> -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"custom-control custom-radio\">\r\n");
      out.write("              <input id=\"debt\" name=\"payment\" type=\"radio\" class=\"custom-control-input\" required>\r\n");
      out.write("              <label class=\"custom-control-label\" for=\"debt\">Express   </label>\r\n");
      out.write("              <!-- <span class=\"text-muted\">   30.000</span> -->\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <li class=\" d-flex justify-content-between\">\r\n");
      out.write("            <h6 class=\"my-0\">Tổng tiền hàng</h6>\r\n");
      out.write("          <span class=\"text-muted\">25.000</span>\r\n");
      out.write("        </li>\r\n");
      out.write("            <li class=\" d-flex justify-content-between\">\r\n");
      out.write("                  <h6 class=\"my-0\">Phí vận chuyển</h6>\r\n");
      out.write("                <span class=\"text-muted\">25.000</span>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li class=\" d-flex justify-content-between lh-condensed\">\r\n");
      out.write("              <h6 class=\"my-1 text-info\">Tổng tiền</h6>\r\n");
      out.write("             <!-- <script language=\"JavaScript\"> \r\n");
      out.write("              let a = 20;\r\n");
      out.write("              let b = 30;\r\n");
      out.write("              \r\n");
      out.write("              // Tính tổng\r\n");
      out.write("              let tong = a + b;\r\n");
      out.write("              \r\n");
      out.write("              document.write(\"Tổng hai số là: \" + tong);\r\n");
      out.write("            </script> -->\r\n");
      out.write("              <span class=\"text-info\">$12</span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <div class=\"d-block my-3\">\r\n");
      out.write("                <p>Hình thức thanh toán</p>\r\n");
      out.write("                <div class=\"custom-control custom-radio\">\r\n");
      out.write("                  <input id=\"credit\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" checked required>\r\n");
      out.write("                  <label class=\"custom-control-label\" for=\"credit\">Credit</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"custom-control custom-radio\">\r\n");
      out.write("                  <input id=\"debit\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" required>\r\n");
      out.write("                  <label class=\"custom-control-label\" for=\"debit\">Cash</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"custom-control custom-radio\">\r\n");
      out.write("                  <input id=\"paypal\" name=\"paymentMethod\" type=\"radio\" class=\"custom-control-input\" required>\r\n");
      out.write("                  <label class=\"custom-control-label\" for=\"paypal\">Check</label>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("                                         <button type=\"button\" class=\"btn btn-danger\">Thanh toán</button>\r\n");
      out.write("       \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("    </body>");
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
