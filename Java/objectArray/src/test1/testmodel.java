package test1;

public class testmodel {
	private String name;
	private String object;
	private int score;
	
	public testmodel(String name, String object, int score) {
		this.name = name;
		this.object = object;
		this.score = score;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getObject() {
		return object;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	public String inform() {
		return "이름 : " + name + " / 과목 : " + object + " / 점수 : " + score;
	}
}
