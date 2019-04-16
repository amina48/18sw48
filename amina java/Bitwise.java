class Bitwise
{
	public static void main(String args[])
	{
		int a=10,b=20,c=0;
		c=a&b;
		System.out.println("a & b = " + c);
		c=a|b;
		System.out.println("a | b = " + c);
		c=~a;
		System.out.println("~ a = " + c);
	}
}