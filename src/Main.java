import javax.print.attribute.SetOfIntegerSyntax;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set1= new HashSet<>(Arrays.asList(1,2,3));
        Set<Integer>set2= new HashSet<>(Arrays.asList(0,1,2));

        System.out.println(symmetricDifference(set1, set2));
    }

    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<Integer>(set1);
        set3.addAll(set2);
        Set<Integer>sort = new HashSet<>(set1);
        sort.retainAll(set2);
        set3.removeAll(sort);
        return set3;


    }


}