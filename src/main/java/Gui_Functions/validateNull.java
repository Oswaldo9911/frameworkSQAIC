/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui_Functions;

/**
 *
 * @author SQA
 */
public class validateNull {

    /**
     * Metodo que permite validar que el elemento envido tenga algun valor
     *
     * @param valor en este parametro debe enviar un String para validar que si
     * hay algo en esa variable y no un null
     * @return
     * @throws java.lang.Exception
     */
    public String validateNull(String valor) throws Exception {
        String answer = "";
        if (valor == null) {
            return "Error";
        } else {
            answer = valor.toString();
        }
        return answer;
    }
}
