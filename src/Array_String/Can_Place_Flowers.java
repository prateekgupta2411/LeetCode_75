package Array_String;

public class Can_Place_Flowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        if(n==0){
            return true;
        }
        for(int i=0;i<flowerbed.length;i++){
           if(flowerbed[i] == 0){
               boolean left_Khali = (i ==0 || flowerbed[i-1] == 0);
               boolean right_Khali = (i == flowerbed.length-1 || flowerbed[i+1] == 0);
               if(left_Khali && right_Khali){
                   flowerbed[i] = 1;
                   n--;
                   if (n == 0) {
                       return true;
                   }
               }
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int flowerbed[] = {1,0,0,0,1}; int  n = 2;
        System.out.println(canPlaceFlowers(flowerbed,n));
    }
}
