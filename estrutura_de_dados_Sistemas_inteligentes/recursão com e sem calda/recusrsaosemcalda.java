/* fatorial sem calda */
import javax.swing.*;

class Fatorialp {
    static void fatp(int n, int x, int f){
        if (x==0 || x==1){
            System.out.println("o fatorial de "+n+ "é"+ f);}
        else{     
                
                fatp(n, x-1, f*x);
                    }
        }
    

    public static void main(String arg []){
                int nro;
                nro = Integer.parseInt(JOptionPane.showInputDialog("Digite o falo para saber o fatorial"));
                if (nro < 0){
                    
                    System.out.println ("valor inválido para o calculo");
                    System.exit(0);}
                    else { fatp(nro, nro, 1);}
                    System.exit(0);}
             
              
}
    
