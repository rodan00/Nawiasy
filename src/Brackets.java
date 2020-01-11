
public class Brackets {

    public static void main(String[] args) {
        int sum=0;
        String znak;
        String text;

        text="A)(ooooo(o))ooo(oooooooo(ooooooooooooooooo(oooooooooooooo(ooo)oooooo)oooooZ";

        for(int i=0; i<text.length();i++){
            znak= text.charAt(i)+"";
            if (znak.equals( "(" )) { sum++;}
            else if (znak.equals( ")" )) {sum--;}

            //System.out.println(znak+" - "+sum);
            if (sum<0) {System.out.println("Błąd na pozycji "+ i);}
        }
        if (sum!=0){ System.out.println("Błąd: nierówna ilość otwierających i zamkajacych");}
        else {System.out.println(" Nawiasy poprawne");}
    }
}
