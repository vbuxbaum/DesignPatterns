public class TCPChannel extends Channel{

    public TCPChannel() {
        super();
    }

    public void Operation(String str){
        System.out.println("enviando " + str + "via TCP"); 
    }
}