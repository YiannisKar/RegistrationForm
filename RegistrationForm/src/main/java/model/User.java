package model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="first name")
	private String firstName;
	
	@Column(name="surname")
	private String surname;
	
	@Column(name="company")
	private String company;
	
	@Column(name="telephone")
	private String telephone;
	
	@Column(name="password")
	private String password;

	@Column(name="email")
	private String email;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="role",joinColumns = @JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="role_id"))
	Set<Role> roles;


	public int getId() {
		return id;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}




	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}


	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return password;
	}
	

}
