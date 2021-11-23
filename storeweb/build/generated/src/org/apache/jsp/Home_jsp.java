package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/css/Home.css");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">        \r\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write("        <style>");
      out.write(".hero {\r\n");
      out.write("        padding-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero.hero-normal {\r\n");
      out.write("        padding-bottom: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero.hero-normal .hero__categories {\r\n");
      out.write("        position: relative;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero.hero-normal .hero__categories ul {\r\n");
      out.write("        display: none;\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        left: 0;\r\n");
      out.write("        top: 46px;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        z-index: 9;\r\n");
      out.write("        background: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero.hero-normal .hero__search {\r\n");
      out.write("        margin-bottom: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__categories__all {\r\n");
      out.write("        background: #dc3545;\r\n");
      out.write("        position: relative;\r\n");
      out.write("        padding: 10px 25px 10px 40px;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__categories__all i {\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__categories__all span {\r\n");
      out.write("        font-size: 18px;\r\n");
      out.write("        font-weight: 700;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__categories{\r\n");
      out.write("        border: 1px solid #ebebeb;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".wrap-category {\r\n");
      out.write("    text-indent: 40px;\r\n");
      out.write("    padding-left: 0px;\r\n");
      out.write("    margin-bottom: 0px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__categories ul li, .sub-btn {\r\n");
      out.write("        list-style: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__categories a:hover {\r\n");
      out.write("    background-color: #e9ecef;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__categories ul li a {\r\n");
      out.write("        font-size: 16px;\r\n");
      out.write("        color: #1c1c1c;\r\n");
      out.write("        line-height: 39px;\r\n");
      out.write("        display: block;\r\n");
      out.write("        text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub-menu {\r\n");
      out.write("    display: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__item {\r\n");
      out.write("        display: flex;\r\n");
      out.write("        align-items: center;\r\n");
      out.write("        padding-left: 75px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__text span {\r\n");
      out.write("        font-size: 14px;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        font-weight: 700;\r\n");
      out.write("        letter-spacing: 4px;\r\n");
      out.write("        color: #7fad39;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__text h2 {\r\n");
      out.write("        font-size: 46px;\r\n");
      out.write("        color: #252525;\r\n");
      out.write("        line-height: 52px;\r\n");
      out.write("        font-weight: 700;\r\n");
      out.write("        margin: 10px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".hero__text p {\r\n");
      out.write("        margin-bottom: 35px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".product-img {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 300px;\r\n");
      out.write("    object-fit: contain;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-title {\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-title a {\r\n");
      out.write("    color: #000000;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".text-price {\r\n");
      out.write("    font-size: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-effect{\r\n");
      out.write("    color: #000000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-effect:hover {\r\n");
      out.write("    border-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-pills .nav-link.active {\r\n");
      out.write("    color: #000000;\r\n");
      out.write("    background-color: #e2e1e4;\r\n");
      out.write("    border-radius: 0;\r\n");
      out.write("    font-weight: 600;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigation.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"mx-4 mt-5\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-3\">\r\n");
      out.write("                    <section class=\"hero\">\r\n");
      out.write("                        <div class=\"hero__categories\">\r\n");
      out.write("                            <div class=\"hero__categories__all\">\r\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                                <span>Danh Mục</span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"nav flex-column nav-pills\" id=\"v-pills-tab\" role=\"tablist\" aria-orientation=\"vertical\">\r\n");
      out.write("                                <a class=\"nav-link nav-effect active\" id=\"all-tab\" data-toggle=\"pill\" href=\"#all\" role=\"tab\" aria-controls=\"all\" aria-selected=\"true\">Tất cả</a>\r\n");
      out.write("                                <a class=\"nav-link nav-effect\" id=\"book-tab\" data-toggle=\"pill\" href=\"#v-pills-book\" role=\"tab\" aria-controls=\"v-pills-book\" aria-selected=\"false\">Sách</a>\r\n");
      out.write("                                <a class=\"nav-link nav-effect\" id=\"clothes-tab\" data-toggle=\"pill\" href=\"#v-pills-clothes\" role=\"tab\" aria-controls=\"v-pills-clothes\" aria-selected=\"false\">Quần Áo</a>\r\n");
      out.write("                                <a class=\"nav-link nav-effect\" id=\"electronic-tab\" data-toggle=\"pill\" href=\"#v-pills-electronic\" role=\"tab\" aria-controls=\"v-pills-electronic\" aria-selected=\"false\">Đồ Điện Tử</a>\r\n");
      out.write("                                <a class=\"nav-link nav-effect\" id=\"shoes-tab\" data-toggle=\"pill\" href=\"#v-pills-shoes\" role=\"tab\" aria-controls=\"v-pills-shoes\" aria-selected=\"false\">Giày</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-9\">\r\n");
      out.write("                   <div class=\"tab-content\" id=\"v-pills-tabContent\">\r\n");
      out.write("                        <div class=\"tab-pane fade show active\" id=\"all\" role=\"tabpanel\" aria-labelledby=\"all-tab\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       \r\n");
      out.write("                        <div class=\"tab-pane fade\" id=\"v-pills-book\" role=\"tabpanel\" aria-labelledby=\"book-tab\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                       <div class=\"tab-pane fade\" id=\"v-pills-clothes\" role=\"tabpanel\" aria-labelledby=\"clothes-tab\">\r\n");
      out.write("                           <div class=\"row\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                       </div>\r\n");
      out.write("                       \r\n");
      out.write("                       <div class=\"tab-pane fade\" id=\"v-pills-electronic\" role=\"tabpanel\" aria-labelledby=\"electronic-tab\">\r\n");
      out.write("                           <div class=\"row\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                       </div>\r\n");
      out.write("                       \r\n");
      out.write("                       <div class=\"tab-pane fade\" id=\"v-pills-shoes\" role=\"tabpanel\" aria-labelledby=\"shoes-tab\">\r\n");
      out.write("                           <div class=\"row\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                       </div>\r\n");
      out.write("                    </div> \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Modal -->\r\n");
      out.write("            <div class=\"modal fade\" id=\"exampleModalCenter\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalCenterTitle\" aria-hidden=\"true\">\r\n");
      out.write("              <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                  <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLongTitle\">THÔNG BÁO</h5>\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("                      <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"modal-body\">\r\n");
      out.write("                    Thêm sản phẩm vào giỏ hàng thành công!\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"modal-footer\">\r\n");
      out.write("                    <button type=\"button\" class=\"btn btn-danger\" data-dismiss=\"modal\">OK</button>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("  \r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listBook}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                        \r\n");
          out.write("                                    <div class=\"col-4 mb-5\" id=\"book-block\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <img class=\"card-img-top img-fluid rounded product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"photo\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                              <h5 class=\"card-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"book\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.book.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                              <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <p class=\"text-warning font-weight-bold text-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</p>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                     <a href=\"?idAdd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"book\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger btn-block\">THÊM VÀO GIỎ HÀNG</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                              </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listClothes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-4 mb-5\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <img class=\"card-img-top img-fluid rounded product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"photo\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                              <h5 class=\"card-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"clothes\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.clothes.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                              <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <p class=\"text-warning font-weight-bold text-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</p>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <a href=\"?idAdd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"clothes\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger btn-block\">THÊM VÀO GIỎ HÀNG</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                              </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listElectronic}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-4 mb-5\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <img class=\"card-img-top img-fluid rounded product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"photo\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                              <h5 class=\"card-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"electronic\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.electronic.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                              <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <p class=\"text-warning font-weight-bold text-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</p>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <a href=\"?idAdd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"electronic\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger btn-block\">THÊM VÀO GIỎ HÀNG</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                              </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listShoes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-4 mb-5\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <img class=\"card-img-top img-fluid rounded product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"photo\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                              <h5 class=\"card-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"shoes\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.shoes.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                              <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <p class=\"text-warning font-weight-bold text-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</p>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <a href=\"?idAdd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"shoes\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger btn-block\">THÊM VÀO GIỎ HÀNG</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                              </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listBook}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("o");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("                        \r\n");
          out.write("                                    <div class=\"col-4 mb-5\" id=\"book-block\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <img class=\"card-img-top img-fluid rounded product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"photo\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                              <h5 class=\"card-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"book\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.book.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                              <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <p class=\"text-warning font-weight-bold text-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</p>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <a href=\"?idAdd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"book\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger btn-block\">THÊM VÀO GIỎ HÀNG</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                              </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listClothes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("o");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-4 mb-5\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <img class=\"card-img-top img-fluid rounded product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"photo\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                              <h5 class=\"card-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"clothes\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.clothes.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                              <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <p class=\"text-warning font-weight-bold text-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</p>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <a href=\"?idAdd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"book\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger btn-block\">THÊM VÀO GIỎ HÀNG</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                              </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent(null);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listElectronic}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setVar("o");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-4 mb-5\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <img class=\"card-img-top img-fluid rounded product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"photo\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                              <h5 class=\"card-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"electronic\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.electronic.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                              <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <p class=\"text-warning font-weight-bold text-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</p>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <a href=\"?idAdd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"book\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger btn-block\">THÊM VÀO GIỎ HÀNG</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                              </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent(null);
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listShoes}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_7.setVar("o");
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-4 mb-5\">\r\n");
          out.write("                                        <div class=\"card\">\r\n");
          out.write("                                            <img class=\"card-img-top img-fluid rounded product-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"photo\">\r\n");
          out.write("                                            <div class=\"card-body\">\r\n");
          out.write("                                              <h5 class=\"card-title\"><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"shoes\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" title=\"View Product\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.shoes.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                              <div class=\"row\">\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <p class=\"text-warning font-weight-bold text-price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" VNĐ</p>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"col\">\r\n");
          out.write("                                                    <a href=\"?idAdd=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"book\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-danger btn-block\">THÊM VÀO GIỎ HÀNG</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                              </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }
}
