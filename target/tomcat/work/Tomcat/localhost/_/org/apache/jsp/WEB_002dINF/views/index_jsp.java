/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-08-16 06:18:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\">\r\n");
      out.write("  <meta name=\"description\" content=\"\">\r\n");
      out.write("  <meta name=\"author\" content=\"\">\r\n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"images/favicon.png\" type=\"image/png\">\r\n");
      out.write("\r\n");
      out.write("  <title>睿道大雪雕</title>\r\n");
      out.write("\r\n");
      out.write("  <link href=\"css/style.default.css\" rel=\"stylesheet\">\r\n");
      out.write("  <link href=\"css/jquery.gritter.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css\">\r\n");
      out.write("  <script src=\"http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js\"></script>\r\n");
      out.write("  <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("  <!--[if lt IE 9]>\r\n");
      out.write("  <script src=\"js/html5shiv.js\"></script>\r\n");
      out.write("  <script src=\"js/respond.min.js\"></script>\r\n");
      out.write("  <![endif]-->\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Preloader -->\r\n");
      out.write("<div id=\"preloader\">\r\n");
      out.write("    <div id=\"status\"><i class=\"fa fa-spinner fa-spin\"></i></div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"leftpanel\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"logopanel\">\r\n");
      out.write("        <h1 align=\"center\"><span >[Poject] [Management]</span></h1>\r\n");
      out.write("    </div><!-- logopanel -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"leftpanelinner\">\r\n");
      out.write("\r\n");
      out.write("        <!-- This is only visible to small devices -->\r\n");
      out.write("        <div class=\"visible-xs hidden-sm hidden-md hidden-lg\">\r\n");
      out.write("            <div class=\"media userlogged\">\r\n");
      out.write("                <img alt=\"\" src=\"\" class=\"media-object\">\r\n");
      out.write("                <div class=\"media-body\">\r\n");
      out.write("                  <h4>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.userName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h4>\r\n");
      out.write("                    <span>\"Life is so...\"</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <h5 class=\"sidebartitle actitle\">Account</h5>\r\n");
      out.write("            <ul class=\"nav nav-pills nav-stacked nav-bracket mb30\">\r\n");
      out.write("              <li><a href=\"\"><i class=\"fa fa-user\"></i> <span>Profile</span></a></li>\r\n");
      out.write("              <li><a href=\"/myapplication\"><i class=\"fa fa-cog\"></i> <span>My Application</span></a></li>\r\n");
      out.write("              <li><a href=\"\"><i class=\"fa fa-question-circle\"></i> <span>Help</span></a></li>\r\n");
      out.write("              <li><a href=\"/logout\"><i class=\"fa fa-sign-out\"></i> <span>Log Out</span></a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      <h5 class=\"sidebartitle\">Navigation</h5>\r\n");
      out.write("      <ul class=\"nav nav-pills nav-stacked nav-bracket\">\r\n");
      out.write("        <li class=\"active\"><a href=\"/index\"><i class=\"fa fa-home\"></i> <span>Dashboard</span></a></li>\r\n");
      out.write("        \r\n");
      out.write("        <li class=\"nav-parent\"><a href=\"\"><i class=\"fa fa-edit\"></i> <span>Project Insert</span></a>\r\n");
      out.write("          <ul class=\"children\">\r\n");
      out.write("            <li><a href=\"/insertProject\"><i class=\"fa fa-caret-right\"></i> Add Project</a></li>\r\n");
      out.write("            <li><a href=\"/insertEmployee\"><i class=\"fa fa-caret-right\"></i> Add Employee</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-parent\"><a href=\"\"><i class=\"fa fa-search\"></i> <span>Management</span></a>\r\n");
      out.write("          <ul class=\"children\">\r\n");
      out.write("            <li><a href=\"/projectList\"><i class=\"fa fa-caret-right\"></i> Projects</a></li>\r\n");
      out.write("            <li><a href=\"/staffList\"><i class=\"fa fa-caret-right\"></i> Employees</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-parent\"><a href=\"\"><i class=\"fa fa-laptop\"></i> <span>Manager Controls</span></a>\r\n");
      out.write("            <ul class=\"children\">\r\n");
      out.write("                <li><a href=\"#\"><i class=\"fa fa-caret-right\"></i> Users</a></li>\r\n");
      out.write("                <li><a href=\"/applicationList\"><i class=\"fa fa-caret-right\"></i> Application Processing</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li class=\"nav-parent\"><a href=\"\"><i class=\"fa fa-user\"></i> <span>Users Controls</span></a>\r\n");
      out.write("            <ul class=\"children\">\r\n");
      out.write("                <li><a href=\"/application\"><i class=\"fa fa-caret-right\"></i> Application</a></li>\r\n");
      out.write("                <li><a href=\"/myapplication\"><i class=\"fa fa-caret-right\"></i> View Result</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("      </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div><!-- leftpanelinner -->\r\n");
      out.write("  </div><!-- leftpanel -->\r\n");
      out.write("\r\n");
      out.write("  <div class=\"mainpanel\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"headerbar\">\r\n");
      out.write("\r\n");
      out.write("      <a class=\"menutoggle\"><i class=\"fa fa-bars\"></i></a>\r\n");
      out.write("\r\n");
      out.write("      <form class=\"searchform\" action=\"#\" method=\"post\">\r\n");
      out.write("        <input type=\"text\" class=\"form-control\" name=\"keyword\" placeholder=\"Search here...\" />\r\n");
      out.write("      </form>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"header-right\">\r\n");
      out.write("        <ul class=\"headermenu\">\r\n");
      out.write("          <li>\r\n");
      out.write("            <div class=\"btn-group\">\r\n");
      out.write("              <button class=\"btn btn-default dropdown-toggle tp-icon\" data-toggle=\"dropdown\">\r\n");
      out.write("                <i class=\"glyphicon glyphicon-envelope\"></i>\r\n");
      out.write("                <span class=\"badge\"></span>  <!--jiao biao-->\r\n");
      out.write("              </button>\r\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-head pull-right\">\r\n");
      out.write("                <h5 class=\"title\">You Have New Message</h5>\r\n");
      out.write("                <ul class=\"dropdown-list gen-list\">  \r\n");
      out.write("                  <li class=\"new\"><a href=\"\">Read All Messages</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("          \r\n");
      out.write("          <li>\r\n");
      out.write("            <div class=\"btn-group\">\r\n");
      out.write("              <button type=\"button\" class=\"btn btn-default dropdown-toggle tp-icon\" data-toggle=\"dropdown\">\r\n");
      out.write("                <i class=\"fa fa-user\" id=\"userName\"></i>\r\n");
      out.write("                <span class=\"caret\"></span>\r\n");
      out.write("              </button>\r\n");
      out.write("              <ul class=\"dropdown-menu dropdown-menu-usermenu pull-right\">\r\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-cog\"></i> Profile</a></li>\r\n");
      out.write("                <li><a href=\"/myapplication\"><i class=\"glyphicon glyphicon-user\"></i> My Application</a></li>\r\n");
      out.write("                <li><a href=\"#\"><i class=\"glyphicon glyphicon-question-sign\"></i> Help</a></li>\r\n");
      out.write("                <li><a href=\"/logout\"><i class=\"glyphicon glyphicon-log-out\"></i> Log Out</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div><!-- header-right -->\r\n");
      out.write("\r\n");
      out.write("    </div><!-- headerbar -->\r\n");
      out.write("\r\n");
      out.write("    <div class=\"pageheader\">\r\n");
      out.write("      <h2><i class=\"fa fa-home\"></i> Dashboard</h2>\r\n");
      out.write("      <div class=\"breadcrumb-wrapper\">\r\n");
      out.write("        <span class=\"label\">You are here:</span>\r\n");
      out.write("        <ol class=\"breadcrumb\">\r\n");
      out.write("          <li><a href=\"/index\">Dashboard</a></li>\r\n");
      out.write("        </ol>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"contentpanel1\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("          <div class=\"panel panel-success panel-stat\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"stat\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-4\">\r\n");
      out.write("                    <img src=\"images/is-user.png\" alt=\"\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-8\">\r\n");
      out.write("                    <small class=\"stat-label\">Visits</small>\r\n");
      out.write("                    <h1>56</h1>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div><!-- row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mb15\"></div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-6\">\r\n");
      out.write("                    <small class=\"stat-label\">Pages / Visit</small>\r\n");
      out.write("                    <h4>10.90</h4>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col-xs-6\">\r\n");
      out.write("                    <small class=\"stat-label\">% New Visits</small>\r\n");
      out.write("                    <h4>55.55%</h4>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div><!-- row -->\r\n");
      out.write("              </div><!-- stat -->\r\n");
      out.write("\r\n");
      out.write("            </div><!-- panel-heading -->\r\n");
      out.write("          </div><!-- panel -->\r\n");
      out.write("        </div><!-- col-sm-6 -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("          <div class=\"panel panel-danger panel-stat\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"stat\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-4\">\r\n");
      out.write("                    <img src=\"images/is-document.png\" alt=\"\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-8\">\r\n");
      out.write("                    <small class=\"stat-label\">% Unique Visitors</small>\r\n");
      out.write("                    <h1>54.40%</h1>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div><!-- row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mb15\"></div>\r\n");
      out.write("\r\n");
      out.write("                <small class=\"stat-label\">Avg. Visit Duration</small>\r\n");
      out.write("                <h4>01:80:22</h4>\r\n");
      out.write("\r\n");
      out.write("              </div><!-- stat -->\r\n");
      out.write("\r\n");
      out.write("            </div><!-- panel-heading -->\r\n");
      out.write("          </div><!-- panel -->\r\n");
      out.write("        </div><!-- col-sm-6 -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("          <div class=\"panel panel-primary panel-stat\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"stat\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-4\">\r\n");
      out.write("                    <img src=\"images/is-document.png\" alt=\"\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-8\">\r\n");
      out.write("                    <small class=\"stat-label\">Page Views</small>\r\n");
      out.write("                    <h1>256</h1>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div><!-- row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mb15\"></div>\r\n");
      out.write("\r\n");
      out.write("                <small class=\"stat-label\">% Bounce Rate</small>\r\n");
      out.write("                <h4>34.23%</h4>\r\n");
      out.write("\r\n");
      out.write("              </div><!-- stat -->\r\n");
      out.write("\r\n");
      out.write("            </div><!-- panel-heading -->\r\n");
      out.write("          </div><!-- panel -->\r\n");
      out.write("        </div><!-- col-sm-6 -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-6 col-md-3\">\r\n");
      out.write("          <div class=\"panel panel-dark panel-stat\">\r\n");
      out.write("            <div class=\"panel-heading\">\r\n");
      out.write("\r\n");
      out.write("              <div class=\"stat\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-4\">\r\n");
      out.write("                    <img src=\"images/is-money.png\" alt=\"\" />\r\n");
      out.write("                  </div>\r\n");
      out.write("                  <div class=\"col-xs-8\">\r\n");
      out.write("                    <small class=\"stat-label\">Today's Earnings</small>\r\n");
      out.write("                    <h1>$557</h1>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div><!-- row -->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"mb15\"></div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                  <div class=\"col-xs-6\">\r\n");
      out.write("                    <small class=\"stat-label\">Last Week</small>\r\n");
      out.write("                    <h4>$468</h4>\r\n");
      out.write("                  </div>\r\n");
      out.write("\r\n");
      out.write("                  <div class=\"col-xs-6\">\r\n");
      out.write("                    <small class=\"stat-label\">Last Month</small>\r\n");
      out.write("                    <h4>$13250</h4>\r\n");
      out.write("                  </div>\r\n");
      out.write("                </div><!-- row -->\r\n");
      out.write("\r\n");
      out.write("              </div><!-- stat -->\r\n");
      out.write("\r\n");
      out.write("            </div><!-- panel-heading -->\r\n");
      out.write("          </div><!-- panel -->\r\n");
      out.write("        </div><!-- col-sm-6 -->\r\n");
      out.write("      </div><!-- row -->\r\n");
      out.write("   </div><!--contentpanel1-->\r\n");
      out.write("\r\n");
      out.write("         <div class=\"row\">\r\n");
      out.write("        <div class=\"col-sm-8 col-md-9\">\r\n");
      out.write("          <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("              <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-8\">\r\n");
      out.write("                  <h5 class=\"subtitle mb5\">Network Performance</h5>\r\n");
      out.write("                  <div id=\"basicflot\" style=\"width: 100%; height: 300px; margin-bottom: 20px\"></div>\r\n");
      out.write("                </div><!-- col-sm-8 -->\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                  <h5 class=\"subtitle mb5\">Server Status</h5>\r\n");
      out.write("                  <p class=\"mb15\">Summary of the status of your server.</p>\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"sublabel\">New Visitors (55.5%)</span>\r\n");
      out.write("                  <div class=\"progress progress-sm\">\r\n");
      out.write("                    <div style=\"width: 40%\" aria-valuemax=\"100\" aria-valuemin=\"0\" aria-valuenow=\"40\" role=\"progressbar\" class=\"progress-bar progress-bar-primary\"></div>\r\n");
      out.write("                  </div><!-- progress -->\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"sublabel\">New Projects (32.2%)</span>\r\n");
      out.write("                  <div class=\"progress progress-sm\">\r\n");
      out.write("                    <div style=\"width: 32%\" aria-valuemax=\"100\" aria-valuemin=\"0\" aria-valuenow=\"40\" role=\"progressbar\" class=\"progress-bar progress-bar-success\"></div>\r\n");
      out.write("                  </div><!-- progress -->\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"sublabel\">New Employees (82.2%)</span>\r\n");
      out.write("                  <div class=\"progress progress-sm\">\r\n");
      out.write("                    <div style=\"width: 82%\" aria-valuemax=\"100\" aria-valuemin=\"0\" aria-valuenow=\"40\" role=\"progressbar\" class=\"progress-bar progress-bar-danger\"></div>\r\n");
      out.write("                  </div><!-- progress -->\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"sublabel\">Unhandle Applications (3/5)</span>\r\n");
      out.write("                  <div class=\"progress progress-sm\">\r\n");
      out.write("                    <div style=\"width: 63%\" aria-valuemax=\"100\" aria-valuemin=\"0\" aria-valuenow=\"40\" role=\"progressbar\" class=\"progress-bar progress-bar-warning\"></div>\r\n");
      out.write("                  </div><!-- progress -->\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"sublabel\">Online Vistors (2/10)</span>\r\n");
      out.write("                  <div class=\"progress progress-sm\">\r\n");
      out.write("                    <div style=\"width: 20%\" aria-valuemax=\"100\" aria-valuemin=\"0\" aria-valuenow=\"40\" role=\"progressbar\" class=\"progress-bar progress-bar-success\"></div>\r\n");
      out.write("                  </div><!-- progress -->\r\n");
      out.write("\r\n");
      out.write("                  <span class=\"sublabel\">Email Account (13/50)</span>\r\n");
      out.write("                  <div class=\"progress progress-sm\">\r\n");
      out.write("                    <div style=\"width: 26%\" aria-valuemax=\"100\" aria-valuemin=\"0\" aria-valuenow=\"40\" role=\"progressbar\" class=\"progress-bar progress-bar-success\"></div>\r\n");
      out.write("                  </div><!-- progress -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div><!-- col-sm-4 -->\r\n");
      out.write("              </div><!-- row -->\r\n");
      out.write("            </div><!-- panel-body -->\r\n");
      out.write("          </div><!-- panel -->\r\n");
      out.write("        </div><!-- col-sm-9 -->\r\n");
      out.write("\r\n");
      out.write("        <div class=\"col-sm-4 col-md-3\">\r\n");
      out.write("\r\n");
      out.write("          <div class=\"panel panel-default\">\r\n");
      out.write("            <div class=\"panel-body\">\r\n");
      out.write("            <h5 class=\"subtitle mb5\">Most Browser Used</h5>\r\n");
      out.write("            <div id=\"donut-chart2\" class=\"ex-donut-chart\"></div>\r\n");
      out.write("            </div><!-- panel-body -->\r\n");
      out.write("          </div><!-- panel -->\r\n");
      out.write("\r\n");
      out.write("        </div><!-- col-sm-3 -->\r\n");
      out.write("\r\n");
      out.write("      </div><!-- row -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <input id=\"userId\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">\r\n");
      out.write("</section>\r\n");
      out.write("<script>\r\n");
      out.write("    $(document).ready(function () {\r\n");
      out.write("        var user=eval (\"(\" +localStorage.getItem(\"user\")+ \")\");\r\n");
      out.write("        //document.getElementById(\"userName\").innerText=user.userName;\r\n");
      out.write("        $(\"#userName\").text(user.userName);\r\n");
      out.write("        setInterval(\"ajaxupdate()\",5000);\r\n");
      out.write("\r\n");
      out.write("    });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function ajaxupdate(){\r\n");
      out.write("        $.ajax({\r\n");
      out.write("            url:\"/message/checkMessage\",\r\n");
      out.write("            type:\"POST\",\r\n");
      out.write("            success:function(result){\r\n");
      out.write("                var data=result.data;\r\n");
      out.write("                var length=data.length;\r\n");
      out.write("                for (var i=0;i<length;i++){\r\n");
      out.write("\r\n");
      out.write("                    $.gritter.add({\r\n");
      out.write("                        title: 'New Message',\r\n");
      out.write("                        text: data[i].messageBody,\r\n");
      out.write("                        class_name: 'growl-primary',\r\n");
      out.write("                        image: 'images/screen.png',\r\n");
      out.write("                        sticky: true,\r\n");
      out.write("                        time: ''\r\n");
      out.write("                    });\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            error:function(){\r\n");
      out.write("                alert(\"failed\");\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-migrate-1.2.1.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery-ui-1.10.3.min.js\"></script>\r\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"js/modernizr.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.sparkline.min.js\"></script>\r\n");
      out.write("<script src=\"js/toggles.min.js\"></script>\r\n");
      out.write("<script src=\"js/retina.min.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.cookies.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/flot/jquery.flot.min.js\"></script>\r\n");
      out.write("<script src=\"js/flot/jquery.flot.resize.min.js\"></script>\r\n");
      out.write("<script src=\"js/flot/jquery.flot.spline.min.js\"></script>\r\n");
      out.write("<script src=\"js/morris.min.js\"></script>\r\n");
      out.write("<script src=\"js/raphael-2.1.0.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("<script src=\"js/dashboard.js\"></script>\r\n");
      out.write("<script src=\"js/jquery.gritter.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/checkOutputUser.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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