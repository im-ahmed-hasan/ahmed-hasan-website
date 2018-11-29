package Electronics;

public class TestComputer {

	public static void main(String[] args) {
		
		Computer mycomp = new Computer();
		
		mycomp.creatorOfTheComputer();
		
	    String brandName = mycomp.findBrandNameOfComputer();
		System.out.println(brandName);
		
	    Computer urcomp = new Computer("Apple");
	    char firstLetterOfComputer = urcomp.findletter();
	    System.out.println(firstLetterOfComputer);
	    
		Computer unknown = new Computer ("Apple Macbook Pro", 'M');
		boolean hpBrand = unknown.nameOfTheBrand();
		System.out.println(hpBrand);
		
		
		

	}

}
