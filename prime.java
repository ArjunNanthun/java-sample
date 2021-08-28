import java.io.*;
class prime
{
	public static void main(String arg[])throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter the value");
		int a=Integer.parseInt(dis.readLine());
		int j=1;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				j=0;
				break;
			}
		}
		if(j==1)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
}
		
		