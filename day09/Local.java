package day09;

public class Local {
	String str="$$$";//멤버변수 
	
	
	
	void demo() {
		final String lstr="###";//로컬변수=> 로컬이너클래스에서 사용하려면 final변수여야 한다. 값을 수정할 수 없다. 
		System.out.println("str: "+str);
		System.out.println("lstr: "+lstr);
				
		class LocalInner{
			int no=100;
			void print() {
				System.out.println("--LocalInner's print()--------");
				System.out.println("no= "+no);
				System.out.println("str= "+str);
				System.out.println("lstr= "+lstr);
				
				
			}
		}//////////////////
		LocalInner li=new LocalInner();
		li.print();
	}//demo()----------------------
	
	public static void main(String[] args) {
		//demo()호출하기 
		Local lc=new Local();
		lc.demo();
//		Local.LocalInner li=new Local().new LocalInner();[x]
	}

}
