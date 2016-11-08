package info.xiaomo.website.model;


import info.xiaomo.core.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 *
 * @author: xiaomo
 * @github: https://github.com/qq83387856
 * @email: hupengbest@163.com
 * @QQ_NO: 83387856
 * @Date: 2016/11/3 14:27
 * @Description: 用户实体类
 * @Copyright(©) 2015 by xiaomo.
 **/

@Entity
@Table(name = "technology")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TechnologyModel extends BaseModel {

    /**
     * 技术名字
     */
    @Column(name = "Name")
    private String name;

    /**
     * url
     */
    @Column(name = "Url")
    private String url;

    /**
     * 简介
     */
    @Column(name = "Summary")
    private String summary;

    /**
     * 图片链接
     */
    @Column(name = "ImgUrl")
    private String imgUrl;

}