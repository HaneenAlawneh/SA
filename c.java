
public class c {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		model mo= new model();
		View vi = new View();
		vi.setVisible(true);
		Controller co = new Controller (vi,mo);
	while (true){
			co.update();

	

	}

}
}