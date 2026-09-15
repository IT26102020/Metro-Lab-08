import java.util.Scanner ;

public class IT26102020Lab8Q1a{

 public static void main(String[] args){
 
  Scanner input = new Scanner(System.in);
  
  //we create the array
  int[] myArray = new int[5];
  
  //input 5 numbers 
  for (int i = 0 ; i < 5 ; i++)
  {
  System.out.println("Enter number " +(i+1)+ ":");
  myArray[i] = input.nextInt();
  }
  
  //print numbers in reverse order
  System.out.println("Numbers in reverse order");
  
  for(int i = 4 ; i>=0 ; i--)
  {
  System.out.println(myArray[i]);
  }
  
  }
  }
  