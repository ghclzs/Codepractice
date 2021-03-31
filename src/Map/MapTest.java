package Map;

public class MapTest {
    public static void main(String[] args) {
        Map map = new LinkedListMap();
        map.add(1,2);
        map.add(2,20);
        map.set(1,100);
        map.set(2,10);
        System.out.println(map.get(1));
        boolean flag = map.contains(3);
        System.out.println(flag);
    }
}
