package command;
import smartcarwash.*;
public class CommandInvoker {
	Command[] createCommands;
    public CommandInvoker(){
        createCommands = new Command[3];
        for( int z = 0; z < 3; z++) {
            createCommands[z] = () -> {};
        }
    }
    public void setCommand(int slot, Command createCommand ){
        createCommands[slot] = createCommand;
    }
    public void onCreate( int slot ){
        createCommands[slot].execute();
    }

    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n ------- Washing Process --------\n");
        for( int i = 0; i < createCommands.length; i++ ){
            stringBuff.append("[slot " + i + "]" + createCommands[i].getClass().getName() + "\n ");
        }


        return stringBuff.toString();
    }
}
