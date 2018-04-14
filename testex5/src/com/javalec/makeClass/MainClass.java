package com.javalec.makeClass;

public class MainClass {
	public static void main(String[] args) {
		
		/*//��ü �����ϱ�
		WomanClass wc = new WomanClass();
		WomanClass wc1 = new WomanClass();
		
		System.out.println(wc.equals(wc1));//wc와 wc1가 같은지 비교해서 블리언으로 반환 
*/	
		ManClass mc = new ManClass();//파라미터가 없는 생성자
		ManClass mc1 = new ManClass(15, 168, 50, "010-1234-1234");//파라미터가 있는 생성자
		
		mc.getAge();//private 인스턴스는 사용할 수 없지만 getter/setter로 설정한 건 사용 가능
		mc.setAge(16);//값을 변경할땐 set을.
		
		double d = mc.calculateBMI();
	}
}
