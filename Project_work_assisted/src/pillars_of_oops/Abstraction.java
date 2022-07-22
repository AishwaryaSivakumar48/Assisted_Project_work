package pillars_of_oops;

abstract class birds {
	  abstract void makeSound();

	  public void fly() {
	    System.out.println("I can fly");
	  }
	}

	class duck extends birds {
	  public void makeSound() {
	    System.out.println("qwack qwack");
	  }
	}

	class Abstraction {
	  public static void main(String[] args) {
	    duck d1 = new duck();
	    d1.makeSound();
	    d1.fly();
	  }
	}