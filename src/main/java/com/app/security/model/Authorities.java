package com.app.security.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Authorities implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5242705947883278091L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@JsonProperty("authority")
	private String authority;

	@Override
	public String getAuthority() {

		return authority;
	}

}
