package lviv.lgs.ua;

public class MainPet {

	public static void main(String[] args) {
		
		Cat c = new Cat(0, 0, 0, null);
		System.out.println(c);
		c.voice();
		
		Cow w = new Cow(0, 0, 0, null);
		System.out.println(w);
		w.voice();
		
		Dog d = new Dog(0, 0, 0, null);
		System.out.println(d);
		d.voice();
		
	}
	
}
