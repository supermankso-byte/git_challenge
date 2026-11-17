package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 japanese = new Dictionary_Chapter21();
		
		String[] english = {"apple", "banana", "grape", "orange"};
		
		for (String word : english) {
			if(japanese.getJapen(word) == null) {
				System.out.println(word+"は辞書に存在しません");
			} else {
				System.out.println(word+"の意味は"+japanese.getJapen(word));
			}
			 
		}
	}

}
