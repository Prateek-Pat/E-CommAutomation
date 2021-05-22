package com.blazedemo.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.annotations.ITestAnnotation;
import org.testng.internal.annotations.IAnnotationTransformer;

public class MyTransformUtility implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod ){
		
		annotation.setRetryAnalyzer(RetryAnalyzerUtility.class);
		
	}

}
