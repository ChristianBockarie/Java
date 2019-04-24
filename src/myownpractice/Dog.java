package myownpractice;

public class Dog {
	public static String dogBreed = "Mutt";
	  public String dogName;
	  public double dogWeight;
	 public Dog(String name, String breed, double weight){
	    dogName = name;
	    dogBreed= breed;
	    dogWeight = weight;
	  }
	  public void getDogDetails(){
	    String details = dogName + " " + dogBreed + " " + dogWeight;
	    System.out.println(details);
	  }
}
