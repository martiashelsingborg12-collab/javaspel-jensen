public class Player {
    private String firstname;
    private String lastname;

    public Player(String firstname, String lastname)  {
        this.firstname = firstname;
	this.lastname = lastname;
    
    }

    public String getName() {
        return (firstname + "  " + lastname);
  
    }
     public void roll(){
         Dice dice = new Dice();

	 int dots = dice.roll();
	 System.out.print("Player ");
	 System.out.print(getName());

	 System.out.println(" rolled " + dots);
     }


}
