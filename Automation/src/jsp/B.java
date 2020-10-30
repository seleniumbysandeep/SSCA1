package jsp;

public class B {

	public static void main(String[] args) {
		A a1=new A(30);
		int x=a1.getValue();
		System.out.println(x);
		a1.setValue(100);
		int y=a1.getValue();
		System.out.println(y);
		
	}

}
