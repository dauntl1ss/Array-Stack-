import java.util.*;
public class testArrayStack
{
   public static void main(String[] args)
   {
      Scanner console = new Scanner(System.in);
      

     //System.out.println("Enter limit: ");
     //int limit = console.nextInt();
     //ArrayStack x = new ArrayStack(limit);
          ArrayStack x = new ArrayStack();

     
     int choice;
         do{
      System.out.println("\t MENU \t");
      System.out.println("1 -- PUSH \n2 -- POP\n3 -- TOP\n4 -- PRINT\n5 -- EXIT\n");   
      System.out.println("Enter choice: ");
      choice = console.nextInt(); 
         switch(choice){
            case 1:
                  System.out.println("PUSH");
                  System.out.println("Enter an item: ");
                  int item = console.nextInt();
                  x.push(item);
                  break; 
            case 2:
                  System.out.println("POP");
                  x.pop();
                  break;
            case 3:
                  System.out.println("TOP");
                  x.top();
                  break;
            case 4:
                  System.out.println("PRINT");
                  x.print();
                  break;
            case 5:
                  System.out.println("EXIT");
                  break;        
         }
        }while(choice<6);    
   }
}