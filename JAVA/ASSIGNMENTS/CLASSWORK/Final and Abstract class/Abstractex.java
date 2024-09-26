
abstract class Test{
	public abstract void f1( );
	public abstract void f2( );
	public abstract void f3( );
}

abstract class AbstractTest extends Test{
	@Override
	public void f1() {	}
	@Override
	public void f2() {	}
	@Override
	public void f3() {	}
}

class A extends AbstractTest{
	@Override
	public void f1() {
		System.out.println("A.f1");
	}
}
class B extends AbstractTest{
	@Override
	public void f2() {
		System.out.println("B.f2");
	}
}
class C extends AbstractTest{
	@Override
	public void f3() {
		System.out.println("C.f3");
	}
}
public class Abstractex {
	public static void main(String[] args) {
		Test t1 = new A( ); //Upcasting
		t1.f1();
		
		Test t2 = new B();	//UPcasting
		t2.f2();
		
		Test t3 = new C();	//Upcasting
		t3.f3();
	}
}

