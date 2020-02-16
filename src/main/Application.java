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
		
		FishInterface f = factory.getFish("River fish", "Amur", 6, "River");
		System.out.println(f);

//		FishInterface factoryFish = factory.cloneFish(f);
//		System.out.println(factoryFish);
		
		FishInterface factoryFish = (FishInterface) f.clone();
		System.out.println(factoryFish);
		System.out.println();
		
		factoryFish.setType("Ocuni");
				
		System.out.println(f);
		System.out.println(factoryFish);
		System.out.println();
		
		f.setType("Lesci");
		
		System.out.println(f);
		System.out.println(factoryFish);
		System.out.println();
	}
}