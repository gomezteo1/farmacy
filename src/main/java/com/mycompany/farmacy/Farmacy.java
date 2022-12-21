/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.farmacy;

import java.util.*;
import java.util.Scanner;

public class Farmacy { //clase para el ejercicio el ejercicio Negocio
    
    static int a,b,c,k=0,fu,fd,ft,sumaFarmaciaUno,sumaFarmaciaDos,sumaFarmaciaTres;
    static int opc, opc1,opc2,opc3,opc5,opc6,contador=1;
    static double CompraFarmacia=0,diaCompraFarmacia,indice,buscar;
    static double farmaciaUnoMaxVen,farmaciaUnoMinVen,farmaciaDosMaxVen;
    static double farmaciaDosMinVen,farmaciaTresMaxVen,farmaciaTresMinVen ; 
    static double[] farmaciaUno = new double[28];
    static double[] farmaciaDos = new double[28];
    static double[] farmaciaTres= new double[28];   
    static String arrayMesDia[]={"1Lunes","2Martes","3Miercoles","4Jueves","5Viernes","6Sabado","7Domingo","8Lunes","9Martes","10Miercoles","11Jueves","12Viernes","13Sabado","14Domingo","15Lunes","16Martes","17Miercoles","18Jueves","19Viernes","20Sabado","21Domingo","22Lunes","23Martes","24Miercoles","25Jueves","26Viernes","27Sabado","28Domingo"};
    static String arrayDiaAseo[]={"1 Lunes","2 Martes","3 Miercoles","4 Jueves","5 Viernes","6 Sabado","7 Domingo"};
    
    static String trabaFarmaciaUno[]={"Maria","Dennis","Sailor","Carlos","Peniche","Clauss","Xiomara"};
    static String trabaFarmaciaDos[]={"Miguel","Dairon","Siron","Camilo","Pedro","Carla","Xion"};
    static String trabaFarmaciaTres[]={"Mario","Daniel","Siomar","Caliche","Puma","Catalina","Xjion"};
    
    public static void main(String[]args){
       //algoritmo para generar las ventas
        Scanner entrada = new Scanner(System.in);
        System.out.println("|------------------------------------------------------|");
        System.out.println("|* Bienvenido al menu de información de las farmacias *|");
        System.out.println("|------------------------------------------------------|");
        for(a=0;a<farmaciaUno.length;a++){
            CompraFarmacia=Math.random();
            CompraFarmacia=Math.round(CompraFarmacia*100);
            farmaciaUno[a]= CompraFarmacia;
        }
        for(a=0;a<farmaciaDos.length;a++){
            CompraFarmacia=Math.random();
            CompraFarmacia=Math.round(CompraFarmacia*100);
            farmaciaDos[a]= CompraFarmacia;
        }
        for(a=0;a<farmaciaTres.length;a++){
            CompraFarmacia=Math.random();
            CompraFarmacia=Math.round(CompraFarmacia*100);
            farmaciaTres[a]= CompraFarmacia;
        }
        do{
            System.out.println("|------------------------------------------------|");
            System.out.println("|               Farmacia Paracetamol             |");
            System.out.println("|------------------------------------------------|");
            System.out.println("|1.Menu información ventas                       |");
            System.out.println("|2.Menu orden empleados aseo desc                |");
            System.out.println("|3.Menu orden ventas farmacias asc               |");
            System.out.println("|4.Registrar informacion complementaria farmacias|");
            System.out.println("|5.Menu buscar compra en la farmacias            |");
            System.out.println("|6.Menu ventas iguales entre farmacias           |");
            System.out.println("|7.Tope de la compra farmacias                   |");
            System.out.println("|8.Compra minima farmacia                        |");
            System.out.println("|9.Compra diaria farmacia                        |");
            System.out.println("|10.Mostrar el acomulado entre las tres farmacias|");
            System.out.println("|0.Salir                                         |");
            System.out.println("|------------------------------------------------|");
            System.out.println("|Seleccione una opción en el menu:                |");
            //Menu que llama a los metodos de la clase
            
            opc = entrada.nextInt();//
            switch(opc){
                case 1 ->{
                do{     
                        System.out.println("                                                  ");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|     Farmacia Paracetamo(informacion ventas)    |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|1.Información de ventas farmacia 1              |");
                        System.out.println("|3.Información de ventas farmacia 2              |");
                        System.out.println("|3.Información de ventas farmacia 3              |");
                        System.out.println("|4.Volver al menu                                |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|Seleccione una opción menu infor de ventas:     |");
                         //metodo 1 que llama al segundo menu
                        opc1 = entrada.nextInt();//
                        switch(opc1){
                            case 1 -> mostrarInformacion1();
                            case 2 -> mostrarInformacion2();
                            case 3 -> mostrarInformacion3();
                            case 4 -> System.out.println("Se vuelve al menu");
                            default -> {
                                System.out.println("la opcion ingresada no existe aún , por favor verificar");
                                System.out.println("O ponerse en contacto con un supervisor");
                            }
                        }       
                    }while (opc1 != 4);
                } 
                case 2 ->{
                    do{     
                        System.out.println("                                                  ");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|   Farmacia Paracetamo(Empleados Orden Aseo)    |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|1.Información de aseo farmacia 1                |");
                        System.out.println("|3.Información de aseo farmacia 2                |");
                        System.out.println("|3.Información de aseo farmacia 3                |");
                        System.out.println("|4.Volver al menu                                |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|Seleccione una opción menu orden aseo:    |");
                         //metodo 1 que llama al segundo menu
                        opc2 = entrada.nextInt();//
                        switch(opc2){
                            case 1 -> empleadosOrdenAseo1();
                            case 2 -> empleadosOrdenAseo2();
                            case 3 -> empleadosOrdenAseo3();
                            case 4 -> System.out.println("Se vuelve al menu");
                            default -> {
                                System.out.println("la opcion ingresada no existe aún , por favor verificar");
                                System.out.println("O ponerse en contacto con un supervisor");
                            }
                        }       
                    }while (opc2 != 4);
                } case 3 ->{
                    do{     
                        System.out.println("                                                  ");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|     Farmacia Paracetamo(Orden Ventas Asc)      |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|1.Información de ventas farmacia 1              |");
                        System.out.println("|2.Información de ventas farmacia 2              |");
                        System.out.println("|3.Información de ventas farmacia 3              |");
                        System.out.println("|4.Volver al menu                                |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|Seleccione una opción menu ventas ascendentes:    |");
                         //metodo 1 que llama al segundo menu
                        opc3 = entrada.nextInt();//
                        switch(opc3){
                            case 1 -> mostrarInformacionVentasAsc1();
                            case 2 -> mostrarInformacionVentasAsc2();
                            case 3 -> mostrarInformacionVentasAsc3();
                            case 4 -> System.out.println("Se vuelve al menu");
                            default -> {
                                System.out.println("la opcion ingresada no existe aún , por favor verificar");
                                System.out.println("O ponerse en contacto con un supervisor");
                            }
                        }       
                    }while (opc3 != 4);
                }case 4->{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Ingrese un nombre de farmacia uno: ");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese una dirrecion uno: ");
                    String dirre = sc.nextLine();
                    System.out.println("Ingrese un DNI de la Farmacia uno: ");
                    String dniFarmacia = sc.nextLine();
                    System.out.println("Ingrese un telefono de farmacia uno: ");
                    String tel = sc.nextLine();
                    System.out.println("Ingrese el primer administrador: ");
                    String adm = sc.nextLine();
                    System.out.println("Ingrese un nombre de farmacia dos: ");
                    String nombre2 = sc.nextLine();
                    System.out.println("Ingrese una dirrecion dos: ");
                    String dirre2 = sc.nextLine();
                    System.out.println("Ingrese un DNI de la Farmacia dos: ");
                    String dniFarmacia2 = sc.nextLine();
                    System.out.println("Ingrese el telefono dos: ");
                    String tel2 = sc.nextLine();
                    System.out.println("Ingrese el segundo administrador: ");
                    String adm2 = sc.nextLine();
                    System.out.println("Ingrese un nombre de farmacia tres: ");
                    String nombre3 = sc.nextLine();
                    System.out.println("Ingrese la tercera dirrecion: ");
                    String dirre3 = sc.nextLine();
                    System.out.println("Ingrese el tercer DNI de la Farmacia: ");
                    String dniFarmacia3 = sc.nextLine();
                    System.out.println("Ingrese el telefono tres: ");
                    String tel3 = sc.nextLine();
                    System.out.println("Ingrese el tercer administrador: ");
                    String adm3 = sc.nextLine();
                    Farmacia farmacia1 = new Farmacia(nombre,dirre,dniFarmacia,tel,adm,nombre2,dirre2,dniFarmacia2,tel2,adm2,nombre3,dirre3,dniFarmacia3,tel3,adm3);
                    farmacia1.mostrarFarmacia();
                    
                }    
                case 5->{
                    do{
                        System.out.println("                                                  ");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|        Farmacia Paracetamol(busqueda compra)   |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|1.Busqueda compra farmacia 1                    |");
                        System.out.println("|2.Busqueda compra farmacia 2                    |");
                        System.out.println("|3.Busqueda compra farmacia 3                    |");
                        System.out.println("|4.Volver al menu                                |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|Seleccione una opción menu ventas similares:    |");
                        //metodo 6 que llama al tercer menu
                        opc5 = entrada.nextInt();//

                        switch(opc5){
                            case 1 -> busquedaFarmacia1();
                            case 2 -> busquedaFarmacia2();
                            case 3 -> busquedaFarmacia3();
                            case 4 -> System.out.println("Se vuelve al menu");
                            default -> {
                                System.out.println("la opcion ingresada no existe aún , por favor verificar");
                                System.out.println("O ponerse en contacto con un supervisor");
                            }
                        }       
                    }while (opc5 != 4);
                }
                case 6 ->{
                    do{
                        System.out.println("                                                  ");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|        Farmacia Paracetamol(ventas similares   |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|1.Ventas iguales entre farmacias 1 y 2          |");
                        System.out.println("|2.Ventas iguales entre farmacias 2 y 3          |");
                        System.out.println("|3.Ventas iguales entre farmacias 3 y 1          |");
                        System.out.println("|4.Volver al menu                                         |");
                        System.out.println("|------------------------------------------------|");
                        System.out.println("|Seleccione una opción menu ventas similares:    |");
                        //metodo 6 que llama al tercer menu
                        opc6 = entrada.nextInt();//

                        switch(opc6){
                            case 1 -> ventasIguales1();
                            case 2 -> ventasIguales2();
                            case 3 -> ventasIguales3();
                            case 4 -> System.out.println("Se vuelve al menu");
                            default -> {
                                System.out.println("la opcion ingresada no existe aún , por favor verificar");
                                System.out.println("O ponerse en contacto con un supervisor");
                            }
                        }       
                    }while (opc6 != 4);
                }
                    
                case 7 -> topeCompraFarmacias();
                case 8 -> topeCompraMinimo();
                case 9 -> compraFarmaciaDia();
                case 10 -> acomuladoFarmacias();
                case 0-> System.out.println("Se cerro la aplicación, adios");
                default -> {
                    System.out.println("la opcion ingresada no existe :C , por favor verificar");
                    System.out.println("O ponerse en contacto con un supervisor");
                }
            }
        }while (opc != 0);
    }static void empleadosOrdenAseo1(){
        System.out.println("-----------------------------------------------"); 
        System.out.println("Los empleados ordenados para realizar los aseos farmacia uno:");
        Arrays.sort(trabaFarmaciaUno,Collections.reverseOrder());
        for(a=0;a<trabaFarmaciaUno.length;a++){
            System.out.println("el orden de empleados de la farmacia1 "+trabaFarmaciaUno[a]+",el día: "+arrayDiaAseo[a]);
        }
       System.out.println("-----------------------------------------------");
    }//cierre del metodo orden de empleados farmacia uno
    static void empleadosOrdenAseo2(){
        System.out.println("-----------------------------------------------"); System.out.println("-----------------------------------------------"); 
        System.out.println("Los empleados ordenados para realizar los aseos farmacia uno:");
        Arrays.sort(trabaFarmaciaDos,Collections.reverseOrder());
        for(a=0;a<trabaFarmaciaDos.length;a++){
            System.out.println("el orden de empleados de la farmacia uno "+trabaFarmaciaDos[a]+",el día: "+arrayDiaAseo[a]);
        }
        System.out.println("-----------------------------------------------"); 
    }//cierre del metodo orden de empleados
    static void empleadosOrdenAseo3(){
        System.out.println("-----------------------------------------------"); 
        System.out.println("Los empleados ordenados para realizar los aseos farmacia uno:");
        Arrays.sort(trabaFarmaciaTres,Collections.reverseOrder());
        for(a=0;a<trabaFarmaciaTres.length;a++){
            System.out.println("el orden de empleados de la farmacia uno "+trabaFarmaciaTres[a]+",el día: "+arrayDiaAseo[a]);
        }
        System.out.println("-----------------------------------------------"); 
    }//cierre del metodo orden de empleados de aseo farmacia 3
    static void busquedaFarmacia1(){
        System.out.println("-----------------------------------------------"); 
        System.out.println("Por favor ingresa un valor a buscar:");
        Arrays.sort(farmaciaUno);
        Scanner entrada = new Scanner(System.in);
        buscar = entrada.nextInt();//
        indice = Arrays.binarySearch(farmaciaUno,buscar);
        for(a=0;a<farmaciaUno.length;a++){
            if(buscar==indice){
                System.out.println(""+farmaciaUno[a]+", en la posicion: "+a);
            }else{
                contador +=1;
            }
        }
        if(contador>=farmaciaUno.length){
            System.out.println("no hay precios similares con tu busqueda registrados en el aplicativo");
        }
        System.out.println("-----------------------------------------------"); 
    }//cierre del metodo orden de empleados de aseo farmacia 3
    static void busquedaFarmacia2(){
        System.out.println("-----------------------------------------------"); 
        System.out.println("Por favor ingresa un valor a buscar:");
        Arrays.sort(farmaciaDos);
        Scanner entrada = new Scanner(System.in);
        buscar = entrada.nextInt();//
        indice = Arrays.binarySearch(farmaciaDos,buscar);
        for(a=0;a<farmaciaDos.length;a++){
            if(buscar==indice){
                System.out.println(""+farmaciaDos[a]+", en la posicion: "+a);
            }else{
                contador +=1;
            }
        }
        if(contador>=farmaciaUno.length){
            System.out.println("no hay precios similares con tu busqueda registrados en el aplicativo");
        }
        System.out.println("-----------------------------------------------"); 
    }//cierre del metodo orden de empleados de aseo farmacia 3
    static void busquedaFarmacia3(){
        System.out.println("-----------------------------------------------"); 
        System.out.println("Por favor ingresa un valor a buscar:");
        Arrays.sort(farmaciaTres);
        Scanner entrada = new Scanner(System.in);
        buscar = entrada.nextInt();//
        indice = Arrays.binarySearch(farmaciaTres,buscar);
        for(a=0;a<farmaciaTres.length;a++){
            if(buscar==indice){
                System.out.println(""+farmaciaTres[a]+", en la posicion: "+a);
            }else{
                contador +=1;
            }
        }
        if(contador>=farmaciaTres.length){
            System.out.println("no hay precios similares con tu busqueda registrados en el aplicativo");
        }
        System.out.println("-----------------------------------------------"); 
    }//cierre del metodo orden de empleados de aseo farmacia 3
    static void mostrarInformacion1(){
        System.out.println("-----------------------------------------------");
        System.out.println("*El acomulado de las ventas farmacia tres:      ");
        for(a=0;a<arrayMesDia.length;a++){
            System.out.print(arrayMesDia[a]+"  ");
        }
        System.out.println("");
        for(a=0;a<farmaciaTres.length;a++){
            System.out.print(farmaciaTres[a]+"\t   ");
        }
        System.out.println("-----------------------------------------------");
    }//cierre del metodo de la información en la farmacia uno
    static void mostrarInformacion2(){
        System.out.println("-----------------------------------------------");
        System.out.println("*El acomulado de las ventas farmacia dos:      ");
        for(a=0;a<arrayMesDia.length;a++){
            System.out.print(arrayMesDia[a]+"  ");
        }
        System.out.println("");
        for(a=0;a<farmaciaDos.length;a++){
            System.out.print(farmaciaDos[a]+"\t   ");
        }
        System.out.println("-----------------------------------------------");
    }//cierre del metodo de la información en la farmacia dos
    static void mostrarInformacion3(){
        System.out.println("------------------------------------------------");
        System.out.println("*El acomulado de las ventas farmacia tres:      ");
        for(a=0;a<arrayMesDia.length;a++){
            System.out.print(arrayMesDia[a]+"  ");
        }
        System.out.println("");
        for(a=0;a<farmaciaTres.length;a++){
            System.out.print(farmaciaTres[a]+"\t   ");
        }
        System.out.println("-----------------------------------------------");
    }//cierre del metodo de la información en la farmacia 3
    static void mostrarInformacionVentasAsc1(){
        System.out.println("-----------------------------------------------");
        System.out.println("*El acomulado de las ventas farmacia uno:      ");
        Arrays.sort(farmaciaUno);
        for(a=0;a<farmaciaUno.length;a++){
            System.out.println(farmaciaUno[a]);
        }
        System.out.println("");
        System.out.println("-----------------------------------------------");
    }//cierre del metodo de la información en la farmacia uno
    static void mostrarInformacionVentasAsc2(){
        System.out.println("-----------------------------------------------");
        System.out.println("*El acomulado de las ventas farmacia uno:      ");
        Arrays.sort(farmaciaDos);
        for(a=0;a<farmaciaDos.length;a++){
            System.out.println(farmaciaDos[a]);
        }
        System.out.println("");
        System.out.println("-----------------------------------------------");
    }//cierre del metodo de la información en la farmacia uno
    static void mostrarInformacionVentasAsc3(){
        System.out.println("-----------------------------------------------");
        System.out.println("*El acomulado de las ventas farmacia tres:      ");
        Arrays.sort(farmaciaTres);
        for(a=0;a<farmaciaTres.length;a++){
            System.out.println(farmaciaTres[a]);
        }
        System.out.println("");
        System.out.println("-----------------------------------------------");
    }//cierre del metodo de la información en la farmacia dos
    static void acomuladoFarmacias(){
        for(a=0;a<farmaciaUno.length;a++){
            sumaFarmaciaUno+=farmaciaUno[a];
        }
        System.out.println("EL acomulado de las ventas en la farmacia uno: "+sumaFarmaciaUno);
        System.out.println("-----------------------------------------------");
        
        for(a=0;a<farmaciaDos.length;a++){
            sumaFarmaciaDos+=farmaciaDos[a];
        }
        System.out.println("El acomulado de las ventas en la farmacia dos"+sumaFarmaciaDos);
        System.out.println("-----------------------------------------------");
        
        for(a=0;a<farmaciaTres.length;a++){
            sumaFarmaciaTres+=farmaciaTres[a];
        }
        System.out.println("El acomulado de las ventas en la farmacia tres"+sumaFarmaciaTres);
        System.out.println("-----------------------------------------------");
    }//cierre del metodo del acomulado en la farmacia
    static void compraFarmaciaDia(){
        System.out.println("-----------------------------------------------"); 
        System.out.println("El acomulado de ventas entre las tres farmacias en ese día:");
        for(a=0;a<arrayMesDia.length;a++){
            diaCompraFarmacia= farmaciaUno[a]+farmaciaDos[a]+farmaciaTres[a];
            System.out.println("el día "+arrayMesDia[a]+" las ventas fueron: "+diaCompraFarmacia);
        }
       System.out.println("-----------------------------------------------"); 
    }//cierre del metodo de las compras del día 
    static void ventasIguales1(){
        System.out.println("-----------------------------------------------"); 
        for (int a = 0; a < farmaciaUno.length - 1; a++) {
            for (int b = a+1; b < farmaciaUno.length; b++) {
                if ((farmaciaUno[b] == farmaciaUno[b]) ){
                    System.out.println("En el día "+arrayMesDia[a]+" es igual al día "+arrayMesDia[b]+" las ventas fueron similares: " + farmaciaUno[b]+" en la farmacia uno.");
                    k=1;
                }
            }
        }
        if(k==0){
            System.out.println("En la farmacia uno no hubo días con ventas similares.");
        }
        System.out.println("-----------------------------------------------"); 
        for (int a = 0; a < farmaciaDos.length - 1; a++) {
            for (int b = a+1; b < farmaciaDos.length; b++) {
                if ((farmaciaDos[a] == farmaciaDos[b]) ){
                    System.out.println("En el día"+arrayMesDia[a]+" es igual al día "+arrayMesDia[b]+" las ventas fueron similares: " + farmaciaDos[b]+" en la farmacia dos.");
                    k=1;
                }
            }
        }
        if(k==0){
            System.out.println("En la farmacia dos no hubo días con ventas similares.");
        }
        System.out.println("-----------------------------------------------"); 
    }//cierre del metodo de las ventas iguales de las farmacia uno y dos
    static void ventasIguales2(){
        System.out.println("-----------------------------------------------"); 
        for (int b = 0; b < farmaciaDos.length - 1; b++) {
            for (int c = b+1; c < farmaciaDos.length; c++) {
                if ((farmaciaUno[c] == farmaciaUno[c]) ){
                    System.out.println("En el día "+arrayMesDia[b]+" es igual al día "+arrayMesDia[c]+" las ventas fueron similares: " + farmaciaUno[c]+" en la farmacia dos.");
                    k=1;
                }
            }
        }
        if(k==0){
            System.out.println("En la farmacia dos no hubo días con ventas similares.");
        }
        System.out.println("-----------------------------------------------"); 
        for (int b = 0; b < farmaciaTres.length - 1; b++) {
            for (int c = b+1; c < farmaciaTres.length; c++) {
                if ((farmaciaTres[b] == farmaciaTres[c]) ){
                    System.out.println("En el día"+arrayMesDia[b]+" es igual al día "+arrayMesDia[c]+" las ventas fueron similares: " + farmaciaDos[c]+" en la farmacia tres.");
                    k=1;
                }
            }
        }
        if(k==0){
            System.out.println("En la farmacia tres no hubo días con ventas similares.");
        }
        System.out.println("-----------------------------------------------"); 
    }//cierre del metodo de las ventas iguales de las farmacias 2 y 3
    static void ventasIguales3(){
        System.out.println("-----------------------------------------------"); 
        for (int c = 0; c < farmaciaTres.length - 1; c++) {
            for (int a = c+1; a < farmaciaTres.length; a++) {
                if ((farmaciaTres[a] == farmaciaTres[a]) ){
                    System.out.println("En el día "+arrayMesDia[c]+" es igual al día "+arrayMesDia[a]+" las ventas fueron similares: " + farmaciaUno[a]+" en la farmacia tres.");
                    k=1;
                }
            }
        }
        if(k==0){
            System.out.println("En la farmacia uno no hubo días con ventas similares.");
        }
        System.out.println("-----------------------------------------------"); 
        for (int c = 0; c < farmaciaUno.length - 1; c++) {
            for (int a = c+1; a < farmaciaUno.length; a++) {
                if ((farmaciaUno[c] == farmaciaUno[a]) ){
                    System.out.println("En el día"+arrayMesDia[c]+" es igual al día "+arrayMesDia[a]+" las ventas fueron similares: " + farmaciaDos[a]+" en la farmacia uno.");
                    k=1;
                }
            }
        }
        if(k==0){
            System.out.println("En la farmacia uno no hubo días con ventas similares.");
        }
        System.out.println("-----------------------------------------------"); 
    }//cierre del metodo de las ventas iguales de las farmacias 3 y 1
    static void topeCompraFarmacias(){
        farmaciaUnoMaxVen=farmaciaUno[0];
        for (a = 0; a < farmaciaUno.length; a++) {
            if (farmaciaUno[a] >= farmaciaUnoMaxVen) {
                farmaciaUnoMaxVen = farmaciaUno[a];
                fu=a;
            }
        }
        System.out.println("El "+arrayMesDia[fu]+" hubo una venta maxima: "+farmaciaUnoMaxVen+" en la farmacia uno.");
        System.out.println("-----------------------------------------------");
        
        farmaciaDosMaxVen=farmaciaDos[0];
        for (a = 0; a < farmaciaDos.length; a++) {
            if (farmaciaDos[a] >= farmaciaDosMaxVen) {
                farmaciaDosMaxVen = farmaciaDos[a];
                fd=a;
            }
        }
        System.out.println("El "+arrayMesDia[fd]+" hubo una venta maxima: "+farmaciaDosMaxVen+" en la farmacia dos.");
        System.out.println("-----------------------------------------------");
        
        farmaciaTresMaxVen=farmaciaTres[0];
        for (a = 0; a < farmaciaTres.length; a++) {
            if (farmaciaTres[a] >= farmaciaTresMaxVen) {
                farmaciaTresMaxVen = farmaciaTres[a];
                ft=a;
            }
        }
        System.out.println("El "+arrayMesDia[ft]+" hubo una venta maxima: "+farmaciaTresMaxVen+" en la farmacia tres.");
        System.out.println("-----------------------------------------------");
    }//cierre del metodo tope de compras maximas de las sedes
    static void topeCompraMinimo(){
        farmaciaUnoMinVen=farmaciaUno[0];
        for (a = 0; a < farmaciaUno.length; a++) {
            if (farmaciaUno[a] <= farmaciaUnoMinVen) {
                farmaciaUnoMinVen = farmaciaUno[a];
                fu=a;
            }
        }
        System.out.println("El "+arrayMesDia[fu]+" - "+fu+" se registro la venta minima: "+farmaciaUnoMinVen+" en la farmacia uno.");
        System.out.println("-----------------------------------------------");
        
        farmaciaDosMinVen=farmaciaDos[0];
        for (a = 0; a < farmaciaDos.length; a++) {
            if (farmaciaDos[a] <= farmaciaDosMinVen) {
                farmaciaDosMinVen = farmaciaDos[a];
                fd=a;
            }
        }
       System.out.println("El "+arrayMesDia[fd]+" - "+fd+" se registro la venta minima: "+farmaciaDosMinVen+" en la farmacia dos.");
       System.out.println("-----------------------------------------------");
       
       farmaciaTresMinVen=farmaciaTres[0];
        for (a = 0; a < farmaciaTres.length; a++) {
            if (farmaciaTres[a] <= farmaciaTresMinVen) {
                farmaciaTresMinVen = farmaciaTres[a];
                ft=a;
            }
        }
       System.out.println("El "+arrayMesDia[ft]+" - "+ft+" se registro la venta minima: "+farmaciaTresMinVen+" en la farmacia tres.");
       System.out.println("-----------------------------------------------");
    }//cierre del metodo tope de compras minimas de las farmacias
}//cierre de la clase principal
