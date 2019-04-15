public class LogChannel extends ChannelDecorator{

    public LogChannel() {
        super();
    }

    public Channel Operation(){
        System.out.println("Operation do LogChannel"); 
    }
}