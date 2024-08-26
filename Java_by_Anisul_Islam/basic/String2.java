public class String2 {
    public static void main(String[] args) {
        String firstName = "Naimul";
        String lastName = "Hoque";

        // string concatenates
        String fullName = firstName + " " + lastName;
        System.out.println("FullName = " + fullName);

        // concat() method
        firstName = "Sumi";
        lastName = " Akter";
        String concatenatFullName = firstName.concat(lastName);
        System.out.println("fullname = " + concatenatFullName);

        String name = "Raiyan Jannat";
        String upperCase = name.toUpperCase();
        System.out.println("Upper Case: " + upperCase);

        String lowerCase = name.toLowerCase();
        System.out.println("Lower Case: " + lowerCase);

        // startWith method
        // endWith method

        String str1 = "This_is_my country";
        System.out.println(str1);

        String str2 = str1.replace('i', 'j');
        System.out.println(str2);

        String[] str3 = str1.split("_");
        for (String x : str3) {
            System.out.println(x);
        }

    }
}
