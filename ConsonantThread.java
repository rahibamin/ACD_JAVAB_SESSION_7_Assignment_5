package Session7.Assignment5.text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConsonantThread extends Thread {
	
	private File fIn;
	private File fOut = new File("Text Separator Files/Consonants.txt");
	char[] c = {'a', 'e', 'i', 'o', 'u', '1', '0', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	public ConsonantThread(File fIn){
		this.fIn = fIn;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(fOut));
			Scanner scan = new Scanner(fIn);
			while(scan.hasNext()){
				String s = scan.next().toLowerCase();
				for(int i = 0; i < s.length(); i++){
					boolean match = true;
					for (char d : c) {
						if(s.charAt(i) == d){
							match = false;
						}
					}
					if(match)
						bw.append(s.charAt(i));
				}
			}
			scan.close();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
