package com.boot.web;

import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://web.boot.com", name = "IQueryServicePortType")
public interface IQueryService {

    List<String> getAllName();
}
