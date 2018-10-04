package edu.cnm.deepdive;

public class Euler{

  public static void main(String[] args) {
    int sums = 0;
    for(int i = 0;i<1000;i++){
      if(i%5==0||i%3==0) {
        sums += i;
        System.out.println(sums);
      }
      //The sum is 233168 for all values divisible by 3 and five below 1000.
    }
  }
}
