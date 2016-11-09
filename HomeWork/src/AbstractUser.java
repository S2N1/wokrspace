
public abstract class AbstractUser implements User, AdminUser {

	public void logIn() {
		System.out.println("User is logged in");
	}

	public void getUserName() {
		System.out.println("Get User Name");
	}

	public void deleteUser(){
		System.out.println("User is deleted");
	}

	public void addUser() {
		System.out.println("User is added");
	}
	public  void getRegTime(){
		System.out.println("Reg Time is");
	}
}
