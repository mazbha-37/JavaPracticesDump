package arrays2d;

public class main {
    public static void main(String[] args){
        String[] vegetable = {"Potato", "Tomato", "Carrot"};
        String[] fruits = {"Apple", "Banana", "Orange"};
        String[] meats = {"Chicken", "Beef", "Mutton"};

        String[][] market = { vegetable,fruits,meats};

        for(String[] i:market){
            for(String j:i){
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }
}
