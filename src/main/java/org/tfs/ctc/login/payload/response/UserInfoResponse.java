package org.tfs.ctc.login.payload.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class UserInfoResponse {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private List<String> roles;

	public UserInfoResponse(Long id, String firstName,String lastname, String email, List<String> roles) {
		this.id = id;
		this.lastName = lastname;
		this.firstName = firstName;
		this.email = email;
		this.roles = roles;
	}

}
