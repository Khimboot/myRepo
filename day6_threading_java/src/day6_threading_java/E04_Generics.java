package day6_threading_java;

public class E04_Generics {
	public static void main(String[] args) {
		//holderOfObjects<String> holder = new holderOfObjects("A", "B", "C");
		//holderOfObjects<Integer> holder = new holderOfObjects(1, 2, 3);
		//holderOfObjects<Boolean> holder = new holderOfObjects(true, false, false);
		Drinks a1, a2, a3;
		a1 = new Drinks("Cold1","Hot1");
		a2 = new Drinks("Cold2","Hot2");
		a3 = new Drinks("Cold3","Hot3");
		holderOfObjects<Drinks> holder = new holderOfObjects(a1,a2,a3);
		System.out.println(holder.getA().toString());
		System.out.println(holder.getB().toString());
		System.out.println(holder.getC().toString());
		/*holder.setC("Cold4","Hot4");
		System.out.println(holder.getC());
		 */
	}

}

class holderOfObjects<T> {
	private T a, b, c;

	
	public holderOfObjects(T a, T b, T c) {
	
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

	//getters
	public T getA() {return a;}
	public T getB() {return b;}
	public T getC() {return c;}
	//setters
	public void setA(T a) {this.a = a;}
	public void setB(T b) {this.b = b;}
	public void setC(T c) {this.c = c;}

}

class Drinks{
	String cold, hot;

	public Drinks(String colder, String hotter) {
		// TODO Auto-generated constructor stub
		this.cold = colder;
		this.hot = hotter;
	}

	public String getCold() {
		return cold;
	}

	public void setCold(String cold) {
		this.cold = cold;
	}

	public String getHot() {
		return hot;
	}

	public void setHot(String hot) {
		this.hot = hot;
	}
	
}
