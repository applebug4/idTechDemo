// iD Tech Demo!
public class Main {
  public static void main(String[] args) {
     boolean isThursday = false;
     System.out.println(isThursday);
     
     if(isThursday) { 
     System.out.println("It's Thursday!");
     } else {
     System.out.println("It's not Thursday.");
     } 
     
     boolean isWeekend = true;
    
     if(isThursday) { 
     System.out.println("It's Thursday!");
     } else if(isWeekend) {
     System.out.println("It's the weekend!");
     }
     else {
     System.out.println("It's not Thursday or the weekend.");
     } 
     
     int daysUntilBirthday = 15;
     
     if (daysUntilBirthday == 0) {
     System.out.println("Happy birthday!");
     } else {
     System.out.println("There are " + daysUntilBirthday + " days left until your birthday!");
     } 
    
     int jacketPrice = 205;
     
     if (jacketPrice > 100) {
     System.out.println("The jacket is an average price.");
     } else if (jacketPrice > 200) {
     System.out.println("This jacket is expensive.");
     } else {
     System.out.println("This jacket is cheap.");
     } 
   
     // Here's the fixed one! :
     if (jacketPrice > 200) {
     System.out.println("The jacket is expensive.");
     } else if (jacketPrice > 100) {
     System.out.println("This jacket is an average price.");
     } else {
     System.out.println("This jacket is cheap.");
     }
  }
}