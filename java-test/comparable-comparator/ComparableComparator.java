import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ComparableComparator {
    public static void main(String... args){
        
     //Using comparable   
        Bank b1 = new Bank("SBI01",2000);
        Bank b2 = new Bank("SBI02",3000);
        Bank b3 = new Bank("SBI03",50000);
        Bank b4 = new Bank("SBI04",1200);
        Bank b5 = new Bank("SBI05",800);
        Bank b6 = new Bank("SBI06",3000);
        Bank b7 = new Bank("SBI07",40000);
        Bank b8 = new Bank("SBI08",25400);
        
        List<Bank> list = new ArrayList<>();
        
        list = Arrays.asList(b1,b2,b3,b4,b5,b6,b7,b8);
        System.out.println("Before Sorting using Comparable");
        System.out.println("--------------");
        list.forEach(System.out::println);
        System.out.println("--------------");
        System.out.println("\nAfter Sorting");
        System.out.println("--------------");
        Collections.sort(list);
        list.forEach(System.out::println);
        System.out.println("--------------");
        
        //Using Comparator
        Bank bb1 = new Bank("SBI01",2000);
        Bank bb2 = new Bank("SBI02",3000);
        Bank bb3 = new Bank("SBI03",50000);
        Bank bb4 = new Bank("SBI04",1200);
        Bank bb5 = new Bank("SBI05",800);
        Bank bb6 = new Bank("SBI06",3000);
        Bank bb7 = new Bank("SBI07",40000);
        Bank bb8 = new Bank("SBI08",25400);
        
        List<Bank> list2 = new ArrayList<>();
        
        list2 = Arrays.asList(bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8);
        
        System.out.println("Before Sorting Using Comparator");
        System.out.println("--------------");
        list2.forEach(System.out::println);
        System.out.println("--------------");
        
        System.out.println("\nAfter Sorting by revenue");
        System.out.println("--------------");
        Collections.sort(list2, new BankComparatorSortByRevenue());
        list2.forEach(System.out::println);
        System.out.println("--------------");
        
        System.out.println("\nAfter Sorting by bank code");
        System.out.println("--------------");
        Collections.sort(list2, new SortByBankCode());
        list2.forEach(System.out::println);
        System.out.println("--------------");
        
    }
}