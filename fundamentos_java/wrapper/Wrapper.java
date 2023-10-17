package wrapper;

public class Wrapper {
    public static void main(String[] args) {
        //primitivos
        int tipoInt = 1;
        float tipoFloat = 1;
        boolean tipoBoolean = false;


        //wrappers
        Integer tipoInteger = 1;
        Float tipoFloat2 = 1F;
        Boolean tipoBoolean2 = false;
    
        //outra maneira seria:
        Integer num = Integer.valueOf(10);

        //para comparar
        System.out.println(num.equals(tipoInteger));
    }
}
