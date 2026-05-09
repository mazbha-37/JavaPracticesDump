package arraysbasics;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
            String[] fruits = {"apples","banana","pineapples","cocunuts"};

        for (String fruit : fruits) {
            System.out.println(fruit);

        }


        double[] numbers = {1.00,990, -1, 2, 4, 7};
        Arrays.sort(numbers);
        for(double number : numbers){
            System.out.println(number);
        }
        Scanner input = new Scanner(System.in);
        String[] foods;
        int inputSize;
        System.out.print("Enter the # of the array:");
        inputSize = input.nextInt();

        foods = new String[inputSize];


        for(int i=0; i<foods.length; i++)  {
            System.out.print("Please enter your food name:");
            foods[i] = input.next();

        }

        for (String food: foods){
            System.out.println(food);

        }

        String[] fruitsBasket = {"Apple", "Banana", "Mango", "Orange", "Grapes"};
        String targetFruit = "Lichi";
        boolean isFound = false;
        for(int i=0; i < fruitsBasket.length; i++ ){

            if(fruitsBasket[i].equals(targetFruit)){
                System.out.println("Target found at index:"+i);
                isFound = true;
                break;
            }


        }

        if(!isFound){
            System.out.print("DIDNot found");
        }


    }
}
