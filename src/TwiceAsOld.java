public class TwiceAsOld{

    public static int TwiceAsOld(int dadYears, int sonYears){
        int edad = Math.abs(dadYears - sonYears * 2);
        return edad;
    }
    public static void main(String [] args) {
        int sonYears = 7;
        int dadYears = 30;
        int resultado = TwiceAsOld(dadYears, sonYears);
        System.out.println(resultado);
    }
}