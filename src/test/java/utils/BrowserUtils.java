package utils;

public class BrowserUtils {

        public static String getMethodName(){
            return new Throwable()
                    .getStackTrace()[0]
                    .getMethodName();
        }

}
