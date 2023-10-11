package com.example.ciclos_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Ciclo --> es una estructura que nos permite iterar o
          repetir acciones 1 o más veces

          FOR

          1. Se utiliza la palabra reservada for seguido de ()
          2. Dentro el parentesis van 3 elementos separados por ;
          3. El primer elemento: es la variable iteradora --> tipo dato - nombre - valor
            tipo de dato--> 80% de las veces es int
            nombre --> 100% es i
            valor --> Depende del ejercicio pero acostumbra a iniciar por la primera iteración o la última
          4. Segundo elemento: condición de cierre del ciclo, se utilizan los operadores lógicos
             >,>=,<,<=<,!=,=
          5. Tercer elemento: Condición de actualización
          ++ es +1, -- es -1
          6. Despues de los parentecis se abren llaver {} y dentro de coloca la lógica
          del ciclo, es decir la acción que se repetira n cantidad de veces

          Ej: Hacer el ejercicio de sumatoria de un número con ciclos
          £5 --> 5+4+3+2+1
          £n --> n+(n-1)+(n-2)...1 */

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

        /* Con un ciclo llenar un arreglo con los 100 primeros números primos
         */
        int [] primos= new int[100];

        for (int i=0; i<primos.length;i++){

        }






    }






}