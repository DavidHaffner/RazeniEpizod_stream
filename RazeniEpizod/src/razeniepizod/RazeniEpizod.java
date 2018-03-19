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
        List<String> seznamEpizod = Arrays.asList("Serial S01E06", "Serial S01E02", "Serial S01E03",
                "Serial S01E05", "Serial S01E01", "Serial S01E04");

        // seřazení listu pomocí 1 streamu
        List<String> serazenySeznam = seznamEpizod.stream().filter(string -> !string.isEmpty())
                .sorted().collect(Collectors.toList());
        serazenySeznam.forEach(System.out::println);
        //seznamEpizod.stream().filter(string -> !string.isEmpty()).sorted().forEach(System.out::println);
        
    }
}
