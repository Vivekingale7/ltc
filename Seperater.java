public class Seperater {
    public static void main(String[] args) {
        int numb = 4321;

        int temp = numb;

        while (temp != 0) {
          int rem = temp % 10;
            System.out.println(rem);
            numb = temp / 10;
        }
    }
}
