package projeto_13_08;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luiz
 */
public class projeto_13_08 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        
        try{
            
        String [] vetor = sc.nextLine().split("  ");
        int posicao =sc.nextInt();
        System.out.println(vetor[posicao]);
        
        }catch(InputMismatchException e){
            System.out.println("tente de novo vacilao");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("tenta mais vacilao");
        }
            System.out.println("fim");
        }
}
