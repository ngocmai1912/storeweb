package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Navigation.jsp", out, false);
      out.write("\r\n");
      out.write("        <div class=\"shopping-cart\">\r\n");
      out.write("            <div class=\"px-4 px-lg-0\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"pb-5\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-12 p-5 bg-white rounded shadow-sm mb-5\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- Shopping cart table -->\r\n");
      out.write("                                <div class=\"table-responsive\">\r\n");
      out.write("                                    <table class=\"table\">\r\n");
      out.write("                                        <thead>\r\n");
      out.write("                                            <tr>\r\n");
      out.write("                                                <th scope=\"col\" class=\"border-0 bg-light\">\r\n");
      out.write("                                                    <div class=\"p-2 px-3 text-uppercase\">Sản Phẩm</div>\r\n");
      out.write("                                                </th>\r\n");
      out.write("                                                <th scope=\"col\" class=\"border-0 bg-light\">\r\n");
      out.write("                                                    <div class=\"py-2 text-uppercase\">Đơn Giá</div>\r\n");
      out.write("                                                </th>\r\n");
      out.write("                                                <th scope=\"col\" class=\"border-0 bg-light\">\r\n");
      out.write("                                                    <div class=\"py-2 text-uppercase\">Số Lượng</div>\r\n");
      out.write("                                                </th>\r\n");
      out.write("                                                <th scope=\"col\" class=\"border-0 bg-light\">\r\n");
      out.write("                                                    <div class=\"py-2 text-uppercase\">Xóa</div>\r\n");
      out.write("                                                </th>\r\n");
      out.write("                                            </tr>\r\n");
      out.write("                                        </thead>\r\n");
      out.write("                                        <tbody>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </tbody>\r\n");
      out.write("                                    </table>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- End -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"row py-5 p-4 bg-white rounded shadow-sm justify-content-end\">\r\n");
      out.write("                            <div class=\"col-lg-6\">\r\n");
      out.write("                                <div class=\"bg-light rounded-pill px-4 py-3 text-uppercase font-weight-bold\">Thành tiền</div>\r\n");
      out.write("                                <div class=\"p-4\">\r\n");
      out.write("                                    <ul class=\"list-unstyled mb-4\">\r\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Tổng tiền hàng</strong><strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(total)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong></li>\r\n");
      out.write("                                        <li class=\"d-flex justify-content-between py-3 border-bottom\"><strong class=\"text-muted\">Tổng thanh toán</strong>\r\n");
      out.write("                                            <h5 class=\"font-weight-bold\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(sum)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" ₫</h5>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                    </ul><a href=\"order?total=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${total}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-dark rounded-pill py-2 btn-block\">Mua hàng</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("    <script>\r\n");
      out.write("        $(\"#btn-add-book\").click(function(){\r\n");
      out.write("             var amount = document.getElementById(\"amount\").innerHTML;\r\n");
      out.write("             var t = 0;\r\n");
      out.write("             t += amount;\r\n");
      out.write("             t++;\r\n");
      out.write("             document.getElementById(\"amount\").innerText = t;\r\n");
      out.write("         });\r\n");
      out.write("         $(\"#btn-sub-book\").click(function(){\r\n");
      out.write("             var amount = document.getElementById(\"amount\").innerHTML;\r\n");
      out.write("             \r\n");
      out.write("             if(amount > 1){\r\n");
      out.write("                 var t = 0;\r\n");
      out.write("                t += amount;\r\n");
      out.write("                 t--;\r\n");
      out.write("             }\r\n");
      out.write("             document.getElementById(\"amount\").innerText = t;\r\n");
      out.write("         });\r\n");
      out.write("    </script>\r\n");
      out.write("</html>\r\n");
      out.write("</html>\r\n");
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
          out.write("\r\n");
          out.write("                                                <tr>\r\n");
          out.write("                                                    <th scope=\"row\">\r\n");
          out.write("                                                        <div class=\"p-2\">\r\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\r\n");
          out.write("                                                            <div class=\"ml-3 d-inline-block align-middle\">\r\n");
          out.write("                                                                <h5 class=\"mb-0\"> <a href=\"#\" class=\"text-dark d-inline-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.book.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </th>\r\n");
          out.write("                                                    <td class=\"align-middle\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\r\n");
          out.write("                                                   <td class=\"align-middle\">\r\n");
          out.write("                                                        <a ><button id=\"btn-sub-book\" class=\"btnSub\">-\r\n");
          out.write("                                                            </button></a> <strong id =\"amount\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\r\n");
          out.write("                                                        <button id = \"btn-add-book\" class=\"btnAdd\">+</button>\r\n");
          out.write("                                                    </td>d\r\n");
          out.write("                                                    <td class=\"align-middle\">\r\n");
          out.write("                                                        <a href=\"cart?dl=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"book\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></a>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                </tr> \r\n");
          out.write("                                            ");
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
          out.write("                                                <tr>\r\n");
          out.write("                                                    <th scope=\"row\">\r\n");
          out.write("                                                        <div class=\"p-2\">\r\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\r\n");
          out.write("                                                            <div class=\"ml-3 d-inline-block align-middle\">\r\n");
          out.write("                                                                <h5 class=\"mb-0\"> <a href=\"#\" class=\"text-dark d-inline-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.clothes.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </th>\r\n");
          out.write("                                                    <td class=\"align-middle\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\r\n");
          out.write("                                                    <td class=\"align-middle\">\r\n");
          out.write("                                                        <a ><button id=\"btn-sub-clothes\" class=\"btnSub\">-\r\n");
          out.write("                                                            </button></a> <strong id =\"amount\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\r\n");
          out.write("                                                        <button id = \"btn-add-clothes\" class=\"btnAdd\">+</button>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"align-middle\">\r\n");
          out.write("                                                        <a href=\"cart?dl=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"clothes\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></a>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                </tr> \r\n");
          out.write("                                            ");
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
          out.write("                                                <tr>\r\n");
          out.write("                                                    <th scope=\"row\">\r\n");
          out.write("                                                        <div class=\"p-2\">\r\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\r\n");
          out.write("                                                            <div class=\"ml-3 d-inline-block align-middle\">\r\n");
          out.write("                                                                <h5 class=\"mb-0\"> <a href=\"#\" class=\"text-dark d-inline-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.electronic.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </th>\r\n");
          out.write("                                                    <td class=\"align-middle\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\r\n");
          out.write("                                                    <td class=\"align-middle\">\r\n");
          out.write("                                                        <a ><button id=\"btn-sub-electronic\" class=\"btnSub\">-\r\n");
          out.write("                                                            </button></a> <strong id =\"amount\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\r\n");
          out.write("                                                        <button id = \"btn-add-electronic\" class=\"btnAdd\">+</button>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"align-middle\">\r\n");
          out.write("                                                        <a href=\"cart?dl=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"electronic\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></a>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                </tr> \r\n");
          out.write("                                            ");
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
          out.write("                                                <tr>\r\n");
          out.write("                                                    <th scope=\"row\">\r\n");
          out.write("                                                        <div class=\"p-2\">\r\n");
          out.write("                                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"70\" class=\"img-fluid rounded shadow-sm\">\r\n");
          out.write("                                                            <div class=\"ml-3 d-inline-block align-middle\">\r\n");
          out.write("                                                                <h5 class=\"mb-0\"> <a href=\"#\" class=\"text-dark d-inline-block\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.shoes.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5><span class=\"text-muted font-weight-normal font-italic\"></span>\r\n");
          out.write("                                                            </div>\r\n");
          out.write("                                                        </div>\r\n");
          out.write("                                                    </th>\r\n");
          out.write("                                                    <td class=\"align-middle\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${Math.round(o.price)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong></td>\r\n");
          out.write("                                                  <td class=\"align-middle\">\r\n");
          out.write("                                                        <a ><button id=\"btn-sub-shoes\" class=\"btnSub\">-\r\n");
          out.write("                                                            </button></a> <strong id =\"amount\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.amount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</strong>\r\n");
          out.write("                                                        <button id = \"btn-add-shoes\" class=\"btnAdd\">+</button>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                    <td class=\"align-middle\">\r\n");
          out.write("                                                        <a href=\"cart?dl=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&type=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${\"shoes\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></a>\r\n");
          out.write("                                                    </td>\r\n");
          out.write("                                                </tr> \r\n");
          out.write("                                            ");
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
}
