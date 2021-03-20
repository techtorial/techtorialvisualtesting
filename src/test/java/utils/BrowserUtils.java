package utils;

public class BrowserUtils {

        public String getMethodName(){
            return new Throwable()
                    .getStackTrace()[0]
                    .getMethodName();
        }

}
