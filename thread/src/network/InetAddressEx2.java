package network;

import java.net.InetAddress;
import java.util.Arrays;

/*
 * 네트워킹
 * 두 대 이상의 컴퓨터를 케이블로 연결하여 네트워크를 구상하는 것
 * 
 * 네트워크 어플리케이션 프로그램 작성 기 java.net 패키지를 사용합
 * 
 * 서버와 클라이언트
 * 서버 : 서비스를 제공하는 컴퓨터(메일 서버, 파일 서버, 어플리케이션 서버, 웹서버)
 * 클라이언트 : 서비스를 사용하는 컴퓨터
 * 
 * IP주소 :  호스트를 구별하는데 사용되는 고유한 값
 * 
 */
public class InetAddressEx2 {

	public static void main(String[] args) {
		//InetAddress 클래스 : Ip 주소를 다루기 위한 클래스
		InetAddress ip = null;
		
		try {
			// getByName(호스트명)
			ip = InetAddress.getLocalHost();
			//getHostName() : ip를 통해서 호스트명을 얻게 됨
			System.out.println("getHostName() : "+ip.getHostName());
			//getHostAddress() : ip주소
			System.out.println("getHostAddress() : "+ip.getHostAddress());
	
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
