import java.util.Scanner;

public class PositiveNegativeCounter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int [] scores = new int[num];

        int positive = 0, negative = 0, sum = 0, numher_of_n = 0;
        for (int i = 0; i < num; i++)
        {
            int in = input.nextInt();
            if(in > 0) {
                positive++;
            }
            else if (in < 0) {
                negative++;
            } else {
                break;
            }

            sum += in;
            numher_of_n++;
            scores[i] = in;

        }

        double avg = (double) sum / (double) numher_of_n;
        System.out.println("Total number of positive numbers: " + positive);
        System.out.println("Total number of negative numbers: " + negative);

        int above_avg = 0, equal_avg = 0;

        for (int i = 0; i < num; i++) {
            if(scores[i] > avg) {
                above_avg++;
            } else if (scores[i] == avg) {
                equal_avg++;
            }

        }

        System.out.println("Above avg: " + above_avg);
        System.out.println("Equal avg: " + equal_avg);

    }
}
