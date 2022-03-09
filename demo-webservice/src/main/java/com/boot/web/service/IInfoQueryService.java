package com.boot.web.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import java.util.List;

@WebService(targetNamespace = "http://service.web.boot.com", name = "IInfoQueryServicePortType")
public interface IInfoQueryService {

    @WebResult(name = "out", targetNamespace = "http://service.web.boot.com")
    @RequestWrapper(localName = "getAllName", targetNamespace = "http://service.web.boot.com", className = "com.boot.web.wapper.GetAllName")
    @WebMethod
    @ResponseWrapper(localName = "getAllNameResponse", targetNamespace = "http://service.web.boot.com", className = "com.boot.web.wapper.GetAllNameResponse")
    List<NameInfo> getAllName();
}
