package bulletinboard;

public class Board {
	String title;
	String content;
	
	public Board() {
		
	}

	public Board(String title, String content,int boardnum) {
		super();
		this.title = title;
		this.content = content;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	
	
}
