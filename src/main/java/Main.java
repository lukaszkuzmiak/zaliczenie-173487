import java.util.Scanner;

 public class Main {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
      System.out.print("Wpisz a: ");
      int a = scanner.nextInt();
      System.out.print("Wpisz b: ");
      int b = scanner.nextInt();
      System.out.print("Wpisz c: ");
      int c = scanner.nextInt();

     int delta = b * b - 4 * a * c; 
     if (delta<0) {
            
            System.out.println("Brak rozwiazania pierwiastka ");
          } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println(" pierwiastek wynosi: " + x);
          } else if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Dwa pierwiastki wynosza: " + x1 + " i " + x2);
          }

          scanner.close();
        }
      }
     
     

     
   
   
   
   
