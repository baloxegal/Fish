package marine;

public interface FishInterface /*extends Cloneable*/{

	//Object clone() throws CloneNotSupportedException;
	void setType(String type);
	String getType();
	void setWeight(Integer weight);
	int getWeight();
	void setEnviroment(String enviroment);
	String getEnviroment();
}