package com.skorniychuk;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletException;

public class ApplicationInitializer implements WebApplicationInitializer {
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
    }

//public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
//
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class<?>[0];
//    }
//
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class<?>[0];
//    }
//
//    protected String[] getServletMappings() {
//        return new String[0];
//    }
}
