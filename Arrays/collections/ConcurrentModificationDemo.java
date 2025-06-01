import java.util.*;

public class ConcurrentModificationDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "Go"));

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();

            if(s.equals("Python")){
                it.remove();
            }
        }
    }
}
