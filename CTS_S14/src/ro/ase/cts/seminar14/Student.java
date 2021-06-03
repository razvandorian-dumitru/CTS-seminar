package ro.ase.cts.seminar14;

public class Student extends StudentAbstract{
	
	/*constraints
	 * nume - [3 - 225] caractere
	 * varsta - [18 - 30]
	 * note - [1 - 10]*/
	
	private static final int NOTA_MAX=10;
	private static final int NOTA_MIN=1;
	
	public Student(String nume, int varsta, int[] note) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.note = note;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public int getVarsta() {
		return varsta;
	}

	public void setVarsta(int varsta) throws StudentExceptionWrongValue{
		if(varsta<0) throw new StudentExceptionWrongValue("Notele nu pot fi mai mici ca 0");
		this.varsta = varsta;
	}

	public int[] getNote() {
		return note;
	}

	public void setNote(int[] note) throws StudentExceptionWrongValue {
		if(note!=null) {
			for(int i=0; i<note.length; i++) {
				if(note[i]>NOTA_MAX || note[i]<NOTA_MIN) throw new 
					StudentExceptionWrongValue("Invalid nota - " + note[i]);
			}
			this.note = note;
		}
		
	}

	public float calculMedie() throws StudentExceptionWrongValue{
		
		if(note==null) {
			throw new StudentExceptionWrongValue("empty dataset - note");
		}
		
		if(note.length<=1) throw new StudentExceptionWrongValue("not enough values for average");
		
		float suma=0;
		for(int i=0; i<note.length; i++)
		{
			suma+=note[i];
		}
		float medie=suma/note.length;
		return (int)(medie * 100)/100.0f;
		//return (int)(suma/note.length * 100) / 100.0f;
	}
}
