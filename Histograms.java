package week4;

import java.io.BufferedReader;
import java.io.FileReader;

import acm.program.ConsoleProgram;

public class Histograms extends ConsoleProgram {

	public void run() {
		int histogramArr[] = new int[11];
		try {
			BufferedReader objReader = new BufferedReader(new FileReader("MidtermScores.txt"));			
			while (true) {
				String aLine = objReader.readLine();
				System.out.println(aLine);
				if (aLine == null)
				break;
			}
			objReader.close();
		}
		catch (Exception e) {
		}
	}
}