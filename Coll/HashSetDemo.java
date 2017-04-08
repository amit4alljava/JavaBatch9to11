import java.util.HashSet;

class Student
{
	private int id;
	private String name;
	private String course;
	@Override
	public boolean equals(Object object){
		boolean isCompare = false;
		if(object instanceof Student){
		Student student = (Student)object ; //Downcasting
		if((this.id == student.id) && 
				(this.name.equals(student.name)) 
				&& (this.course.equals(student.course))){
			isCompare = true;
		}
		}
		return isCompare;
	}
	
	@Override
	public int hashCode(){
		return name.length();
//		if(course.equals("MCA")){
//			return 10;
//		}
//		else
//		{
//			return 20;
//		}
	}
	Student(int id , String name, String course){
		this.id = id;
		this.name = name;
		this.course = course;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String toString(){
		return "Id "+ id +" Name "+name+" Course "+course+" \n";
	}
}
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hashSet = new HashSet<>();
		Student ram = new Student(1001,"Ram","MCA");
		Student ram2 = new Student(1001,"Ram","MCA");
		Student shyam = new Student(1002,"Shyam","BCA");
		Student shyam2 = new Student(1002,"Shyam","BCA");
		System.out.println(ram.hashCode());
		System.out.println(ram2.hashCode());
		System.out.println(shyam.hashCode());
		System.out.println(shyam2.hashCode());
		hashSet.add(ram); // add internally call hashCode and equals
		hashSet.add(ram2);
		hashSet.add(shyam);
		hashSet.add(shyam2);
		System.out.println(hashSet);

	}

}










