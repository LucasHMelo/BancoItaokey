/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoitaokey;

/**
 *
 * @author Joyce
 */
public class Criptografia {

    public String criptografa(int chave, String realPass) {
        StringBuilder newPass = new StringBuilder();
        int textSize = realPass.length();
        for (int i = 0; i < textSize; i++) {
            int letraCifradaASCII = ((int) realPass.charAt(i)) + chave;
            while (letraCifradaASCII > 126) {
                letraCifradaASCII -= 94;
            }
            newPass.append((char) letraCifradaASCII);
        }
        return newPass.toString();
    }

    public String descriptografa(int chave, String textoCifrado) {
        StringBuilder realPass = new StringBuilder();
        int textSize = textoCifrado.length();
        for (int i = 0; i < textSize; i++) {
            int letraDecifradaASCII = ((int) textoCifrado.charAt(i)) - chave;
            while (letraDecifradaASCII < 32) {
                letraDecifradaASCII += 94;
            }
            realPass.append((char) letraDecifradaASCII);
        }
        return realPass.toString();
    }
}
