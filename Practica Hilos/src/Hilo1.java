
public class Hilo1 implements Runnable{
	
	String nombreHilo;
	
	Hilo1(String parNombre){
		nombreHilo = parNombre;
	}
	
	public void run() {
		System.out.println(nombreHilo + " (INICIO HILO 1)");
		try {
			for(int x=0; x<=5; x++) {
				Thread.sleep(2000);
				
				System.out.println(nombreHilo + " CORRIENDO HILO... 1" + " x = " + x);
			}
		}catch(InterruptedException exc) {
			System.out.println(nombreHilo + " (INTERRUPCION HILO 1)");
		}
		
		System.out.println(nombreHilo  + " (!! FINAL HILO 1)");
	}


}
