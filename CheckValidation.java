import java.util.Arrays;

public class CheckValidation {
    public static void main(String[] args){
        String name = "michael";
        String nickName = "ichbeml";

        if(checkValidation(name, nickName)){
            System.out.println("We found the valid answer");
        }else
            System.out.println("Invalid");
    }

    public static boolean checkValidation(String name, String nickName){
        if(name.length() != nickName.length()){
            return false;
        }

        int[] validations = new int[26];

        for(int i=0; i<name.length(); i++){
            char individualCharName = name.charAt(i);
            char individualCharNickName = nickName.charAt(i);
            validations[individualCharName - 'a'] += 1;
            validations[individualCharNickName - 'a'] -= 1;
        }
        System.out.println(Arrays.toString(validations));
        for(int i: validations){
            if(i!=0)
                return false;
        }
        return true;
    }
}
