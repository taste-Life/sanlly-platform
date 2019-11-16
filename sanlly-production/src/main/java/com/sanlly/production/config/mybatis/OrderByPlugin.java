package com.sanlly.production.config.mybatis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.JavaVisibility;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.codegen.ibatis2.Ibatis2FormattingUtilities;

/**
 * @author https://github.com/RexSheng ©2019
 * @author RexSheng
 * 2019年11月11日 上午11:08:17
 */
public class OrderByPlugin extends PluginAdapter {
	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		if(introspectedTable.getTableConfiguration().getProperty("generateOrderBy")!=null && 
				introspectedTable.getTableConfiguration().getProperty("generateOrderBy").equals("true")) {
			
			if(properties.get("type")!=null && String.valueOf(properties.get("type")).equalsIgnoreCase("string")) {
				addOrderBy(topLevelClass, introspectedTable);
			}
			else if(properties.get("type")!=null && String.valueOf(properties.get("type")).equalsIgnoreCase("lambda")) {
				addOrderByLambda(topLevelClass, introspectedTable);
			}
			else if(properties.get("type")!=null && String.valueOf(properties.get("type")).equalsIgnoreCase("all")) {
				addOrderBy(topLevelClass, introspectedTable);
				addOrderByLambda(topLevelClass, introspectedTable);
			}
		}
		return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
	}
	
	private void addOrderBy(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		introspectedTable.getAllColumns().forEach(column->{
			Method ascMethod = new Method();
			ascMethod.setVisibility(JavaVisibility.PUBLIC);
			String fieldName=column.getJavaProperty();
			ascMethod.setName("setOrderBy" + fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1)+"Asc");
			ascMethod.setReturnType(topLevelClass.getType());
			ascMethod.addBodyLine("this.orderByClause=this.orderByClause==null?\"" + column.getActualColumnName() + "\":(this.orderByClause+\"," +column.getActualColumnName()+ "\");");
			ascMethod.addBodyLine("return this;");
			topLevelClass.addMethod(ascMethod);
			
			Method descMethod = new Method();
			descMethod.setVisibility(JavaVisibility.PUBLIC);
			descMethod.setName("setOrderBy" + fieldName.substring(0, 1).toUpperCase()+fieldName.substring(1)+"Desc");
			descMethod.setReturnType(topLevelClass.getType());
			descMethod.addBodyLine("this.orderByClause=this.orderByClause==null?\"" + column.getActualColumnName() + " desc\":(this.orderByClause+\"," +column.getActualColumnName()  + " desc\");");
			descMethod.addBodyLine("return this;");
			topLevelClass.addMethod(descMethod);
		});
	}
	
	private void addOrderByLambda(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		Map<String,String> columnMapping=new HashMap<>();
		introspectedTable.getAllColumns().forEach(column->{
			String fieldName=column.getJavaProperty();
			String columnName=Ibatis2FormattingUtilities.getAliasedActualColumnName(column);
			columnMapping.put(fieldName, columnName);
		});
		
		Method method = new Method();
		method.setVisibility(JavaVisibility.PUBLIC);
		method.setName("setOrderBy");
		FullyQualifiedJavaType param1=new FullyQualifiedJavaType("com.sanlly.common.models.input.EntityFunction");
		
		if (introspectedTable.getRules().generateRecordWithBLOBsClass()) {
            param1.addTypeArgument(new FullyQualifiedJavaType(introspectedTable.getRecordWithBLOBsType()));
        } else {
        	param1.addTypeArgument(new FullyQualifiedJavaType(introspectedTable.getBaseRecordType()));
        }
		
		param1.addTypeArgument(FullyQualifiedJavaType.getObjectInstance());
		method.addParameter(new Parameter(param1,"fn"));
		method.addParameter(new Parameter(FullyQualifiedJavaType.getBooleanPrimitiveInstance(),"asc"));
		method.setReturnType(topLevelClass.getType());
		
		method.addBodyLine("String columnName=asc?columnMapping.get(EntityFunctionUtil.fnToFieldName(fn)):(columnMapping.get(EntityFunctionUtil.fnToFieldName(fn))+\" desc\");");
		method.addBodyLine("this.orderByClause=this.orderByClause==null?columnName:(this.orderByClause+\",\"+columnName);");
		method.addBodyLine("return this;");
		topLevelClass.addMethod(method);
		topLevelClass.addImportedType(new FullyQualifiedJavaType("com.sanlly.common.utils.EntityFunctionUtil"));
		topLevelClass.addImportedType(new FullyQualifiedJavaType("com.sanlly.common.models.input.EntityFunction"));
		
		Field field = new Field();
		field.setVisibility(JavaVisibility.PRIVATE);
		FullyQualifiedJavaType mapType=FullyQualifiedJavaType.getNewMapInstance();
		mapType.addTypeArgument(FullyQualifiedJavaType.getStringInstance());
		mapType.addTypeArgument(FullyQualifiedJavaType.getStringInstance());
		field.setType(mapType);
		field.setName("columnMapping");
		field.setStatic(true);
		String initValue="new HashMap<String,String>(){private static final long serialVersionUID = 1L;{";
		for(String key:columnMapping.keySet()) {
			initValue+="put(\""+key+"\",\""+columnMapping.get(key)+"\");";
		}
		initValue+="}}";
		field.setInitializationString(initValue);
		topLevelClass.addImportedType(FullyQualifiedJavaType.getNewMapInstance());
		topLevelClass.addImportedType(FullyQualifiedJavaType.getNewHashMapInstance());
		topLevelClass.addField(field);
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
