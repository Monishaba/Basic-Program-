public class SimpleRepeat {
    public static void main(String[] args) {
        String str = "wipro";
        int n = str.length();
        String part = str.substring(0,n);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += part;
        }
        System.out.println(result);
    }
}
