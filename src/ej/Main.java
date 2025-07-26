package ej;

public class Main {
    public static void main(String[] args) {
        MajeurOuPas(12);
    }
    public static void MajeurOuPas(final int age){
        if(age>=18) {
        System.out.println("la personne a " + age + " ans, elle est donc majeure");}
        else if(age<= 12) {
        System.out.println("La personne a " + age + " ans, elle est très jeune");}
        else if(age> 12 && age< 18) {
        System.out.println("La personne a " + age + " ans, elle est donc une adolescente");}

    }









}








