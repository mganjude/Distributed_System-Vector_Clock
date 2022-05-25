
package project2;

import java.io.Serializable; // Serializability of a class is enabled by the class implementing the java.io.Serializable interface. 


public class Message implements Serializable {

    private int counter;
    private byte[] message;
    private MessageType type;

    public MessageType getType() {  // Get the type of the message
        return type;
    }

    public void setType(MessageType type) { //Set the type of the message
        this.type = type;
    }
    private int processID;

    public int getProcessID() {
        return processID;
    }

    public void setProcessID(int processID) {
        this.processID = processID;
    }

    public Message(int pid, int counter, byte[] message, MessageType type) {
        this.processID = pid;
        this.counter = counter;
        this.message = message;
        this.type = type;
    }

    public int getCounter() {  // Get the counter 
        return counter;
    }

    public void setCounter(int counter) {  // Set the counter
        this.counter = counter;
    }

    public byte[] getMessage() {
        return message;
    }

    public String getMessageString() {
        String msg = null;

        msg = new String(message);
        return msg;
    }

    public void setMessage(byte[] message) {
        this.message = message;
    }

    public enum MessageType implements Serializable {  //Because enums are automatically Serializable
        TEXT, FILE, TIME_DIFF, CHANGE_TIME, DAEMON_COUNTER,SEND_PROCESS_LIST,TIMESTAMP,TIMESTAMP_FINAL;

    }

}