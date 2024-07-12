class Sumoftwonumbers
{
	public static void main(String args[])
	{
		int n=126,n1,n2,n3,sum;

		n1=n%10;

		n2=n/10;

		n2=n2%10;

		n3=n/100;

		sum=n1+n2+n3;

		System.out.println("sum of individual Numbers="+sum);
	}
}