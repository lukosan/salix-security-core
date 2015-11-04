package org.lukosan.salix.security;

import java.io.Serializable;
import java.util.Map;

public interface SalixUser extends Serializable {

	String getUsername();
	
	String getPassword();
	
	String[] getRoles();

	boolean hasRole(String scope, String role);

	Map<String, Object> getMap();
}