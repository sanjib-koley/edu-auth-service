package com.sanjib.edureka.ms_auth_service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential, Long> {
	
	List<Credential> findByPhone(String phone);
    List<Credential> findByEmail(String email);
}
