package classpart;

public class Man {

	int age;
	String man_Name;
	boolean isMarried;
	int child;
	
	public String getMan_Name( ) {
		return man_Name;
	}
	
	public void showManInfo( ) {
		System.out.println(man_Name + " , " + age + " , " + isMarried + " , " + child);
	}
}
