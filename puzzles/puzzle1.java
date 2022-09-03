public class puzzle1 {

    // the source of the task is: 
    // https://www.youtube.com/watch?v=SQCFu6G_58k&list=PLmNK9aRt5JxZqY93VXMM90bTrsRaFZ086&index=2 
    // (downloaded:2022. 09. 03.)

    public static void main(String[] args) {
        int a = 6;
        int sum = 1;

        for (int i = 0; i < a; i++) {
            sum *= i + 1; 
        }
        System.out.println(" The factorial of "+a+" is "+sum);
    }
}
