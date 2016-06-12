package kys.stusy.DesignPattern.CreationalPatterns.builder;

public class Ex02 {

	public static void main(String args[]){
		Ex02 Ex02 = new Ex02();
		Ex02.ex02();
	}

	/**
	 * 출처 http://blog.naver.com/2feelus/220644096727
	 */
	public void ex02(){
		ImmutablePerson.PersonBuilder pb = new ImmutablePerson.PersonBuilder("Black");
		ImmutablePerson jack = pb.firstName("Jack").gender("Man").createPerson();
		ImmutablePerson jenny = pb.firstName("Jenny").gender("Woman").createPerson();
		ImmutablePerson cindy = pb.firstName("Cindy").createPerson();
		    
		System.out.println(jack);
		System.out.println(jenny);
		System.out.println(cindy);   


	}
}

class ImmutablePerson
{
	private final String familyName;
	private final String firstName;
	private final String gender;
	private ImmutablePerson(
			final String newFamilytName, final String newFirstName,
			final String newGender)
	{
		this.familyName = newFamilytName;
		this.firstName = newFirstName;
		this.gender = newGender;
	}
	public String getFamilyName()
	{
		return this.familyName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public String getGender()
	{
		return this.gender;
	}
	public String toString() {
		return "I am "+firstName+" "+familyName+". My gender is "+gender;
	}
	
	public static class PersonBuilder
	{
		private String nestedFamilyName;
		private String nestedFirstName;
		private String nestedGender;
		public PersonBuilder(final String newFamilyName) 
		{
			this.nestedFamilyName = newFamilyName;
		}
		public PersonBuilder firstName(final String newFirstName)
		{
			this.nestedFirstName = newFirstName;
			return this;
		}
		public PersonBuilder gender(final String newGender)
		{
			this.nestedGender = newGender;
			return this;
		}
		public ImmutablePerson createPerson()
		{
			return new ImmutablePerson(
					nestedFamilyName,nestedFirstName,  nestedGender
					);
		}
	}
}

