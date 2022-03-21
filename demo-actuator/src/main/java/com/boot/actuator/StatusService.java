package com.boot.actuator;

import org.springframework.stereotype.Service;

/**
 * 自定义端点：状态服务
 */
@Service
public class StatusService {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
