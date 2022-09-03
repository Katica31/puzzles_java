
public class puzzle3 {

// the source of the task is: 
//https://www.youtube.com/watch?v=JDuRen5_AYg&list=PLmNK9aRt5JxZqY93VXMM90bTrsRaFZ086&index=5
// (downloaded:2022. 09. 03.)


    public static void main(String[] args) {
        
        int [] array = {1,1,1,0,0,0,0};
        
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count0 ++;
            } else{
                count1 ++;
            }
        }

        if (count0 >= count1) {
            System.out.println("The output "+count1 *2);
        }else{
            System.out.println("The output "+count0 *2);

        }
    }
}