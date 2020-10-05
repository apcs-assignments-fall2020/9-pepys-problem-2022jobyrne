import java.util.Arrays;
public class MyMain {


    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int prob = 0;
        int counter = 0;
        double finalcounter = 0;
        double[] arr = new double[10000];
        double[] arr2 = new double[10000];
    for (int k = 0; k < 10000; k++) 
    {
        for (int i = 0; i < 6; i++)
        {
            prob = (int)(Math.random()* 6 + 1);
            //System.out.println("\t" + prob + " number");

            arr[i] = prob;
            //System.out.print("\t" + arr);
        }
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == 6.0) 
            {
                arr2[counter] = 6;
                //System.out.println(Arrays.toString(arr2));
                counter = counter + 1;
                break;
            }
        // counter = (counter + sixcounter) / k;
         //System.out.println("\t" + counter);
        }
        
    }
        for (int g = 0; g < arr2.length; g++)
        {
            if (arr2[g] == 6.0)
            {
                finalcounter = finalcounter + 1;
            }
        }
        return finalcounter / 100;
    }














    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int prob = 0;
        int n = 27;
        int counter = 0;
        double commonality = 0;
        double finalcounter = 0;
        double[] arr = new double[10000];
        double[] arr2 = new double[10000];

    for (int k = 0; k < 10000; k++) 
    {
        for (int i = 0; i < 12; i++)
        {
            prob = (int)(Math.random()* 6 + 1);
            //System.out.println("\t" + prob + " number");

            arr[i] = prob;
            //System.out.println("\t" + arr);
        }
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == 6.0) 
            {
                arr2[counter] = 6;
                counter = counter + 1;
                break;
            }
        } 
    }
        for (int g = 0; g < arr2.length; g++)
        {
            if (arr2[g] == 6.0)
            {
                finalcounter = finalcounter + 1;
            }
        }

        return finalcounter / 100 - n;
    }
        













    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int prob = 0;
        int n = 37;
        int counter = 0;
        double commonality = 0;
        double finalcounter = 0;
        double[] arr = new double[10000];
        double[] arr2 = new double[10000];

    for (int k = 0; k < 10000; k++) 
    {
        for (int i = 0; i < 18; i++)
        {
            prob = (int)(Math.random()* 6 + 1);
            //System.out.println("\t" + prob + " number");

            arr[i] = prob;
            //System.out.println("\t" + arr);
        }
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == 6.0) 
            {
                arr2[counter] = 6;
                counter = counter + 1;
                break;
            }
        } 
    }
        for (int g = 0; g < arr2.length; g++)
        {
            if (arr2[g] == 6.0)
            {
                finalcounter = finalcounter + 1;
            }
        }

        return finalcounter / 100 - n;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.print(probabilityThreeSixes());
    }
}
