/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_modul5_kel18;
import java.util.Scanner;
import userService.userService;

public class Tugas_modul5_kel18 {

    
    public static void main(String[] args) {
        String email, password;

        Scanner input = new Scanner(System.in);
        System.out.print("Email : ");
        email = input.nextLine();
        System.out.print("Password : ");
        password = input.nextLine();

        userService satu = new userService( email, password );
        satu.login();
        
    }
    
}
