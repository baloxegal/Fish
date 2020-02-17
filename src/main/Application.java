package main;

//import marine.RiverFish;
//import marine.SeaFish;
//import marine.Fish;
import marine.FishInterface;
import marine.FishFactory;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {

		FishFactory factory = new FishFactory();
		System.out.println(factory.getFish("River fish", "Carp", 2, "River"));
		System.out.println(factory.getFish("Sea fish", "Shark", 100, "Sea"));
		System.out.println();
		
		FishInterface factoryFish = factory.getFish("River fish", "Amur", 6, "River");
		System.out.println(factoryFish);
		
		FishInterface cloneFish = factory.cloneFish(factoryFish);
		System.out.println(cloneFish);
		
//		FishInterface cloneFish = (FishInterface) factoryFish.clone();
//		System.out.println(cloneFish);
		System.out.println();
		
		factoryFish.setType("Ocuni");
				
		System.out.println(factoryFish);
		System.out.println(cloneFish);
		System.out.println();
		
		cloneFish.setType("Lesci");
		
		System.out.println(factoryFish);
		System.out.println(cloneFish);
		System.out.println();
	}
}