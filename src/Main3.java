

    import java.util.regex.Matcher;
import java.util.regex.Pattern;



    public class Main3 {
        public static void main(String[] args) {
            Pattern pattern = Pattern.compile("(([0-1]\\d|(2[0-3])))");
            Matcher matcher = pattern.matcher("00:02:10-Errr Mah Gawd!19:02:12-Everything makes boom!29:02:14-Ded :-( 23:59:59"
            );




            while(matcher.find()) {
                System.out.println(matcher.group());
            }






        }
    }

