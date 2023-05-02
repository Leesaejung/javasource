package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputEx6 {

	public static void main(String[] args) throws IOException {
		// copy(C:\\temp\\file1.txt = > C:\\temp\\file2.txt)
		

		try(FileInputStream fis = new FileInputStream("C:\\temp\\KakaoTalk_20230314_151605199.mp4");
				FileOutputStream fos = new FileOutputStream("C:\\temp\\KakaoTalk_20230314_151605199copy.mp4");) {
			int data = 0;
			long start = System.currentTimeMillis(); //시작시간
			//읽어오는 시간 + 출력 동시에
			while ((data=fis.read())!=-1) {

			}
			long end =System.currentTimeMillis(); //종료시간
			System.out.println("InputStream / OutputStream 걸린 시간"+(end-start)+"ms");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\temp\\KakaoTalk_20230314_151605199.mp4"))
		//BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\temp\\KakaoTalk_20230314_151605199copy.mp4"))
		try(FileInputStream fis = new FileInputStream("C:\\temp\\KakaoTalk_20230314_151605199.mp4");
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos = new FileOutputStream("C:\\temp\\KakaoTalk_20230314_151605199copy.mp4");
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			int data = 0;
			
			byte b[] =new byte[8192]; //8kb
			
			long start = System.currentTimeMillis(); //시작시간
			
			while ((data=fis.read(b))!=-1) {
				bos.write(b);
			}
			long end =System.currentTimeMillis(); //종료시간
			System.out.println("InputStream+Buffered+byte / OutputStream+Buffered+byte 걸린 시간"+(end-start)+"ms");
			
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
