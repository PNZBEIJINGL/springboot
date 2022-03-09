package com.boot.web.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@javax.jws.WebService(
        serviceName = "IInfoQueryService",
        portName = "IInfoQueryServiceHttpPort",
        targetNamespace = "http://web.boot.com",
        endpointInterface = "com.boot.web.service.IInfoQueryService")
@Service("infoQueryServiceImp")
public class InfoQueryServiceImpl implements IInfoQueryService {

    @Override
    public List<NameInfo> getAllName() {
        List<NameInfo> list = new ArrayList<NameInfo>();
        NameInfo nameInfo = new NameInfo();
        nameInfo.setFirstName("zhang");
        nameInfo.setLastName("san");
        list.add(nameInfo);
        return list;
    }


}
