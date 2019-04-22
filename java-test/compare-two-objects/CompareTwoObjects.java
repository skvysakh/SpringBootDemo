
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CompareTwoObjects {

    public static void main(String... args) {
        Bank b1 = new Bank("SBI", "SBI01", "vithura");
        Bank b2 = new Bank("FED", "FED01", "vithura");
        Bank b3 = new Bank("SBI", "SBI02", "vithura");

        Map<String, Bank> bankMap = new HashMap<>();
        
        bankMap.put(b1.getBranchCode(),b1);
        bankMap.put(b2.getBranchCode(),b2);
        bankMap.put(b3.getBranchCode(),b3);
        
       /* bankMap = Arrays.asList(b1, b2, b3).stream()
        .collect(Collectors.toMap(x -> x.getBranchCode(), x -> x));*/
        
        bankMap.forEach((K,V) -> System.out.println("Key:"+K+" || Value:{"+V.toString()+"} || HashCode:"+ V.hashCode()));

    }

}
