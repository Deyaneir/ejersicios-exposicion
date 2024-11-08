public class excepciones1 {
    public static void main(String[] args){
        try {
            int[] numeros={3,5,8,9};
            System.out.println("Su valor es: "+numeros[2]);
        } catch (Exception e) {
            System.out.println("Ingresar una posicion valida ");
        }
    }
}
