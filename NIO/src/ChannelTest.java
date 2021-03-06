import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.concurrent.SynchronousQueue;


public class ChannelTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile aFile = new RandomAccessFile("C:\\Users\\LPY\\Desktop\\define.cpp", "rw");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(48);

		int bytesRead = inChannel.read(buf);
		while (bytesRead != -1) {

		System.out.println("Read " + bytesRead);
		buf.flip();

		while(buf.hasRemaining()){
		System.out.print((char) buf.get());
		}

		buf.clear();
		bytesRead = inChannel.read(buf);
		}
		aFile.close();
				
	}

}
