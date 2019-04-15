public class ChannelDecorator extends Channel {

    private Channel channel;

    public ChannelDecorator() {
        super();
    }

    public Channel Operation(){
        System.out.println("Operation do ChannelDecorator"); 
        channel.Operation()
    }
}