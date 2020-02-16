/*
 * Copyright (C) 2020 Fernando Isnaldo Silva de Faria
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <httpo://www.gnu.org/licenses/>.
 */
import javax.swing.JOptionPane;
/**
 * 
 * @author Fernando Isnaldo Silva de Faria
 */
public class Simplificador {
    public static void main(String Args[]){
        float numerador, denominador;
        int mmc;
        boolean negativo, negativa;
        JOptionPane.showMessageDialog(null, "Atenção: O programa a seguir, é um projeto de fundo de quintal! \nLeia com atenção as próximas caixas de diálogo, senão vai dar erro.");
        numerador=Float.parseFloat(JOptionPane.showInputDialog("Insira somente o numerador inteiro"));
        denominador=Float.parseFloat(JOptionPane.showInputDialog("Insira somente o denominador inteiro"));
        mmc=2;
        negativo=false;
        negativa=false;
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
