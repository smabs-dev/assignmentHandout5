package week4;

import acm.program.ConsoleProgram;

public class WordCount extends ConsoleProgram {

	
	static int WordCount(String str) {
		int count = 0;

		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || 
					((ch[0] != ' ') && (i == 0)))
				count++;
		}
		return count;
	}
	static int LineCount(String str) {
		int count = 0;
		
		char ch[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (((i > 0) && (ch[i] != '\n') && (ch[i - 1] == '\n')) || 
					((ch[0] != '\n') && (i == 0)))
				count++;
		}
		return count;
	}
	static int CharCount(String str) {
		int count = 0;
		
		for (int ch = 0; ch < str.length(); ++ch) {
			char i = str.charAt(ch);
			if (ch != '\r' && ch != '\n')
				count++;
		}
		return count;
	}
public static void main(String[] args) {
		String string = "Poor naked wretches, wheresoe'er you are, \r\n"
				+ "That bide the pelting of this pitiless storm, \r\n"
				+ "How shall your houseless heads and unfed sides, \r\n"
				+ "Your loop'd and window'd raggedness, defend you \r\n"
				+ "From seasons such as these? O, I have ta'en \r\n"
				+ "Too little care of this!";
		System.out.println(WordCount(string) + " words.");
		System.out.println(LineCount(string) + " lines.");
		System.out.println(CharCount(string) + " characters.");
	}
}