
public class aplicacao{

    public static void main(String[] args){

        String tecnica = args[0];
        String dadoshexa = args[1];

        switch(tecnica){
            case "nrzi":
            System.out.println("nrzi");
            break;
            case "mdif":
            System.out.println("mdif");
            break;
            case "hdb3":
            System.out.println("hdb3");
            break;
            case "8b6t":
            System.out.println("8b6t");
            break;
            case "6b8b":
            System.out.println("6b8b");
            break;
            default:
            System.out.println("Error!");
            break;
        }

    }

    public static String nrzi(String dadoshexa){
        return null;
    }

    public static String mdif(String dadoshexa){
        return null;
    }

    public static String hdb3(String dadoshexa){
        return null;
    }

    public static String oitob6t(String dadoshexa){
        return null;
    }

    public static String seisb8b(String dadoshexa){
        return null;
    }

}