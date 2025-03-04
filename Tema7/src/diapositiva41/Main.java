package diapositiva41;

public class Main {

	public static void main(String[] args) {
		Piano p = new Piano();
		p.add(Nota.SOL);
		p.add(Nota.LA);
		p.add(Nota.SOL);
		
		p.add(Nota.DO);
		p.add(Nota.SI);
		p.add(Nota.SOL);
		
		p.add(Nota.SOL);
		p.add(Nota.LA);
		p.add(Nota.SOL);
		
		p.add(Nota.RE);
		p.add(Nota.DO);
		p.add(Nota.SOL);
		
		p.add(Nota.SOL);
		p.add(Nota.SOL);
		p.add(Nota.MI);

		p.add(Nota.DO);
		p.add(Nota.DO);
		p.add(Nota.SI);
		
		p.add(Nota.LA);
		p.add(Nota.FA);
		p.add(Nota.FA);

		p.add(Nota.MI);
		p.add(Nota.DO);
		p.add(Nota.RE);
		p.add(Nota.DO);
		
		p.interpretar();

	

	}

}
