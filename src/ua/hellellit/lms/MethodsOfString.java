package ua.hellellit.lms;

public class MethodsOfString {

  public static void main(String[] args) {
    System.out.println(findSymbolOccurance("a-ba-ba-ga-la-ma-ga", 'a'));
    System.out.println(findWordPosition("Apollo", "ollo"));
    System.out.println(stringReverse("Hello"));
    System.out.println(isPalindrome("Alla"));
  }

  static int findSymbolOccurance(String str, char ch) {
    if (str == null) {
      System.out.print("Невірно введені дані. ");
      return -1;
    }
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == ch) {
        count++;
      }
    }
    return count;
  }

  static int findWordPosition(String source, String target) {
    return source.indexOf(target);
  }

  static String stringReverse(String str) {
    StringBuilder result = new StringBuilder(str);
    return result.reverse().toString();
  }

  static boolean isPalindrome(String str) {
    return str.toLowerCase().equals(stringReverse(str.toLowerCase()));
  }
}
