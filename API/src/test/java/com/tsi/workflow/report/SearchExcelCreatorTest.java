/*
 * This file was automatically generated by EvoSuite
 * Thu Aug 09 06:37:59 GMT 2018
 */

package com.tsi.workflow.report;

import static org.junit.Assert.*;

import com.tsi.workflow.beans.ui.AdvancedMetaSearchResult;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.XmlSimpleList;
import org.apache.xmlbeans.impl.common.ValidationContext;
import org.apache.xmlbeans.impl.schema.BuiltinSchemaTypeSystem;
import org.apache.xmlbeans.impl.schema.SchemaTypeImpl;
import org.apache.xmlbeans.impl.values.NamespaceContext;
import org.apache.xmlbeans.impl.values.XmlListImpl;
import org.apache.xmlbeans.impl.values.XmlObjectBase;
import org.junit.Test;

public class SearchExcelCreatorTest {

    @Test(timeout = 4000)
    public void test00() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	searchExcelCreator0.lWorkBook = null;
	Workbook workbook0 = searchExcelCreator0.getWorkBook();
	assertNull(workbook0);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	searchExcelCreator0.lCurrentCell = (-1877);
	int int0 = searchExcelCreator0.getNextCell();
	assertEquals((-1877), int0);
    }

    @Test(timeout = 4000)
    public void test02() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	searchExcelCreator0.lCurrentRow = (-4);
	int int0 = searchExcelCreator0.getNewRow();
	assertEquals((-4), int0);
    }

    @Test(timeout = 4000)
    public void test03() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	searchExcelCreator0.lName = "{N]X6W";
	String string0 = searchExcelCreator0.getName();
	assertEquals("{N]X6W", string0);
    }

    @Test(timeout = 4000)
    public void test04() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	searchExcelCreator0.lName = "";
	String string0 = searchExcelCreator0.getName();
	assertEquals("", string0);
    }

    @Test(timeout = 4000)
    public void test05() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	HashMap<String, List<AdvancedMetaSearchResult>> hashMap0 = new HashMap<String, List<AdvancedMetaSearchResult>>();
	LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
	XmlSimpleList xmlSimpleList0 = new XmlSimpleList(linkedList0);
	hashMap0.put("", xmlSimpleList0);
	// Undeclared exception!
	try {
	    searchExcelCreator0.addSearchResult(hashMap0);
	    fail("Expecting exception: NoSuchElementException");

	} catch (NoSuchElementException e) {
	}
    }

    @Test(timeout = 4000)
    public void test06() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	// Undeclared exception!
	try {
	    searchExcelCreator0.addSearchResult((Map<String, List<AdvancedMetaSearchResult>>) null);
	    fail("Expecting exception: NullPointerException");

	} catch (NullPointerException e) {
	    //
	}
    }

    @Test(timeout = 4000)
    public void test07() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	HashMap<String, List<AdvancedMetaSearchResult>> hashMap0 = new HashMap<String, List<AdvancedMetaSearchResult>>(65, 65);
	searchExcelCreator0.addSearchResult(hashMap0);
	// Undeclared exception!
	try {
	    searchExcelCreator0.addSearchResult(hashMap0);
	    fail("Expecting exception: IllegalArgumentException");

	} catch (IllegalArgumentException e) {
	    //
	    // The workbook already contains a sheet named 'Search Result'
	    //
	}
    }

    @Test(timeout = 4000)
    public void test08() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	HashMap<String, List<AdvancedMetaSearchResult>> hashMap0 = new HashMap<String, List<AdvancedMetaSearchResult>>();
	SchemaTypeImpl schemaTypeImpl0 = BuiltinSchemaTypeSystem.ST_LANGUAGE;
	ValidationContext validationContext0 = XmlObjectBase._voorVc;
	NamespaceContext namespaceContext0 = new NamespaceContext(hashMap0);
	XmlSimpleList xmlSimpleList0 = XmlListImpl.lex("Z~/'&>=J^GM$uUvhC", schemaTypeImpl0, validationContext0, namespaceContext0);
	hashMap0.put("Z~/'&>=J^GM$uUvhC", xmlSimpleList0);
	// Undeclared exception!
	try {
	    searchExcelCreator0.addSearchResult(hashMap0);
	    fail("Expecting exception: ClassCastException");

	} catch (ClassCastException e) {
	    //
	    // org.apache.xmlbeans.impl.values.XmlLanguageImpl cannot be cast to
	    // com.tsi.workflow.beans.ui.AdvancedMetaSearchResult
	    //
	}
    }

    @Test(timeout = 4000)
    public void test09() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	searchExcelCreator0.getNextCell();
	int int0 = searchExcelCreator0.getNextCell();
	assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test10() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	searchExcelCreator0.getNewRow();
	int int0 = searchExcelCreator0.getNewRow();
	assertEquals(1, int0);
    }

    @Test(timeout = 4000)
    public void test11() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	XSSFWorkbook xSSFWorkbook0 = (XSSFWorkbook) searchExcelCreator0.getWorkBook();
	assertFalse(xSSFWorkbook0.isStructureLocked());
    }

    @Test(timeout = 4000)
    public void test12() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	String string0 = searchExcelCreator0.getName();
	assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test13() throws Throwable {
	SearchExcelCreator searchExcelCreator0 = new SearchExcelCreator();
	HashMap<String, List<AdvancedMetaSearchResult>> hashMap0 = new HashMap<String, List<AdvancedMetaSearchResult>>();
	searchExcelCreator0.addSearchResult(hashMap0);
	searchExcelCreator0.getWorkBook();
    }
}
