package hack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class ArrayDS {
    static int[] reverseArray(int[] a){
        int len = a.length-1;
        for(int i=0;i<=len/2;i++){
           swap(a,i,len-i); 
        }
        return a;
    }
    
private static void swap (int[] a, int start, int end){
    int temp=a[start];
    a[start]=a[end];
    a[end]=temp;
}
}

