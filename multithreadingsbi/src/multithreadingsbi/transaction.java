package multithreadingsbi;

public class transaction {
	account src;
	account dest;
	int amnt;

	transaction(account src, account dest, int amnt) {
		this.src = src;
		this.dest = dest;
		this.amnt = amnt;
	//System.out.println(src + "source" + dest + "destination" + amnt + "amount");

	}
}
