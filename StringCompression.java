//Compress "aaabbcccdd" to "a3b2c3d2"
public class Main
    { 
        public static String String_Compression(String str) {
            String newstr = "";
           for(int i=0;i<str.length();i++) {
               Integer count=1;
               //for comparison
               while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
               }
           newstr+=str.charAt(i);
           if(count>1) { //for checking repetition
               newstr+=count.toString();
           } 
               }
       
            return newstr;
        }
        public static void main(String [] args) {
            String newstr="aaabbcccdd";
            System.out.println(String_Compression(newstr));
        } 
}