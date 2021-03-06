package com.netjstech.dao;

import java.util.Optional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.netjstech.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	public Optional<User> findByUserName(String userName);
	public boolean existsByEmail(String email);
	public boolean existsByUserName(String userName);
	public List<User> findByUserName(String userName);
	public List<User> deleteByUserName(String userName);
}
