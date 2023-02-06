package src;

/***
 * 
 * @author Gianl
 * Gestisce l'accesso alla generazione dei valori del condizionatore, facendo da intermediario tra l'Observer e l'Observable
 */
public class VariantClass extends Observer{
	
	private SubjectClass subjectClass;
	
	
	public VariantClass(SubjectClass subjectClass) {
		this.subjectClass = subjectClass;
		this.subjectClass.attach(this);
	}
	
	/***
	 * 
	 * richiama il metodo del thread da NumberClass per generare i valori random per il climatizzatore
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
