package com.demo.util;

public class ReturnCode {
	
	/**
	 * 成功
	 */
	public static final int SUCCESS = 0;
	
	public static final int _500=-500;
	/**
	 * 登录失败
	 */
	public static final int LOGIN_ERROR=-990;
	/**
	 * 用户令牌不合法
	 */
	public static final int TOKEN_ILLEGAL=-996;//
	/**
	 * 用户 刷新令牌过期
	 */
	public static final int REFRESH_TOKEN_EXPIRED=-997;//
	/**
	 * 用户 普通令牌过期
	 */
	public static final int TOKEN_EXPIRED=-998;//
	/**
	 * 未登录
	 */
	public static final int UNLOGIN=-999;//
	/**
	 * 权限不够
	 */
	public static final int LIMITED_AUTHORITY=-1000;//
	/**
	 * 非自定义异常
	 */
	public static final int NOT_CUSTOM_EXCEPTION=-2000;//
	/**
	 * 非自定义运行时异常
	 */
	public static final int NOT_CUSTOM_RUNTIME_EXCEPTION=-2001;//
	
}
