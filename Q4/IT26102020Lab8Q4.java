import java.util.Scanner ;

public class IT26102020Lab8Q4{

 public static void main(String[] args){
 
  Scanner input = new Scanner(System.in);
  
  //variables
  int count = 0;
  int idNum ;
  
  //we create the array
  int[] studentID = new int[8];
  
  //while loop
         while (count < 8) 
		{
            System.out.print("Enter student ID for student "+(count+1)+ " : ");
             idNum = input.nextInt();

            if (idNum <= 0) 
			{

                System.out.println("Error: Please Enter ONLY Numbers");
            } else 
			{
                studentID[count] = idNum;
                count++;
            }
        }
  
  
  //availability of a student ID number
  System.out.println("Enter a student ID to search : ");
  int searchID = input.nextInt();
  
  //logic to find the availability
 boolean found = false ;
 for (int i = 0 ; i < 8 ; i++)
	 {
		 if(studentID[i] == searchID) 
			 {
				 found = true;
				 break;
			 }
	 }
	 
	 //print whether the ID number is in the array or not
	 if (found)
		 {
			 System.out.println("Student is Available");
		 }
			 else
				 {
					 System.out.println("Student is not available");
				 }
				 input.close();
		 
		 
 }
}
