package xyz.vatagin.stepik.ascii_char;

import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] byteArray;

    public AsciiCharSequence(byte[] byteArray) {
        this.byteArray = Arrays.copyOf(byteArray, byteArray.length);
    }

    @Override
    public int length() {
        return byteArray.length;
    }

    @Override
    public char charAt(int index) {
        return (char) byteArray[index];
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {
        byte[] subArray = Arrays.copyOfRange(byteArray, start, end);
        return new AsciiCharSequence(subArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (byte b: byteArray) {
            sb.append((char) b);
        }
        return sb.toString();
    }
}
