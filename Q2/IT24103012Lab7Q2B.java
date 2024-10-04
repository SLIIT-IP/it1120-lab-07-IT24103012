package org.example;



class IT24103012lab7Q2B{
    public static void main(String[] args) {
        int number=1;

        

        for (int j = 1; j <=5; j++) {
            System.out.print(number+" - ");
            for (int i = 0; i < j; i++) {
               System.out.print(" * ");
            }
            System.out.println();
            number++;
        }


      
    }
}