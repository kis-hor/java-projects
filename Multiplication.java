public class Multiplication {
    public static void main(String[] args){
        System.out.println("Multiplication table upto 10 \n");
        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i*j + "\t");
            }
            System.out.println();
        }
    }
}