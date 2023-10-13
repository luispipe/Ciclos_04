package com.example.ciclos_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
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
        */

        /* Definición ciclo While
        * 1. palabra reservada while
        * 2. parentesis donde van los parametros
        * 3. El unico parametro es la condición de cierre
        * 4.Lógica del while
        * 5.terminada la lógica se añade la condición de actualización
        * */
        int count=1;

        while (count<=10){
            System.out.println(count);
            count++;
        }
        /*Si ustedes van a trabajr en un ejercicio en donde conocen el limite inferior
         y superior es decir un rango, entonces se trabaja con ciclo for

        *Si desconocen los limites se trabaja con while

        * */

        /*hacer el funcionamiento de una rifa donde participen n cantidad personas
        * */
        int numeradorGanador= (int)((Math.random()*(1000-1+1))-1);
        int seleccionUsuario=(int)((Math.random()*(1000-1+1))-1);
        count=0;
        while (seleccionUsuario!=numeradorGanador){
            System.out.println("Ganador:"+numeradorGanador+" seleccionUser:"+seleccionUsuario);
            seleccionUsuario=(int)((Math.random()*(1000-1+1))-1);
            count++;
        }
        System.out.println("seleccionUsuario:"+seleccionUsuario+" cantidadIter:"+count);
        count=0;

        //A diferencia de los otros ciclo el do while como minimo itera una vez
        do{
            System.out.println("Ganador:"+numeradorGanador+" seleccionUser:"+seleccionUsuario);
            seleccionUsuario=(int)((Math.random()*(1000-1+1))-1);
            count++;
        }while (seleccionUsuario!=numeradorGanador);

        System.out.println(seleccionUsuario+"---"+count);







        }


    }






