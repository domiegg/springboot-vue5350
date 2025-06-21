package com.entity.model;

import com.entity.CheliangchuchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 车辆出场
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2024-04-07 21:17:03
 */
public class CheliangchuchangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车位名称
	 */
	
	private String cheweimingcheng;
		
	/**
	 * 车位类型
	 */
	
	private String cheweileixing;
		
	/**
	 * 入场时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date ruchangshijian;
		
	/**
	 * 出场时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuchangshijian;
		
	/**
	 * 小时价格
	 */
	
	private Double xiaoshijiage;
		
	/**
	 * 停车时长
	 */
	
	private Double tingcheshizhang;
		
	/**
	 * 停车费用
	 */
	
	private Double tingchefeiyong;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 车牌号
	 */
	
	private String chepaihao;
		
	/**
	 * 颜色
	 */
	
	private String yanse;
		
	/**
	 * 位置
	 */
	
	private String weizhi;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：车位名称
	 */
	 
	public void setCheweimingcheng(String cheweimingcheng) {
		this.cheweimingcheng = cheweimingcheng;
	}
	
	/**
	 * 获取：车位名称
	 */
	public String getCheweimingcheng() {
		return cheweimingcheng;
	}
				
	
	/**
	 * 设置：车位类型
	 */
	 
	public void setCheweileixing(String cheweileixing) {
		this.cheweileixing = cheweileixing;
	}
	
	/**
	 * 获取：车位类型
	 */
	public String getCheweileixing() {
		return cheweileixing;
	}
				
	
	/**
	 * 设置：入场时间
	 */
	 
	public void setRuchangshijian(Date ruchangshijian) {
		this.ruchangshijian = ruchangshijian;
	}
	
	/**
	 * 获取：入场时间
	 */
	public Date getRuchangshijian() {
		return ruchangshijian;
	}
				
	
	/**
	 * 设置：出场时间
	 */
	 
	public void setChuchangshijian(Date chuchangshijian) {
		this.chuchangshijian = chuchangshijian;
	}
	
	/**
	 * 获取：出场时间
	 */
	public Date getChuchangshijian() {
		return chuchangshijian;
	}
				
	
	/**
	 * 设置：小时价格
	 */
	 
	public void setXiaoshijiage(Double xiaoshijiage) {
		this.xiaoshijiage = xiaoshijiage;
	}
	
	/**
	 * 获取：小时价格
	 */
	public Double getXiaoshijiage() {
		return xiaoshijiage;
	}
				
	
	/**
	 * 设置：停车时长
	 */
	 
	public void setTingcheshizhang(Double tingcheshizhang) {
		this.tingcheshizhang = tingcheshizhang;
	}
	
	/**
	 * 获取：停车时长
	 */
	public Double getTingcheshizhang() {
		return tingcheshizhang;
	}
				
	
	/**
	 * 设置：停车费用
	 */
	 
	public void setTingchefeiyong(Double tingchefeiyong) {
		this.tingchefeiyong = tingchefeiyong;
	}
	
	/**
	 * 获取：停车费用
	 */
	public Double getTingchefeiyong() {
		return tingchefeiyong;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：车牌号
	 */
	 
	public void setChepaihao(String chepaihao) {
		this.chepaihao = chepaihao;
	}
	
	/**
	 * 获取：车牌号
	 */
	public String getChepaihao() {
		return chepaihao;
	}
				
	
	/**
	 * 设置：颜色
	 */
	 
	public void setYanse(String yanse) {
		this.yanse = yanse;
	}
	
	/**
	 * 获取：颜色
	 */
	public String getYanse() {
		return yanse;
	}
				
	
	/**
	 * 设置：位置
	 */
	 
	public void setWeizhi(String weizhi) {
		this.weizhi = weizhi;
	}
	
	/**
	 * 获取：位置
	 */
	public String getWeizhi() {
		return weizhi;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
