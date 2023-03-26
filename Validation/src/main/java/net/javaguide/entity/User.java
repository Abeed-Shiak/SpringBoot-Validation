package net.javaguide.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="USER_TBL")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	//user name should not be null or empty/ empty ga undaudadhu
	//user name should be 2 characters
	@NotEmpty
	@Size(min=2, message ="user name should be 2 charcters")
	@Column(name ="name",nullable = false)
	private String name;
	//email should be valid format
	//email should  be not null
	@NotEmpty
	@Email
	private String email;
	//password should be not null 
	//password should have at least 8 characters
	@NotEmpty
	@Size(min =8, message="passwod shoud have at least 8 charctes")
	private String password;
	

}
