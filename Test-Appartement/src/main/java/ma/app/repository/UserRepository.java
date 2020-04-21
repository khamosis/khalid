package ma.app.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.app.entities.User;

@Repository

public interface UserRepository extends JpaRepository<User, String> {

	@Query("select a from User a where a.email like:x")
	User finUserByEmail(@Param("x")String email);

	List<User> findByNameLike(String name);

	@Transactional
	User deleteUserByEmail(String email);
}
