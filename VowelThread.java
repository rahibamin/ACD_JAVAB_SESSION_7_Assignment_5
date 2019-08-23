package Session7.Assignment5.text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class VowelThread extends Thread {
	
	private File fIn;
	private File fOut = new File("Text Separator Files/Vowels.txt");
	
	
	public VowelThread(File fIn) {
		// TODO Auto-generated constructor stub
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
					if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
						bw.append(s.charAt(i));
					}
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
