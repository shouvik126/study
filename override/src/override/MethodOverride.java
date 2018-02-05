package override;

class A
{
	
	public void show()
	{
		System.out.println("on A");
	}
}
class B extends A
{
	
	@Override
	public void show()
	{
		super.show();
		System.out.println("in B");
	}
}
public class MethodOverride {
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}

}
