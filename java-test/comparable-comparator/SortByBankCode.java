import java.util.Comparator;

public class SortByBankCode implements Comparator<Bank>{
    @Override
    public int compare(Bank b1, Bank b2){
        return b1.getBankCode().compareTo(b2.getBankCode());
    }
}