
import java.util.Objects;

class Bank implements Comparable<Bank>{
    
    private int bankId;
    private String bankCode;
    private String branchCode;
    private String branchLocationCode;
    
    //Sort the bank in order of there 
    private long totalRevenue;
    
   @Override
   public int compareTo(Bank bank){
       if(this.totalRevenue == bank.totalRevenue) return 0;
       else if(this.totalRevenue > bank.totalRevenue) return 1;
       else return -1;
   }

    public Bank(String bankCode, long totalRevenue) {
        super();
        this.bankCode = bankCode;
        this.totalRevenue = totalRevenue;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; 
        if (obj == null)
            return false;
            
        if (this.getClass() != obj.getClass())
            return false;

        Bank bank = (Bank) obj;
        return (branchCode == bank.branchCode || (bank.branchCode != null && branchCode.equals(bank.branchCode)));
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchCode);
    }

	/**
	 * @return the bankId
	 */
	public int getBankId() {
		return bankId;
	}

	/**
	 * @param bankId the bankId to set
	 */
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}

	/**
	 * @return the bankCode
	 */
	public String getBankCode() {
		return bankCode;
	}

	/**
	 * @param bankCode the bankCode to set
	 */
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	/**
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}

	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	/**
	 * @return the branchLocationCode
	 */
	public String getBranchLocationCode() {
		return branchLocationCode;
	}

	/**
	 * @param branchLocationCode the branchLocationCode to set
	 */
	public void setBranchLocationCode(String branchLocationCode) {
		this.branchLocationCode = branchLocationCode;
	}
	
	/**
 * @return the totalRevenue
 */
public long getTotalRevenue() {
	return totalRevenue;
}

/**
 * @param totalRevenue the totalRevenue to set
 */
public void setTotalRevenue(long totalRevenue) {
	this.totalRevenue = totalRevenue;
}
    
    @Override
public String toString() {
	return "Bankcode:"+bankCode+" revenue:"+totalRevenue;
}

}