package Session7.Assignment5.bank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteToFileThread extends Thread{
	
	private volatile File f = new File("Withdraw.txt");
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			
			bw.write("Email Sent!\nText Sent");
			bw.flush();
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
