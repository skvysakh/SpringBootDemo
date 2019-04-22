
import java.util.Objects;

public class Bank {
    private int bankId;
    private String bankCode;
    private String branchCode;
    private String branchLocationCode;

    public Bank(String bankCode, String branchCode, String branchLocationCode) {
        super();
        this.bankCode = bankCode;
        this.branchCode = branchCode;
        this.branchLocationCode = branchLocationCode;
    }

    // Static fields need not to be considered for equality testing
    // transient fields are also need not to be opted for equality testing,
    // as these fields are not written during serialization,
    // otherwise an object will not be equal once its is serialized and deserialized
    // Consider we are using branchcode as key
    @Override
    public boolean equals(Object obj) {
        // check both referes to same instance in memory
        if (this == obj)
            return true; 
        //check if object is null
        if (obj == null)
            return false;
            
        // check the Class by getClass(), dont use 'instanceof' as it returns true for
        // subclasses also.
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
    
    @Override
public String toString() {
	return "Bankcode:"+bankCode+" BranchCode:"+branchCode+" LocationCode:"+branchLocationCode;
}

}