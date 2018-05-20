package hashMap;

import java.util.HashMap;
import java.util.HashSet;
//import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
//		
//		//데이터삽입
//		hashMap.put(0, "str0");
//		hashMap.put(1, "str1");
//		hashMap.put(2, "str2");
//		hashMap.put(3, "str3");
//		System.out.println(hashMap.toString());//{0=str0, 1=str1, 2=str2, 3=str3}
//		
//		//데이터 지우기
//		hashMap.remove(2);//키가 2인 값을 삭제
//		System.out.println(hashMap.toString());//{0=str0, 1=str1, 3=str3}
//		
//		//데이터 모두 삭제
//		hashMap.clear();
//		System.out.println(hashMap.toString());//{}
//		
//		hashMap.put(0, "str0");
//		hashMap.put(1, "str1");
//		hashMap.put(2, "str2");
//		hashMap.put(3, "str3");
//		System.out.println(hashMap.toString());//{0=str0, 1=str1, 2=str2, 3=str3}	
//		
//		//이터레이터(키를 모아둠) 객체 얻기
//		
//		Iterator<Integer> iterator = hashMap.keySet().iterator();
//		while (iterator.hasNext()) {//다음키가 있는지 체크
//			System.out.println(hashMap.get(iterator.next()));//str0 str1 str2 str3
//			
//		}
		
		HashSet<Student> hashSet = new HashSet<Student>();
		hashSet.add(new Student("홍길동", 3));
		hashSet.add(new Student("장보고", 6));
		hashSet.add(new Student("이순신", 2));
		
		//데이터삭제
		Student student = new Student("이순신", 2);//기초데이터라면 문제 없지만 객체를 만들어 사용하면 메모리의 주소값이 다르기 때문에 
		//삭제할때 해쉬코드값 재정의를 통해 삭제한다 
		hashSet.remove(student);
		
		
		System.out.println(hashSet.toString());//[hashMap.Student@5c647e05, hashMap.Student@33909752, hashMap.Student@70dea4e]
		//Object 에 있는 tostring, 메모리의 주소값이 찍힘
		//[장보고:6, 이순신:2, 홍길동:3] studnet클래스에서 tostring을 오버라이딩해서 내가 새롭게 정의함
		

		
		
	}
}
