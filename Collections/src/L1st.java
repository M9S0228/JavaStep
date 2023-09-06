import java.util.*;

public class L1st {
    public static void main(String[] args) {
        //LIST
        String[] arrStr = {"BWM", "AUDI", "Volov", "Mercedes"};

        List<String> list1 = new ArrayList<String>();
        list1.addAll(Arrays.asList(arrStr));


        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list1);

        List<String> list3 = Arrays.asList("Lamborgini", "Ferrari", "Porsche");

        list2.addAll(2,list3);

        Collections.sort(list2);
        Collections.reverse(list2);


        ListIterator<String> iterator = list2.listIterator();

        boolean removeNext = false;

        while (iterator.hasNext()){
            if(removeNext){
                iterator.next();
                iterator.remove();
                removeNext = false;
            }
            else {
                iterator.next();
                removeNext = true;
            }
        }

        for(String el : list2){
            System.out.println(el);
        }


        System.out.println("######################################");

        //SET
        HashSet<String> set1 = new HashSet<>();
        set1.add("Toyota");
        set1.add("Mazda");

        set1.addAll(list1);
        set1.addAll(list2);

        for (String el : set1) {
            System.out.println(el);
        }

        System.out.println("######################################");

        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        set2.addAll(list2);
        set2.addAll(list3);

        for (String el : set2) {
            System.out.println(el);
        }

    }
}
