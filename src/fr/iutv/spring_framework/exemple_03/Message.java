package fr.iutv.spring_framework.exemple_03;

public class Message {

	String text;

	long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Message(String text) {
		this.text = text;
		this.id = System.currentTimeMillis();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String info() {
		return "Id:" + this.id + ", Message:" + this.text;
	}

}
