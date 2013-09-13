/* Declare three variables: age, name and height and 
initialize them with your age, name and height. Choose an 
appropriate data type for each of these. 
Output a greeting, which mentions your name, age and height, 
e.g. Hello Falk. So you are 27 years old and your 
height is 1.8 metres. 

Bonus: Do not store the greeting you want to output in a String 
variable. */


import java.util.Scanner;
public class exe3 
{
	public static void main(String[] args) 
	{
		int a; 		/*Age*/
		float b;	/*height*/
		String c;	/*Name*/

		Scanner in = new Scanner(System.in);

		System.out.println("Enter your first name");	/*Ask for users name*/
		c = in.nextLine();


		System.out.println("Enter your height");		/*Ask for users height*/
		b = in.nextFloat();

		System.out.println("Enter your Age");			/*Ask for users Age*/
		a = in.nextInt();
		
		System.out.println( a + b + c);
		
		System.out.println("So you are called "+ c + " you are " + b + " meters tall and your are" +  a + " years old. It's a pleasure meeting you.");
	}
}