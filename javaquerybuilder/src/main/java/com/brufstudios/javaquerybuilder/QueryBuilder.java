package com.brufstudios.javaquerybuilder;

public interface QueryBuilder {
	
	public SelectBuilder init();
	
	public interface SelectBuilder {
		
		public FromBuilder select(String[] args);
		
	}
	
	public interface FromBuilder {
		
	}
	
	public interface WhereBuilder {
		
	}

}
