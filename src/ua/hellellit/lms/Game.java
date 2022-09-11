package ua.hellellit.lms;


import java.util.Arrays;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String guessWord = "";
    String response = "";
    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
        "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    String randomWord = words[randomNumber(0, words.length)];

    System.out.println("Відгадайте одно з наведенних нижче слів.");
    System.out.println(Arrays.toString(words));
    do {
      guessWord = sc.nextLine().toLowerCase();
      response = compareWords(randomWord, guessWord);
      if (response.equals(randomWord)) {
        System.out.println("Це правільна відповідь!");
        break;
      } else {
        System.out.println(response);
        System.out.println("Спробуйте ще раз.");
      }
    } while (true);
  }

  static int randomNumber(int start, int end) {
    return (int) ((Math.random() * (end - start + 1)) + start);
  }

  static String compareWords(String expected, String actual) {
    String word = "";

    for (int i = 0; i < Math.min(expected.length(), actual.length()); i++) {
      if (expected.charAt(i) == actual.charAt(i)) {
        word = word + expected.charAt(i);
      } else {
        word = word + "#";
      }
    }

    if (word.length() < 15 && !word.equals(expected)) {
      for (int i = word.length() - 1; i < 15; i++) {
        word = word + "#";
      }
    }
    return word;
  }
}
