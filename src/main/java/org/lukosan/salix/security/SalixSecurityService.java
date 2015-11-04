package org.lukosan.salix.security;

import java.util.List;

public interface SalixSecurityService {

	SalixUser user(String username);

	SalixUser save(String username, String password);

	void allow(String username, String scope, String role);
	
	void deny(String username, String scope, String role);
	
	List<SalixUser> users(String scope);
	
	List<SalixUser> users(String scope, String role);

}