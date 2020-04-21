package ma.app.repository;

import org.springframework.data.domain.Pageable;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.app.entities.Appartement;
import ma.app.entities.User;


@Repository

public interface AppartementRepository extends JpaRepository<Appartement, Long> {

	@Query("select a from Appartement a where a.id like:x")
	AppartementRepository findAppartementById(@Param("x")Long id);
	
//	@Query("select max(m.id) from Appartement m")
//	Appartement findAppartementByMaxIdApp(Long id);
	
//	List<AppartementRepository> findByOrderByIdDesc();

	List<Appartement> findByOrderByIdDesc();

	List<Appartement> findByUser(User user);

	List<Appartement> findByQuartierLike(String string);

	


	
	
	

	
	
}
