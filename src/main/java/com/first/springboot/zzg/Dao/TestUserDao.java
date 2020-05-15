package com.first.springboot.zzg.Dao;

import com.first.springboot.zzg.Entry.TestUser;
import com.first.springboot.zzg.Pojo.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestUserDao extends JpaRepository<TestUser,Long> {

//    @Query(value = "select * from test_user where name = ?1",nativeQuery = true)
//    UserInfo findUserInfoByName(String name);
}
