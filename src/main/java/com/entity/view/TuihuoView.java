package com.entity.view;

import com.entity.TuihuoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 退货
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tuihuo")
public class TuihuoView extends TuihuoEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 gongyingshang
			/**
			* 供应商名称
			*/
			private String gongyingshangName;
			/**
			* 供应商类型
			*/
			private Integer gongyingshangTypes;
				/**
				* 供应商类型的值
				*/
				private String gongyingshangValue;
			/**
			* 信用等级
			*/
			private Integer gongyingshangXinyongdengjiTypes;
				/**
				* 信用等级的值
				*/
				private String gongyingshangXinyongdengjiValue;
			/**
			* 供应商详情
			*/
			private String gongyingshangContent;

		//级联表 shangpin
			/**
			* 商品编号
			*/
			private String shangpinUuidNumber;
			/**
			* 商品名称
			*/
			private String shangpinName;
			/**
			* 商品照片
			*/
			private String shangpinPhoto;
			/**
			* 单位
			*/
			private String shangpinDanwei;
			/**
			* 商品类型
			*/
			private Integer shangpinTypes;
				/**
				* 商品类型的值
				*/
				private String shangpinValue;
			/**
			* 商品库存
			*/
			private Integer shangpinKucunNumber;
			/**
			* 商品售价
			*/
			private Double shangpinNewMoney;
			/**
			* 商品介绍
			*/
			private String shangpinContent;
			/**
			* 逻辑删除
			*/
			private Integer shangpinDelete;

		//级联表 yuangong
			/**
			* 员工工号
			*/
			private String yuangongUuidNumber;
			/**
			* 员工姓名
			*/
			private String yuangongName;
			/**
			* 员工手机号
			*/
			private String yuangongPhone;
			/**
			* 员工身份证号
			*/
			private String yuangongIdNumber;
			/**
			* 员工头像
			*/
			private String yuangongPhoto;
			/**
			* 电子邮箱
			*/
			private String yuangongEmail;

	public TuihuoView() {

	}

	public TuihuoView(TuihuoEntity tuihuoEntity) {
		try {
			BeanUtils.copyProperties(this, tuihuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















				//级联表的get和set gongyingshang

					/**
					* 获取： 供应商名称
					*/
					public String getGongyingshangName() {
						return gongyingshangName;
					}
					/**
					* 设置： 供应商名称
					*/
					public void setGongyingshangName(String gongyingshangName) {
						this.gongyingshangName = gongyingshangName;
					}

					/**
					* 获取： 供应商类型
					*/
					public Integer getGongyingshangTypes() {
						return gongyingshangTypes;
					}
					/**
					* 设置： 供应商类型
					*/
					public void setGongyingshangTypes(Integer gongyingshangTypes) {
						this.gongyingshangTypes = gongyingshangTypes;
					}


						/**
						* 获取： 供应商类型的值
						*/
						public String getGongyingshangValue() {
							return gongyingshangValue;
						}
						/**
						* 设置： 供应商类型的值
						*/
						public void setGongyingshangValue(String gongyingshangValue) {
							this.gongyingshangValue = gongyingshangValue;
						}

					/**
					* 获取： 信用等级
					*/
					public Integer getGongyingshangXinyongdengjiTypes() {
						return gongyingshangXinyongdengjiTypes;
					}
					/**
					* 设置： 信用等级
					*/
					public void setGongyingshangXinyongdengjiTypes(Integer gongyingshangXinyongdengjiTypes) {
						this.gongyingshangXinyongdengjiTypes = gongyingshangXinyongdengjiTypes;
					}


						/**
						* 获取： 信用等级的值
						*/
						public String getGongyingshangXinyongdengjiValue() {
							return gongyingshangXinyongdengjiValue;
						}
						/**
						* 设置： 信用等级的值
						*/
						public void setGongyingshangXinyongdengjiValue(String gongyingshangXinyongdengjiValue) {
							this.gongyingshangXinyongdengjiValue = gongyingshangXinyongdengjiValue;
						}

					/**
					* 获取： 供应商详情
					*/
					public String getGongyingshangContent() {
						return gongyingshangContent;
					}
					/**
					* 设置： 供应商详情
					*/
					public void setGongyingshangContent(String gongyingshangContent) {
						this.gongyingshangContent = gongyingshangContent;
					}











				//级联表的get和set shangpin

					/**
					* 获取： 商品编号
					*/
					public String getShangpinUuidNumber() {
						return shangpinUuidNumber;
					}
					/**
					* 设置： 商品编号
					*/
					public void setShangpinUuidNumber(String shangpinUuidNumber) {
						this.shangpinUuidNumber = shangpinUuidNumber;
					}

					/**
					* 获取： 商品名称
					*/
					public String getShangpinName() {
						return shangpinName;
					}
					/**
					* 设置： 商品名称
					*/
					public void setShangpinName(String shangpinName) {
						this.shangpinName = shangpinName;
					}

					/**
					* 获取： 商品照片
					*/
					public String getShangpinPhoto() {
						return shangpinPhoto;
					}
					/**
					* 设置： 商品照片
					*/
					public void setShangpinPhoto(String shangpinPhoto) {
						this.shangpinPhoto = shangpinPhoto;
					}

					/**
					* 获取： 单位
					*/
					public String getShangpinDanwei() {
						return shangpinDanwei;
					}
					/**
					* 设置： 单位
					*/
					public void setShangpinDanwei(String shangpinDanwei) {
						this.shangpinDanwei = shangpinDanwei;
					}

					/**
					* 获取： 商品类型
					*/
					public Integer getShangpinTypes() {
						return shangpinTypes;
					}
					/**
					* 设置： 商品类型
					*/
					public void setShangpinTypes(Integer shangpinTypes) {
						this.shangpinTypes = shangpinTypes;
					}


						/**
						* 获取： 商品类型的值
						*/
						public String getShangpinValue() {
							return shangpinValue;
						}
						/**
						* 设置： 商品类型的值
						*/
						public void setShangpinValue(String shangpinValue) {
							this.shangpinValue = shangpinValue;
						}

					/**
					* 获取： 商品库存
					*/
					public Integer getShangpinKucunNumber() {
						return shangpinKucunNumber;
					}
					/**
					* 设置： 商品库存
					*/
					public void setShangpinKucunNumber(Integer shangpinKucunNumber) {
						this.shangpinKucunNumber = shangpinKucunNumber;
					}

					/**
					* 获取： 商品售价
					*/
					public Double getShangpinNewMoney() {
						return shangpinNewMoney;
					}
					/**
					* 设置： 商品售价
					*/
					public void setShangpinNewMoney(Double shangpinNewMoney) {
						this.shangpinNewMoney = shangpinNewMoney;
					}

					/**
					* 获取： 商品介绍
					*/
					public String getShangpinContent() {
						return shangpinContent;
					}
					/**
					* 设置： 商品介绍
					*/
					public void setShangpinContent(String shangpinContent) {
						this.shangpinContent = shangpinContent;
					}

					/**
					* 获取： 逻辑删除
					*/
					public Integer getShangpinDelete() {
						return shangpinDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShangpinDelete(Integer shangpinDelete) {
						this.shangpinDelete = shangpinDelete;
					}











				//级联表的get和set yuangong

					/**
					* 获取： 员工工号
					*/
					public String getYuangongUuidNumber() {
						return yuangongUuidNumber;
					}
					/**
					* 设置： 员工工号
					*/
					public void setYuangongUuidNumber(String yuangongUuidNumber) {
						this.yuangongUuidNumber = yuangongUuidNumber;
					}

					/**
					* 获取： 员工姓名
					*/
					public String getYuangongName() {
						return yuangongName;
					}
					/**
					* 设置： 员工姓名
					*/
					public void setYuangongName(String yuangongName) {
						this.yuangongName = yuangongName;
					}

					/**
					* 获取： 员工手机号
					*/
					public String getYuangongPhone() {
						return yuangongPhone;
					}
					/**
					* 设置： 员工手机号
					*/
					public void setYuangongPhone(String yuangongPhone) {
						this.yuangongPhone = yuangongPhone;
					}

					/**
					* 获取： 员工身份证号
					*/
					public String getYuangongIdNumber() {
						return yuangongIdNumber;
					}
					/**
					* 设置： 员工身份证号
					*/
					public void setYuangongIdNumber(String yuangongIdNumber) {
						this.yuangongIdNumber = yuangongIdNumber;
					}

					/**
					* 获取： 员工头像
					*/
					public String getYuangongPhoto() {
						return yuangongPhoto;
					}
					/**
					* 设置： 员工头像
					*/
					public void setYuangongPhoto(String yuangongPhoto) {
						this.yuangongPhoto = yuangongPhoto;
					}

					/**
					* 获取： 电子邮箱
					*/
					public String getYuangongEmail() {
						return yuangongEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYuangongEmail(String yuangongEmail) {
						this.yuangongEmail = yuangongEmail;
					}






}
