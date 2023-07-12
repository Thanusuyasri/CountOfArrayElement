import java.time.LocalTime;
import java.util.Scanner;


public class NumberGrater {
    public static int countMaxAtleatOne(int[] array)
    {
        int count=0;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
                count=1;
            }
            else if(array[i]==max)
            {
                count++;
            }
        }
        return array.length-count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeOfarray=scanner.nextInt();
        int[] array = new int[sizeOfarray];
        for(int i =0 ; i < sizeOfarray ; i++)
        {
            array[i]= scanner.nextInt();
        }
        System.out.println(countMaxAtleatOne(array));
    }

}
