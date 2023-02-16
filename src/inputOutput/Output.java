package inputOutput;

import api.services.OutConsole;

import java.io.PrintStream;

public class Output implements OutConsole {
    private final PrintStream out;

    public Output() {
        this.out = System.out;
    }

    public void print(String message){
        out.println(message);
    }
}
