class MathOperation
{
	static float mul(float x, float y)
	{
		return x*y;
	}
	static float divide(float x, float y)
	{
		return  x/y;
	}
}

class TestStatic
{
	public static void main(String args[])
	{
		float a=MathOperation.mul(4.0f,5.0f);
		System.out.println("a="+a);
		
		float b=MathOperation.divide(a,2);
		System.out.println("b="+b);
	}
}