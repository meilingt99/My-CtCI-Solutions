public class RomanToInt {
    public static int romanToInt(String s) {
        char prev = '0';
        int sum = 0;
        char c;
        for(int i = s.length() - 1; i >= 0; i--){
            c = s.charAt(i);
            switch(c) {
                case 'I':
                    if(prev == 'V' || prev == 'X'){
                       sum -= 1;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if(prev == 'L' || prev == 'C'){
                       sum -= 10;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if(prev == 'D' || prev == 'M'){
                       sum -= 100;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    break;
        }
        prev = c;
    }
    return sum;
}

public static void main(String[] args){
    System.out.println(romanToInt("XIV"));
}
}