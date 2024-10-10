package string_methods_examples;

public class Main {
    public static void main(String[] args) {
        //String with constructor vs string literal
        String myFirstName = new String("Reed");
        String myLastName = "Jordan";
        String anotherName = new String("Reed");
        String anotherLastName = "Jordan";

        System.out.println(myFirstName == anotherName);
        //Says it's false
        System.out.println(myLastName == anotherLastName);
        //Says it's true

        //to compare two object, use .equals
        System.out.println(myFirstName.equals(anotherName));
        //Says it's true

        //String length
        System.out.println(myFirstName.length());

        //substring method
        //First two letters of my name
        //Counting starts at 0 and does not include the second number
        System.out.println(myFirstName.substring(0,2));

        //getting "d"
        System.out.println(myFirstName.substring(3,4));

        //indexOf- finds location of the first occurance of a letter
        System.out.println(myFirstName.indexOf("d"));

        //compareTo
        System.out.println(myFirstName.compareTo(anotherName));
        System.out.println("R".compareTo("d"));
        System.out.println("a".compareTo("A"));
    }
}
