package java멘토씨;

class EmplyeeInfo{
	public int rank;
	EmplyeeInfo(int rank){
		this.rank=rank;
	}
}

class Perso_1<T,S>{
	//복수의 제네릭은 서로 이름이 달라야 함
	public T info;
	public S id;
	Perso_1(T info,S id){
		this.info=info;
		this.id=id;
	}
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}

public class GenreicDm {
	public static void main(String[] args) {
		EmplyeeInfo e = new EmplyeeInfo(1);
		Integer i =new Integer(10);
		//Perso_1<EmplyeeInfo,Integer> p1= new Perso_1<EmplyeeInfo,Integer>(e,i);
		Perso_1 p1 = new Perso_1(e,i);
		p1.printInfo(e);
	}

}
