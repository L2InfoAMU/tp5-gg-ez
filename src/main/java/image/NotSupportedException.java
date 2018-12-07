package image;

public class NotSupportedException extends RuntimeException{
    private String string;

    public NotSupportedException(String string){
        this.string = string;
    }
}