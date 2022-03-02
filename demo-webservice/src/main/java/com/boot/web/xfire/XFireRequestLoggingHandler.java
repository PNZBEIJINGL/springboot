package com.boot.web.xfire;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.xfire.MessageContext;
import org.codehaus.xfire.exchange.AbstractMessage;
import org.codehaus.xfire.handler.AbstractHandler;
import org.codehaus.xfire.service.OperationInfo;

/**
 * 调用日志Handler
 */
public class XFireRequestLoggingHandler extends AbstractHandler {

    private static Log logger = LogFactory.getLog(XFireRequestLoggingHandler.class);

    public void invoke(MessageContext ctx) throws Exception {
        OperationInfo op = ctx.getExchange().getOperation();
        String contextId = ctx.getId();
        String operationName = op.getName();
        String serviceName = ctx.getService().getName().toString();
        AbstractMessage message = ctx.getCurrentMessage();
        logger.info(contextId + ":[request]" + serviceName + "." + operationName + " " + message.getBody());

    }

}
