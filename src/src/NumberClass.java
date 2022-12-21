package src;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/***
 * 
 * @author Gianl
 * Classe con la responsabilita di generare la temperatura iniziale, variarla e gestirla
 */
public class NumberClass implements Runnable{

	private double xTemperatura;
	
	public double getNumber() {
		return xTemperatura;
	}
	
	public void setNumber(double xTemperatura) {
		this.xTemperatura = xTemperatura;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random xTemperature = new Random();
		
	
		for(int i= 0; i<30; i++) {
			int num = xTemperature.nextInt(6) +15;
			
			if(xTemperature.nextBoolean()) {
				num += 1;
			}else {
				num -= 1;
			}
			
			
			if(num <16) {
				num ++;
				System.out.println("Troppo freddo, ricondiziona ambiente");
			} else if(num>20) {
				num--;
				System.out.println("Troppo caldo, ricondiziona ambiente");
			}
			
			System.out.println(num);
			
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
		
		
	
		
		
	}

}
