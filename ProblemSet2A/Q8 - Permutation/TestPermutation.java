import java.util.List;

public class TestPermutation {

    public static void main(String[] args) {

        List<String> list1 = new Permutation("hat").getA();
        System.out.println(list1);

        List<String> list2 = new Permutation("hat").permute().getA();
        System.out.println(list2);

        List<String> list3 = new Permutation(456).permute().getA();
        System.out.println(list3);

        /* 
         * []
         * [hat, hta, aht, ath, tah, tha] 
         * [456, 465, 546, 564, 654, 645]
         */
    }
}
