public class ValidWords_in {

        public int countValidWords(String sentence) {
            String[] str = sentence.split(" ");
            int count = 0;
            int beeper = 0;
            int hyphen_count = 0;

            for(int i=0 ; i < str.length ; i++)
            {
                for(int j=0 ; j < str[i].length() ; j++)
                {
                    if(str[i].charAt(j) == '!' || str[i].charAt(j) == ',' || str[i].charAt(j) == '.')
                    {
                        if(j != str[i].length()-1)
                        {
                            beeper = 1;
                        }
                    }
                    if(str[i].charAt(j) == '-')
                    {
                        hyphen_count++;

                        if(hyphen_count > 1)
                        {
                            beeper = 1;
                        }
                        if(j == 0 || j == str[i].length()-1)
                        {
                            beeper = 1;
                        }
                        if(j == str[i].length()-2 )
                        {
                            if(str[i].charAt(str[i].length()-1) == '!' || str[i].charAt(str[i].length()-1) == ',' || str[i].charAt(str[i].length()-1) == '.')
                            {
                                beeper = 1;
                            }
                        }
                    }
                    if(Character.isDigit(str[i].charAt(j)))
                    {
                        beeper = 1;
                    }
                    if(j == str[i].length()-1 && beeper == 0)
                    {
                        count++;
                    }
                }
                if (beeper == 1)
                {
                    beeper = 0;
                }
                hyphen_count = 0;
            }
            return count;
        }

    public static void main(String[] args) {
        String v=" cat and dog";
        ValidWords_in o=new ValidWords_in();
        System.out.println(o.countValidWords(v));
    }

    }


