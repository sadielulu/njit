import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
			File in = new File("input.txt");
			File out = new File("output.txt");
			
			try {Scanner sc = new Scanner(in);
				PrintWriter wr= new PrintWriter(new FileWriter(out,true));
				while(sc.hasNext()){
					wr.println(sc.next());
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
}
