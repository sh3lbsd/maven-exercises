public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String s) {
        String output = "";
        CharSequence input = null;
//        if (s.equals("")) {
//            return "";
//        } else {
//            return "444";
//        }

        return s;


//        for (int i = 0; i < input.length(); i +=1) {
//            if(Character.toLowerCase(input.charAt(i)) == 'a') {
//                output += 4;
//            } else if (Character.toLowerCase(input.charAt(i) == 'e') {
//                output += 3;
//            }else if (Character.toLowerCase(input.charAt(i) == 'i')
//                output += 1;
//            }else if (Character.toLowerCase(input.charAt(i) == 'o')
//                output += 0;
//            } else if (Character.toLowerCase(input.charAt(i) == 'u')
//                output += 9;
//            } else {
//                output+= input.charAt(i);
//            }
//        switch ((Character.toLowerCase(input.charAt(i))

    }
    public static boolean checkPassword(String hashed, String orig) {
        return hashed.equals(hashPassword(orig));
    }
}