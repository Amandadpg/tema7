package diapositiva41;


	public class Piano extends Instrumento {

		@Override
		public void interpretar() {
			System.out.println("Interpretación en piano: ");
			for(Nota n : this.getMelodia()) {
				interpretarNota(n);
			}
			
		}
		
		public static void interpretarNota(Nota nota) {
	        int midiNote = 0;

	        // Asignar el valor MIDI correspondiente a cada nota
	        switch (nota) {
	            case DO:
	                midiNote = 60; // DO central (C4)
	                break;
	            case RE:
	                midiNote = 62; // RE (D4)
	                break;
	            case MI:
	                midiNote = 64; // MI (E4)
	                break;
	            case FA:
	                midiNote = 65; // FA (F4)
	                break;
	            case SOL:
	                midiNote = 67; // SOL (G4)
	                break;
	            case LA:
	                midiNote = 69; // LA (A4)
	                break;
	            case SI:
	                midiNote = 71; // SI (B4)
	                break;
	            default:
	                System.out.println("Nota no reconocida");
	                return;
	        }

	        

}
	}
