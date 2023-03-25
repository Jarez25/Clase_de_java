package alimento;

import alimento.P.Congelado;
import alimento.P.Refrigerado;
import alimento.P.frescos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class main {

    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
    public static void main(String[] args) throws ParseException {
        frescos frescos1 = new frescos("mantequilla", 18, dateFormat.parse("11/03/1992"), "nicaragua", 154);
        System.out.println(frescos1.getNombre());
        frescos1.setNombre("mermelada");
        System.out.println(frescos1.getNombre());

        Refrigerado refrigerado1 = new Refrigerado("helado", 18, dateFormat.parse("11/03/1992"), "nicaragua", 565, "otro" );
        System.out.println(refrigerado1.getNombre());

        Congelado congelado1 = new Congelado("hielo", 5,dateFormat.parse("11/03/1992"), "nicaragua", 566, "15°");
        System.out.println(congelado1.getNombre());
    }
}

