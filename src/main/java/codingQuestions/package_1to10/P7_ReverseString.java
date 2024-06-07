package codingQuestions.package_1to10;

public class P7_ReverseString {
    public static void main(String[] args) {
        String str = "java";
        String str1 = "";
        char ch;
        for (int i=0;i<str.length();i++){
            ch = str.charAt(i);
            str1 = ch + str1;
        }
        System.out.println(str1);
    }
}
