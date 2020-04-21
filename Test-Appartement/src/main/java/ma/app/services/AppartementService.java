package ma.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.app.entities.Appartement;
import ma.app.entities.User;
import ma.app.repository.AppartementRepository;

@Service

public class AppartementService {
	
	@Autowired
	private AppartementRepository appartementRepository;
	
	public void addAppartement(Appartement appartement,User user) {
		appartement.setuser(user);
		appartementRepository.save(appartement);
	}

	public List<Appartement> findUserAppartement(User user){
		return appartementRepository.findByUser(user);
		
	}
	
	public List<Appartement> findByOrderDescAppartement(){
		return appartementRepository.findByOrderByIdDesc();
		
	}
	
	public void addApp(Appartement appartement) {
		
		appartementRepository.save(appartement);
	}
	
	public void editAppartement(Appartement appartement,User user,Long id) {
		appartement.setuser(user);
		appartementRepository.findAppartementById(id);
	}
	
	public List<Appartement> findByQuartier(String quartier) {
		// TODO Auto-generated method stub
		return appartementRepository.findByQuartierLike("%"+quartier+"%");
	}
	
	public void appDelete(Long id) {
		 appartementRepository.deleteById(id);
	}
	
	public void findOneApp(Long id) {
		
		 appartementRepository.findAppartementById(id);
	}
}
