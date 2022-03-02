package com.boot.web.xfire;

import cn.hutool.extra.spring.SpringUtil;
import com.boot.web.IQueryService;
import com.boot.web.QueryServiceImpl;
import com.boot.web.xfire.SpringProxyServlet;
import com.boot.web.xfire.XFireFaultLoggingHandler;
import com.boot.web.xfire.XFireRequestLoggingHandler;
import com.boot.web.xfire.XFireResponseLoggingHandler;
import org.codehaus.xfire.DefaultXFire;
import org.codehaus.xfire.XFire;
import org.codehaus.xfire.service.ServiceFactory;
import org.codehaus.xfire.service.binding.ObjectServiceFactory;
import org.codehaus.xfire.spring.remoting.XFireExporter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

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


    @Bean("testQueyService_xfire")
    public XFireExporter getInfoQueryServiceImp_xfire() throws ClassNotFoundException {
        XFireExporter xFireExporter = xFireExporter();
        xFireExporter.setServiceBean(SpringUtil.getBean("queryService"));
        xFireExporter.setServiceClass(Class.forName("com.boot.web.IQueryService"));
        xFireExporter.setName("queryService");
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
