import java.util.*;
public class Random_Password {
    public static void main(String args[]) {
        String pass=genPass(8,16);
        System.out.println("Random Password : "+pass);
    }

    static String genPass(int min, int max){
        Random random=new Random();
        String upper="QWERTYUIOPASDFGHJKLZXCVBNM";
        String lower="qwertyuiopasdfghjklzxcvbnm";
        String number="1234567890";
        String special="!@#$%^&*(){}?";
        String all=upper+lower+number+special;
        List<Character> letterslist=new ArrayList<Character>();
        for(char c: all.toCharArray()){
            letterslist.add(c);
        }
        Collections.shuffle(letterslist);
        String pass="";
        for(int i=random.nextInt(max-min)+min;i>0;--i){
            pass+=letterslist.get(random.nextInt(letterslist.size()));
        }
        return pass;
    }
}
