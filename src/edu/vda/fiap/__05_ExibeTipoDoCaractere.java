package edu.vda.fiap;

import java.util.Scanner;

public class __05_ExibeTipoDoCaractere {
    public static void main(String[] args) {


        Scanner leitor = new Scanner(System.in);

        String entradaDoUusuario;

        System.out.println("Informe uma letra: ");

        entradaDoUusuario = leitor.nextLine();

        switch (entradaDoUusuario) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("dígito");
                break;
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Vogal minúscula");
                break;

            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("Vogal maiúscula");
                break;

            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println("consoante minúscula ");
                break;
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "T":
            case "V":
            case "W":
            case "X":
            case "Y":
            case "Z":
                System.out.println("consoante maiúscula");
                break;

            default:
                System.out.println("caractere especial");
        }
    }
}
