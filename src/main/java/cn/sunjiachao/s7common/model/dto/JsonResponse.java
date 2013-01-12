package cn.sunjiachao.s7common.model.dto;

import java.io.Serializable;

public class JsonResponse implements Serializable {

	private static final long serialVersionUID = -7908958308779498104L;
	private String message;
    private int code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
