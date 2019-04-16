class LogicalOperators
{
	public static void main(String args[])
	{
		int x=4,y=5,z=6;
		System.out.println("x>y & x>z" +(x>y&y>z));
		System.out.println("z>y & z>x" +(z>y&z>x));
		System.out.println("y>x & y<z" +(y>x&y>z));
		System.out.println("x<y & y<x" +(x<y&y<x));
	}
}