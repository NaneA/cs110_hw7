package Utils;
public class math{

public static long factorial(int x){

  int i = 0;
  long z = 1;
  while(i < x) {
    z = (i + 1) * z;
    i++;
  }
  return z;
  }
}

  // public static long factorialrec(int t){
  //   int this=1;
  //   if(t<=1){
  //     return 1;
  //   }
  //   this=this*factorialrec(t-1);
  // }
  // }
