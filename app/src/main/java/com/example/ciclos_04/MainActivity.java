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

          Ej: Hacer el ejercicio de sumatoria de un número con ciclos
          £5 --> 5+4+3+2+1
          £n --> n+(n-1)+(n-2)...1 */

          /*Estructura para definir una lista:
            1. Primero se coloca la palabra ArrayList
            2. entre < > se coloca la clase del tipo de dato de la lista
            3. se asigna el nombre
            4. se instancia la lista con new ArrayList<>();
          *

          Diferencia entre Array(arreglo) y ArrayList(Lista)
          - El arreglo tiene un tamaño estatico y la lista tiene un tamaño dinamico
          * */

        /*
        * String --> clase String
        * char --> clase Char
        * double --> clase Double
        * int--> clase Integer
        * */


        ArrayList<Integer> pares= new ArrayList<>();
        int flag=0;
        for (int i=1;i<=100;i++){
            flag=flag+2;
            pares.add(flag);
        }

        /*Matriz --> un arreglo de arreglos
        *       c0  c1  c2  c3 c4
        * f0  |  2  10  16  4  8 |
        * f1  |  6  12  20  32 30|
        * f2  |  14 24  28  40 38|
        * f3  |  18 26  22  34 36|
        * Filas--> horizontal
        * Columnas--> vertical
        * Tamaño de la matriz= filas *columnas
        *   i  j         i  j         i  j         i  j         i  j
        *  [0][0]--> 2  [0][1]--> 10 [0][2]--> 16 [0][3]--> 4  [0][4]--> 8
        *  [1][0]--> 6  [1][1]--> 12 [1][2]--> 20 [1][3]--> 32 [1][4]--> 30
        *  [2][0]--> 14 [2][1]--> 24 [2][2]--> 28 [2][3]--> 40 [2][4]--> 38
        *  [3][0]--> 18 [3][1]--> 26 [3][2]--> 22 [3][3]--> 34 [3][4]--> 36
         *
        * int [][] pares= new int[4][5]
        *
        * */
        int [] numeros= {4,50,15,16,80,100,41,63,97};
        //Calcular la sumatoria de cada uno de los números dentro del arreglo

        //Arreglo donde almaceno las sumatorias
        int [] sumatoria= new int[numeros.length];
        int bandera=0;
        //Primer for va a recorrer el arreglo de números
        for (int i=0;i<numeros.length;i++){
            bandera=0;
            //Segundo for es para realizar sumatoria
            for (int j=1;j<=numeros[i];j++){
                bandera=bandera+j;
                //sumatoria[i]+=j;
                System.out.println("i:"+i+" j:"+j+" bandera:"+bandera);
            }
            sumatoria[i]=bandera;
            System.out.println(Arrays.toString(sumatoria));
        }
        /* i=0  0<9 --> j=1 j<=4  (numeros[i]=4) bandera=0+1
        *               j=2 j<=4                 bandera=1+2
        *               j=3 j<=4                 bandera=3+3
        *               j=4 j<=4                 bandera=6+4
        *               j=5 j<=4                 Sale del ciclo interno
        * sumatoria[0]=10
        *
        * i=1 1<9 -->  j=1 j<=50 (numeros[i]=50)
        *
        */

        /* dada una matriz vacia de tamaño 4 * 5  la llenaremos con números aleatorios entre 1-1000
        * */

        int [][] aleatorios= new int[4][5];

        //Primer ciclo recorro filas
        //al calcular el tamaño de la matriz el nos devuelve la cantidad de filas
        int numero=0;
        int min=1;
        int max=1000;
        for (int i=0;i<aleatorios.length;i++){
            //Segundo ciclo para recorrer columnas
            // la cantidad de datos que hay en una fila es igual al número de columnas
            //por ende aleatorios[0].length = 5
            for (int j=0; j<aleatorios[i].length;j++){
                 numero= (int)(Math.random()*((max-min)+1)-min);
                 aleatorios[i][j]=numero;
                 System.out.println("i:"+i+" j:"+j+" numero:"+numero);
            }
            System.out.println(Arrays.toString(aleatorios[i]));
        }
        System.out.println("----------------------------");
        for (int i=0; i<aleatorios.length;i++){
            System.out.println(Arrays.toString(aleatorios[i]));
        }


        /* Math.ramdon() --> 0 y 1 sin incluir ambos limites
        *  Math.random()*max(100) --> 0 y 100 sin incluir ambos limites y con decimales
        *  Math.random()*(max(100)-min(1)) --> 1 y 100 sin incluir ambos limites y con decimales
        *  (int)(Math.random()*(max(100)-min(1)+1)-min(1)) -->; 1 y 100 inclyendo ambos limites y enteros
        * */

        /*
        Tablas de Multiplicar del 1 al 10
        */

        int mdo = 0;
        int mdor = 0;
        int resultado=0;

        for(int i=1;i<=10;i=i+1) {
            System.out.println( "Tabla de Multiplicar del " + "N° " + i );
            System.out.println( " " );
            System.out.println( "Mdo Por Mdor Igual Rsdo" );
            System.out.println( " " );
            for (int j=1;j<=10;j=j+1) {
                resultado = i * j;
                System.out.println(" "+ i + " " + " *   " + j + "     =     " + resultado );
            }
            System.out.println(" ");
        }



    }






}