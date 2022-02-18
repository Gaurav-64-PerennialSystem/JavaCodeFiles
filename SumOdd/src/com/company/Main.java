package com.company;

public class Main {

    public static boolean isPalindrome(int n){
        int r,sum=0,temp;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("number is palindrome");
        }else {
            System.out.println("number is not palindrome");
        }
    return true;
    }
    public static void main(String[] args) {
	isPalindrome(434);
    }
}
