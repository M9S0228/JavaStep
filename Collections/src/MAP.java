import java.util.*;

public class MAP {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String>map1 = new LinkedHashMap<>();
        map1.put(1,"Січень");
        map1.put(2,"Лютий");
        map1.put(3,"Березень");
        map1.put(4,"Квітень");
        map1.put(5,"Травень");
        map1.put(6,"Червень");
        map1.put(7,"Липень");
        map1.put(8,"Серпень");
        map1.put(9,"Вересень");
        map1.put(10,"Жовтень");
        map1.put(11,"Листопад");
        map1.put(12,"Грудень");

        System.out.println("Перший місяць року: " + map1.get(1));
        System.out.println("Останній місяць року: " +map1.get(12));

        map1.put(6, "Відпустка!");
        System.out.println(map1.get(6));

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.putAll(map1);

        System.out.println("MAP1");
        EntrySet(map1);

        System.out.println("######################################");
        System.out.println("MAP2");
        EntrySet(map2);


        System.out.println("######################################");

        Map<String, Set<String>> map3 = new HashMap<>();

        Set<String> student1 = new HashSet<>();
        student1.add("+380684753232");
        student1.add("nikkk@ukr.net");
        student1.add("parlament");

        map3.put("Nikita",student1);

        System.out.println(map3.keySet() + " " + map3.values());
    }

    private static void EntrySet(HashMap<Integer, String> map){
        for (int i : map.keySet()) {
            System.out.println(i + " : " + map.get(i));
        }
    }
}
