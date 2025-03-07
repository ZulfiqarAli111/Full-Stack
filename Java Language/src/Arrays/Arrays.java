package Arrays;

public class Arrays {
    public static  void main(String[] args){

        int[] num = {1,2,3,4,5};
        System.out.println(num[1]);

        for(int i:num){
            System.out.println(i);
        }

        int[] numbers = new int[10];
        for(int i=0;i<10;i++){
            numbers[i] = (i+1)*10;
        }
        for(int i:numbers){
            System.out.println(i);
        }

        // seach max value in array

        int values[] = {12,23,11,1,34,23,10,1};
        int res = Integer.MIN_VALUE;
        for (int max: values
             ) {
            if(max>res){
                res = max;
            }
        }
        System.out.println(res);
    }
}
