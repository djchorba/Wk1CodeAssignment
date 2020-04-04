
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bookPrice, footballPrice, kevinMoney, sueMoney;
		int kevinFriends, sueFriends, kevinAge, sueAge;
		
		bookPrice = 14.99;
		footballPrice = 19.99;
		kevinMoney = 75.92;
		sueMoney = 50.42;
		kevinFriends = 300;
		sueFriends = 350;
		kevinAge = 30;
		sueAge = 25;
		
		String firstNameMan = "Kevin";
		String firstNameWoman = "Sue";
		String lastNameMan = "Wheeler";
		String lastNameWoman = "Dwyer";
		char middleInitialMan = 'M';
		char middleInitialWoman = 'A';
		
		String fullNameMan = firstNameMan + " " + middleInitialMan + " " + lastNameMan;
		String fullNameWoman = firstNameWoman + " " + middleInitialWoman + " " + lastNameWoman;
		
		System.out.println("The price of the book is" + " " + "$" + bookPrice);
		System.out.println("The price of the football is" + " " + "$" + footballPrice);
		System.out.println("Kevin has" + " " + "$" + kevinMoney + " " + "in his wallet.");
		System.out.println("Sue has" + " " + "$" + sueMoney + " " + "in his wallet.");
		System.out.println("Kevin has" + " " + kevinFriends + " " + "friends.");
		System.out.println("Sue has" + " " + sueFriends + " " + "friends.");
		System.out.println("Kevin is" + " " + kevinAge + " " + "years old.");
		System.out.println("Sue is" + " " + sueAge + " " + "years old.");
		System.out.println("After" + " " + fullNameMan + " " + "buys a book he has" + " " + "$" + (kevinMoney - bookPrice) + " " + "left in his wallet");
		System.out.println(fullNameWoman + " " + "made an average of" + " " + (sueFriends / sueAge) + " " + "friends each year.");
	
	}
}
