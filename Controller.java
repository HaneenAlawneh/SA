import java.util.InputMismatchException;

public class Controller {

	private View v;
	private model m;
	int r;
	
	public Controller (View v, model m)
	{
		this.m=m;
		this.v=v;
	}
	public int Calculate() {
		return v.geto();
		
	}
	
	public void update ()
	{
		boolean c=true;
		do 
		{
			try {
				int fn =v.getf();
				int sn =v.gets();
				v.t3.setText(""+ m.calculate(fn, sn , v.geto()));
				c=false;
			}
			catch (InputMismatchException e)
			{
				System.err.print(e);
			}
			
			catch (ArithmeticException a )
			{
				System.err.print(a);
			}
		}while (c);
	
	
	}
}
