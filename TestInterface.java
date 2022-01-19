interface AIR
{
	String tostring();
}
abstract class AIRPlane implements AIR
{
	char type;
	static int serno;
	int cap;
	AIRPlane(char t, int c)
	{
		type = t;
		cap = c;
	}
}

class AIRINDIA extends AIRPlane
{
	AIRINDIA(char t, int c)
	{
		super(t, c);
	}
	public String tostring()
	{
		serno = serno +1;
		return ("AIRINDIA: "+type+ "\t"+serno+"\t"+ cap);
	}	
}

class JETAIR extends AIRPlane
{
	JETAIR(char t, int c)
	{
		super(t, c);
	}
	public String tostring()
	{
		serno = serno +1;
		return ("JETAIR: "+type+ "\t"+serno+"\t"+ cap);
	}
}

class TestInterface
{
	public static void main(String args[])
	{
		AIRPlane rf;
		AIRINDIA ob1 = new AIRINDIA('A',20);
		JETAIR ob2 = new JETAIR('B',50);
		rf = ob1;
		System.out.println(rf.tostring());
		rf = ob2;
		System.out.println(rf.tostring());

	}
}








