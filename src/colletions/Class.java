package colletions;

public class Class implements Comparable<Class> {
	private String title;
	private int duration;
	
	public Class(String title, int duration) {
		this.title = title;
		this.duration = duration;
	}
	
	public String getTitle() {
		return title;
	}
	public int getDuration() {
		return duration;
	}

	@Override
	public String toString() {
		return "[Title: " + this.title + ", Duration: " + this.duration + " min]";
	}

	@Override
	public int compareTo(Class anotherclass) {
		
		return this.title.compareTo(anotherclass.title);
	}
	
}

