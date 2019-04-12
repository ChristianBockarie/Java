package com.Class18;

public class Application {
	public static void main(String[] args) {
		
		Animal dog1 = new Animal();
		System.out.println(dog1.breed);
		System.out.println(dog1.name);
		System.out.println(dog1.weight);
		System.out.println(dog1.age);
		System.out.println();
		
		Animal dog2 = new Animal();
		System.out.println(dog2.breed);
		System.out.println(dog2.name);
		System.out.println(dog2.weight);
		System.out.println(dog2.age);
		System.out.println();
		
		Animal dog3 = new Animal();
		System.out.println(dog3.breed);
		System.out.println(dog3.name);
		System.out.println(dog3.weight);
		System.out.println(dog3.age);
		
        int my_array[] = { -1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println("Printing the minimum value");
        
        System.out.println(Minimum.minOfValues(my_array));
	}

}
