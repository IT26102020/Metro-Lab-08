import java.util.Scanner ;

public class IT26102020Lab8Q1b{

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
  
  //create even array
  int[] evenArray = new int[5] ; //there could be max 5 even numbers
  int evenCount = 0;
  
  //find the even numbers
  for (int i = 0 ; i < 5 ; i++)
  {
  if (myArray[i] % 2 ==0)
  {
  evenArray[evenCount] = myArray[i];
  evenCount++;
  }
  }
  
  //print myArray
  System.out.println();
  System.out.println("myArray contents : ");
  for ( int i =0 ; i <5 ; i++)
  {
  System.out.println(myArray[i]);
  }
  
  //print evenArray
   System.out.println();
  System.out.println("evenArray contents : ");
  
  for ( int i = 0 ; i < evenCount ; i++)
  {
  System.out.println(evenArray[i]);
  }
  }
  }
  