import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class one {

	public void runPython() throws IOException, InterruptedException {
		
		String command = "terminator python3 /home/script.py";
		
		Process p = Runtime.getRuntime().exec(command);
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = "";
		while((line = reader.readLine()) != null) {
            System.out.print(line + "\n");
        }
		
		p.waitFor();
		
	
	}
	
}
