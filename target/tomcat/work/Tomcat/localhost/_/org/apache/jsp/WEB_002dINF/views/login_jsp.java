/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-16 06:18:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("    <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"image/png\">\r\n");
      out.write("\r\n");
      out.write("    <title>睿道大雪雕</title>\r\n");
      out.write("\r\n");
      out.write("    <link href=\"css/style.default.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("    <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("    <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class=\"signin\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"signinpanel\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-7\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"signin-info\">\r\n");
      out.write("                 \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"mb20\"></div>\r\n");
      out.write("\r\n");
      out.write("                    <h3><strong>Welcome to Project Management</strong></h3>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><i class=\"fa fa-arrow-circle-o-right mr5\"></i>YHYSB</li>\r\n");
      out.write("                        <li><i class=\"fa fa-arrow-circle-o-right mr5\"></i> Add Your Employees</li>\r\n");
      out.write("                        <li><i class=\"fa fa-arrow-circle-o-right mr5\"></i> Retina Ready</li>\r\n");
      out.write("                        <li><i class=\"fa fa-arrow-circle-o-right mr5\"></i> Be Ready TO Management Your PRojects</li>\r\n");
      out.write("                        <li><i class=\"fa fa-arrow-circle-o-right mr5\"></i> and much more...</li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <div class=\"mb20\"></div>\r\n");
      out.write("                    <strong>Not a member? <a href=\"/signup\">Sign Up</a></strong>\r\n");
      out.write("                </div><!-- signin0-info -->\r\n");
      out.write("\r\n");
      out.write("            </div><!-- col-sm-7 -->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-md-5\">\r\n");
      out.write("\r\n");
      out.write("                <form id=\"logincheck\">\r\n");
      out.write("                    <h4 class=\"nomargin\">Sign In</h4>\r\n");
      out.write("                    <p class=\"mt5 mb20\">Login to access your account.</p>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"text\" class=\"form-control uname\" placeholder=\"userName\" id=\"userName\" name=\"userName\" onblur=\"isnull('userName','warnusername')\"/>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <p id=\"warnusername\" style=\"color: #ff0000\"></p>\r\n");
      out.write("                    <input type=\"password\" class=\"form-control pword\" placeholder=\"password\" id=\"password\" name=\"password\" onblur=\"isnull('password','warnpassword')\"/>\r\n");
      out.write("                    <p></p>\r\n");
      out.write("                    <p id=\"warnpassword\" style=\"color: #ff0000\"></p>\r\n");
      out.write("                    <p id=\"error\" style=\"color: #ff0000\"></p>\r\n");
      out.write("                    <a href=\"\"><small>Forgot Your Password?</small></a>\r\n");
      out.write("                    <input class=\"btn btn-success btn-block\" type=\"button\" value=\"Sign In\" onclick=\"logincheck()\" />\r\n");
      out.write("\r\n");
      out.write("                </form>\r\n");
      out.write("            </div><!-- col-sm-5 -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"signup-footer\">\r\n");
      out.write("            <div class=\"pull-left\">\r\n");
      out.write("                &copy; 2018. All Rights Reserved. Mr Wen,Mr Wang,Mr He,Mr Yang.\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"pull-right\">\r\n");
      out.write("                Created By: <a href=\"\" target=\"_blank\">睿道大雪雕</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div><!-- signin -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <input id=\"userId\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/modernizr.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.sparkline.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.cookies.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/toggles.min.js\"></script>\r\n");
      out.write("<script src=\"js/retina.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/checkOutputUser.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("    jQuery(document).ready(function(){\r\n");
      out.write("\r\n");
      out.write("        // Please do not use the code below\r\n");
      out.write("        // This is for demo purposes only\r\n");
      out.write("        var c = jQuery.cookie('change-skin');\r\n");
      out.write("        if (c && c == 'greyjoy') {\r\n");
      out.write("            jQuery('.btn-success').addClass('btn-orange').removeClass('btn-success');\r\n");
      out.write("        } else if(c && c == 'dodgerblue') {\r\n");
      out.write("            jQuery('.btn-success').addClass('btn-primary').removeClass('btn-success');\r\n");
      out.write("        } else if (c && c == 'katniss') {\r\n");
      out.write("            jQuery('.btn-success').addClass('btn-primary').removeClass('btn-success');\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("    function logincheck() {\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            method:\"POST\",\r\n");
      out.write("            url:\"logincheck\",\r\n");
      out.write("            data:$(\"#logincheck\").serialize(),\r\n");
      out.write("            success:function (result) {\r\n");
      out.write("                if(result.code===400)\r\n");
      out.write("                    window.document.getElementById(\"error\").innerText=result.message;\r\n");
      out.write("                else {\r\n");
      out.write("                    localStorage.setItem(\"user\",JSON.stringify(result.data));\r\n");
      out.write("                    window.location.href=\"index\";\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            error:function (){\r\n");
      out.write("                window.document.getElementById(\"error\").innerText=(\"Unknow error,Please check your network\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
