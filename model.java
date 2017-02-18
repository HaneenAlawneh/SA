
public class model {
	
	
	public int calculate( int x, int y, int o)
	throws ArithmeticException
	{
		if (o==1){
			
		return x+y;
		}
	if(o==2){
		return x-y;
	}
	if(o==3){
		return x/y;
		
	}
	if (o==4)
	{
		return x*y;
	}
	else 
		return 0;
	

}
}