package Session7.Assignment5.bank;

public class SendEmailThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {
			this.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Email is sent to the user.");
	}
}
