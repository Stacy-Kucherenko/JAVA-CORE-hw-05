package lviv.lgs.ua;

public class Cat extends Pet {
	private String breed;
	private int maxSpeed;
	public Cat(double weight, double height, int maxSpeed, String breed) {
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
		return "Cat [breed=" + breed + ", maxSpeed=" + maxSpeed + ", toString()=" + super.toString() + "]";
	}


	@Override
	void voice() {
		System.out.println("ί κ³ς- Μÿσσσ-Μÿσσσ");
		
	}
	
	
	

}
