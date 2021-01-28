abstract class PairMap{
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	abstract String delete(String key);
	abstract int length();
}

class Dictionary extends PairMap{
	int size;
	public Dictionary(int size) {
		this.size = size;
		super.keyArray = new String[size];
		super.valueArray = new String[size];
	}
	
	@Override
	public String get(String key) {
		for(int i=0; i<size; i++) {
			if(key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}
	
	@Override
	public void put(String key, String value) {
		for(int i=0; i<size; i++) {
			if(key.equals(keyArray[i])) {
				valueArray[i] = value;
				break;
			}
			else if(keyArray[i] == null) {
				keyArray[i] = key;
				valueArray[i] = value;
				break;
			}
		}
	}
	
	@Override 
	String delete(String key) {
		String tmp = null;
		for(int i=0; i<size; i++) {
			if(keyArray[i].equals(key)) {
				tmp = valueArray[i];
				keyArray[i] = null;
				valueArray[i] = null;
				break;
			}
		}
		return tmp;
	}
	
	@Override
	int length() {
		int cnt = 0;
		for(int i=0; i<size; i++) {
			if(keyArray[i] != null) cnt++;
		}
		return cnt;
	}
}


public class Ch5_10 {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
	    dic.put("이재문","파이선");
	    dic.put("이재문","C++");
	    System.out.println("이재문의 값은 "+dic.get("이재문"));
	    System.out.println("황기태의 값은 "+dic.get("황기태"));
	    dic.delete("황기태");
	    System.out.println("황기태의 값은 "+dic.get("황기태"));
	}
}
