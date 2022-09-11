package ua.hellellit.lms;

public class MethodsOfString {

  public static void main(String[] args) {
    System.out.println(findSymbolOccurance("a-ba-ba-ga-la-ma-ga", 'a'));
    System.out.println(findWordPosition("Apollo", "ollo"));
    System.out.println(stringReverse("Hello"));
    System.out.println(isPalindrome("Alla"));
  }

  static int findSymbolOccurance(String str, char ch) {
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
    String result = "";
    for (int i = 0; i < str.length(); i++) {
      result = str.charAt(i) + result;
    }
    return result;
  }

  static boolean isPalindrome(String str) {
    for (int i = 0; i <= str.length() / 2; i++) {
      if (str.toLowerCase().charAt(i) != str.toLowerCase().charAt(str.length() - i - 1)) {
        return false;
      }
    }
    return true;
  }
}
