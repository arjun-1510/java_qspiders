
public class Whileloopday2 {

    public static void main(String[] args) {
        int num = 12;
        int count = 0;

        while (num > 0) {

            num = num / 10;
            count++;

        }
        System.out.println("Total number " + count);

        if (count % 2 == 0) {

            char ch = 'Z';
            while (ch >= 'A') {

                System.out.println(ch);
                ch--;
            }

        } else {
            int j = 1;

            while (j <= 10) {
                System.out.println(j);
                j++;

            }

        }

    }

}
