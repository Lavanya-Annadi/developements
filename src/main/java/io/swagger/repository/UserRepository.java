package io.swagger.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.User;
@Transactional(isolation=Isolation.SERIALIZABLE)
public interface UserRepository extends CrudRepository<User, Long>,JpaRepository<User, Long> {
	List<User> findByUsername(String username);
	User findByEmail(String email);

}
