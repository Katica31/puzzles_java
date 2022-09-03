public class puzzle2 {

        // the source of the task is: 
        //https://www.youtube.com/watch?v=m-JCaYKkTwQ&list=PLmNK9aRt5JxZqY93VXMM90bTrsRaFZ086&index=3
        // (downloaded:2022. 09. 03.)


    public static void main(String[] args) {
        
        Integer n = 5;
        Integer count = 0;

        if (n % 2 != 0 ) {
            n = n-1;
            count = 1;
        }
    
    for (int i = 0; i < 10000; i++) {
         n = n/2;
         count++;
         if(n == 0){
            break;
         }
    }
    System.out.println("THE OUTPUT IS: "+count);
        
    }
}
