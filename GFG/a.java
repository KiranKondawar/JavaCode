package GFG;


import java.io.BufferedReader;
import java.io.InputStreamReader;




import java.util.*;

class a {
    public static void main(String args[] ) throws Exception {


        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        int a=0,e=0,i1=0,o=0,u=0;
        int ans = 1;

        for(int j=0;j<Integer.parseInt(test);j++){

            String s = sc.nextLine();
           // System.out.println(s);

                for(int i=0;i<s.length();i++){

                    if( s.charAt(i)=='a' || s.charAt(i)=='o' || s.charAt(i)=='i' || s.charAt(i)=='e' || s.charAt(i)=='u' ) {

                            if(s.charAt(i)=='a')
                            a=1;

                            else if(s.charAt(i)=='e')
                            e=1;
                            else if(s.charAt(i)=='i')
                            i1=1;
                            else if(s.charAt(i)=='o')
                            o=1;
                            else if(s.charAt(i)=='u')
                            u=1;


                    }

                    else if(s.charAt(i)=='_'){
                        int sum = a + e +i1 +o + u;
                        if(sum != 0)
                        ans  = ans * sum;
                    }

                }


        if(ans!=0)
        System.out.println(ans);
        else
        System.out.println(1);
        ans = 1;
        a=0;
        e=0;
        i1=0;
        o=0;
        u=0;
        }

    }
}