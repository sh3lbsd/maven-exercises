public class CodeupCrypt {
    public static double version;

    public static String hashPassword(String s) {
//        if (s.equals("")) {
//            return "";
//        } else {
//            return "444";
//        }

//        return s;

        String output = "";
        for (int i = 0; i < input.length(); i +=1) {
            if(Character.toLowerCase(input.charAt(i)) == 'a') {
                output += 4;
            }else {
                output+= input.charAt(i);
            }
        }
        return output;
    }
}
