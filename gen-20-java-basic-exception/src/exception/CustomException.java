package exception;


public class CustomException extends Exception {

    public CustomException(String msg){

        System.out.println(msg);
    }
    public CustomException(Throwable cause){
        super(cause);
    }
    public CustomException(String msg, Throwable cause) {

        super(msg, cause);

    }

}
