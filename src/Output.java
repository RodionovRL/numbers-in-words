public class Output implements OutConsole {
    public void print(String message){
        System.out.println(message);
    }
    public void print(String message, int ...args){
        System.out.printf(message, args);
    }


}
