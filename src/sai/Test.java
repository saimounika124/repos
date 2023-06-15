package sai;

public class Test {
	public String name;
	public void m1(String n) {
			this.name = n;
			System.out.println(this.name);
	}
	public static void m2() {
		System.out.println("m2 executed");
	}
	
	public static void main(String args[]) {
		System.out.println("main method executed");
		Test q = new Test();
		Test q1 = new Test();
		q.m1("q m1 object");
		Test.m2();
		q1.m1("q1 object");
		Test.m2();
	}
	}


