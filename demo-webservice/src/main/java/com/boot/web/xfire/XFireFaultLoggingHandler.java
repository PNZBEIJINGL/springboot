package com.boot.web.xfire;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.xfire.MessageContext;
import org.codehaus.xfire.exchange.MessageExchange;
import org.codehaus.xfire.handler.AbstractHandler;
import org.codehaus.xfire.service.OperationInfo;

/**
 * 调用日志Handler
 */
public class XFireFaultLoggingHandler extends AbstractHandler {

    private static Log logger = LogFactory.getLog(XFireFaultLoggingHandler.class);

    /**
     * (non-Javadoc)
     *
     * @see org.codehaus.xfire.handler.Handler#invoke(MessageContext)
     */
    public void invoke(MessageContext ctx) throws Exception {
        MessageExchange exchange = ctx.getExchange();
        OperationInfo op = exchange.getOperation();
        String contextId = ctx.getId();
        String operationName = op.getName();
        String serviceName = ctx.getService().getName().toString();
        Object fault = exchange.getFaultMessage().getBody();
        String errorMessage = fault.toString();
        logger.info(contextId + ":[fault]" + serviceName + "." + operationName + " " + errorMessage);

    }

}