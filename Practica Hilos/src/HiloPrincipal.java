
public class HiloPrincipal {

public static void main(String[] args) {
		
		System.out.println("Hilo main (INICIO)");
		
		Hilo1 objHilo = new Hilo1("Hilo Primero");
		Hilo2 objHilo1 = new Hilo2("Hilo Segundo");
		
		Thread varHilo = new Thread(objHilo);
		Thread varHilo1 = new Thread(objHilo1);
		
		varHilo.start();
		varHilo1.start();
		
		for(int i=0; i<30; i++) {
			System.out.print(",");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException exc) {
				System.out.println("Hilo main (INTERRUPCION");
			}
		}
		System.out.println("Hilo main (!! FINAL)");
		}
}
