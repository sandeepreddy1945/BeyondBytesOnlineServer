/**
 * 
 */
package com.app.security.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.security.model.UserDetails;
import com.app.security.repo.UserRepo;

/**
 * @author Sandeep
 *
 */
@RestController
public class LoginController {

	@Autowired
	private UserRepo userRepo;

	@PreAuthorize(value = "")
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, path = "/login")
	@ResponseBody
	public ResponseEntity<UserDetails> authenticateUser(@RequestBody UserDetails details) {
		UserDetails details2 = userRepo.findByUnameAndUpass(details.getUname(), details.getUpass());
		return new ResponseEntity<>(details2, HttpStatus.OK);
	}
}
