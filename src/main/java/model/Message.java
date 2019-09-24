package model;

import java.time.LocalDateTime;

public class Message {

	private String message;
	private String owner;
	private LocalDateTime localDateTime;

	public Message() {

	}

	public Message(String message, String owner, LocalDateTime localDateTime) {
		this.message = message;
		this.owner = owner;
		this.localDateTime = localDateTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "Message{" +
				"message='" + message + '\'' +
				", owner=" + owner +
				", localDateTime=" + localDateTime +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Message message1 = (Message) o;

		if (message != null ? !message.equals(message1.message) : message1.message != null) return false;
		if (owner != null ? !owner.equals(message1.owner) : message1.owner != null) return false;
		return localDateTime != null ? localDateTime.equals(message1.localDateTime) : message1.localDateTime == null;
	}

	@Override
	public int hashCode() {
		int result = message != null ? message.hashCode() : 0;
		result = 31 * result + (owner != null ? owner.hashCode() : 0);
		result = 31 * result + (localDateTime != null ? localDateTime.hashCode() : 0);
		return result;
	}
}
