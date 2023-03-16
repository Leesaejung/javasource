package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;

public class FileInputEx3 {

	public static void main(String[] args) throws IOException {
		// FileInputEx1.java를 읽어서 화면 출력
		// 행번호와 같이 출력(FileReader, Writer)


		
//		try(FileInputStream fis = new FileInputStream(".\\src\\io\\FileEx4.java");OutputStream out = System.out) {
//			int data;
//			int row=1; //행번호
//			while ((data=fis.read())!=-1) {
//				if (row==1) {
//					System.out.print(row++ + " ");
//					continue;
//				}
//				System.out.print((char)data); // 읽은 문자를 하나씩 출력
//				if(data=='\n') { // 엔터와 같으면 이후에 공백 문자 마다 행 번호 출력
//					System.out.print(row++ + " "); //행추가
//				}
//				
//			}
//		} catch(Exception e) {
//			System.out.println("파일 입출력 오류");
//		}
		
		
//		try(FileInputStream fis = new FileInputStream(".\\src\\io\\FileEx4.java");	PrintStream out = System.out) {
//			int data;
//			int row=1; //행번호
//			while ((data=fis.read())!=-1) {
//				if (row==1) {
//					out.print(row++ + " ");
//					continue;
//				}
//				out.print((char)data); // 읽은 문자를 하나씩 출력
//				if(data=='\n') { // 엔터와 같으면 이후에 공백 문자 마다 행 번호 출력
//					out.print(row++ + " "); //행추가
//				}
//				
//			}
//		} catch(Exception e) {
//			System.out.println("파일 입출력 오류");
//		}
		
		//FileReader / BufferedReader 사용하는 형태로 변경
		try(FileReader fis = new FileReader(".\\src\\io\\FileEx4.java");	
			BufferedReader br = new BufferedReader(fis);
				)
				
				 {
			String str = null;
			int i = 1;
			while ((str=br.readLine())!=null) {
				System.out.println(i+" "+str);
				i++;
			}
		} catch(Exception e) {
			System.out.println("파일 입출력 오류");
		}
	}

}