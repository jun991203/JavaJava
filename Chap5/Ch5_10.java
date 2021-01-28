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
		dic.put("Ȳ����", "�ڹ�");
	    dic.put("���繮","���̼�");
	    dic.put("���繮","C++");
	    System.out.println("���繮�� ���� "+dic.get("���繮"));
	    System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	    dic.delete("Ȳ����");
	    System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	}
}
