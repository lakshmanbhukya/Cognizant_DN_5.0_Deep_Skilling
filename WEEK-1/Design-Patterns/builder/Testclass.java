package org.example.builder;

public class Testclass {
    public static void main(String[] args) {

        Computer home=new Computer.Builder("ryzen 5","8gb")
                .build();
        Computer gaming=new Computer.Builder("ryzen 7","32 gb")
                .disk("512 gb")
                .gpu(" rtx 3070")
                .haswifi(true).
                build();
        Computer  office=new Computer.Builder("intel i7","16 gb")
                .disk("512 gb")
                .haswifi(true)
                .build();

        System.out.println("Home Computer ");
        System.out.println(home);
        System.out.println("Gaming Computer");
        System.out.println(gaming);
        System.out.println("Office Computer");
        System.out.println(office);

    }

}
