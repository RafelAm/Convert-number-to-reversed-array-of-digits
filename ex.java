public class Kata {
  public static int[] digitize(int n) {
   if(n == 0){
     return new int[]{0};
   }
    int temp = n;
    int longitud = 0;
    
    while(temp > 0){
      temp = temp /= 10;
      longitud++;
    }
    int[] Tab = new int[longitud];
    
    for(int i = 0; i < longitud; i++){
      Tab[i] = n % 10;
      n = n /= 10;
    }
    return Tab;
  }
}
