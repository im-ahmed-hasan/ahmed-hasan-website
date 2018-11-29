package Electronics;

public class Computer {

    static String brandName= "MacBook";
    String brandTitle;
    static boolean hpBrand = false;
    char firstLetterOfComputer = 'C';
    boolean availability=true;
    int unitNumber;
    
    /*public boolean inStock (int unitNumber ) {
    	if(unitNumber > 0) {
    	}
		return true;
		else{return false;};
    */
   
    public static String findBrandNameOfComputer() { 
    	return brandName;
    }
    public void creatorOfTheComputer() {
    	System.out.println("APPLE");
    }
    public char findletter () {
    	return firstLetterOfComputer;
    }
    public static boolean nameOfTheBrand () {
    	return hpBrand;
    }
    public Computer () {
    	System.out.println("My name is Ahmed Foysol Hasan");
    }
    
    public Computer (String brandTitle) {
    this.brandTitle = brandTitle;
    System.out.println(brandTitle);
    }
    public Computer(String brandTitle, char firstLetterOfComputer) {
	this.brandTitle = brandTitle;
    this.firstLetterOfComputer = firstLetterOfComputer;
    System.out.println(brandTitle+ " " +firstLetterOfComputer);
	}



}
