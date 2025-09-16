package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        // Importar o Scanner - Leitura do Teclado
        Scanner input = new Scanner(System.in);

        // Declarar as variáveis
        int segundosMusica, minutosMusica, segundosTotaisAlbum = 0;

        // Ler duração das músicas
        System.out.print("Insira os minutos da 1º música:");
        minutosMusica = input.nextInt();

        System.out.print("Insira os segundos da 1º música:");
        segundosMusica = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosMusica * 60) + segundosMusica;


        System.out.print("Insira os minutos da 2º música:");
        minutosMusica = input.nextInt();

        System.out.print("Insira os segundos da 2º música:");
        segundosMusica = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosMusica * 60) + segundosMusica;


        System.out.print("Insira os minutos da 3º música:");
        minutosMusica = input.nextInt();

        System.out.print("Insira os segundos da 3º música:");
        segundosMusica = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosMusica * 60) + segundosMusica;


        System.out.print("Insira os minutos da 4º música:");
        minutosMusica = input.nextInt();

        System.out.print("Insira os segundos da 4º música:");
        segundosMusica = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosMusica * 60) + segundosMusica;


        System.out.print("Insira os minutos da 5º música:");
        minutosMusica = input.nextInt();

        System.out.print("Insira os segundos da 5º música:");
        segundosMusica = input.nextInt();

        segundosTotaisAlbum = segundosTotaisAlbum + (minutosMusica * 60) + segundosMusica;

        // System.out.println("Segundos Totais: "+segundosTotaisAlbum);

        int horas, minutos, segundos;

        horas = segundosTotaisAlbum / 3600;


        minutos = (segundosTotaisAlbum / 60) - (horas * 60);



        segundos = segundosTotaisAlbum - (horas * 3600) - (minutos * 60);


        System.out.println("Total: " + horas + "h " + minutos + "m " + segundos + "s");


    }
}
