package com.api.models.request;

public class ResetLoginRequest {

	private String token;
	private String newPassword;
	private String confirmPassword;
	public ResetLoginRequest(String token, String newPassword, String confirmPassword) {
		super();
		this.token = token;
		this.newPassword = newPassword;
		this.confirmPassword = confirmPassword;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "ResetLoginRequest [token=" + token + ", newPassword=" + newPassword + ", confirmPassword="
				+ confirmPassword + "]";
	}
	
}
