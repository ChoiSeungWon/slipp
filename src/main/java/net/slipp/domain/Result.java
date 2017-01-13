package net.slipp.domain;

public class Result {
	
	private boolean valid;
	
	private String errorMessage;
	

	
	public Result(boolean valid, String errorMessage){
		this.valid = valid;
		this.errorMessage = errorMessage;
	}
	
	public static Result ok(){
		return new Result(true, null);
	}
	
	public static Result fial(String errorMessage){
		return new Result(false, errorMessage);
	}
	
	public boolean isValid(){
		return valid;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
}
