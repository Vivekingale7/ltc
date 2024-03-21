class Solution {
  int mostWordsFound(List<String> sentences) {
    int max = 0;

    for (String sentence in sentences) {
      List<String> words = sentence.split(' ');
      int wordCount = words.length;

      if (wordCount > max) {
        max = wordCount;
      }
    }

    return max;
  }

  void main() {
    List<String> sentences = [
      "please wait",
      "continue to fight",
      "continue to win"
    ];

    mostWordsFound(sentences);
  }
}
