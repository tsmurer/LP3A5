
public class Contagem extends Thread{
	private int v1;
	private int v2;
	
	
	public Contagem(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	@Override
	public void run() {
		for(int i = v1; i < v2+1; i++) {
			
		
			System.out.println(i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Erro ao usar Thread.sleep");
			}
			
		}
	}
}
