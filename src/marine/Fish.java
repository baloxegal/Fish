package marine;

public class Fish implements FishInterface {

	private String type;
	private Integer weight;
	private String enviroment;

	Fish() {

	}

	Fish(String type, Integer weight, String enviroment) {
		this.type = type;
		this.weight = weight;
		this.enviroment = enviroment;
	}

	@Override
	public String toString() {
		return "Fish without type = " + type + ", weight = " + weight + ", enviroment = " + enviroment;
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void setEnviroment(String enviroment) {
		this.enviroment = enviroment;
	}

	@Override
	public String getEnviroment() {
		return enviroment;
	}
	
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone();
//	}
}