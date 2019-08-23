package Session7.Assignment5.text;

import java.io.File;

public class SeperatorMain {
	
	public static void main(String[] args) {
		File f = new File("Text Separator Files/MyText.txt");
		
		DigitThread dTh = new DigitThread(f);
		ConsonantThread cTh = new ConsonantThread(f);
		VowelThread vTh = new VowelThread(f);
		
		dTh.start();
		cTh.start();
		vTh.start();
	}

}
