public class StringManipulatorTest1 {
    public static void main(String[] args) {
        StringManipulator1 pt = new StringManipulator1();
        String last = pt.trimAndConcat("      I am a  ", "   Student    ");
        System.out.println(last);
        //
        char neww = 'o';
        Integer a = pt.getIndexOrNull("Coding", neww);
        Integer b = pt.getIndexOrNull("Hello World", neww);
        Integer c = pt.getIndexOrNull("Hi", neww);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer a1 = pt.getIndexOrNull(word, subString);
        Integer b1 = pt.getIndexOrNull(word, notSubString);
        System.out.println(a1);
        System.out.println(b1);
        //
        String word1 = pt.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word1);
    }
}
