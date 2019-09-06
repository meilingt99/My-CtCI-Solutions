import java.util.*;
class CountAndSay {
    
    public static String countAndSay(int n) {
        if(n == 1){
            return "1";
        } 
        else {
            int count = 1;
            String casN = countAndSay(n-1);
            String curr = casN.substring(0,1);
            String newS = "";
            for(int i = 1; i < casN.length(); i++){
                if(!casN.substring(i,i+1).equals(curr)){
                    newS = newS + Integer.toString(count) + curr;
                    curr = casN.substring(i,i+1);
                    count = 1;
                } else {
                    count++;
                }
            }
            newS = newS + Integer.toString(count) + curr;
            return newS;
        }
    }
    
    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        System.out.println(countAndSay(in.nextInt()));
    }
}