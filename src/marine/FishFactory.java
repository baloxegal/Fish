package marine;

public class FishFactory {

	public FishInterface getFish(String fishClass, String type, Integer weight, String enviroment) {
		
		if (fishClass == null) {
			return null;
		}
		else if (fishClass.equalsIgnoreCase("Sea fish")) {
			return new SeaFish(type, weight, enviroment);
		}
		else if (fishClass.equalsIgnoreCase("River fish")) {
			return new RiverFish(type, weight, enviroment);
		}
		return null;
	}

//	public FishInterface cloneFish(FishInterface original) {
//		FishInterface fish = new Fish();
//		fish.setType(original.getType());
//		fish.setWeight(original.getWeight());
//		fish.setEnviroment(original.getEnviroment());
//		return fish;
//	}
	
	
}