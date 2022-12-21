package src;

/***
 * 
 * @author Gianl
 * Gestisce meglio l'accesso alla generazione dei numeri del condizionatore, facendo da intermediario tra l'observer e l'observable
 */
public class VariantClass extends Observer{
	
	private SubjectClass subjectClass;
	
	
	public VariantClass(SubjectClass subjectClass) {
		this.subjectClass = subjectClass;
		this.subjectClass.attach(this);
	}
	
	/***
	 * 
	 * richiama il metodo del thread da NumberClass per generare i numeri random per il climatizzatore
	 */
	@Override
	public void update() { 
		// TODO Auto-generated method stub
		//richiama metodo random da classe con responsibilita di randomizzare spawn
		System.out.println("Condizionatore : ON");
		NumberClass numberClass = new NumberClass();
		numberClass.run();
		System.out.println("Condizionatore : OFF");
	}

	

}
