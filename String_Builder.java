public class String_Builder {
    public static void main(String args[]) {
        // String Builder
        StringBuilder sb = new StringBuilder("Divyansh");
        System.out.println(sb);

        // charAt
        System.out.println(sb.charAt(2));

        // setCharAt
        sb.setCharAt(2, 'a');
        System.out.println(sb);

        // insert
        sb.insert(7, 's');
        System.out.println(sb);

        // delete
        sb.delete(7, 8);
        System.out.println(sb);

        // append
        sb.append(" Goyal");
        System.out.println(sb);
    }
}
