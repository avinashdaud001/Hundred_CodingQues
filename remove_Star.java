public class remove_Star {

        public static String removeStars(String s) {
            if (s == null || s.length() == 0) return s;

            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (c == '*' && sb.length() != 0) {
                    sb.deleteCharAt(sb.length() - 1);
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        String s="leet***co*de";
                System.out.println(removeStars(s));
    }
    }



