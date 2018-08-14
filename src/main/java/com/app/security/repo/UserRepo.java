package com.app.security.repo;

import org.springframework.data.repository.CrudRepository;

import com.app.security.model.UserDetails;

public interface UserRepo extends CrudRepository<UserDetails, Long> {

	UserDetails findByUname(String uname);

	UserDetails findByUnameAndUpass(String uname, String upass);
}
