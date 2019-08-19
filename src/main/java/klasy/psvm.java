package klasy;

import java.util.Arrays;
import java.util.List;

public class psvm {
    public static void main(String[] args) {
        List integers = Arrays.asList(new Integer []{1,2,3});
        List ints = Arrays.asList(new Integer []{1,2,3});
        System.out.println(ints.size() == integers.size());
    }
}
