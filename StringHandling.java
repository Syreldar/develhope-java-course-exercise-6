public class StringHandling
{
    public static void main(String[] args)
    {
        String string1 = "Hello";
        String string2 = "How are you?";

        char[] combinationArr = new char[4];
        combinationArr[0] = string1.charAt(0);
        combinationArr[1] = string1.charAt(1);
        combinationArr[2] = string2.charAt(string2.length() - 2);
        combinationArr[3] = string2.charAt(string2.length() - 1);

        System.out.println(combinationArr);
    }
}
