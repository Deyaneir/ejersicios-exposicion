public class excepciones3 {
    public static void main(String[] args){
        try{
            String numb="12345.88";
            int resultado=Integer.parseInt(numb);
            System.out.println("El numero en entero es: "+resultado);
        } catch (Exception e){
            System.out.println("Valor no valido");
        }
    }
}
