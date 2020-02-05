import java.io.File;
import java.util.Scanner;

public class Aula179 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isFile);
		System.out.println("FOLDERS:");

		for (File folder : folders) {
			System.out.println(folder);
		}
		
		boolean success = new File(strPath + "/subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		sc.close();
	}
}
