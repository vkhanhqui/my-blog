/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.11
 * Generated at: 2020-08-12 18:38:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<title>List</title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerList.jsp", out, false);
      out.write("\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<nav\n");
      out.write("\t\tclass=\"navbar px-md-0 navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light\"\n");
      out.write("\t\tid=\"ftco-navbar\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"/blog/\">M<i>e</i>.\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\tdata-target=\"#ftco-nav\" aria-controls=\"ftco-nav\"\n");
      out.write("\t\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("\t\t\t\t<span class=\"oi oi-menu\"></span> Menu\n");
      out.write("\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"ftco-nav\">\n");
      out.write("\t\t\t\t<ul class=\"navbar-nav ml-auto\">\n");
      out.write("\t\t\t\t\t<li class=\"nav-item active\"><a href=\"/blog/\" class=\"nav-link\">Home</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"list\" class=\"nav-link\">Blogs</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"contact\" class=\"nav-link\">Contact</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"nav-item\"><a href=\"login\" class=\"nav-link\">Sign\n");
      out.write("\t\t\t\t\t\t\tup/Log in</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</nav>\n");
      out.write("\t<!-- END nav -->\n");
      out.write("\n");
      out.write("\t<div class=\"hero-wrap js-fullheight\"\n");
      out.write("\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/bg_1.jpg');\"\n");
      out.write("\t\tdata-stellar-background-ratio=\"0.5\">\n");
      out.write("\t\t<div class=\"\"></div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div\n");
      out.write("\t\t\t\tclass=\"row no-gutters slider-text js-fullheight align-items-center justify-contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt-start\"\n");
      out.write("\t\t\t\tdata-scrollax-parent=\"true\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12 ftco-animate\">\n");
      out.write("\t\t\t\t\t<h1 class=\"mb-4 mb-md-0\">List</h1>\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-7\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"mouse\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"mouse-icon\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"mouse-wheel\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<span class=\"ion-ios-arrow-round-down\"></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<section class=\"ftco-section bg-light\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row d-flex\">\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_1.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_2.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_3.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_4.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_5.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_6.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_7.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_8.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("\t\t\t\t\t<div\n");
      out.write("\t\t\t\t\t\tclass=\"blog-entry justify-content-end\">\n");
      out.write("\t\t\t\t\t\t<a href=\"detail.html\" class=\"block-20\"\n");
      out.write("\t\t\t\t\t\t\tstyle=\"background-image: url('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_9.jpg');\"> </a>\n");
      out.write("\t\t\t\t\t\t<div class=\"text p-4 float-right d-block\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"topper d-flex align-items-center\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"one py-2 pl-3 pr-1 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"day\">18</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"two pl-0 pr-3 py-2 align-self-stretch\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span class=\"yr\">2019</span> <span class=\"mos\">October</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<h3 class=\"heading mb-3\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\">title</a>\n");
      out.write("\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>contenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt</p>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn-custom\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-round-forward mr-3\"></span>Read more</a>\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"row mt-5\">\n");
      out.write("\t\t\t\t<div class=\"col text-center\">\n");
      out.write("\t\t\t\t\t<div class=\"block-27\">\n");
      out.write("\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">&lt;</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"active\"><span>1</span></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">4</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">&gt;</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
      out.write("\n");
      out.write("\t<footer class=\"ftco-footer ftco-bg-dark ftco-section\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"row mb-5\">\n");
      out.write("\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t<div class=\"ftco-footer-widget mb-4\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"logo\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">Read<span>it</span>.\n");
      out.write("\t\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t</h2>\n");
      out.write("\t\t\t\t\t\t<p>Far far away, behind the word mountains, far from the\n");
      out.write("\t\t\t\t\t\t\tcountries Vokalia and Consonantia, there live the blind texts.</p>\n");
      out.write("\t\t\t\t\t\t<ul\n");
      out.write("\t\t\t\t\t\t\tclass=\"ftco-footer-social list-unstyled float-md-left float-lft mt-5\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"ftco-animate\"><a href=\"#\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"icon-twitter\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"ftco-animate\"><a href=\"#\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"icon-facebook\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"ftco-animate\"><a href=\"#\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"icon-instagram\"></span></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t<div class=\"ftco-footer-widget mb-4\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"ftco-heading-2\">latest News</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"block-21 mb-4 d-flex\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"img mr-4 rounded\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_1.jpg);\"></a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Even the all-powerful Pointing has no control\n");
      out.write("\t\t\t\t\t\t\t\t\t\tabout</a>\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"meta\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><span></span> Oct. 16, 2019</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><span></span> Admin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><span></span> 19</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"block-21 mb-4 d-flex\">\n");
      out.write("\t\t\t\t\t\t\t<a class=\"img mr-4 rounded\"\n");
      out.write("\t\t\t\t\t\t\t\tstyle=\"background-image: url(");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/images/image_2.jpg);\"></a>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"text\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"heading\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\">Even the all-powerful Pointing has no control\n");
      out.write("\t\t\t\t\t\t\t\t\t\tabout</a>\n");
      out.write("\t\t\t\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"meta\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><span></span> Oct. 16, 2019</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><span></span> Admin</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"#\"><span></span> 19</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t<div class=\"ftco-footer-widget mb-4 ml-md-5\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"ftco-heading-2\">Information</h2>\n");
      out.write("\t\t\t\t\t\t<ul class=\"list-unstyled\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"py-1 d-block\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-forward mr-3\"></span>Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"py-1 d-block\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-forward mr-3\"></span>Blogs</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"py-1 d-block\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-forward mr-3\"></span>Contact</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"py-1 d-block\"><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"ion-ios-arrow-forward mr-3\"></span>Sign up/Log in</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md\">\n");
      out.write("\t\t\t\t\t<div class=\"ftco-footer-widget mb-4\">\n");
      out.write("\t\t\t\t\t\t<h2 class=\"ftco-heading-2\">Have a Questions?</h2>\n");
      out.write("\t\t\t\t\t\t<div class=\"block-23 mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t<li><span class=\"icon icon-map-marker\"></span><span\n");
      out.write("\t\t\t\t\t\t\t\t\tclass=\"text\">address</span></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><span class=\"icon icon-phone\"></span><span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"text\">phone number</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><span class=\"icon icon-envelope\"></span><span\n");
      out.write("\t\t\t\t\t\t\t\t\t\tclass=\"text\">mail</span></a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/jquery.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/popper.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/bootstrap.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/jquery.easing.1.3.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/jquery.waypoints.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/jquery.stellar.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/owl.carousel.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/aos.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/jquery.animateNumber.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/scrollax.min.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/google-map.js\"></script>\n");
      out.write("\t<script\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/homePage/js/main.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
