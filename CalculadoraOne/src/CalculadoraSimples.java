/***************************** PROJETO CALCULADORA JAVA********************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculadoraSimples {
    public static void main(String[] args) throws Exception {
        double num1, num2, resultado = 0;
        String operação = "";
        int opcao;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("=====Calculadora=====");
        System.out.println("Digite a operação desejada");
        System.out.println("=====[1] Multiplicação=====");
        System.out.println("=====[2] Divisão=====");
        System.out.println("=====[3] Adição=====");
        System.out.println("=====[4] Subtração=====");
        opcao = Integer.parseInt(reader.readLine());

        System.out.println("Você escolheu a opção de número:" + opcao);

        System.out.println("Informe o valor do número 1");
        num1 = Double.parseDouble(reader.readLine());
        System.out.println("Informe o valor do número 2");
        num2 = Double.parseDouble(reader.readLine());

        switch (opcao) {
            case 1:
                resultado = num1*num2;
                operação = "Multiplicação";
                break;
            
            case 2:
                resultado = num1/num2;
                operação = "Divisão";
                break;
            
            case 3:
                resultado = num1+num2;
                operação = "Adição";
                break;

            case 4:
                resultado = num1-num2;
                operação = "Subtração";
                break;
                
            default:
                System.out.println("Opção não encontrada");
                break;
        }
        System.out.println("O resultado da operação " + operação + " entre "+ num1 + " e " + num2 + " é " + resultado);
    }
}
