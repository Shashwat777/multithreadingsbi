

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class stimulate  {
	static int  n;
	

	public static  transaction[] transactions=new transaction[0];

	static account[] accounts = new account[1000];
	int stimulates;

	stimulate() {
		this.n = 1000;
		transactions = new transaction[n];

	}

	public void run() {

		for (int i = 0; i < 1000; i++) {
	
			accounts[i] = new account(i);}

			for (int jk = 0; jk < n; jk++) {

				Random rn = new Random();
				int src = rn.nextInt(1000);

				int dst = rn.nextInt(1000);

				while (src == dst) {
					dst = rn.nextInt(1000);

				}
				int amnt = rn.nextInt(1000);
				
			
	
				transactions[jk]=new transaction(accounts[src], accounts[dst], amnt);
				


			}
			

		}

	}
