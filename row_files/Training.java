import java.util.Scanner; 

public class Training {

	public static void main(String[] args) {
		
		//wRechner(); // Funktioniert 
		randomLadder(); 
	}
	
	
	// Rechnet aus wie viele Klimzüge man insgesammt bei einem Beliebigen W Machen muss
	public static void wRechner( ) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Was für ein W wollen Sie machen:");
		int w = scan.nextInt(); 
		
		int count = 0; 
		
		
		
		while(w >= 1) {
			
			if (count == 0) {
				count = count + ( 3 * w ) ; 
			}
			else if (w == 1) {
				count = count + ( 2 * w ) ; 
			}
			else {
				count = count + ( 4 * w ) ; 
			}
			
			w--; 
		}
		
	
		System.out.println("Sie müssen insgesammt: " + count + " Liegestütz machen. Viel Spass"); 
		scan.close(); 
	}

	
	// Liefert ein Beliebiges Leiter Training
	public static void randomLadder() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Mit wie vielen Pullups wollen Sie anfangen?");
		int l = scan.nextInt(); 
		
		while ( l > 0) {
			
			int hauptuebung = (int) (Math.random()*2); // Bestimmt zufaellig die Hauptuebung
			
			if (hauptuebung == 0) {
				System.out.println( l + " : Pull-Ups "); 
				
				int pause1 = (int) (Math.random()*3); // Bestimmt zufaellig die Pausenuebung
					if (pause1 == 0) System.out.println( (l*2) + " : Liegestuetz"); 
					if (pause1 == 1) System.out.println( (l*2) + " : Austrailien Pull-Ups"); 
					if (pause1 == 2) System.out.println( (l*2) + " : Austrailien Chin-Ups"); 
			}
			if (hauptuebung == 1) {
				System.out.println( l + " : Chin-Ups "); 
				
				int pause2 = (int) (Math.random()*3); // Bestimmt zufaellig die Pausenuebung
					if (pause2 == 0) System.out.println( (l*2) + " : Liegestuetz"); 
					if (pause2 == 1) System.out.println( (l*2) + " : Austrailien Pull-Ups"); 
					if (pause2 == 2) System.out.println( (l*2) + " : Austrailien Chin-Ups"); 
				
			}
			
			System.out.println("------------------------");
			l--;
			
		}
		
		scan.close(); 
	}
	
}
