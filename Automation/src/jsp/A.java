package jsp;

public class A {
	
private int i;       //declaration
	
	public A(int k) {
		i=k;       //initialization
				}
	
	public int getValue() {       //only read access
		return i;
	}
	public void setValue(int j) {
		i=j;                           //utilization
	}
}
