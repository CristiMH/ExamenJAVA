package edu.step.conversion;

import java.util.Scanner;

public class CurrencyConverter {
    public double convertToEur(double Eur, double rata)
    {
        return Eur * rata;
    }
    public double convertToLei(double Lei, double rata){
        return Lei / rata;
    }

    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti suma EUR: ");
        double eur = scanner.nextDouble();
        System.out.print("Introduceti rata de conversie din Eur in Lei: ");
        double rataEur = scanner.nextDouble();
        double ResultEurToLei = convertToEur(eur, rataEur);
        System.out.println(eur + " = " + ResultEurToLei + " Lei ");

        System.out.print("Introduceti suma Lei: ");
        double lei = scanner.nextDouble();
        System.out.print("Introduceti rata de conversie din Lei in Eur: ");
        double rataLei = scanner.nextDouble();
        double ResultLeiToEur = convertToLei(lei, rataLei);
        System.out.println(lei + " = " + ResultLeiToEur + " Eur ");
    }

    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        currencyConverter.Input();
    }
}
