
public class Tkdthr {
	
	public static void main(String args[])
	{
		class ParentClass
		{
			private int x,y;
			public ParentClass()
			{
				System.out.println("�θ� Ŭ���� ������");
			}
			public ParentClass(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}
			
		}
		class ChildClass extends ParentClass
		{
			public ChildClass()
			{
				System.out.println("���� Ŭ���� ������");
			}
		}
		ChildClass ch = new ChildClass();
	}
}