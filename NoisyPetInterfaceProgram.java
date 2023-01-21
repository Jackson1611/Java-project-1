interface NoisyPet {
	void makeSound();

	void play();
}

class Cat implements NoisyPet {
	public void makeSound() {
		System.out.println("Cat says meow!");
	}

	@Override
	public void play() {
		System.out.println("Cat is playing with the ball of yarn.");
	}
}

class Dog implements NoisyPet {
	public void makeSound() {
		System.out.println("Dog says woof, woof!");
	}

	@Override
	public void play() {
		System.out.println("Dog is fetching the ball.");
	}
}

class Parrot implements NoisyPet {
	public void makeSound() {
		System.out.println("Parrot says 'Polly wants a cracker!'");
	}

	@Override
	public void play() {
		System.out.println("Parrot is flying around.");
	}
}

public class NoisyPetInterfaceProgram {
	public static void main(String[] args) {

		NoisyPet[] pet = {  new Cat(),new Dog(), new Parrot() };

		for (int i = 0; i < pet.length; i++) {
			pet[i].makeSound();

		}
		System.out.println("");
		for (int i = 0; i < pet.length; i++) {
			pet[i].play();
		}
	}
}