package Streams.Questions;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "dabcadefg";

        str.chars().distinct().mapToObj(c -> (char) c).forEach(System.out::println);
    }
}
