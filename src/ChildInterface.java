
public class ChildInterface implements Parent {

	public static void main(String[] args) {
		
		ChildInterface pri=new ChildInterface();
		pri.green();
		ChildInterface.orange();
	}

	@Override
	public void green() {
		System.out.println("printgreen");
		System.out.println("printgreennnnn");
		
		
	}

	
	public static void orange() {
		System.out.println("prinnt orage");
	}
	@Override
	public void blue() {
		
		
	}

	@Override
	public void yellow() {
		
		
	}

}
