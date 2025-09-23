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



}
