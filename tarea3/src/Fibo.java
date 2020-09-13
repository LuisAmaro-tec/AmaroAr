
public class Fibo {
	public static void main(String args[]) {

		int valor1 = 0;
		int valor2 = 1;
		int limite = 15;
		int temp;
		
		while(valor2+valor1 <= limite)
		{
			temp = valor1;
			valor1 = valor2;
			valor2 = temp + valor1;
			
			System.out.println(valor2);
		}
	  }	

}
