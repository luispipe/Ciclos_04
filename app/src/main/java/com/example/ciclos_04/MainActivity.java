package com.example.ciclos_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

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
          £n --> n+(n-1)+(n-2)...1

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




    }
}