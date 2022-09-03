public class puzzle4 {

  //The source of the task is:
  //https://www.youtube.com/watch?v=uIhhzJseRs8&list=PLmNK9aRt5JxZqY93VXMM90bTrsRaFZ086&index=7
  //downloaded: 2022. 09. 03.
    public static void main(String[] args) {
        int[]a1 = {22,7,1,-5,5,-2};
        int[]a2 = {4,-1,21,12,10,-3};

        int sum = 0;
        int arraylength = a2.length-1;
        for (int i = 0; i < a2.length; i++) {
          sum +=  (a1[i] * a2[arraylength]);
          arraylength--;
        }

        System.out.println("Az output: "+sum);

    }
}
