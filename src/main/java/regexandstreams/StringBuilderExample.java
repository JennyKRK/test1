package regexandstreams;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append("Avada kedavra");
        sb2.append("Avada kedavra");
        System.out.println(sb.compareTo(sb2));
        System.out.println(sb);
        sb.replace(1, 4, "VAD");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.compareTo(sb2));
        sb2.insert(7, "XXXX");
        System.out.println(sb2);
        sb2.replace(sb2.length() - 3, sb2.length() - 1, "ZZ");
        System.out.println(sb2);
        sb2.delete(0, 2);
        System.out.println(sb2);
        System.out.println(sb2.indexOf("eda"));
        System.out.println(sb2.indexOf("ada"));
    }
}
