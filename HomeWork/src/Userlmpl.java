
public class Userlmpl extends AbstractUser {

	java.util.Date regTime = new java.util.Date();
	long time = regTime.getTime();

	@Override
	public void getUserName() {
		System.out.println("Print My User Name");
	}

	@Override
	public void getRegTime() {
		System.out.println("Reg Time is : " + time);
	}

}
