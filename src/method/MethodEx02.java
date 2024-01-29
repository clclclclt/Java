package method;

public class MethodEx02 {
    public static void main(String[] args) {

        String message = "Hello, world!";

        repeatMessage(3,message);

    }

    static void repeatMessage(int num,String message){

        for(int i=0; i< num; i++) {
            System.out.println(message);
        }
    }

}


