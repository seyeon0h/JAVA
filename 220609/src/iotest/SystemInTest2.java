package iotest;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		System.out.println("알파벳을 여러 개를 쓰고 [Enter]를 누르세요");

		int i;
		try {
			while ((i = System.in.read()) != -1) {	// while 문에서 read() 메서드로 한 바이트로 반복해 읽음
				System.out.println((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

