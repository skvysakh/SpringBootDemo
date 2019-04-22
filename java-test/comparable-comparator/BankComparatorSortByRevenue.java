import java.util.Comparator;

public class BankComparatorSortByRevenue implements Comparator<Bank>{
    
    @Override
    public int compare(Bank b1, Bank b2){
        if(b1.getTotalRevenue() == b2.getTotalRevenue()) return 0;
        else if (b1.getTotalRevenue() > b2.getTotalRevenue()) return 1;
        else return -1;
    }
    
}