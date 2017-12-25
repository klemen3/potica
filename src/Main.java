import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
        String pythonScriptPath = "/home/klemen/Desktop/script.py";
        String[] cmd = {"python3", pythonScriptPath};

        ProcessBuilder pb = new ProcessBuilder(cmd);

        pb.redirectError();

        Process p = pb.start();
        System.out.println("Process Started...");
        BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
            //int ret = new Integer(in.readLine()).intValue();
        String result = new String(in.readLine());
        System.out.println(result);

    }
}



