package Session7.Assignment5.bank;

public class SendSMSThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("SMS is sent to User.");
	}
}