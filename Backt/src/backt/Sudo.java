package backt;
class A{
	void dis1() {
		System.out.println("this is A");
	}
}

class B extends A{
	void dis2() {
		System.out.println("this is b");
	}
}
public class Sudo extends B {
	
	public void dis() {
		System.out.println("this is sudo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Sudo s=new Sudo();
		s.dis1();
		s.dis2();
		s.dis();
	}

}

