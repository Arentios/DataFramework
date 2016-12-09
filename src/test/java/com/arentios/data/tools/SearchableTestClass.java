package com.arentios.data.tools;

import java.util.List;

import com.arentios.data.datatypes.Queryable;

public class SearchableTestClass extends Queryable{

	private Integer primaryKey;
	private Integer otherField;
	
	public int compareTo(Queryable o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<String> getQueryKeys() {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(Integer primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Integer getOtherField() {
		return otherField;
	}

	public void setOtherField(Integer otherField) {
		this.otherField = otherField;
	}
	
	
	
}