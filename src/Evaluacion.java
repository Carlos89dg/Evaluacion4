//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Evaluacion{
    public static void main(String[] args) {
        int cocina = 299990;
        int lavadora = 234540;
        int comedor = 159990;
        int televisor= 345100;

        float IVA=0.19f;
        float dolar=916.15f;
        int totalcompra= cocina + lavadora + comedor + televisor;
        float totalIVA= totalcompra * IVA;
        float totalDolar= totalcompra / dolar;

        System.out.println("Total de su compra es:"+totalcompra);
        System.out.println("Total de iva es:"+totalIVA);
        System.out.println("Total de su compra en dolares es:"+totalDolar);
        System.out.println("hola");
    }
}