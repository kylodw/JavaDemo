package test5;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * 对charbuffer中的字符进行编码和译码
 */
public class UsingBuffers {
    private static void syme(CharBuffer charBuffer) {
        while (charBuffer.hasRemaining()) {
            //将mark设为position
            charBuffer.mark();
            //拿到 U
            char c1 = charBuffer.get();
            //拿到 s
            char c2 = charBuffer.get();

            //position的值设为mark的值
            charBuffer.reset();
            charBuffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] data = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
        CharBuffer cb = bb.asCharBuffer();
        cb.put(data);
        System.out.println(cb.rewind());
        syme(cb);
        System.out.println(cb.rewind());
        syme(cb);
        System.out.println(cb.rewind());
    }
}
