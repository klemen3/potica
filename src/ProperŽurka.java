

import java.io.IOException;
import java.util.Scanner;

public class ProperŽurka {

	String imeHrane;
	int količina;
	int kapacitetaŽelodca;
	
	public void začniŽurko() throws IOException {
		
		imeHrane = "Čokoladna potica";
		int količinaPotice = 1000;
		kapacitetaŽelodca = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < količinaPotice; i++) {
			
			
			System.out.println("Ali želiš kos potice? (da/ne)");
			String odgovor = scanner.nextLine();
			
			if(odgovor.equals("da")) {
				speci("potica");
			} else if(odgovor.equals("ne")) {
				speci("toast");
			} else {
				speci("potica");
				speci("potica");
			}
		}
		scanner.close();
	}
	
	public void speci(String hrana) throws IOException {
		String pythonScriptPath = "/home/klemen/eclipse-workspace/potica/potica/" + hrana + ".py";
        String[] cmd = {"python3", pythonScriptPath};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        Process p = pb.start();
	}
	
	
}
