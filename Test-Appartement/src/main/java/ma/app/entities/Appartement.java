package ma.app.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Appartement implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	@Size(min=2,max=15)
	private String titre;
	@NotNull
	private String adresse;
	@NotNull
	@Size(min=2,max=15)
	private String quartier;
	@NotNull
	private String superficie;
	private String description;
	@DecimalMin("100")
	private double prix;
	private int chambre;
	private int cuisine;
	private int salon;
	private int salleDeBain;
	private String terrace;
	private String photos;
	
	@ManyToOne
	@JoinColumn(name = "USER_EMAIL")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public String getSuperficie() {
		return superficie;
	}

	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getChambre() {
		return chambre;
	}

	public void setChambre(int chambre) {
		this.chambre = chambre;
	}

	public int getCuisine() {
		return cuisine;
	}

	public void setCuisine(int cuisine) {
		this.cuisine = cuisine;
	}

	public int getSalon() {
		return salon;
	}

	public void setSalon(int salon) {
		this.salon = salon;
	}

	public int getSalleDeBain() {
		return salleDeBain;
	}

	public void setSalleDeBain(int salleDeBain) {
		this.salleDeBain = salleDeBain;
	}


	
	

	public String getTerrace() {
		return terrace;
	}

	public void setTerrace(String terrace) {
		this.terrace = terrace;
	}

	public String getPhotos() {
		return photos;
	}

	public void setPhotos(String photos) {
		this.photos = photos;
	}

	public User getuser() {
		return user;
	}

	public void setuser(User user) {
		this.user = user;
	}

	public Appartement(@NotNull @Size(min = 2, max = 15) String titre, String adresse,
			@NotNull @Size(min = 2, max = 15) String quartier, String superficie, String description,
			@DecimalMin("100") double prix, int chambre, int cuisine, int salon, int salleDeBain, String terrace,
			String photos, User user) {
		this.titre = titre;
		this.adresse = adresse;
		this.quartier = quartier;
		this.superficie = superficie;
		this.description = description;
		this.prix = prix;
		this.chambre = chambre;
		this.cuisine = cuisine;
		this.salon = salon;
		this.salleDeBain = salleDeBain;
		this.terrace = terrace;
		this.photos = photos;
		this.user = user;
	}

	public Appartement(@NotNull @Size(min = 2, max = 15) String titre, String adresse,
			@NotNull @Size(min = 2, max = 15) String quartier, String superficie, String description,
			@DecimalMin("100") double prix, int chambre, int cuisine, int salon, int salleDeBain, String terrace,
			String photos) {
		this.titre = titre;
		this.adresse = adresse;
		this.quartier = quartier;
		this.superficie = superficie;
		this.description = description;
		this.prix = prix;
		this.chambre = chambre;
		this.cuisine = cuisine;
		this.salon = salon;
		this.salleDeBain = salleDeBain;
		this.terrace = terrace;
		this.photos = photos;
	}

	public Appartement() {
	}
	

	
	
}
