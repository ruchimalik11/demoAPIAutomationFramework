package com.api.models.response;

public class SignUpRequest {

	@Override
	public String toString() {
		return "SignUpRequest [username=" + username + ", password=" + password + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + "]";
	}

	private SignUpRequest(String username, String password, String email, String firstName, String lastName,
			String mobileNumber) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	private String username;
	private String password;
	private String email;
	private String firstName;
	private String lastName;
	private String mobileNumber;

	public static class Builder{
		
		private String username;
		private String password;
		private String email;
		private String firstName;
		private String lastName;
		private String mobileNumber;
		
		public Builder userName(String username) {
			this.username=username;
			Builder x=this;
			return x;
		}
		
		public Builder password(String password) {
			this.password=password;
			Builder x=this;
            return x;	
	}
		public Builder email(String email) {
			this.email=email;
			Builder x=this;
            return x;	
	}
	
		public Builder firstName(String firstName) {
			this.firstName=firstName;
			Builder x=this;
            return x;	
	}
		
		public Builder lastName(String lastName) {
			this.lastName=lastName;
			Builder x=this;
            return x;	
	}
		
		public Builder mobileNumber(String mobileNumber) {
			this.mobileNumber=mobileNumber;
			Builder x=this;
            return x;	
	}
		
		public SignUpRequest build() {
			
			SignUpRequest signUpRequest=new SignUpRequest(username, password, email, firstName, lastName, mobileNumber);
			return signUpRequest;
		}
}

}

