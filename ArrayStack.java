public class ArrayStack
{
   
   private int array[];
   int arrayCopy[];
   int limit, count, capacity = 2;
   
   
  /* public ArrayStack(int limit)
   {
      this.limit = limit;
      count = this.limit-1;
      array = new int[limit];
   }*/
   
   public boolean isEmpty()
   {
      if(limit - 1 == count)
         return true;
      else
         return false;  
   }
   public void push(int item)// add to head
   {
     if(array.length == capacity)
         {
           int length = array.length;
            arrayCopy = new int[capacity*2];
            
            for(int i = 0; i<array.length; i++)
            {
               arrayCopy[i] = array[i];
               array[i] = arrayCopy[i];
            }
         }
              
      array[count] = item;
      count--;
      
   }
   public void pop()//Delete head
   {
      if(isEmpty())
         System.out.println("List is empty. You need to add an element");
      
      else{
         array[count+1] = 0;
         count++;        
      }
   }
   public void top() // print head
   {
      if(isEmpty())
         System.out.println("List is empty. You need to add an element");
      else
         System.out.println(array[count+1]);
   }
   public void print() // print forward
   {
      if(isEmpty())
         System.out.println("List is empty. You need to add an element");
      else
      {
         int x = count + 1;
         for(int i = x; i<limit; i++)
         {
            System.out.println(array[i]);
         }
      }
   }
}