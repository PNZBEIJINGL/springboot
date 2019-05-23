package com.springboot.security;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jpa数据访问
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    SysUser findByUsername(String username);

}
