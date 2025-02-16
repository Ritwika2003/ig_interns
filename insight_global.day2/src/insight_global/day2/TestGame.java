package insight_global.day2;

//Test class to demonstrate polymorphism
public class TestGame {
public static void main(String[] args) {
   // Declare an array of Game references
   Game[] games = new Game[5];

   // Populate the array with instances of Cricket, Football, and Tennis
   games[0] = new Cricket();
   games[1] = new Football();
   games[2] = new Tennis();
   games[3] = new Cricket();
   games[4] = new Football();

   // Demonstrate polymorphism by calling displayInfo() on each element of the array
   for (Game game : games) {
       game.displayInfo(); // This will call the overridden method based on the object type
   }
}
}

