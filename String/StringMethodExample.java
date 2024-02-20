/**
 * toLowerCase()
 * toUpperCase()
 * charAt()
 * concat()
 * contains()
 * contentEquals()
 * copyValueOf()
 */

class StringMethodExample{
    public static void main(String s[]){
        String name ="Mahaveer";
        String surname = new String("Surname");
        String fullName = name.concat(surname);
        System.out.println(name.toLowerCase());
        System.out.println(surname.toUpperCase());
        System.out.println(fullName);
    }
}