import java.util.ArrayList;
import java.util.List;

public class puzzle6 {

//source of task:
//https://www.youtube.com/watch?v=sslD2QNdlpw&t=71s
// downloaded: 2022. 09. 03.

    public static void main(String[] args) {
            
        int [] Input = {1,0,3,6,3,0,4,5,6,0,7,8,9,0};
        List <Integer> tmp = new ArrayList<>();

        for (int i = 0; i < Input.length; i++) {
            if( Input[i] != 0 ){
                tmp.add(Input[i]);
            }
        }

        int numbOfZeros = Input.length - tmp.size();

        List <Integer> Output = new ArrayList<>();
        for (int k = 0; k < numbOfZeros; k++) {
            Output.add(0);
        }

        for (int k = 0; k < tmp.size(); k++) {
            Output.add(tmp.get(k));
        }

    for (int i = 0; i < Input.length; i++) {
        System.out.print(Input[i]+" ");
    }

    System.out.println("The Output: ");
    for (int i = 0; i < Output.size(); i++) {
        System.out.print(Output.get(i)+" ");
    }
    

    }
}
