import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.lang.String;

/**
 * @author Maslor
 */
 
public class BMI {
	
	public Map<String,String> countrytags = new HashMap<String,String>();
	
	public BMI() {
	countrytags.put("PORTUGAL","PT");
	countrytags.put("FRANCE","FR");
	countrytags.put("SPAIN","ES");
	countrytags.put("ITALY","IT");
	countrytags.put("UNITED KINGDOM","UK");
	countrytags.put("GERMANY","DE");
	}
	
	Scanner sc = new Scanner(System.in);

	public int readInt(){
		int i=0;
		i = sc.nextInt();
		return i;
	}

	public float readFloat(){
		float in;
		in = sc.nextFloat();
		return in;
	}

	public String readString(){
		String in=null;
		in = sc.next();
		return in;
	}

	public String getCountryTag(String country) {
		return countrytags.get(country);
	}

	public float bmi(float weight, float height) {
		return (weight / (height * height));
	}

	public String id(String name, String country, int age, String gender) {
		return "" + getCountryTag(country.toUpperCase()) + age + gender.toUpperCase() + name.toUpperCase();
	}

	public void finalMessage(String id, String name, float bmi) {
		System.out.printf("Hello %s\nYour code is: %s\nYour bmi is: %s\n",name,id,bmi);
	}
	
		
		public static void main(String[] args) {
			BMI bmi = new BMI();
			System.out.println("What's your name?");
			String name = bmi.readString();
			System.out.println("How old are you?");
			int age = bmi.readInt();
			System.out.println("Where are you from?");
			String country = bmi.readString();
			System.out.println("What's your gender?(m/f)");
			String gender = bmi.readString();
			System.out.println("How tall are you?");
			float height = bmi.readFloat();
			System.out.println("How much do you weigh?(kilos)");
			float weight = bmi.readFloat();
			
			bmi.finalMessage(bmi.id(name,country,age,gender), name, bmi.bmi(weight, height));
			
		}
	}



