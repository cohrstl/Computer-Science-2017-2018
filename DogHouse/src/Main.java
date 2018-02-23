
public class Main {

	public static void main(String[] args) {
	Dog Sam=new Dog();
	Dog Jim=new Dog(true,"Jim");
	Jim.feed();
	Jim.feed();
	System.out.println(Jim.numTimesFed+" "+Jim.getName());

	}

}
