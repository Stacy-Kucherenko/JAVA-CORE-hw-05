package lviv.lgs.ua;

public class Dog extends Pet {
	private String breed;
	private int maxSpeed;
	
	public Dog(double weight, double height, int maxSpeed, String breed) {
		super(weight, height);
		this.breed = breed;
		this.maxSpeed = maxSpeed;
	}
	
	

	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public int getMaxSpeed() {
		return maxSpeed;
	}



	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}



	@Override
	public String toString() {
		return "Dog [breed=" + breed + ", maxSpeed=" + maxSpeed + ", toString()=" + super.toString() + "]";
	}



	@Override
	void voice() {
		System.out.println("ί οερ - Γΰσσσ-Γΰσσσ");
		
	}
	
	
}
