import java.util.ArrayList;
import java.util.Scanner;

public class a1main{
    
        public static void main(String[] args){
            
            ArrayList newArray = new ArrayList();
            Scanner keyboard = new Scanner(System.in);
            
            System.out.println("1.ADD 2.INSERT 3.DELETE 4.SHOW 5.COUNT 6.CLEAR");
            
            int option = keyboard.nextInt();
            
            if(option == 1){
            
                System.out.println("Enter number");
                int number = keyboard.nextInt();
            
                newArray.add(number);
            }
            
            else if(option == 2){
                
                System.out.println("Enter number");
                int number = keyboard.nextInt();
            
                System.out.println("Enter Index");
                int index = keyboard.nextInt();
            
                newArray.add(index,number);
            }
            
            else if (option == 3){
                
                System.out.print("Enter index");
                int index = keyboard.nextInt();
                
                newArray.remove(index);
            }
            
            else if (option == 4){
                
                System.out.println("Content of array: " + newArray);
            }
            
            else if (option == 5){
                
                System.out.println("Count of array: " + newArray.size());
            }
            
            else if (option == 6) {
                
                newArray.clear();
                
                System.out.println("Array data has been cleared.");
            }
        }
}