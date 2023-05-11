package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addCart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Rimba Fashion Store</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/shoes_clothes.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/mystyles.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/details.css\">\n");
      out.write("        <link rel=\"icon\" href=\"imgs/logo.png\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"main-header\">\n");
      out.write("            <nav>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"about-us.jsp\">About us</a></li>\n");
      out.write("                        <li><a href=\"location.jsp\">Location</a></li>\n");
      out.write("                        <li><a href=\"contact.jsp\">Contact us</a></li>\n");
      out.write("                        <li><a href=\"login\">Login</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </nav>\n");
      out.write("            <img src='imgs/logo.png'height='200'>\n");
      out.write("            <h1 class=\"band-name band-name-large\">RIMBA <strong>FASHION</strong> STORE</h1>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section class=\"container content-section\" id=\"content-section\">\n");
      out.write("            <h2 class=\"section-header\">CART</h2>\n");
      out.write("            <div class=\"cart-row\">\n");
      out.write("                <span class=\"cart-item cart-header cart-column\">ITEM</span>\n");
      out.write("                <span class=\"cart-price cart-header cart-column\">PRICE</span>\n");
      out.write("                <span class=\"cart-quantity cart-header cart-column\">QUANTITY</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cart-items\">\n");
      out.write("\n");
      out.write("                <!--begin cart list item-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"cart-row\">\n");
      out.write("                        <div class=\"cart-item cart-column\">\n");
      out.write("                            <img class=\"cart-item-image\" src=\"./imgs/dress2.jpg}\" width=\"100\" height=\"100\" alt=\"khonglayduoc\">\n");
      out.write("                            <span class=\"cart-item-title\">TENSP</span>\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"cart-price cart-column\">100000</span>\n");
      out.write("                        <div class=\"cart-quantity cart-column\">\n");
      out.write("                            <input class=\"cart-quantity-input\" type=\"number\" value=\"1\"  min=\"1\" max=\"5\">\n");
      out.write("                            <!--<span class=\"cart-quantity-input\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.getSoluongmua()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>-->\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("\n");
      out.write("                <!--end cart list item-->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cart-total\">\n");
      out.write("                <strong class=\"cart-total-title\">Total</strong>\n");
      out.write("                <span class=\"cart-total-price\">0</span>\n");
      out.write("            </div>\n");
      out.write("            <button class=\"btn btn-primary btn-purchase\" type=\"button\">THÊM VÀO GIỎ HÀNG</button>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <footer class=\"main-footer\">\n");
      out.write("            <div class=\"container main-footer-container\">\n");
      out.write("                <h3 class=\"band-name text-center\">Rimba Fashion Store</h3>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
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
