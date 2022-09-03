import java.util.ArrayList;
import java.util.List;


public class puzzle7 {

    // source of task:
    //https://www.youtube.com/watch?v=eQffg2tO0ss&t=88s
    //downloaded: 2022. 09. 03.
    public static void main(String[] args) {

        List<Integer> szamok = new ArrayList<>();
        szamok.add(8);
        szamok.add(4);
        szamok.add(5);
        szamok.add(3);
        szamok.add(2);
        szamok.add(6);
        szamok.add(9);
        szamok.add(1);

        

        for (int i = 0; i < szamok.size(); ) {

            int kisosszeg = 0;
            int nagyosszeg = 0;

            for (int j = 0; j < szamok.size(); j++) {

                if (szamok.get(i) > szamok.get(j)) {
                    kisosszeg += szamok.get(j);
                   

                } else if(szamok.get(i) < szamok.get(j)) {

                    nagyosszeg += szamok.get(j);
                    
                }
                
            }
            
            System.out.print(kisosszeg * nagyosszeg+" ");
            szamok.remove(i);
        }

       
    }
}
