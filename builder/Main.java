package builder;

public class Main {

	public static void main(String[] args) {
		
		 // Regular way
		
		Phone phone = new Phone("Android", "Lenovo", 2000, 4000);
		
		System.out.println(phone.toString());

		
		// Builder way
		
		Phone phone2 = new PhoneBuilder().
				setOs("IOS").
				setRam(2000).
				setBrand("Apple").
				getPhone();
		
		System.out.println(phone2.toString());
		
	}

}
