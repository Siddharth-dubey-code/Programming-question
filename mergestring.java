package JAVA.csepDS;


public class mergestring {
    public static void main(String[] args) {
        String a = "ace";
        String b = "bdf";
        String c = "";

        int i = 0, j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) < b.charAt(j))
                c += a.charAt(i++);
            else
                c += b.charAt(j++);
        }

        while (i < a.length())
            c += a.charAt(i++);

        while (j < b.length())
            c += b.charAt(j++);

        System.out.println(c);

    }
    
}
