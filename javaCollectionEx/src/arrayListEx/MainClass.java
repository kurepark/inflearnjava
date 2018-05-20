package arrayListEx;

import java.util.ArrayList;

public class MainClass {
	
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		System.out.println(arrayList.toString());//[str0, str1, str2, str3]
		
		//데이터변경
		arrayList.set(2, "str2222");//2번째 index값을 변경
		System.out.println(arrayList.toString());//[str0, str1, str2222, str3]
		
		//배열 지우기
		arrayList.remove(2);//2번째 인덱스 지우기
		System.out.println(arrayList.toString());//[str0, str1, str3]
		
		//사이즈구하기
		System.out.println(arrayList.size());//3
		
		//데이터 삭제하기
		arrayList.clear();
		System.out.println(arrayList.toString());//[]
		
		//null, 객체와의 관계끊기. 주소값이 사라짐
		arrayList = null;
		//System.out.println(arrayList.toString());//Exception in thread "main" java.lang.NullPointerException at arrayListEx.MainClass.main(MainClass.java:33)
		
		System.out.println(arrayList);//null
	}

}
