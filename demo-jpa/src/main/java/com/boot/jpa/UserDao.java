package com.boot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Long> {

    /**
     * @param name1
     * @param name2
     * @return
     */
    @Query(nativeQuery = true, value = "select 0 from useren u where u.name=:name1 or u.name=:name2")
    List<User> findBySQL(@Param("name1") String name1, @Param("name2") String name2);

    /**
     * 使用sql
     *
     * @param name1
     * @param name2
     * @return
     */
    @Query("select 0 from User u where u.name=:name1 or u.name=:name2")
    List<User> findTwoName(@Param("name1") String name1, @Param("name2") String name2);

}
