package com.entity.view;

import com.entity.DiscusscheweixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 车位信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-04-07 21:17:04
 */
@TableName("discusscheweixinxi")
public class DiscusscheweixinxiView  extends DiscusscheweixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusscheweixinxiView(){
	}
 
 	public DiscusscheweixinxiView(DiscusscheweixinxiEntity discusscheweixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusscheweixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
