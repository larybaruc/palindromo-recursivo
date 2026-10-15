/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindromo;

/**
 *
 * @author laryb
 */
public class Palindromo {
    // Aqui es donde se agrega la palabra para verificar que funciona correctamente
    public static void main(String[] args) {
        System.out.println(esPalindromo("reconocer"));
    }
    // se crea wrapper, toma la palabra y la convierte en minuscula para que despues retorne un true o false
    public static boolean esPalindromo(String palabra){
        palabra = palabra.toLowerCase();
        return esPalindromoRecursivo(palabra, 0, palabra.length() - 1);
    }
    // aqui se verifica si las letras coinciden o no, en caso de que sí, continua el proceso y en caso contrario se convierte a false
    // y retorna
    private static boolean esPalindromoRecursivo(String palabra, int inicio, int fin){
        // caso base: si mis indices se cruzan o chocan es un palindromo
        if (inicio >= fin){
            return true;
        }
        // caso base: si mis indices no coinciden no será un palindromo
        if (palabra.charAt(inicio) != palabra.charAt(fin)){
            return false;
        }
        return esPalindromoRecursivo(palabra, inicio + 1, fin - 1);
    }
}
