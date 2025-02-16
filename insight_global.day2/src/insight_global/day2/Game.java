package insight_global.day2;

//Base class representing a sport
class Game {
 public void displayInfo() {
     System.out.println("This is a sport game.");
 }
}

//Derived class representing Cricket
class Cricket extends Game {
 @Override
 public void displayInfo() {
     System.out.println("Cricket is a bat-and-ball game played between two teams of eleven players.");
 }
}

//Derived class representing Football
class Football extends Game {
 @Override
 public void displayInfo() {
     System.out.println("Football is a team sport played by two teams of eleven players using a spherical ball.");
 }
}

//Derived class representing Tennis
class Tennis extends Game {
 @Override
 public void displayInfo() {
     System.out.println("Tennis is a racket sport that involves hitting a ball over a net between two players or two teams.");
 }
}

