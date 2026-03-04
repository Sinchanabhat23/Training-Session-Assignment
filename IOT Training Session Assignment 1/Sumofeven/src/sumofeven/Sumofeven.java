package sumofeven;
public class Sumofeven {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
             sum=sum+i;
            }
            i++;
        }
        System.out.println("The sum of even numbers from 1 to 100 is "+sum);
    }
}
 