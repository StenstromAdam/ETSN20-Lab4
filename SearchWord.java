import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchWord {
	private static String lineWork;
	private static File fileToRead;
	private static String wordToSearch;
	
	public static void main(String[] args) throws FileNotFoundException {
		try {
			wordToSearch = args[1].toLowerCase();
			fileToRead = new File(args[2]);
		} catch(Exception e) {
			System.out.println("Wrong Input Arguments, should be: Search <Pattern> <file>");
			System.exit(0);
		}
		Scanner sc = new Scanner(fileToRead);
		while(sc.hasNextLine()) {
			lineWork = sc.nextLine();
			if(lineWork.toLowerCase().contains(wordToSearch)) {
				System.out.println(lineWork);
			}
		}
	}
}

