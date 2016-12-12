
public class Tkdthr {
	
	public static void main(String args[])
	{
		class ParentClass
		{
			private int x,y;
			public ParentClass()
			{
				System.out.println("부모 클래스 생성자");
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
				System.out.println("하위 클래스 생성자");
			}
		}
		ChildClass ch = new ChildClass();
	}
}