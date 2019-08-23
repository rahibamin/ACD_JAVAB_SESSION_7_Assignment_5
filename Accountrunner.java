package Session7.Assignment5.bank;

public class Accountrunner {
	
	public static void main(String[] args) {
		WithdrawThread wTh = new WithdrawThread(1000);
		SendEmailThread sndEmTh = new SendEmailThread();
		SendSMSThread sndSMSTh = new SendSMSThread();
		WriteToFileThread wrtTh = new WriteToFileThread();

		wTh.start();
		sndEmTh.start();
		sndSMSTh.start();
		wrtTh.start();
	}
}