import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static Integer compareTriplets(List<Integer> a, List<Integer> b) {

        int res[]=new int[2];
        for(int x=0;x<=res.length;x++){
            for(int i=0;i<a.size();i++){
                for(int j=0;j<a.size();j++){
                    if(a.get(i)>b.get(j)){


                        return  res[0]=1;
                    }
                    if(a.get(i)<b.get(j)){
                        return res[1]=1;
                    }
                    else{
                        return null;
                    }
                }

            }
        }

        return null;
    }

}

  class  bhjh {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int bItem = Integer.parseInt(bTemp[i]);
            b.add(bItem);
        }

        List<Integer> result = Collections.singletonList(Result.compareTriplets(a, b));

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
