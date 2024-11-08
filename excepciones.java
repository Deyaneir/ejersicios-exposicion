public class excepciones {
    public static void main(String[] args) {
        int numero = 3;
        try {
            double resultado= numero/0;
        } catch (Exception e){
            System.out.println("No hay valor divisible para 0");
        }
    }
}