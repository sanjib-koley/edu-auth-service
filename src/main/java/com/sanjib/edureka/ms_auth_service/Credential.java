package com.sanjib.edureka.ms_auth_service;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "credentials")
public class Credential {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 100)
    @Column(name = "email", length = 100)
    private String email;

    @Size(max = 100)
    @Column(name = "phone", length = 100)
    private String phone;

    @Size(max = 20)
    @Column(name = "password", length = 20)
    private String password;
    
    // customer,seller,admin
    @Size(max = 10)
    @Column(name = "usertype", length = 10)
    private String usertype;

}