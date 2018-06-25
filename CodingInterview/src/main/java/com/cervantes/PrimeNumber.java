package com.cervantes;

/**
 * Created by ancervan on 25/06/2018.
 */
public class PrimeNumber {

    static String solve(int n) {

        if(n==1)
            return "Not prime";

        if(n==2)
            return "Prime";


        if(n%2==0)
            return "Not prime";

        for(int i = 3; i<=n/2; i+=2){
                if(n%i==0)
                    return "Not prime";
            }


        return "Prime";

    }

    public static void main(String[] args) {

        System.out.println(solve(1));	//Not prime
        System.out.println(solve(4));	//Not prime
        System.out.println(solve(9));	//Not prime
        System.out.println(solve(16));	//Not prime
        System.out.println(solve(25));	//Not prime
        System.out.println(solve(36));	//Not prime
        System.out.println(solve(49));	//Not prime
        System.out.println(solve(64));	//Not prime
        System.out.println(solve(81));	//Not prime
        System.out.println(solve(100));	//Not prime
        System.out.println(solve(121));	//Not prime
        System.out.println(solve(144));	//Not prime
        System.out.println(solve(169));	//Not prime
        System.out.println(solve(196));	//Not prime
        System.out.println(solve(225));	//Not prime
        System.out.println(solve(256));	//Not prime
        System.out.println(solve(289));	//Not prime
        System.out.println(solve(324));	//Not prime
        System.out.println(solve(361));	//Not prime
        System.out.println(solve(400));	//Not prime
        System.out.println(solve(441));	//Not prime
        System.out.println(solve(484));	//Not prime
        System.out.println(solve(529));	//Not prime
        System.out.println(solve(576));	//Not prime
        System.out.println(solve(625));	//Not prime
        System.out.println(solve(676));	//Not prime
        System.out.println(solve(729));	//Not prime
        System.out.println(solve(784));	//Not prime
        System.out.println(solve(841));	//Not prime
        System.out.println(solve(907));	//Prime

    }
}
