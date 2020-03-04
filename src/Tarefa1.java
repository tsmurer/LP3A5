
public class Tarefa1 extends Thread{
	private int v1;
	private int v2;
	private int total;
	
	
	public Tarefa1(int v1, int v2) {
		this.v1 = v1;
		this.v2 = v2;
		this.total = 0;
	}
	
	@Override
	public void run() {
		for(int i = v1; i < v2; i++) {
			this.total++;
		}
	}
}
