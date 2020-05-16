package com.first.springboot.zzg.Dao;

import com.first.springboot.zzg.Entry.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestUserDao extends JpaRepository<TestUser,Long> {

}
