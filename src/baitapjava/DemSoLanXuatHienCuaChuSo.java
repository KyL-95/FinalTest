package baitapjava;

import java.util.*;

public class DemSoLanXuatHienCuaChuSo {
    public static void main(String[] args) {
        Integer a = 12343215;
        Integer b = 1112343215;
        String aToString = a.toString();
        System.out.println(aToString);

        String[] arrA = aToString.split("");

        List<String> arrList = Arrays.asList(arrA);
        Map<String, Integer> map = new HashMap<>();
//        Set<String> arrSet = new HashSet<>(arrList);

//        List<Integer> count = new ArrayList<>(arrSet.size());


    }
}
