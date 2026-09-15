import java.util.Scanner;

public class IT26102020Lab8Q3_1{
	
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
		
		//variables
        int[] arrayNumbers = new int[6];
        int count = 0;
		int num, maxNo ;
		
		//while loop
         while (count < 6) 
		{
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
             num = input.nextInt();

            if (num <= 0) 
			{

                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else 
			{
                arrayNumbers[count] = num;
                count++;
            }
        }
		
		//print the array
		
		System.out.println();
        System.out.println("Array Contents:");
        for (int i = 0; i < 6; i++)
		{
            System.out.print(+ arrayNumbers[i] + " ");
            
        }
        System.out.println();
		
		//print the maximum value

        maxNo = arrayNumbers[0];
        for (int i = 1; i < 6; i++)
			{
            if (arrayNumbers[i] > maxNo) {
                maxNo = arrayNumbers[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + maxNo);

        input.close();
    }
}