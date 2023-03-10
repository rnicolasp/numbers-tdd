public class NumbersCat {
    public static java.lang.String say(long n) {
        if (n < 0) {
            return "Menys " + say(-n).toLowerCase();
        }
        switch ((int) n) {
            case 0:
                return "Zero";
            case 1:
                return "Un";
            case 2:
                return "Dos";
            case 3:
                return "Tres";
            case 4:
                return "Quatre";
            case 5:
                return "Cinc";
            case 6:
                return "Sis";
            case 7:
                return "Set";
            case 8:
                return "Vuit";
            case 9:
                return "Nou";
            case 10:
                return "Deu";
            case 20:
                return "Vint";
            case 30:
                return "Trenta";
            case 40:
                return "Quaranta";
            case 50:
                return "Cinquanta";
            case 60:
                return "Seixanta";
            case 70:
                return "Setanta";
            case 80:
                return "Vuitanta";
            case 90:
                return "Noranta";
        }

        long unitat;
        long decena;
        long divisor = 0;
        String xifra = "";
        String xifres = "";

        if (n > 20 && n < 100) {
            unitat = n % 10;
            decena = 10 * (n / 10);
            String resultat = n < 30 ? say(decena) + "-i-" + say(unitat).toLowerCase()
                    : say(decena) + "-" + say(unitat).toLowerCase();
            return resultat;
        }

        if (n >= 100 && n < 1000) {
            divisor = 100;
            xifra = "Cent";
            xifres = "-cents";
        }
        if (n > 999 && n < 1000000) {
            divisor = 1000;
            xifra = "Mil";
            xifres = " mil";

        }
        if (n > 999_999) {
            divisor = 1000000;
            xifra = "Milió";
            xifres = " milions";

        }
        return calculaNombre(n, divisor, xifra, xifres);
    }

    private static String calculaNombre(long n, long divisor, String xifra, String xifres) {
        String nombre = "";
        long centena = n / divisor;
        long resto = n % divisor;
        nombre = centena == 1 ? xifra : say(centena) + xifres;
        nombre += resto != 0 ? " " + say(resto).toLowerCase() : "";
        return nombre;
    }


}
