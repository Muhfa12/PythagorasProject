/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;
/**
 *
 * @author Lzer0
 */
public class PythagorasProject {
    public static void main(String[] args) {
        int menu;
        double hipotenusa, sisi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("               Menu                ");
        System.out.println("1. Cek Triple Pythagoras           ");
        System.out.println("2. Menentukan Sisi Miring Segitiga ");
        System.out.println("3. Menentukan Sisi Siku - Siku     ");
        System.out.println("4. Exit                            ");
        System.out.println("                                 \n");
        
        System.out.print("Silahkan Memilih : ");
        menu = scanner.nextInt();
         switch(menu) {
            case(1):
                System.out.print("Sisi a      : ");
                int sisi1 = scanner.nextInt();
                System.out.print("Sisi b      : ");
                int sisi2 = scanner.nextInt();
                System.out.print("Sisi miring : ");
                int sisiMiring = scanner.nextInt();
                if(Math.pow(sisi1, 2) + Math.pow(sisi2, 2) == Math.pow(sisiMiring, 2)) {
                    System.out.println("\nKetiga angka tersebut termasuk dalam triple pythagoras");
                }
                else {
                    System.out.println("\nKetiga angka tersebut bukan termasuk dalam triple pythagoras");
                }
                break;
            case(2):
                System.out.print("Sisi a : ");
                sisi1 = scanner.nextInt();
                System.out.print("Sisi b : ");
                sisi2 = scanner.nextInt();
                hipotenusa = Math.sqrt(Math.pow(sisi1, 2)+ Math.pow(sisi2, 2));
                System.out.println("\nSisi miring dari segitiga tersebut adalah : " + hipotenusa);
                break;
            case(3):
                System.out.print("Sisi a atau b : ");
                sisi1 = scanner.nextInt();
                System.out.print("Sisi miring   : ");
                int sisi3 = scanner.nextInt();
                sisi = Math.sqrt(Math.pow(sisi3, 2) - Math.pow(sisi1, 2));
                System.out.println("\nSisi a atau b dari segitiga tersebut adalah : " + sisi);
                break;
            case(4):
                System.exit(0);
            default:
                System.out.println("Erorr, silakan ulangi");
        }
    }
    
}
