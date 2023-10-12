package com.example.ciclos_04;

import java.util.Arrays;

public class CiclosNumber {

    public void ejemplos(){
         /*
    int n= 6;
    int sumatoria=0;
          for(int i=1;i<=n;i+1){
        sumatoria=sumatoria+i;
        //sumatoria+= i;
    }

    Iter 1 --> i=1  n=6  sumatoria=1
    Iter 2 --> i=2  n=6  sumatoria=3
    Iter 3 --> i=3  n=6  sumatoria=6
    Iter 4 --> i=4  n=6  sumatoria=10
    Iter 5 --> i=5  n=6  sumatoria=15
    Iter 6 --> i=6  n=6  sumatoria=21
    Iter 7 --> i=7  n=6  termina el ciclo y sumatoria=21

            *
            * */

        int n=6;
        long sumatoria=0;

        for (int i=1;i<=n;i++){
            sumatoria=sumatoria+i;
            System.out.println("i="+i+" Sumatoria="+sumatoria);
        }
        //  £6 = 6+5+4+3+2+1
        System.out.println("--------------------------------");
        sumatoria=0;
        for (int i=n;i>=1;i--){
            sumatoria=sumatoria+i;
            System.out.println("i="+i+" Sumatoria="+sumatoria);
        }

        for(int i=100; i>=0;i--){
            System.out.println(i);
        }
        String texto = "Bienvenidos al curso de desarrollo de aplicaciones" +
                "moviles del programa ATENEA";

        //Contar cuantas veces aparece la letra 'a' en el texto
        int count=0;
        //Los textos iniciamos en la posición  0 y termina en la posición n-1 .length()-1
        //"Hola"-> 0-H 1-o 2-l 3-a  texto.length()=4

        for (int i=0;i<texto.length();i++){
            if(texto.charAt(i)=='a'){
                count=count+1;
            }
            System.out.println("i: "+i+" Carácter: "+texto.charAt(i)+" Contador: "+count);
        }
        count=0;
        for (int i=0;i<texto.length();i++){
            //"HOLA" -> 'a'
            //toLowerCase()--> convierto un texto en minusculas
            //"hola" -> 'a'
            if(texto.toLowerCase().charAt(i)=='a'){
                count=count+1;
            }
            System.out.println("i: "+i+" Carácter: "+texto.charAt(i)+" Contador: "+count);
        }

        count=0;
        for (int i=texto.length()-1;i>=0;i--){
            if(texto.toLowerCase().charAt(i)=='a'){
                count=count+1;
            }
            System.out.println("i: "+i+" Carácter: "+texto.charAt(i)+" Contador: "+count);
        }

        int [] pares= new int [100];
        //{ 2,4,6,8, , , , , , , , , , , , , , , , , , , , , , , }
        int flag=0;
        //Ciclo que llena el arreglo con los 100 primeros números pares
        for (int i=0;i<pares.length;i++){
            flag=flag+2;
            pares[i]=flag;
            System.out.println("i: "+i+" Flag: "+flag+ " valor:"+pares[i]);
        }
        System.out.println(Arrays.toString(pares));
        int [] impares= new int [100];
        //{ 2,4,6,8, , , , , , , , , , , , , , , , , , , , , , , }
        int flag2=1;
        //Ciclo que llene el arreglo con los 100 primeros números impares
        for (int i=0;i<impares.length;i++){
            impares[i]=flag2;
            System.out.println("i: "+i+" Flag: "+flag2+ " valor:"+impares[i]);
            flag2=flag2+2;
        }
        System.out.println(Arrays.toString(impares));

        flag2=0;
        for (int i=0;i<impares.length;i++){
            flag2=flag2+1;

            if (flag2%2 !=0){
                impares[i]=flag2;
            } else {
                flag2=flag2+1;
                impares[i]=flag2;
            }

            System.out.println("i: "+i+" Flag: "+flag2+ " valor:"+impares[i]);
        }
        System.out.println(Arrays.toString(impares));

        flag=-1;
        //Ciclo que llena el arreglo con los 100 primeros números pares
        for (int i=0;i<impares.length;i++){
            flag=flag+2;
            impares[i]=flag;
            System.out.println("i: "+i+" Flag: "+flag+ " valor:"+impares[i]);
        }
        System.out.println(Arrays.toString(impares));


    }

}
