package multithreadingsbi;

public class computation implements Runnable {

	private static volatile int p;

	computation() {
		
		

	}

	public void run() {
	
		
		while(p< stimulate.n){
			p=p+1;
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			//try {
		
			transaction currnt = stimulate.transactions[p-1];
			account csrc = currnt.src;
			account cdes = currnt.dest;
			synchronized (csrc) {
				synchronized (cdes) {
					


					if (csrc.balance < currnt.amnt) {
		
					} else {
						csrc.withdraw(currnt.amnt);
						cdes.deposit(currnt.amnt);
				
						

					}
				}
			}
			

		}
	}

}
