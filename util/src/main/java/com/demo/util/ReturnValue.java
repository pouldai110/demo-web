package com.demo.util;

import com.alibaba.fastjson.JSON;
import java.util.List;

/**
 * ReturnValue
 *   
 * @author Clevo  
 * @date 2017/12/11 21:32 
 */  
public class ReturnValue<T> {
	
	public Integer retCode = ReturnCode.SUCCESS;
	public String message;
	public T obj;
	//不分页时使用
	public List<T> result;
	
	public ReturnValue(){
		super();
	}
	
	public ReturnValue(T obj ){
		super();
		this.obj = obj;
	}
	
	public ReturnValue(List<T> result ){
		super();
		this.result = result;
	}
	
	public ReturnValue(String message) {
		super();
		this.message = message;
	}
	
	public ReturnValue( String message,T obj ){
		super();
		this.message = message;
		this.obj = obj;
	}
	
	public ReturnValue(String message,List<T> result ){
		super();
		this.message = message;
		this.result = result;
	}
	
	public ReturnValue(Integer retCode, String message) {
		super();
		this.retCode = retCode;
		this.message = message;
	}
	
	public ReturnValue( Integer retCode, String message,T obj ){
		super();
		this.retCode = retCode;
		this.message = message;
		this.obj = obj;
	}
	
	public ReturnValue( Integer retCode, String message,List<T> result ){
		super();
		this.retCode = retCode;
		this.message = message;
		this.result = result;
	}
	
	public String toJson(){

		return JSON.toJSONString(this);
	}

	
	public Integer getRetCode() {
		return retCode;
	}
	public void setRetCode( Integer retCode ) {
		this.retCode = retCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getObj() {
		return obj;
	}
	public void setObj(T obj) {
		this.obj = obj;
	}
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
}
