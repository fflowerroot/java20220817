package ch07.book.p335_337_추상_메소드와_오버라이딩;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		System.out.println();
		
		Animal animal = null;
		animal.sound();
		animal = new Cat();
		animal.sound();
		
		System.out.println();
		
		animalSound(new Dog());
	}
		
		public static void animalSound(Animal animal) {
			animal.sound();
		}
		
	}

