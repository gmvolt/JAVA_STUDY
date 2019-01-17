package icehs.science.Chapter09;

public class HumanPolyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person [] person = {
				new Person(),
				new Student(),
				new Teacher()
		};
		
		person[0].eat();
		person[1].eat();
		person[2].eat();
		( (Student) (person[1]) ).study();
		( (Teacher) (person[2]) ).teach();
		
		System.out.println();
		
		for(int i = 0 ; i < person.length ; i++) {
			if(person[i] instanceof Student) {
				( (Student)(person[i]) ).study();
			}else if(person[i] instanceof Teacher) {
				( (Teacher)(person[i]) ).teach();
			}
		}
	}

}
