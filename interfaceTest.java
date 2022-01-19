interface Area
{
	final static float pi = 3.142f;
	float compute(float x, float y);
}

class Rectangle implements Area
{
	public float compute(float x, float y)
	{
		return(x * y);
	}
}

class Circle implements Area
{
	public float compute(float x, float y)
	{
		return(pi * x * x);
	}
}

class interfaceTest
{
	public static void main(String args[])
	{
		Rectangle rect = new Rectangle();
		Circle cir = new Circle();
		float areaR = rect.compute(10,20);
		System.out.println("Area of rectangle="+areaR);
		System.out.println("Area of circle="+cir.compute(10,0));
		
	}
}