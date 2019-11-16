package com.sanlly.production.config.mybatis;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.codegen.ibatis2.Ibatis2FormattingUtilities;

/**
 * 
 * @author https://github.com/RexSheng ©2019
 * 2019年11月8日 下午2:55:14
 */
public class IfNullPlugin extends PluginAdapter {
	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		if(introspectedTable.getTableConfiguration().getProperty("generateIfNull")!=null && 
				introspectedTable.getTableConfiguration().getProperty("generateIfNull").equals("true")) {
			addIfNull(topLevelClass, introspectedTable);
		}
		return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
	}
	
	
	private void addIfNull(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		topLevelClass.getInnerClasses().forEach(innerClass->{
			if(innerClass.getType().getShortName().equals("Criteria")) {
				introspectedTable.getAllColumns().forEach(column->{
					
					String columnName=Ibatis2FormattingUtilities.getAliasedActualColumnName(column);
					String fieldName=column.getJavaProperty();
					if(true) {
						String methodName="and" + fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1)+"IfNullEqualTo";
						Method method = new Method();
						method.setVisibility(JavaVisibility.PUBLIC);
						method.setName(methodName);
						method.addParameter(0,new Parameter(column.getFullyQualifiedJavaType(), "value"));
						method.addParameter(1,new Parameter(column.getFullyQualifiedJavaType(), "defaultValue"));
						if("java.lang.String".equals(column.getFullyQualifiedJavaType().getFullyQualifiedName())) {
							method.addBodyLine("addCriterion(\"ifnull("+columnName+",'\"+defaultValue+\"')=\", value, \""+fieldName+"\");");
						}
						else {
							method.addBodyLine("addCriterion(\"ifnull("+columnName+",\"+defaultValue+\")=\", value, \""+fieldName+"\");");
						}
						
						method.addBodyLine("return (Criteria) this;");
						method.setReturnType(FullyQualifiedJavaType.getCriteriaInstance());
						innerClass.addMethod(method);
					}
					if(true) {
						String methodName="and" + fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1)+"IfNullNotEqualTo";
						Method method = new Method();
						method.setVisibility(JavaVisibility.PUBLIC);
						method.setName(methodName);
						method.addParameter(0,new Parameter(column.getFullyQualifiedJavaType(), "value"));
						method.addParameter(1,new Parameter(column.getFullyQualifiedJavaType(), "defaultValue"));
						if("java.lang.String".equals(column.getFullyQualifiedJavaType().getFullyQualifiedName())) {
							method.addBodyLine("addCriterion(\"ifnull("+columnName+",'\"+defaultValue+\"')<>\", value, \""+fieldName+"\");");
						}
						else {
							method.addBodyLine("addCriterion(\"ifnull("+columnName+",\"+defaultValue+\")<>\", value, \""+fieldName+"\");");
						}
						
						method.addBodyLine("return (Criteria) this;");
						method.setReturnType(FullyQualifiedJavaType.getCriteriaInstance());
						innerClass.addMethod(method);
					}
					
				});
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
