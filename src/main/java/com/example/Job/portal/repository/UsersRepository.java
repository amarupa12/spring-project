package com.example.Job.portal.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Job.portal.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	 Optional<Users> findByEmail(String email);

}
