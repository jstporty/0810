
public class MemberInnerClass {
	public static void main(String[] args) {
		OuterClass1 out= new OuterClass1();  //바깥 클래스의 참조변수 ㅋ
		
		OuterClass1.InnerClass1 inner= out.new InnerClass1();
		//System.out.println(inner.avg);
		inner.show();
	}
}
