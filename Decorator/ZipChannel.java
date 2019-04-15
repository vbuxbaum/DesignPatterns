public class ZipChannel extends ChannelDecorator{

    public ZipChannel() {
        super();
    }

    public Channel Operation(){
        System.out.println("Operation do ZipChannel"); 
    }
}