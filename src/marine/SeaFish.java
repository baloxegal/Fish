package marine;

public class SeaFish extends Fish {

	SeaFish() {
		super();
	}

	SeaFish(String type, int weight, String habitat) {
		super(type, weight, habitat);
	}

	@Override
	public String toString() {
		return "SeaFish type = " + getType() + ", weight = " + getWeight() + ", enviroment = " + getEnviroment();
	}

}