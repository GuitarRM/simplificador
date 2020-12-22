/*Simplifica frações*/
import javax.swing.JOptionPane;
public class Simplificador {
    public static void main(String Args[]){
        float numerador, denominador;
        int mmc=2;
        boolean negativo=false, negativa=false;
        try {
            numerador=Float.parseFloat(JOptionPane.showInputDialog("Insira somente o numerador inteiro"));
            denominador=Float.parseFloat(JOptionPane.showInputDialog("Insira somente o denominador inteiro"));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Dados foram incorretamente inseridos");
            System.exit(0);
        }
        if(numerador<0){
            numerador=numerador*-1;
            negativo=true;
        }
        if(denominador<0){
            denominador=denominador*-1;
            negativa=true;
        }
        while(mmc <=numerador && mmc <= denominador){
            if(numerador%mmc!=0 || denominador%mmc!=0){
                mmc=mmc+1;
            }
            else{
                numerador=numerador/mmc;
                denominador=denominador/mmc;
                mmc=2;
            }
        }
        if(negativo==true){
            numerador=numerador*-1;
        }
        if(negativa==true){
            denominador=denominador*-1;
        }
        if(numerador==0){
            JOptionPane.showMessageDialog(null, "O resultado é 0.");
        }
        else if(denominador==1){
            JOptionPane.showMessageDialog(null, "O resultado é um número inteiro: " + (int)numerador);
        }
        else if(denominador%1!=0 || numerador%1!=0){
            JOptionPane.showMessageDialog(null, "Transforme os números em uma fração");
        }
        else {
            JOptionPane.showMessageDialog(null, "A fração simplificada é: " + (int)numerador + "/" + (int)denominador);
        }
        System.exit(0);
    }
}
