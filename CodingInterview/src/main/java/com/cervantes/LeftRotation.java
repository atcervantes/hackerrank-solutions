package com.cervantes;

/**
 * Created by ancervan on 19/06/2018.
 */
public class LeftRotation {

    public static void main(String[] args) {

        int a[] = new int[] {73642, 60581,
                908888, 969919, 799300, 901951, 255276, 696355, 167087, 447070, 100192, 879605, 273189, 736167, 98411};

            int tmp=0;
            for (int i = 0; i<a.length-1; i++){

                if(i==0){
                    tmp = a[i];
                }

                a[i]=a[i+1];

            }

            a[a.length-1]=tmp;



            System.out.println("");


    }

}
