package com.disabe.authAndAut.entities;

import java.io.Serializable;

import com.disabe.authAndAut.enums.StatusUsersEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



  
@AllArgsConstructor
@NoArgsConstructor
@Entity  
@Table(name = "SATOO_USERS", uniqueConstraints =
{@UniqueConstraint(columnNames = {"USER_EMAIL"})}) 
@Getter
@Setter
public class SatooUsers implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6303909915317045379L;

	/**
	 * ID de l'utilisateur, il sera auto-genéré.
	 */
	
	  @Id	  
	  @GeneratedValue(strategy = GenerationType.IDENTITY)	  
	  @Column(name = "USER_ID", nullable = false) 
	  private long userId;
	 
	  /**
		 * Nom et prénom de l'utilisateur.
		 * 
	  */
	
	  @Column(name = "USER_NAME", length = 255, nullable = false) 
	  private String userName;
	 
	  /**
		 * Email de l'utilisateur.
		 */
	
	  @Column(name = "USER_EMAIL", length = 50, nullable = false, unique = true)
	  private String userEmail;
	 
	  /**
		 * Numéro de téléphone mobile de l'utilisateur.
		 */
	
	  @Column(name = "USER_PHONE", length = 20, nullable = false) 
	  private String userPhone;
	 /**
		 * Agence d'affectation de l'utilisateur.
		 */
	
	  @Column(name = "USER_BRANCH", length = 100, nullable = false) 
	  private String userBranch;
	 
	  /**
		 * Statut de l'utilisateur.
		 */
	 @Enumerated(EnumType.STRING) 
	 private StatusUsersEnum statusUserEnum;
			 

}
