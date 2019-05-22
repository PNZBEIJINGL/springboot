package com.springboot.jpa;

        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.data.jpa.repository.Query;
        import org.springframework.data.repository.query.Param;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

    @Query(nativeQuery = true, value = "select 0 from useren u where u.name=:name1 or u.name=:name2")
    List<User> findBySQL(@Param("name1") String name1, @Param("name2") String name2);

    @Query("select 0 from User u where u.name=:name1 or u.name=:name2")
    List<User> findTwoName(@Param("name1") String name1, @Param("name2") String name2);

}
