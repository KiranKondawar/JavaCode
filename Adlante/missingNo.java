package Adlante;

public class missingNo {
	public static int MissingMarbles(int number, int[] bowls)

    {

        int sum = bowls[0] + bowls[number - 1];

        int missing = 0;

        int i = 1, j = number - 2;

        while(i<=j)

        {

            if(bowls[i]+bowls[j] == sum)

            {  

                i++;  

                j = j - 1;  

            }

            else  

            {

                if (i == j)  

                    missing = sum - bowls[i];

                else

                missing = (sum - (bowls[i] + bowls[j]));

                break;

            }

        }

        return missing;

    }

	
	public static void main(String[] args) {
		int []arr= {2,4,6,10,12};
		int input =5;
		int a=MissingMarbles(input,arr);
		System.out.println(a);
		
	}
}
