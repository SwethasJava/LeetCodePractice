package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectionPractice {
    public static void main(String args[])
    {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set numb=numbers.stream().collect(Collectors.toSet());
        numbers.stream().distinct().forEach(number-> System.out.println("numbers "+number));

        Map<Integer, Long> frequencyMap = numbers.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        List<String> names= Arrays.asList("ss","bb","kk","Swetha");
         //names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
        System.out.println("  :"+names.stream().map(name->name.toUpperCase()).collect(Collectors.toList()));
        // count the names start with s

        long count=names.stream().filter(name->name.startsWith("S") || name.startsWith("s")).count();
        System.out.println(" Names startng with S"+count);

        //remove null from the list

        List<String> names2= Arrays.asList("ss","bb","kk","Swetha",null);
        List<String> noNullNames=names.stream().filter(name-> ! name.equals(null)).collect(Collectors.toList());
        System.out.println("No Null Names "+noNullNames);

        // sort the integers

        List<Integer> nums1= Arrays.asList(1,43,21,4,5,0);
        nums1.stream().sorted().collect(Collectors.toList());

        //System.out.println("Set is "+numbers.stream().distinct().collect(Collectors.toList()));
    }
}
