public class HM4 {
    public static void main(String[] args) {

        String str1 = new String("abc, abdc abcd qwertyabc");
        String str2 = new String("abc");
        int count = 0, i = 0;
        while(i < str1.length()){
            if (str1.indexOf(str2, i) != -1){
                count++;
                i = str1.indexOf(str2, i) + 1;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}