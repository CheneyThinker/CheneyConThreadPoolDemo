package com.cheney.dbcp.mtp.test;

import java.math.BigDecimal;
import java.util.List;

import com.cheney.dbcp.mtp.entity.GoodsEntity;
import com.cheney.dbcp.mtp.entity.MemberEntity;
import com.cheney.dbcp.mtp.pool.CheneyDataWrap;

import com.cheney.dbcp.mtp.pool.CheneyThreadPool;
import com.cheney.dbcp.mtp.utils.CheneyUtils;
import com.cheney.dbcp.mtp.pool.CheneyDataWrap.Dimension;

@SuppressWarnings("unused")
public class CheneyConThreadPoolMain {

	public static void main(String[] args) {
		try {
			//submitSave();
			//submitDML();
			//submitLinear();
			//submitSimple();
			//submitComplex();
			//submitSimpleModel();
			//submitComplexModel();
			//System.err.println(CheneyThreadPool.submitSimpleBatch("INSERT INTO Member(name,note) VALUES(?,?)", new Object[]{ "CheneyThinker1", "CheneyThinker1", "Tea", "Tea", "²è×ÓÄ¾", "²è×ÓÄ¾" }));
			//System.err.println(CheneyThreadPool.submitComplexBatch("INSERT INTO Goods(id,name,price) VALUES('GI1008','Ð¬×Ó','128')", "INSERT INTO Goods(id,name,price) VALUES('GI1009','µç·¹ìÒ','1300')", "INSERT INTO Member(name,note) VALUES('²èÒÕ','²èÒÕ')", "INSERT INTO Member(name,note) VALUES('²èÒÕ¼º','²èÒÕ¼º')"));
			//submitUpdate();
			//submitDelete();
			//submit();
		} finally {
			CheneyUtils.release();
			System.exit(0);
		}
	}
	
	public static void submitSave() {
		/**
		 * not only is it contain-increment, but also it is contain-key
		 */
		//System.err.println(CheneyThreadPool.submitSave(new MemberEntity("DBCP AND MTP BY CheneyThinker", "CheneyThinker")));
		/**
		 * only is it contain-key, no-contain-increment
		 */
		//System.err.println(CheneyThreadPool.submitSave(new GoodsEntity(new BigDecimal(3), "Æ»¹û", "GI1004")));
	}
	
	public static void submitDML() {
		/**
		 * arguments
		 */
		//System.err.println(CheneyThreadPool.submitDML("INSERT INTO Goods(id,name,price) VALUES(?,?,?)", new Object[]{"GI1005", "¹û³ÈÖ­", new BigDecimal(9)}));
		/**
		 * argument
		 */
		//System.err.println(CheneyThreadPool.submitDML("UPDATE Member SET note=?", "DBCP AND MTP BY CheneyThinker"));
		/**
		 * no-argument
		 */
		//System.err.println(CheneyThreadPool.submitDML("INSERT INTO Member(name,note) VALUES('Thinker', 'DBCP AND MTP BY CheneyThinker')"));
	}

	public static void submitLinear() {
		/**
		 * arguments
		 */
		//System.err.println(CheneyThreadPool.submitLinear("SELECT note FROM Member WHERE id>? AND name=?", new Object[]{ 1, "Thinker" }));
		/**
		 * argument
		 */
		//System.err.println(CheneyThreadPool.submitLinear("SELECT name FROM Goods WHERE id=?", "GI1001"));
		/**
		 * no-argument
		 */
		//System.err.println(CheneyThreadPool.submitLinear("SELECT name FROM Member WHERE id=1"));
	}
	
	public static void submitSimple() {
		/**
		 * arguments
		 */
		//String[] notes = CheneyThreadPool.submitSimple("SELECT note FROM Member WHERE id>? AND name=?", new Object[]{ 1, "CheneyThinker" });
		//for (String note : notes)
		//	System.err.println(note);
		/**
		 * argument
		 */
		//String[] notes = CheneyThreadPool.submitSimple("SELECT note FROM Member WHERE id>?", 0);
		//for (String note : notes)
		//	System.err.println(note);
		/**
		 * no-argument
		 */
		//String[] notes = CheneyThreadPool.submitSimple("SELECT note FROM Member WHERE id>0");
		//for (String note : notes)
		//	System.err.println(note);
	}
	
	public static void submitComplex() {
		/**
		 * arguments
		 */
		//String[][] idAndNames = CheneyThreadPool.submitComplex("SELECT id,name FROM Goods WHERE price>? AND name=?", new Object[]{ new BigDecimal(0), "Æ»¹û" });
		//for (String[] idAndName : idAndNames)
		//	for (String field : idAndName)
		//		System.err.println(field);
		/**
		 * argument
		 */
		//String[][] idAndNames = CheneyThreadPool.submitComplex("SELECT id,name FROM Goods WHERE name=?", "Æ»¹û");
		//for (String[] idAndName : idAndNames)
		//	for (String field : idAndName)
		//		System.err.println(field);
		/**
		 * no-argument
		 */
		//String[][] idAndNames = CheneyThreadPool.submitComplex("SELECT id,name FROM Goods WHERE name='Æ»¹û'");
		//for (String[] idAndName : idAndNames)
		//	for (String field : idAndName)
		//		System.err.println(field);
	}

	public static void submitSimpleModel() {
		/**
		 * arguments
		 */
		//GoodsEntity entity = CheneyThreadPool.submitSimpleModel("SELECT id,name,price FROM Goods WHERE price=? AND name=?", GoodsEntity.class, new Object[]{ new BigDecimal(3), "Æ»¹û" });
		//System.err.println(entity.getId());
		//System.err.println(entity.getName());
		//System.err.println(entity.getPrice());
		/**
		 * argument
		 */
		//GoodsEntity entity = CheneyThreadPool.submitSimpleModel("SELECT id,name,price FROM Goods WHERE name=?", GoodsEntity.class, "Å£ÄÌ");
		//System.err.println(entity.getId());
		//System.err.println(entity.getName());
		//System.err.println(entity.getPrice());
		/**
		 * no-argument 1
		 */
		//GoodsEntity entity = CheneyThreadPool.submitSimpleModel("SELECT id,name,price FROM Goods WHERE name='Å£ÄÌ'", GoodsEntity.class);
		//System.err.println(entity.getId());
		//System.err.println(entity.getName());
		//System.err.println(entity.getPrice());
		/**
		 * no-argument 2
		 */
		//GoodsEntity entity = CheneyThreadPool.submitSimpleModel(GoodsEntity.class, "GI1001");
		//System.err.println(entity.getId());
		//System.err.println(entity.getName());
		//System.err.println(entity.getPrice());
	}
	
	public static void submitComplexModel() {
		/**
		 * arguments
		 */
		//List<GoodsEntity> entities = CheneyThreadPool.submitComplexModel("SELECT id,name,price FROM Goods WHERE price>? AND name=?", GoodsEntity.class, new Object[]{ new BigDecimal(0), "Æ»¹û" });
		//for (GoodsEntity entity : entities) {
		//	System.err.println(entity.getId());
		//	System.err.println(entity.getName());
		//	System.err.println(entity.getPrice());
		//}
		/**
		 * argument
		 */
		//List<GoodsEntity> entities = CheneyThreadPool.submitComplexModel("SELECT id,name,price FROM Goods WHERE price>?", GoodsEntity.class, new BigDecimal(0));
		//for (GoodsEntity entity : entities) {
		//	System.err.println(entity.getId());
		//	System.err.println(entity.getName());
		//	System.err.println(entity.getPrice());
		//}
		/**
		 * no-argument 1
		 */
		//List<GoodsEntity> entities = CheneyThreadPool.submitComplexModel("SELECT id,name,price FROM Goods WHERE price>0", GoodsEntity.class);
		//for (GoodsEntity entity : entities) {
		//	System.err.println(entity.getId());
		//	System.err.println(entity.getName());
		//	System.err.println(entity.getPrice());
		//}
		/**
		 * no-argument 2
		 */
		//List<GoodsEntity> entities = CheneyThreadPool.submitComplexModel(GoodsEntity.class);
		//for (GoodsEntity entity : entities) {
		//	System.err.println(entity.getId());
		//	System.err.println(entity.getName());
		//	System.err.println(entity.getPrice());
		//}
	}

	public static void submitUpdate() {
		/*
		GoodsEntity entity = CheneyThreadPool.submitSimpleModel(GoodsEntity.class, "GI1003");
		System.err.println(entity.getName());
		System.err.println(entity.getPrice());
		entity.setName("ÄÃÌú¿§·È");
		entity.setPrice(new BigDecimal(56));
		System.err.println(CheneyThreadPool.submitUpdate(entity));
		*/
		
		/*
		GoodsEntity entity = CheneyThreadPool.submitSimpleModel(GoodsEntity.class, "GI1008");
		System.err.println(entity.getName());
		System.err.println(entity.getPrice());
		entity.setName("±ùÏä");
		entity.setPrice(new BigDecimal(2300));
		System.err.println(CheneyThreadPool.submitUpdate(entity, "name.price"));
		*/
		
		/*
		GoodsEntity entity = CheneyThreadPool.submitSimpleModel(GoodsEntity.class, "GI1009");
		System.err.println(entity.getName());
		System.err.println(entity.getPrice());
		entity.setName("µç´ÅÂ¯");
		System.err.println(CheneyThreadPool.submitUpdate(entity, "name"));
		*/
	}
	
	public static void submitDelete() {
		/*
		MemberEntity entity = CheneyThreadPool.submitSimpleModel(MemberEntity.class, 19);
		System.err.println(entity.getName());
		System.err.println(entity.getNote());
		System.err.println(CheneyThreadPool.submitDelete(entity));
		*/
		
		//System.err.println(CheneyThreadPool.submitDelete(MemberEntity.class, 16));
	}
	
	public static void submit() {
		/*
		CheneyDataWrap wrap = CheneyThreadPool.submit(Dimension.COMPLEX_MODEL, GoodsEntity.class, "SELECT id,name,price FROM Goods");
		List<GoodsEntity> entities = wrap.getComplexModel();
		for (GoodsEntity entity : entities) {
			System.err.println(entity.getId());
			System.err.println(entity.getName());
			System.err.println(entity.getPrice());
		}
		*/
		
		/*
		CheneyDataWrap wrap = CheneyThreadPool.submit(Dimension.COMPLEX_MODEL, 100, GoodsEntity.class, "SELECT id,name,price FROM Goods WHERE price>?");
		List<GoodsEntity> entities = wrap.getComplexModel();
		for (GoodsEntity entity : entities) {
			System.err.println(entity.getId());
			System.err.println(entity.getName());
			System.err.println(entity.getPrice());
		}
		*/
		
		/*
		CheneyDataWrap wrap = CheneyThreadPool.submit(Dimension.COMPLEX_MODEL, new Object[]{ 100, 2000}, GoodsEntity.class, "SELECT id,name,price FROM Goods WHERE price>? AND price<?");
		List<GoodsEntity> entities = wrap.getComplexModel();
		for (GoodsEntity entity : entities) {
			System.err.println(entity.getId());
			System.err.println(entity.getName());
			System.err.println(entity.getPrice());
		}
		*/
		
		/*
		CheneyDataWrap wrap = CheneyThreadPool.submit(Dimension.COMPLEX, "SELECT id,name,price FROM Goods");
		String[][] strings = wrap.getComplex();
		for (String[] strs : strings)
			for (String string : strs)
				System.err.println(string);
		*/
		
		/*
		CheneyDataWrap wrap = CheneyThreadPool.submit(100, Dimension.COMPLEX, "SELECT id,name,price FROM Goods WHERE price>?");
		String[][] strings = wrap.getComplex();
		for (String[] strs : strings)
			for (String string : strs)
				System.err.println(string);
		*/
		
		/*
		CheneyDataWrap wrap = CheneyThreadPool.submit(new Object[]{ 100, 2000}, Dimension.COMPLEX, "SELECT id,name,price FROM Goods WHERE price>? AND price<?");
		String[][] strings = wrap.getComplex();
		for (String[] strs : strings)
			for (String string : strs)
				System.err.println(string);
		*/
	}
	
}
