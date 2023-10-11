public class string {
    public static void main(String[] arge) {
        byte[] bytes = { 100, 101, 102 };
        String str = new String(bytes);
        System.out.println(str);

        char name[] = { 'i', 's', 'h', 'a', 'n' };
        String str1 = new String(name);
        System.out.println(str1);
    }
}