package ma.app.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Email;





@Entity
public class User {
	
	
	@Id
	@Email
	@NotNull
	@Column(unique = true)
	private String email;
	private String telephone ;
	@NotNull
	private String name;
	@Size(min = 4)
	private String password;
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	private List<Appartement> appartements;
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinTable(name = "USER_ROLES",joinColumns = {
			@JoinColumn(name="USER_EMAIL",referencedColumnName = "email")
	},inverseJoinColumns = {
			@JoinColumn(name="ROLE_NAME",referencedColumnName ="name" )
	})
	private List<Role> roles;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Appartement> getAppartements() {
		return appartements;
	}
	public void setAppartements(List<Appartement> appartements) {
		this.appartements = appartements;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	public User(String email, String telephone, String name,String password) {
		this.email = email;
		this.telephone = telephone;
		this.name = name;
		this.password = password;
	}
	public User() {
		// TODO Auto-generated constructor stub
	} 
	
	
	



	

}
