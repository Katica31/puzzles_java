public class puzzle5 {

    //The sourc of the task is:
    //https://www.youtube.com/watch?v=G93NyU6AkGw&list=PLmNK9aRt5JxZqY93VXMM90bTrsRaFZ086&index=9
    //Downloaded: (2022. 09. 03.)

    public static void main(String[] args) {
        
        boolean helyes = true;
        String str = "3trallala/5";
        String elsob = str.toUpperCase();
        if (str.charAt(0)!=(elsob.charAt(0))) {
            helyes = false;
        }

       if(str.contains("0") || str.contains("1") || str.contains("2") || str.contains("3") ||
       str.contains("4") || str.contains("5") || str.contains("6") || str.contains("7") || 
       str.contains("8") || str.contains("9")){
       }else{
        helyes = false;
       }

       if(str.contains(" ")||str.contains("/")){
       }else{
        helyes = false;
       }

      
       if(helyes == false){
        System.out.println("Invalid password");
       }else{
        System.out.println("The password is valid");
       }


    }
}
