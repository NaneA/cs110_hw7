package Utils;
public class ArrayUtils {
  public static void reverse(int[] arr){
  int i=0;
  while(i<arr.length/2){
    int rev = arr[i];
    arr[i] = arr[arr.length-i-1];
    arr[arr.length-i-1]=rev;
    i++;

  }
}
public static String stringifyArray(int[] lol){
  String z = "";
  for(int j=0; j<lol.length;j++){
   z+= (lol[j]);

  }
   return z;
}
}
