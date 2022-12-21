package src;

public class MainClass {
	public static void main(String[] args) {
		SubjectClass subjectClass = new SubjectClass();
		
		new VariantClass(subjectClass);
		
		subjectClass.setState(0);
	}
}
