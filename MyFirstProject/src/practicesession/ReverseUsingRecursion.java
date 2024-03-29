package practicesession;

public class ReverseUsingRecursion {
    public static String reverse(String str)
    {
        if(str==null || str.equals(""))
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main (String[] args)
    {
        String str="Codekul";
        str=reverse(str);
        System.out.println("Reversed string is: "+str);
    }

}
