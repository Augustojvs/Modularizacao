
package modularizacao;

import java.util.Scanner;


public class Modularizacao {
    static Scanner input = new Scanner(System.in);

    static int retornaDobro(int num){
        
        return num * 2;
    }
    static int maiorNumero(int num1, int num2){
        
        if(num1 > num2){
            return num1;
        }else {
        return num2;
        }
    }
    static int Diferenca(int maior, int menor){
        if(maior > menor){
           return maior - menor;
        }else {
            return menor - maior;
        }
    }
    static int retornaSoma(int num){
        int soma = 0;
        for (int i = 1; i < num; i++) {
           num += soma;
        }
        return soma;
    }
    static int retornaFatorial(int num){
        int fat = 0;
        for (int i = 1; i < num; i++) {
            num = fat * i;
        }
        return num;
    }
    static int retornaMultiplicacaoComSoma(int num1, int num2){
        int result = 0;
        for (int i = 0; i < num1; i++) {
            result += num2;
        }
        return result;
    }
    static int retornaDivisaoComSomaSubtracao(int num1, int num2){
        int result = 0;
        while(num1 - num2 >= 0){
            num1 -= num2;
            result++;
        }
        return result;
    }
    static int retornaPotencia(int num1, int num2){
        int potencia = num1;
        for (int i = num2-1; i > 0; i--) {
            potencia *= num1;
        }
        return potencia;
    }
    static boolean retornaTrueParFalseImpar(int num){
      
        return num %2 == 0 ;
       
    }
    static boolean retornaPrimoTrue(int num){
        for (int i = 2; i < num; i++) {
            if(num %i ==0){
                return false;
            } 
            
        }
        return true;
       
    }
    static void imprimeVetorInverso(int num[]){
        int vet[] = new int[num.length];
        for (int i = 1; i <= num.length; i++) {
            vet[num.length-i] = num[i-1];
        }
        
    }
    static int retornaNegativos(int num[]){
        int result = 0;
        for (int i = 0; i < num.length; i++) {
            if(num[i] < 0){
                result++;
            }
        }
        return result;
    }
    static int retornaSomaValoresReais(int num[]){
        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] += soma;
        }
        return soma;
    }
    static double retornaSomaValoresReais(double num[]){
        int soma = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] += soma;
        }
        return soma;
    }
    static int retornaMediaAritimetica(int media[]){
      int soma = retornaSomaValoresReais(media);
        return soma / media.length;
    }
    static double retornaMediaAritimetica(double media[]){
      double soma = retornaSomaValoresReais(media);
        return soma / media.length;
    }
    static int retornaMaiorElemento(int num[]){
        int maior = 0;
        for (int i = 0; i < num.length; i++) {
            if(i == 0){
                maior = num[i];
            }
            if (maior < num[i]) {
                maior = num[i];
            }
        }
        return maior;
    }
    static int retornaOcorrencias(int num[], int outro){
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == outro) {
                count++;
            }
        }
        return count;
    }
    static int retornaPrimeiraPosicaoVetor(int num[], int outro){
        for (int i = 0; i < num.length; i++) {
            if(num[i] == outro ){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    
    }
}