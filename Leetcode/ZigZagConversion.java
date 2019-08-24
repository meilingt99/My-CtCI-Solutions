class ZigZagConversion {
    public static String convert(String s, int numRows) {
        String convString = "";
        int inc1;
        int inc2;
        for(int i = 1; i <= numRows; i++){
            if(i == 1 || i == numRows ){
                for( int j = i; j <= s.length(); j += (numRows-1)*2 ){
                    convString = convString + s.substring(j-1,j);
                }
            }
            else {
                inc1 = (numRows - i) * 2;
                inc2 = ((numRows-1) - inc1/2) * 2;
                convString = convString + s.substring(i-1,i);
                for( int j = (i+inc1); j <= s.length(); j += (numRows-1)*2) {
                    convString = convString + s.substring(j-1,j);
                    if( j + inc2 <= s.length() ){
                        convString = convString + s.substring(j+inc2-1,j+inc2);
                    }
                }
            }
        }
        return convString;
    }
    
    public static void main( String[] args ){
        System.out.println(convert("PAYPALISHIRING",3));
    }
}