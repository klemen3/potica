

import java.util.Scanner;

public class ProperŽurka {

	String imeHrane;
	int količina;
	int kapacitetaŽelodca;
	
	public void začniŽurko() {
		
		imeHrane = "Čokoladna potica";
		int količinaPotice = 1000;
		kapacitetaŽelodca = 3;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < količinaPotice; i++) {
			
			
			System.out.println("Ali želiš kos potice? (da/ne)");
			String odgovor = scanner.nextLine();
			
			if(odgovor.equals("da")) {
				babi_1();
			} else if(odgovor.equals("ne")) {
				babi_2();
			} else {
				System.out.println("Ali želiš še topli sendvič?");
				babi_3();
			}
		}
		scanner.close();
	}
	
	
	public void babi_1() {
		System.out.println("Izvoli 2 kosa potice");
		System.out.println();
		
	}
	
	public void babi_2()  {
		System.out.println("Izvoli 1 kos potice");
		System.out.println("Izvoli topli sendvič");
		System.out.println();

	}
	
	public void babi_3() {
		System.out.println("Izvoli topli sendvič");	
		System.out.println();
	}

}
