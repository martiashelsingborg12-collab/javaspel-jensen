import java.util.Scanner;

public class Game{
    public void run(){
        System.out.println("välkomen till spelet: ");
	Scanner scanner = new Scanner(System.in);
	Player player1 = addPlayer(scanner);
	Player player2 = addPlayer(scanner);

        while(true){ 
            System.out.println("hej spelare");
            System.out.println("quit avsluta spelet, play köra spelet: ");
       	    String command = scanner.nextLine();
 
	    if("quit".equals(command)){
                break;
	    }
	    if("play".equals(command)){
                play( player1, player2);
            }
	}
	
		                                 
    }

    private Player addPlayer(Scanner scanner){
          System.out.print("vad är ditt förnamn: ");
          String firstName = scanner.nextLine();
          
          System.out.print("vad är ditt efternamn: ");
          String lastName = scanner.nextLine();
          return new Player(firstName, lastName);
    }
   
    private void play( Player player1, Player player2){
        System.out.println(player1.getName());
        System.out.println(player2.getName());
    }
} 
