package pillars_of_oops;

class Animal{
void eat(){
	System.out.println("It eats");
	
}
}
class Dog extends Animal{
void bark(){
	System.out.println("It barks");
}
}
class Puppy extends Dog{
void puppy_dog() {
	System.out.println("puppy is small");}
}
class Inheritance{
public static void main(String args[]){
Puppy d=new Puppy();
d.puppy_dog();
d.bark();
d.eat();
}
}