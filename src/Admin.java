public class Admin {
	String Email;
	String Password;
	String UserName;
	boolean Discount;
	
	public Admin() {
		Email = "";
		Password = "";
		UserName = "";
	}
	

	public Admin(String email, String username, String password) {
		Email = email;
		UserName = username;
		Password = password;
	}
	
	public void setEmail(String email) {
        Email = email;
    }
	
	public void setPassword(String pass) {
        Password = pass;
    }
	
	public void setUserName(String userName) {
        UserName = userName;
    }
	
	public void setDiscount(boolean discount) {
		Discount = discount;
	}
	
	public String getEmail() {
		return Email;
	}

	public String getPassword() {
		return Password;
	}

	public String getUserName() {
		return UserName;
	}

	public boolean isDiscount() { return true; }
}