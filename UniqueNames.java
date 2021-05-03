package week4;

import acm.program.ConsoleProgram;
import acm.program.*;
import java.util.*;

public class UniqueNames extends ConsoleProgram {
		public void run() {
			ArrayList<String>sList = new ArrayList<String>();
				while (true) {
				String name = readLine("Enter name:");
				if (name.equals("")) break;
				if(!sList.contains(name)) {
					sList.add(name);
				}
		}
				System.out.println(sList);
}
private void readList(ArrayList<String> list)   {
			while(true) {
				String line = readLine("?");
				if (line.equals("")) break;
				for(int i = 0; i < list.size(); i++) {
					if(!getName().equalsIgnoreCase(line)){
						list.add(line);
					}       
				}
			}
}

private void printArrayList(ArrayList list) {
		println("List contains " + list.size() + " elements");
		for (int i = 0; i < list.size(); i++) {
			println(list.get(i));
		}
	}
}