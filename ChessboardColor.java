public class ChessboardColor {
    public boolean squareIsWhite(String coordinates) {
        if(coordinates.charAt(0) == 'a' || coordinates.charAt(0) == 'c' || coordinates.charAt(0) == 'e' || coordinates.charAt(0) == 'g'){
            char ch = coordinates.charAt(1);
            int num = Character.getNumericValue(ch);
            if(num%2 == 0){
                return true;
            }else{
                return false;
            }
        }else{
            char ch = coordinates.charAt(1);
            int num = Character.getNumericValue(ch);
            if(num%2 == 0){
                return false;
            }else{
                return true;
            }
        }
    }
}
