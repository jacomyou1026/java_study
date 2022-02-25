package ex3_override;

public class Minus extends Calculator {
@Override
public int getResult(int n1, int n2) {
	int result =0;
	if(n1>n2) {
		result = n1-n2;
	}else {
		result = n2-n1;
		
	}
	return result;
}
}
