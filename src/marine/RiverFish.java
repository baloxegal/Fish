package marine;

public class RiverFish extends Fish {

	RiverFish() {
		super();
	}

	RiverFish(String type, Integer weight, String enviroment) {
		super(type, weight, enviroment);
	}

	@Override
	public String toString() {
		return "RiverFish type = " + getType() + ", weight = " + getWeight() + ", enviroment = " + getEnviroment();
	}
}