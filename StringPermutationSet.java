import java.util.HashSet;
import java.util.Set;

public class StringPermutationSet {
	public Set<String>stringPem(String str){
		Set<String>perm = new HashSet<String>();
		if(str==null) {
			return null;
		}
		else if(str.length()==0) {
			perm.add("");
			return perm;
		}
		char init = str.charAt(0);
		String remain = str.substring(1);
		Set<String> words = stringPem(remain);
		for(String newWord:words) {
			for(int i=0;i<=newWord.length();i++) {
				perm.add(charInsert(i,init,newWord));
			}
		}
		return perm;
	}
	public String charInsert(int i,char c,String word) {
		String begin = word.substring(0, i);
		String end = word.substring(i);
		return begin+c+end;
	}

}
