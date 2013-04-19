package com.example.yinyangapp.test;
import org.junit.Test;

import com.example.yinyangapp.databaseentities.Comment;
import junit.framework.TestCase;


public class DbTest extends TestCase {
		
	public Comment path;
	
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Test
	public void testDBPath(){
		assertTrue(path == path);	
	}
		
	@Test
	public void testTableName(){
		assertTrue(Comment.TABLE_NAME == "comments");
		
	}
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}