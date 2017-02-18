import junit.framework.TestCase;


public class vTest extends TestCase {
	View v = new View ();
	model m = new model ();
	Controller co = new Controller (v,m);
	
	protected void setUp() throws Exception {
		super.setUp();
		
	}

	public void testGeto() {
		int x = 2;
		v.o=x; 
		int y = v.geto();
		assertTrue(y==2);
		
	}

	public void testGetf() {
		int x = 3;
		v.f=x; 
		int y = v.getf();
		assertTrue(y==3);
		
	}

	public void testGets() {
		int x = 8;
		v.s=x; 
		int y = v.gets();
		assertTrue(y==8);
		
	}

	public void testSeto() {
		int x = 3 ; 
		v.seto(x);
		int y = v.o;
		assertTrue(y==3);
		
	}

	public void testSetf() {
		
		int x = 3 ; 
		v.setf(x);
		int y = v.f;
		assertTrue(y==3);

		
	}

	public void testSets() {
		int x = 3 ; 
		v.sets(x);
		int y = v.s;
		assertTrue(y==3);
	}
	public void testCalculate() {
		int x = 5;
		int y = 3; 
		
		int a=m.calculate(x, y, 1);
		int s = m.calculate(x, y, 2);
		int d= m.calculate(x, y, 3);
		int ml=m.calculate(x, y, 4);
		
		assertTrue((a==8)&& (s==2)&&(d==1)&&(ml==15));
		
		
		
	

}
}
