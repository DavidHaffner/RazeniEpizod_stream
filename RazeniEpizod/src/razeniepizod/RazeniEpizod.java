/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package razeniepizod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ShangTzu
 */
public class RazeniEpizod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // úvodní vstup
        List<String> seznamEpizod = Arrays.asList("1x04", "02x10", "02x4", "5x8");

        // seřazení listu pomocí 1 streamu (předp. -> seriál nemá více jak 9 sérií)
        List<String> serazenySeznam = seznamEpizod.stream().filter(string -> !string.isEmpty())
                .map(string -> string.startsWith("0") ? string : "0" + string)
                .map(string -> string.length() <5 ? string.replaceAll("x", "x0") : string)
                .sorted().collect(Collectors.toList());
        serazenySeznam.forEach(System.out::println);
        //seznamEpizod.stream().filter(string -> !string.isEmpty()).sorted().forEach(System.out::println);
        
    }
}
