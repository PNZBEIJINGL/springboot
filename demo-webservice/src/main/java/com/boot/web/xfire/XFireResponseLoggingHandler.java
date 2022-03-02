package com.boot.web.xfire;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.xfire.MessageContext;
import org.codehaus.xfire.exchange.AbstractMessage;
import org.codehaus.xfire.exchange.MessageExchange;
import org.codehaus.xfire.handler.AbstractHandler;
import org.codehaus.xfire.service.OperationInfo;

/**
 * 返回日志Handler
 */
public class XFireResponseLoggingHandler extends AbstractHandler {

    private static Log logger = LogFactory
            .getLog(XFireResponseLoggingHandler.class);

    public void invoke(MessageContext ctx) throws Exception {
        MessageExchange exchange = ctx.getExchange();
        OperationInfo op = exchange.getOperation();
        String contextId = ctx.getId();
        String operationName = op.getName();
        String serviceName = ctx.getService().getName().toString();
        AbstractMessage message = ctx.getCurrentMessage();
        logger.info(contextId + ":[response]" + serviceName + "." + operationName + " OK, msgBody =" + ((Object[]) message.getBody())[0]);

    }

}
