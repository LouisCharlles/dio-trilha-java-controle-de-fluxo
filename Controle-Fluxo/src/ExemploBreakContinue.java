public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
            continue;
            else if(numero == 4)
            continue;
            //else if(numero == 2)
            //break;
            System.out.println(numero);
        }   
    }   
}
