package com.netoptc.DsCommerce.repositories;

import com.netoptc.DsCommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { }