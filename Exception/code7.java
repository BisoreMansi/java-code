import java.util.Scanner;
class Test
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		try {
			
			System.out.println(10/n);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			
		}
		finally{
			System.out.println("Finnaly Execute");
		}

		s.close();
	}
}