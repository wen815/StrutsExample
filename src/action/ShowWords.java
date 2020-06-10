package action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class ShowWords extends ActionSupport{

	private String name;
	private String words;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public String execute(){
		if("".equals(name)){
			return INPUT;
		}else{
			words = "»¶Ó­Äú£º" + name;
			return SUCCESS;
		}
	}
}
