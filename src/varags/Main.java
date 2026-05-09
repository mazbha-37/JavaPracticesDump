package varags;

public class Main {
        public static void main(String[] args){


            add(1,2,3,4);
            System.out.println(average(1.0,2,3,4));
        }

        static void add(int... numbers){
            int sum =0;
            for(int i=0; i < numbers.length; i++){
                sum+=numbers[i];

            }
            System.out.println("So the add result is:"+ sum);
        }

        static double average(double... numbers){
            double sum=0;
            for(double number: numbers){
                sum+=number;
            }
            return sum/ numbers.length;

        }
}
