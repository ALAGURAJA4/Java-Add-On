package session2;

public class ConstructorOverloadingEx {
   private String name;
   private int regno;
   private String location;
   
   public void ConstructorOverloadingEx(){
     
   }
   public  ConstructorOverloadingEx(String name, int regno, String location) {
	   this.name=name;
	   this.regno=regno;
	   this.location=location;
   }
   public  ConstructorOverloadingEx(String name, String location)
   {
	   this(name,0,location);
   }
   public  ConstructorOverloadingEx(String name, int regno)
   {
	   this(name,regno,null);
   }
   
   public void displayInfo() {
	   System.out.println("Name:"+this.name);
	   System.out.println("Regno:"+this.regno);
	   System.out.println("Location:"+this.location);
   }
   public static void main (String[]args) {
	   ConstructorOverloadingEx co=new ConstructorOverloadingEx("Nithin",100,"Coimbatore");
	   ConstructorOverloadingEx co1 =new ConstructorOverloadingEx("Nithin","Madurai");
	   ConstructorOverloadingEx co2 =new ConstructorOverloadingEx("Nithin",197);
	   co.displayInfo();
	   co1.displayInfo();
	   co2.displayInfo();
   }
}