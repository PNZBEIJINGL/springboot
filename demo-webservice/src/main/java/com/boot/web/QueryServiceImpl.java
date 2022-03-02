package com.boot.web;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@javax.jws.WebService(
        serviceName = "IQueryService",
        portName = "IQueryServicePortType",
        targetNamespace = "http://web.boot.com",
        endpointInterface = "com.boot.web.IQueryService")
@Service("queryService")
public class QueryServiceImpl implements IQueryService {
    @Override
    public List<String> getAllName() {
        List<String> list = new ArrayList<String>();
        list.add("zhangsan");
        list.add("lisi");
        return list;
    }
}
