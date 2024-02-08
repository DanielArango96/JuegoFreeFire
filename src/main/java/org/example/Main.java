package org.example;


import java.util.Random;
import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    String nickName;
    String nickNameBD = "Daniel96";
    String password;
    String passwordBD = "Daniel123";
    Integer nivelVida = 70;
    Integer contadorSkills = 0;
    Integer contadorDisparos = 0;
    Integer precioSkillVida = 100000;
    Integer danoDisparo = -5;
    boolean estaMuerto=false;

    String juego1 = "Free Fire";
    String juego2 = "Fifa 24";
    String juegoSeleccionado;
    Scanner lea = new Scanner(System.in);


    //Proceso
    System.out.println("***********Ingresando**********");
    System.out.println("*****Bienvenido******");


    System.out.println("Digita tu nickName:");
    nickName = lea.nextLine();

    System.out.println("Digita tu password:");
    password = lea.nextLine();

    //Rutina para verificar el perfil

    if (nickName.equals(nickNameBD) && password.equals(passwordBD)) {
      System.out.println("Bienvenido a PSPLUS" + nickName);
      //Rutina para iniciar el juego
      System.out.println("Seleccione un juego");
      juegoSeleccionado = lea.nextLine();
      if (juegoSeleccionado.equals(juego1)) {

        do {
           Random random=new Random();
          int disparo=random.nextInt(2);

          if (disparo==1){
            contadorDisparos=contadorDisparos+1;
            nivelVida=nivelVida+danoDisparo;
            System.out.println("te dispararon, tu vida quedo en:"+nivelVida);
            if (nivelVida==0){
              estaMuerto=true;
              break;
            }

          } else {
            System.out.println("Esquivo la bala");
            contadorDisparos=0;
          }

        } while (estaMuerto==false);
        System.out.println("Estas muerto!!!");


      } else{
        System.out.println("servidores no disponibles");
      }
      }else {
      System.out.println("nickName o password incorrectos");
    }


  }
}

