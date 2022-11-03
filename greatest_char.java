public class greatest_char {
    static int Search(char c[],int t){
        int start=0;
        int end=c.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(t<c[mid]){
                end=mid;
            }
            else if(t>c[mid]){
                start=mid;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        char c[]={'c','f','j'};
        char target='f';
        System.out.println(Search(c,target));
    }
}
