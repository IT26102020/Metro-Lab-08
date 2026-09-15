
public class IT26102020Lab8Q2{

 public static void main(String[] args){
	 
	 int[] A = { 10, 20, 30, 40, 50};
	 
	 int [] B = { 34, 67, 12, 89, 12};
	 
	 int[] C = new int[5];
	 
	 //add A and B and store in C
	 for (int i = 0 ; i < 5 ; i++)
		 {
			 C[i] = A[i] + B[i];
		 }
		 
	//print A array
	System.out.println( "A array contents: ");
	for (int i = 0; i < 5 ; i++ )
		{
			System.out.print(+A[i]+" ");
		}
	 //print B array
	 System.out.println();
	 System.out.println( "B array contents: ");
	 for (int i = 0; i < 5 ; i++ )
		{
			System.out.print(+B[i]+" ");
		}
		
	//print C array
	System.out.println();
	System.out.println( "C array contents (A+B): ");
	 for (int i = 0; i < 5 ; i++ )
		{
			System.out.print(+C[i]+" ");
		}	
		
 }
}