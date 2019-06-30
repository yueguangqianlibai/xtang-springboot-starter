package com.xtang.common;

/**
 * @Title:xTangJSONResult
 * @Date: 2019/6/26 17:48
 * @Author: xTang
 * @Description: 自定义响应数据结构
 *               200:成功
 *               500:错误（错误信息在msg字段中）
 *               501:bean验证错误（不计多少个错误都以map形式返回）
 *               502:用户操作校验出错（拦截器拦截到用户token出错）
 *               555:异常抛出信息
 * @version v1.0
 */
public class XTangJSONResult {

    /**响应状态码*/
    private Integer status;

    /**响应消息*/
    private String msg;

    /**响应数据*/
    private Object data;

    /**不使用*/
    private String ok;

    public static XTangJSONResult build(Integer status, String msg, Object data){
        return new XTangJSONResult(status, msg, data);
    }

    public static XTangJSONResult ok(Object data){
        return new XTangJSONResult(data);
    }

    public static XTangJSONResult ok(){
        return new XTangJSONResult(null);
    }

    public static XTangJSONResult errorMsg(String msg){
        return new XTangJSONResult(500,msg,null);
    }

    public static XTangJSONResult errorMap(Object data){
        return new XTangJSONResult(501,"error",data);
    }

    public static XTangJSONResult errorTokenMsg(String msg){
        return new XTangJSONResult(502,msg,null);
    }

    public static XTangJSONResult errorException(String msg){
        return new XTangJSONResult(555,msg,null);
    }
    public XTangJSONResult(){

    }

    public XTangJSONResult(Integer status, String msg, Object data){
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public XTangJSONResult(Object data){
        this.status = 200;
        this.msg = "OK";
        this.data = data;
    }

    public Boolean isOk(){
        return this.status == 200;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
