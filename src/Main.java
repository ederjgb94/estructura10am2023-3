import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila p = new Pila();
        int entrada;
        while(sc.hasNext()){
            String comando = sc.next();
            if(comando.equals("PPU")){
                entrada = sc.nextInt();
                p.push(entrada);
            }else if(comando.equals("CPU")){
                entrada = sc.nextInt();
                //c.push(entrada);
            }else if(comando.equals("PPO")){
                System.out.println(p.pop());
            }else{
                //System.out.println(c.pop());
            }
        }

    }
}