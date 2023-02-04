import java.util.TreeMap;

public class Test5{
    public static void main(String[] args){
        //string(key), integer(value)
        TreeMap<String, Integer> map = new TreeMap<>();

        //Insertion
        map.put("C", 1);
        map.put("A", 2);
        map.put("B", 3);

        System.out.println(map);
    }
}

//hashmap --> the output can be in any order
//treemap --> the output in the ascending order
//linkedhashmap --> the output in the same order of insertion