package Loops;

public class Loops {
    public static void main(String[] args){

        // for loop

        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

        // while loop

        int j=10;
        while(j>0){
            System.out.println(j);
            j--;
        }

        // do while loop

        int b = 2;
        do{
            System.out.println(b);
            b--;
        }while (b>=0);



        // for each loop

        String[] fruits = {"Apple","Banana","Orange","Melon"};

        for(String fruit:fruits){
            System.out.println(fruit);
        }
    }
}
