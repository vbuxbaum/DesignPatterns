public static void main(String[] args) {

    Channel = new BufferChannel (new TCPChannel());

    Channel = new BufferChannel (new UDPChannel());

    Channel = new BufferChannel (new ZipChannel (new TCPChannel());

    Channel = new BufferChannel (new LogChannel (new TCPChannel());

    Channel = new ZipChannel (new BufferChannel (new LogChannel (new TCPChannel()));


}