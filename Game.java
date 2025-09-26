import java.util.Scanner;

public class Game{
    public void run(){
        System.out.println("välkomen till spelet: ");
	Scanner scanner = new Scanner(System.in);

	System.out.print("vad är ditt förnamn: ");
	String firstName = scanner.nextLine();

	System.out.print("vad är ditt efternamn: ");
	String lastName = scanner.nextLine();


        while(true){

        System.out.println("hej: " + firstName + " " + lastName);
        System.out.println("quit avsluta spelet, play köra spelet: ");
	String command = scanner.nextLine();

	if("quit".equals(command)){
            break;
	}
		                                                     
	}
	
		                                 
    }
}
