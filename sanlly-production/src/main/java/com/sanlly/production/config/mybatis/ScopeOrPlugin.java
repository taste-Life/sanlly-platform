package com.sanlly.production.config.mybatis;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

/**
 * https://github.com/RexSheng ©2019
 * RecordExample.java配置如下：
 * protected List<Criteria> orCriteria;
    	
        protected Criteria() {
            super();
            orCriteria=new ArrayList<Criteria>();
        }
        
        public Criteria createOrCriteria() {
        	Criteria criteria = new Criteria();
        	orCriteria.add(criteria);
            return criteria;
        }
        
        public List<Criteria> getOrCriteria() {
        	return orCriteria;
        }
        
        public boolean getValidOr() {
            return orCriteria.size() > 0;
        }
        
        
 * <sql id="Example_Where_Clause">
    <where>
      <foreach collection="oredCriteria" item="criteria" separator="or">
          <trim prefix="(" prefixOverrides="and" suffix=")">
          	<if test="criteria.valid">
         	   <foreach collection="criteria.criteria" item="criterion">
	              <choose>
	              	<when test="criterion.noValue">
	                  and ${criterion.condition}
	                </when>
	                <when test="criterion.singleValue">
	                  and ${criterion.condition} #{criterion.value}
	                </when>
	                <when test="criterion.betweenValue">
	                  and ${criterion.condition} #{criterion.value} and #{criterion.secondValue}
	                </when>
	                <when test="criterion.listValue">
	                  and ${criterion.condition}
	                  <foreach close=")" collection="criterion.value" item="listItem" open="(" separator=",">
	                    #{listItem}
	                  </foreach>
	                </when>
	              </choose>
	            </foreach>
          	</if>
          	<if test="criteria.validOr">
	           and 
               <foreach collection="criteria.orCriteria" item="criteriaItem" separator="and">
                <if test="criteriaItem.valid">
                  <trim prefix="(" prefixOverrides="or" suffix=")">
                  	<foreach collection="criteriaItem.criteria" item="criterionItem">
		              <choose>
		              	<when test="criterionItem.noValue">
		                  or ${criterionItem.condition}
		                </when>
		                <when test="criterionItem.singleValue">
		                  or ${criterionItem.condition} #{criterionItem.value}
		                </when>
		                <when test="criterionItem.betweenValue">
		                  or ${criterionItem.condition} #{criterionItem.value} and #{criterionItem.secondValue}
		                </when>
		                <when test="criterionItem.listValue">
		                  or ${criterionItem.condition}
		                  <foreach close=")" collection="criterionItem.value" item="listItem" open="(" separator=",">
		                    #{listItem}
		                  </foreach>
		                </when>
		              </choose>
	                </foreach>
                  </trim>
                </if>
               </foreach>
	          </if>
          	</trim>
      </foreach>
    </where>
  </sql>
 * @author RexSheng
 * 2019年11月8日 下午2:32:41
 */
public class ScopeOrPlugin extends PluginAdapter {
	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		if(introspectedTable.getTableConfiguration().getProperty("generateScopeOr")!=null && 
				introspectedTable.getTableConfiguration().getProperty("generateScopeOr").equals("true")) {
			updateCriteria(topLevelClass, introspectedTable);
		}
		return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
	}
	
	@Override
    public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement element,
            IntrospectedTable introspectedTable) {
		
		if(introspectedTable.getTableConfiguration().getProperty("generateScopeOr")!=null && 
				introspectedTable.getTableConfiguration().getProperty("generateScopeOr").equals("true")) {
			updateElement(element, introspectedTable);
		}
		
        return super.sqlMapExampleWhereClauseElementGenerated(element, introspectedTable);
    }
	
	private void updateElement(XmlElement element, IntrospectedTable introspectedTable) {
		String rootName=null;
		if("Update_By_Example_Where_Clause".equalsIgnoreCase(element.getAttributes().get(0).getValue())) {
			rootName="example.";
		}
		else if("Example_Where_Clause".equalsIgnoreCase(element.getAttributes().get(0).getValue())) {
			rootName="";
		}
		if(rootName!=null) {
			XmlElement whereElement = new XmlElement("where");
			XmlElement foreachElement = new XmlElement("foreach");
			foreachElement.addAttribute(new Attribute("collection", rootName+"oredCriteria"));
			foreachElement.addAttribute(new Attribute("item", "criteria"));
			foreachElement.addAttribute(new Attribute("separator", "or"));
			
			XmlElement trimElement = new XmlElement("trim");
			trimElement.addAttribute(new Attribute("prefix", "("));
			trimElement.addAttribute(new Attribute("prefixOverrides", "and"));
			trimElement.addAttribute(new Attribute("suffix", ")"));
			
			if(true) {
				XmlElement ifElement1 = new XmlElement("if");
				ifElement1.addAttribute(new Attribute("test", "criteria.valid"));
				
				XmlElement foreachElement1 = new XmlElement("foreach");
				foreachElement1.addAttribute(new Attribute("collection", "criteria.criteria"));
				foreachElement1.addAttribute(new Attribute("item", "criterion"));
				
				XmlElement chooseElement1 = new XmlElement("choose");
				
				XmlElement whenElement1 = new XmlElement("when");
				whenElement1.addAttribute(new Attribute("test", "criterion.noValue"));
				whenElement1.addElement(new TextElement("and ${criterion.condition}"));
				chooseElement1.addElement(whenElement1);
				
				XmlElement whenElement2 = new XmlElement("when");
				whenElement2.addAttribute(new Attribute("test", "criterion.singleValue"));
				whenElement2.addElement(new TextElement("and ${criterion.condition} #{criterion.value}"));
				chooseElement1.addElement(whenElement2);
				
				XmlElement whenElement3 = new XmlElement("when");
				whenElement3.addAttribute(new Attribute("test", "criterion.betweenValue"));
				whenElement3.addElement(new TextElement("and ${criterion.condition} #{criterion.value} and #{criterion.secondValue}"));
				chooseElement1.addElement(whenElement3);
				
				XmlElement whenElement4 = new XmlElement("when");
				whenElement4.addAttribute(new Attribute("test", "criterion.listValue"));
				whenElement4.addElement(new TextElement("and ${criterion.condition}"));
				XmlElement forEachElement2 = new XmlElement("foreach");
				forEachElement2.addAttribute(new Attribute("close", ")"));
				forEachElement2.addAttribute(new Attribute("collection", "criterion.value"));
				forEachElement2.addAttribute(new Attribute("item", "listItem"));
				forEachElement2.addAttribute(new Attribute("open", "("));
				forEachElement2.addAttribute(new Attribute("separator", ","));
				forEachElement2.addElement(new TextElement("#{listItem}"));
				whenElement4.addElement(forEachElement2);
				chooseElement1.addElement(whenElement4);
				
				foreachElement1.addElement(chooseElement1);
				ifElement1.addElement(foreachElement1);
				trimElement.addElement(ifElement1);
			}
			
			if(true) {
				XmlElement ifElement1 = new XmlElement("if");
				ifElement1.addAttribute(new Attribute("test", "criteria.validOr"));
				ifElement1.addElement(new TextElement("and"));
				
				XmlElement foreachElement0 = new XmlElement("foreach");
				foreachElement0.addAttribute(new Attribute("collection", "criteria.orCriteria"));
				foreachElement0.addAttribute(new Attribute("item", "criteriaItem"));
				foreachElement0.addAttribute(new Attribute("separator", "and"));
				
				ifElement1.addElement(foreachElement0);
				
				XmlElement ifElement11 = new XmlElement("if");
				ifElement11.addAttribute(new Attribute("test", "criteriaItem.valid"));
				foreachElement0.addElement(ifElement11);
				
				XmlElement trimElement1 = new XmlElement("trim");
				trimElement1.addAttribute(new Attribute("prefix", "("));
				trimElement1.addAttribute(new Attribute("prefixOverrides", "or"));
				trimElement1.addAttribute(new Attribute("suffix", ")"));
				ifElement11.addElement(trimElement1);
				
				XmlElement foreachElement1 = new XmlElement("foreach");
				foreachElement1.addAttribute(new Attribute("collection", "criteriaItem.criteria"));
				foreachElement1.addAttribute(new Attribute("item", "criterionItem"));
				trimElement1.addElement(foreachElement1);
				
				XmlElement chooseElement1 = new XmlElement("choose");
				foreachElement1.addElement(chooseElement1);
				
				XmlElement whenElement1 = new XmlElement("when");
				whenElement1.addAttribute(new Attribute("test", "criterionItem.noValue"));
				whenElement1.addElement(new TextElement("or ${criterionItem.condition}"));
				chooseElement1.addElement(whenElement1);
				
				XmlElement whenElement2 = new XmlElement("when");
				whenElement2.addAttribute(new Attribute("test", "criterionItem.singleValue"));
				whenElement2.addElement(new TextElement("or ${criterionItem.condition} #{criterionItem.value}"));
				chooseElement1.addElement(whenElement2);
				
				XmlElement whenElement3 = new XmlElement("when");
				whenElement3.addAttribute(new Attribute("test", "criterionItem.betweenValue"));
				whenElement3.addElement(new TextElement("or ${criterionItem.condition} #{criterionItem.value} and #{criterionItem.secondValue}"));
				chooseElement1.addElement(whenElement3);
				
				XmlElement whenElement4 = new XmlElement("when");
				whenElement4.addAttribute(new Attribute("test", "criterionItem.listValue"));
				whenElement4.addElement(new TextElement("or ${criterionItem.condition}"));
				chooseElement1.addElement(whenElement4);
				
				XmlElement forEachElement2 = new XmlElement("foreach");
				whenElement4.addElement(forEachElement2);
				
				forEachElement2.addAttribute(new Attribute("close", ")"));
				forEachElement2.addAttribute(new Attribute("collection", "criterionItem.value"));
				forEachElement2.addAttribute(new Attribute("item", "listItem"));
				forEachElement2.addAttribute(new Attribute("open", "("));
				forEachElement2.addAttribute(new Attribute("separator", ","));
				forEachElement2.addElement(new TextElement("#{listItem}"));
				
				trimElement.addElement(ifElement1);
			}
			
			foreachElement.addElement(trimElement);
			whereElement.addElement(foreachElement);
			element.getElements().set(0, whereElement);
		}
	}
	
	private void updateCriteria(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		topLevelClass.getInnerClasses().forEach(innerClass->{
			if(innerClass.getType().getShortName().equals("Criteria")) {
				
				Field field = new Field();
				field.setVisibility(JavaVisibility.PROTECTED);
				FullyQualifiedJavaType fieldType=FullyQualifiedJavaType.getNewListInstance();
				fieldType.addTypeArgument(FullyQualifiedJavaType.getCriteriaInstance());
				field.setType(fieldType);
				field.setName("orCriteria");
//				commentGenerator.addFieldComment(field, introspectedTable);
				innerClass.addField(field);
				
				
				innerClass.getMethods().stream().forEach(m->{
					if(m.getName().equals("Criteria")) {
						m.getBodyLines().add("orCriteria=new ArrayList<Criteria>();");
					}
				});
				if(true) {
					Method method = new Method();
					method.setVisibility(JavaVisibility.PUBLIC);
					method.setName("createOrCriteria");
					method.addBodyLine("Criteria criteria = new Criteria();");
					method.addBodyLine("orCriteria.add(criteria);");
					method.addBodyLine("return criteria;");
					method.setReturnType(FullyQualifiedJavaType.getCriteriaInstance());
					innerClass.addMethod(method);
				}
				if(true) {
					Method method = new Method();
					method.setVisibility(JavaVisibility.PUBLIC);
					method.setName("getOrCriteria");
					method.addBodyLine("return orCriteria;");
					
					FullyQualifiedJavaType returnType=FullyQualifiedJavaType.getNewListInstance();
					returnType.addTypeArgument(FullyQualifiedJavaType.getCriteriaInstance());
					method.setReturnType(returnType);
					innerClass.addMethod(method);
				}
				if(true) {
					Method method = new Method();
					method.setVisibility(JavaVisibility.PUBLIC);
					method.setName("getValidOr");
					method.addBodyLine("return orCriteria.size() > 0;");
					method.setReturnType(FullyQualifiedJavaType.getBooleanPrimitiveInstance());
					innerClass.addMethod(method);
				}
			}
		});
	}
	
	/**
	 * 
	 * This plugin is always valid -no properties are required
	 * 
	 */
	public boolean validate(List<String> warnings) {
		return true;
	}
}
