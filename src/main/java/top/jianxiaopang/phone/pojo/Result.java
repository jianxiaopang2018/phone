package top.jianxiaopang.phone.pojo;

public class Result<T> {
	private int status;
	private String message;
	private T data;

	private Result(T data) {
		this.status = 200;
		this.message = "成功";
		this.data = data;
	}

	private Result(int status, String message) {
		this.status = status;
		this.message = message;
	}

	public static <T> Result<T> success(T data) {
		return new Result<T>(data);
	}

	public static <T> Result<T> message(int status, String message) {
		return new Result<T>(status, message);
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
