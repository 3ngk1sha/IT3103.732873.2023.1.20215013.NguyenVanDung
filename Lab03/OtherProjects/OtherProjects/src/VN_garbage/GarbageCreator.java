package VN_garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//Nguyen VanDung-20215013
public class GarbageCreator {

	public static void main(String[] args) throws IOException {

		String filename = "C:\\OtherProjects\\src\\VN_garbage\\test.txt";
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		
		String outputString = "";
		for (byte b : inputBytes) {
			outputString += (char) b;
		}
		
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}

}
