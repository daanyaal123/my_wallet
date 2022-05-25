package com.example.User.Service.Repository;
import com.example.User.Service.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
