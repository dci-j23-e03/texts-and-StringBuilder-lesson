public class Main {
    public static void main(String[] args) {

        String ourString = "Hello";
        System.out.println(ourString);

        ourString += " world";
        // String is immutable
        // ourString = "Hello world" - new instance is created and ourString is pointing to it
        System.out.println(ourString);

        char ourChar = 'a';
        String newString = "a";

        // StringBuilder
        String helloString = "Hello";
        StringBuilder sb = new StringBuilder(helloString);
        System.out.println(sb);
        sb.append(" world");
        System.out.println(sb);
        // String Builder is mutable, same instance is changed, dynamically changed size and content added
        sb.insert(6, "beautiful ");
        System.out.println(sb);
        sb.replace(6, 15, "nice").delete(5, 10);
        System.out.println(sb);

        String reversed = sb.reverse().toString();
        System.out.println(reversed);

        // size vs capacity
        sb.reverse();
        System.out.println(sb);
        System.out.println("Current sb capacity is: " + sb.capacity());
        System.out.println("Current sb size/length is: " + sb.length());

        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("Hello");
        System.out.println("Current sb2 capacity is: " + sb2.capacity());
        System.out.println("Current sb2 size/length is: " + sb2.length());

        sb.ensureCapacity(200);
        System.out.println("Current sb capacity is: " + sb.capacity());
        System.out.println("Current sb size/length is: " + sb.length());

        char charAt6 = sb.charAt(6);
        System.out.println("Character at the position 6 is: " + charAt6);

        // substring
        System.out.println("Current value of sb: " + sb);
        String worldString = sb.substring(6);
        System.out.println(worldString);

        String wString = sb.substring(6, 7);
        System.out.println(wString);

        // StringBuffer
        StringBuffer stringBuffer = new StringBuffer(); // has same functionality as StringBulder, just in thread safe manner
    }
}