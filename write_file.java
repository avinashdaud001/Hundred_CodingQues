import java.io.*;

  class file {
    public static void main(String[] args)   {
        try{
            FileWriter v=new FileWriter("C:\\Users\\Desktop\\avi.txt");
            try{
                v.write("hello avi how are you ");


            }

            finally{
                v.close();
            }
        }

        catch(IOException i){
            System.out.println(i);
        }
    }
}
