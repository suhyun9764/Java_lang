package inheritance;

class Animal{

	public void move() {
		System.out.println("동물이 움직입니다");
	}
}

class human extends Animal{
	public void move(){
		System.out.println("사람이 두발로 걷습니다.");
	}
	
}

class tiger extends Animal{
	public void move(){
		System.out.println("호랑이가 네발로 뜁니다.");
	}
}

class eagle extends Animal{
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}


public class AnimalTest {

	
	public static void main(String[] args) {
		AnimalTest test =new AnimalTest();
		test.moveAnimal(new human());
		test.moveAnimal(new tiger());
		test.moveAnimal(new eagle());

	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}
