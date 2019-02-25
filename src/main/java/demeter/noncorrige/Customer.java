package demeter.noncorrige;

public class Customer {
	
	private Wallet wallet;

	public Customer() {

	}

	public Customer(Wallet wallet) {
		this.wallet = wallet;
	}

	/**
	 * Getter for wallet
	 * 
	 * @return the wallet
	 */
	public Wallet getWallet() {
		return wallet;
	}

	/**
	 * Setter
	 * 
	 * @param wallet
	 *            the wallet to set
	 */
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
	
	public double payment(double payment){
		
		if (wallet.getMoney() >= payment) {
			wallet.setMoney(wallet.getMoney() - payment);
		}else{
			payment = 0;
		}
		return payment;
	}
}
