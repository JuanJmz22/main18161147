import java.util.Scanner;
public class Main18161147 { 
    public static void main(String[] args) {          
        int lim;
        String numero;
        Scanner dato = new Scanner (System.in);
        numero = dato.nextLine();   
        lim = Integer.parseInt(numero);
        while (lim<1 || lim>998){
            System.out.println("rango no aceptado");
            numero = dato.nextLine();   
            lim = Integer.parseInt(numero);
        }   
        for (int i=0; i<10;i++){
            int total=0;
            String numF[] = numero.split("");
            int num[] = new int [numF.length];
            for (int x=0;x<numF.length;x++){
                 num[x]= Integer.parseInt(numF[x]);
                 num[x]=num[x]*num[x];
                 total=total+num[x];
            }           
            System.out.println(total);
            if (total==1){
                System.out.println(total);
                break;
            }
            if (total!=1 && i==9){
                System.out.println("0");
            }
            numero = String.valueOf(total);
        }
    }
}
