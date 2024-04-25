public class Switch {
  public static void main(String[] args) {
    
  
  // System.out.println(Math.max(5,10));

//     String day = "5";
// switch (day) {
//   case "1":
//     System.out.println("Monday");
//     break;
//   case "2":
//     System.out.println("Tuesday");
//     break;
//   case "3":
//     System.out.println("Wednesday");
//     break;
//   case "4":
//     System.out.println("Thursday");
//     break;
//   case "5":
//     System.out.println("Friday");
//   case "7":
//     System.out.println("Saturday");
//     break;
//   case "8":
//     System.out.println("Sunday");
//     break;
//     default: 
//         System.out.println("Enter correct day");
// }
// // Outputs "Thursday" (day 4)




// for (int i = 1; i <= 2; i++) {
//   System.out.println("Outer: " + i); // Executes 2 times
  
//   // Inner loop
//   for (int j = 1; j <= 3; j++) {
//     System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
//   }
// } 
for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
}


}
}
