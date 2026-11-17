package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String, String> english = new HashMap<>();
	
	public Dictionary_Chapter21() {
		english.put("apple", "りんご");
		english.put("banana", "バナナ");
		english.put("peach", "桃");
		english.put("lemon", "レモン");
		english.put("pear", "梨");
		english.put("kiwi", "キウィ");
		english.put("strawberry", "いちご");
		english.put("grape", "ぶどう");
		english.put("muscat", "マスカット");
		english.put("cherry", "さくらんぼ");
	}
	
	public String getJapen(String word) {
		return english.get(word);
	}


}

