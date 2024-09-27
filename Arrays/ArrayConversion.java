package Arrays;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ArrayConversion {

   // Recursive method to flatten the array
   public static void flattenArray(Object[] array, List<Object> flatList) {
        for(Object element : array){
            if(element instanceof Object[]){
                flattenArray((Object[]) element, flatList);
            }else{
                flatList.add(element);
            }
        }
    }

    public static void main(String args[]){
//         List<List<Integer>> list = new ArrayList<>();

//         list.add(List.of(1,2,3));
//         list.add(List.of(5,3,1));
//         list.add(List.of(1,12,6));
//         list.add(List.of(5,6,2));

//         // List<Integer> singleList = new ArrayList<>();

//         list.stream().flatMap(List::stream).forEach(System.out::println);
// /* 
//         for(List<Integer> data : list){
//             singleList.addAll(data);
//         }
//         singleList.stream().forEach(System.out::println);      */   

//     }

Object[]  array = { 1, 2, new Object[]{ 3, 4, new Object[]{ 5 }, 6, 7 }, 8, 9, 10 };
// List<Object> list = new ArrayList<>();
        List<Object> flatList = flattenArrayStream(array).collect(Collectors.toList());
        System.out.println(flatList);

//call the recursive method to flat the array

// flattenArray(array, list);
// list.stream().forEach(System.out::println);

    }

    public static Stream<Object> flattenArrayStream(Object[] array) {
        return Arrays.stream(array) // Create a stream from the array
                .flatMap(element -> {
                    if (element instanceof Object[]) {
                        // If the element is an array, recursively flatten it
                        return flattenArrayStream((Object[]) element);
                    } else {
                        // If it's not an array, return a single-element stream
                        return Stream.of(element);
                    }
                });
}
