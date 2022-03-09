package com.boot.web.xfire;

import cn.hutool.extra.spring.SpringUtil;
import org.codehaus.xfire.DefaultXFire;
import org.codehaus.xfire.XFire;
import org.codehaus.xfire.service.ServiceFactory;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.codehaus.xfire.spring.XFireSpringServlet;
import org.codehaus.xfire.spring.remoting.XFireExporter;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Xfire Configuration for WebService
 *
 * @see "xfire-service.xml"
 */
@Configuration
public class XfireXMLConfiguration {

    @Bean
    public HttpServlet httpServlet() {
        return new SpringProxyServlet();
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        //WEB.XML: web servlet configuration
        return new ServletRegistrationBean(new XFireSpringServlet(), "/webservice/*");
    }

    @Bean("defaultHandlerMapping")
    public SimpleUrlHandlerMapping defaultHandlerMapping() throws ClassNotFoundException {
        SimpleUrlHandlerMapping defaultHandlerMapping = new SimpleUrlHandlerMapping();
        Map urlMap = new HashMap();
        urlMap.put("/InfoQueryService", SpringUtil.getBean("testQueyService_xfire"));
        defaultHandlerMapping.setUrlMap(urlMap);
        return defaultHandlerMapping;
    }


    @Bean("testQueyService_xfire")
    public XFireExporter getInfoQueryServiceImp_xfire() throws ClassNotFoundException {
        XFireExporter xFireExporter = xFireExporter();
        xFireExporter.setServiceBean(SpringUtil.getBean("infoQueryServiceImp"));
        xFireExporter.setServiceClass(Class.forName("com.boot.web.service.IInfoQueryService"));
        xFireExporter.setName("InfoQueryService");
        return xFireExporter;
    }


    @Bean("xfire")
    public XFire getXFire() {
        DefaultXFire defaultXFire = new DefaultXFire();
        return defaultXFire;
    }

    @Bean
    public ServiceFactory getServiceFactory() {
        return new ObjectServiceFactory();
    }

    @Bean("xfireRequestLoggingHandler")
    public XFireRequestLoggingHandler xFireRequestLoggingHandler() {
        return new XFireRequestLoggingHandler();
    }


    @Bean("xfireResponseLoggingHandler")
    public XFireResponseLoggingHandler xFireResponseLoggingHandler() {
        return new XFireResponseLoggingHandler();
    }

    @Bean("xfireFaultLoggingHandler")
    public XFireFaultLoggingHandler xFireFaultLoggingHandler() {
        return new XFireFaultLoggingHandler();
    }


    private XFireExporter xFireExporter() {
        XFireExporter xFireExporter = new XFireExporter();
        List inHandlers = new ArrayList();
        inHandlers.add(SpringUtil.getBean("xfireRequestLoggingHandler"));
        xFireExporter.setInHandlers(inHandlers);

        List outHandlers = new ArrayList();
        outHandlers.add(SpringUtil.getBean("xfireResponseLoggingHandler"));
        xFireExporter.setOutHandlers(outHandlers);

        List faultHandlers = new ArrayList();
        faultHandlers.add(SpringUtil.getBean("xfireFaultLoggingHandler"));
        xFireExporter.setFaultHandlers(faultHandlers);

        xFireExporter.setServiceFactory(getServiceFactory());
        xFireExporter.setXfire(SpringUtil.getBean("xfire"));
        return xFireExporter;
    }
}
