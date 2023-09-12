package facebook;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailVerifier {
 public static boolean isValidEmail(String email) {
	String emailRegex= "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	Pattern pattern =Pattern.compile(emailRegex);
	 Matcher matcher = pattern.matcher(email);
     
     // Returning true if email is valid, false otherwise
     return matcher.matches();
 }
}