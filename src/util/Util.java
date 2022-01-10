package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Util {

    public static String readTextFromUser() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static int readWholeNumberFromUser() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static float readDecimalNumberFromUser() {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        try {
            return Float.parseFloat(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * Transformar número para Moeda com formatação local e decimal com vírgula
     * @param number número que equivale ao valor em dinheiro
     * @return número formatado para moeda local com decimal e vírgula
     */
    public static String formatCurrency(float number) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String formatedcurrency = formatter.format(number);
        return formatedcurrency;
    }
}
