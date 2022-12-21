
package com.mycompany.farmacy;

public class Farmacia {
    String nombre="null" , dirre="null", dniFarmacia="null" , tel="null",adm="null";
    String nombre2="null" , dirre2="null", dniFarmacia2="null" , tel2="null",adm2="null";
    String nombre3="null" , dirre3="null", dniFarmacia3="null" , tel3="null",adm3="null";
    
    public Farmacia(String nombre, String dirre,String dniFarmacia, String tel,String adm,String nombre2, String dirre2,String dniFarmacia2, String tel2,String adm2,String nombre3, String dirre3, String dniFarmacia3, String tel3,String adm3){
        this.nombre = nombre;
        this.dirre = dirre;
        this.dniFarmacia = dniFarmacia;
        this.tel = tel;
        this.adm = adm;
        this.nombre2 = nombre2;
        this.dirre2 = dirre2;
        this.dniFarmacia2 = dniFarmacia2;
        this.tel2 = tel2;
        this.adm2 = adm2;
        this.nombre3 = nombre3;
        this.dirre3 = dirre3;
        this.dniFarmacia3 = dniFarmacia3;
        this.tel3 = tel3;
        this.adm3 = adm3;

    }
    public Farmacia(String nombre3, String dirre3,String dniFarmacia3, String tel3,String adm3){
        this.nombre3 = nombre3;
        this.dirre3 = dirre3;
        this.dniFarmacia3 = dniFarmacia3;
        this.tel3 = tel;
        this.adm3 = adm3;
    }   
   
    void mostrarFarmacia(){
        System.out.println("Farmacia1: "+nombre+" Dirrecion1: "+dirre+" Dni1: "+dniFarmacia+" Tel1: "+tel+" Adm1: "+adm);
        System.out.println("Farmacia2: "+nombre2+" Dirrecion2: "+dirre2+" Dni2: "+dniFarmacia2+" Tel2: "+tel2+" Adm2: "+adm2);
        System.out.println("Farmacia3: "+nombre3+" Dirrecion3: "+dirre3+" Dni3: "+dniFarmacia3+" Tel3: "+tel3+" Adm3: "+adm3);
    }
   
}