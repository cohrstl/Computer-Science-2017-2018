
public class Dog {
	// declare and initialize private member variables here	private    private int numTimesFed = 0;
		private int numTimesFed=0;   
		private boolean isSleeping = false;
		private String name = "Ruffer";

	   public String getName()
	   {
		   return name;
	   }

	   public void wakeUp()
	   {
		   System.out.println("WAKING UP");
		  isSleeping=false;
		   numTimesFed=0;
	   }

	   public void sleep()
	   {
		   isSleeping=true;
		   System.out.println("SLEEPING");
	   }

	   public void hear(String sound)
	   {
		   if(isSleeping==true){
			   return;
		   }
		   if (sound==name) {
			   System.out.println("WAG TAIL");
		   }
		   if (sound=="ding-dong") {
			   System.out.println("BARK");
		   }
		   else {
			   return;
		   }
	   }
	   
	  public Dog(boolean sleeping,String n) {
			   this.isSleeping=sleeping;
			   this.name=n;
		   }  
	  public Dog(String n) {
		  this.name=n;
	  }
	   public void feed()
	   {
		   if (isSleeping==true) {
			   return;
		   }
		   else {
			   numTimesFed++;
		   }
		   if (numTimesFed>2){
			   System.out.println("YAWN");
		   }
		   if(numTimesFed<=2) {
			   System.out.println("YUMMY");
		   }
		  
	   }
}
