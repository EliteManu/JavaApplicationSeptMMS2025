import java.time.LocalDate;

public class UsingLocalDate{
	public static void main(String[] args){
		LocalDate todaysDate = LocalDate.now();
		LocalDate myBirthDate = LocalDate.of(2000,11,6);
		LocalDate resumptionDate = LocalDate.parse("2026-10-25");
		
		boolean isLeapYear = resumptionDate.isLeapYear();
		boolean isEqual = resumptionDate.equal(myBirthDate);
		
		System.out.printf("Today's date is %s%n",todaysDate);
		System.out.printf("My birth date is %s%n",myBirthDate);
		System.out.printf("The resumption Date is %s%n", resumptionDate); 
		System.out.printf("Resumption year is %s%n",resumptionDate.getYear());
		System.out.printf("Resumption month is %s%n",resumptionDate.getMonth());
		System.out.printf("Resumption day is %s%n",resumptionDate.getDayOfMonth());
		System.out.printf("The meeting date is %s%n",resumptionDate.plusDays(10));
		System.out.printf("The party date will be %s%n",resumptionDate.plusMonths(5));
		System.out.printf("Resumption date a leap year %b%n",isLeapYear);
		System.out.printf("Is %s the same a %s?  %b%n",resumptionDate,myBirthDate,isEqual);
		
	}
}