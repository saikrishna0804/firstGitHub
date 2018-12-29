package constructor;

public  class A {
	private  void m1() {
		System.out.println("parent class private method");
	}
	}
class C extends A{
	private  void m1() {
		System.out.println("child class private class");
		
	}
}

